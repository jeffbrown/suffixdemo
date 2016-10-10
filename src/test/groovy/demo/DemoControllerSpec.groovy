package demo

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
@Mock(Person)
class DemoControllerSpec extends Specification {

    void "test model suffix"() {
        when:
        controller.index()

        then:
        model.personInstance instanceof Person
        model.personInstance.name == 'Jeff'
    }
}
