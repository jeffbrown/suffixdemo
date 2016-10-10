package demo

class DemoController {

    def index() {
        def p = new Person(name: 'Jeff').save()

        respond p
    }
}
