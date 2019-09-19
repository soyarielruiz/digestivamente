package digestivamente

import grails.gorm.services.Service

@Service(RegistroDiario)
interface RegistroDiarioService {

    RegistroDiario get(Serializable id)

    List<RegistroDiario> list(Map args)

    Long count()

    void delete(Serializable id)

    RegistroDiario save(RegistroDiario registroDiario)

}