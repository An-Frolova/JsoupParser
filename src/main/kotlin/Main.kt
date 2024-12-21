import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect(URL).get()
    val elements: Elements = doc.select("article")

    for (element in elements) {
        val text = element.text()
        println(text)
    }
}

const val URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"