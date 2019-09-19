package digestivamente

class RegistroSemanal {

    List<RegistroDiario> registrosDiarios
    String estresoresSemanales

    static constraints = {
        estresoresSemanales size: 3..255, nullable: true
    }
}
