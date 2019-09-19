package digestivamente

class RegistroDiario {

    List<Registro> registrosIndividuales
    Date fecha
    int estadoAnimo

    static constraints = {
        fecha nullable: false
        estadoAnimo range: 1..10, nullable: true
    }
}
