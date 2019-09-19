package digestivamente

import grails.gorm.services.Service

@Service(RegistroSemanal)
interface RegistroSemanalService {

    RegistroSemanal get(Serializable id)

    List<RegistroSemanal> list(Map args)

    Long count()

    void delete(Serializable id)

    RegistroSemanal save(RegistroSemanal registroSemanal)

}