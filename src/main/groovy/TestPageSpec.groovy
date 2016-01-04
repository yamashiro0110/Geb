import geb.spock.GebSpec

class TestPageSpec extends GebSpec {
    def "Google"() {
        when:
        go "https://www.google.co.jp/"

        then:
        title == "Google"
    }
}
