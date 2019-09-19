package digestivamente

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class RegistroDiarioServiceSpec extends Specification {

    RegistroDiarioService registroDiarioService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new RegistroDiario(...).save(flush: true, failOnError: true)
        //new RegistroDiario(...).save(flush: true, failOnError: true)
        //RegistroDiario registroDiario = new RegistroDiario(...).save(flush: true, failOnError: true)
        //new RegistroDiario(...).save(flush: true, failOnError: true)
        //new RegistroDiario(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //registroDiario.id
    }

    void "test get"() {
        setupData()

        expect:
        registroDiarioService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<RegistroDiario> registroDiarioList = registroDiarioService.list(max: 2, offset: 2)

        then:
        registroDiarioList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        registroDiarioService.count() == 5
    }

    void "test delete"() {
        Long registroDiarioId = setupData()

        expect:
        registroDiarioService.count() == 5

        when:
        registroDiarioService.delete(registroDiarioId)
        sessionFactory.currentSession.flush()

        then:
        registroDiarioService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        RegistroDiario registroDiario = new RegistroDiario()
        registroDiarioService.save(registroDiario)

        then:
        registroDiario.id != null
    }
}
