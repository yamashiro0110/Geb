import geb.Browser
import geb.Page
import geb.spock.GebSpec

def browser = new Browser()

class TestPage extends Page {
    static url = "http://www.actier.co.jp/"

    static content = {
        title = {
            $("title")
        }
    }

    static at = {
        title == 'トップページ｜株式会社アクティア'
    }
}

browser.drive {
    to TestPage
    Thread.sleep(2000)
}.quit()

class TestPageSpec extends GebSpec {

}
