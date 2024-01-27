package io.github.jmltoolkit.cli

import com.beust.jcommander.JCommander
import java.io.StringWriter
import java.util.*
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.ParserConfigurationException
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerException
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

/**
 * @author Alexander Weigl
 * @version 1 (24.05.22)
 */
object StatMain {
    private val args = Args()

    @Throws(ParserConfigurationException::class, TransformerException::class)
    @JvmStatic
    fun main(argv: Array<String>) {
        val cmd: JCommander = JCommander.newBuilder()
            .programName("jml-stat")
            .addObject(args)
            .build()
        cmd.parse(argv)

        if (args.help) {
            cmd.usage()
            return
        }

        val config: ParserConfiguration = ParserConfiguration()
        config.setProcessJml(true)
        config.setKeepJmlDocs(true)
        for (activeJmlKey in args.activeJmlKeys) {
            val activeJmlKeys = activeJmlKey.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            config.getJmlKeys().add(Arrays.asList(*activeJmlKeys))
        }

        if (args.activeJmlKeys.isEmpty()) {
            //config.getJmlKeys().add(new ArrayList<>());
            config.getJmlKeys().add(listOf("key"))
            //config.getJmlKeys().add(Collections.singletonList("openjml"));
        }


        val builderFactory = DocumentBuilderFactory.newInstance()
        val builder = builderFactory.newDocumentBuilder()
        val xmlDocument = builder.newDocument()
        val xmlRoot = xmlDocument.createElement("statistics-model")

        val nodes: Collection<CompilationUnit> = Main.parse(args.files, config)
        val costs = ExpressionCosts()
        for (key in config.getJmlKeys()) {
            val statVisitor = StatVisitor(xmlDocument, key, costs)
            val e = xmlDocument.createElement("settings")
            e.setAttribute("keys", "" + key)
            xmlRoot.appendChild(e)
            for (node in nodes) {
                node.accept(statVisitor, e)
            }
        }

        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //System.out.println(gson.toJson(statVisitor.getNewlines()));
        val transformer = TransformerFactory.newInstance().newTransformer()
        transformer.setOutputProperty(OutputKeys.INDENT, "yes")
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2")
        val result = StreamResult(StringWriter())
        val source = DOMSource(xmlRoot)
        transformer.transform(source, result)
        val xmlString = result.writer.toString()
        println(xmlString)
    }

    private class Args {
        @Parameter
        val files: List<String> = ArrayList()

        @Parameter(names = "-k")
        val activeJmlKeys: List<String> = ArrayList()

        @Parameter(names = "-h")
        val help: Boolean = false


        @Parameter(names = ["-verbose"], description = "Level of verbosity")
        private val verbose = 1
    }
}
