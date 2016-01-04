import geb.Browser
import geb.Page

def browser = new Browser()

class GooglePage extends Page {
    static url = "https://www.google.co.jp/"

    static content = {
//        textBox = { $("input", id: "lst-ib") }
    }

    static at = {
        title == 'Google'
//        title == 'hogehoge'
    }

    @Override
    void onLoad(final Page previousPage) {
        $("#lst-ib").value("hogehoge")
    }
}

browser.drive {
    to GooglePage
    Thread.sleep(2000)
}.quit()
