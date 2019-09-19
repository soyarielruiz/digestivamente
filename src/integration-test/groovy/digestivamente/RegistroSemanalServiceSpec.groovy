package digestivamente

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class RegistroSemanalServiceSpec extends Specification {

    RegistroSemanalService registroSemanalService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new RegistroSemanal(...).save(flush: true, failOnError: true)
        //new RegistroSemanal(...).save(flush: true, failOnError: true)
        //RegistroSemanal registroSemanal = new RegistroSemanal(...).save(flush: true, failOnError: true)
        //new RegistroSemanal(...).save(flush: true, failOnError: true)
        //new RegistroSemanal(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //registroSemanal.id
    }

    void "test get"() {
        setupData()

        expect:
        registroSemanalService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<RegistroSemanal> registroSemanalList = registroSemanalService.list(max: 2, offset: 2)

        then:
        registroSemanalList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        registroSemanalService.count() == 5
    }

    void "test delete"() {
        Long registroSemanalId = setupData()

        expect:
        registroSemanalService.count() == 5

        when:
        registroSemanalService.delete(registroSemanalId)
        sessionFactory.currentSession.flush()

        then:
        registroSemanalService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        RegistroSemanal registroSemanal = new RegistroSemanal()
        registroSemanalService.save(registroSemanal)

        then:
        registroSemanal.id != null
    }
}
