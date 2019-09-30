package digestivamente

class Registro {

    String hora
    int escalaBristol
    String sensacionesFisicas
    String emociones
    int intensidadEmocional
    String pensamiento
    String conducta

    static constraints = {
        hora nullable: false
        escalaBristol range: 0..7, nullable: false
        sensacionesFisicas size: 3..255, nullable: false
        emociones inList: ["1) Contento/a o alegre", "2) Preocupado", "3) Enojado o irritado/a", "4) Asustado/a, ansioso/a o con miedo", "5) Triste o angustiado/a"], nullable: false
        intensidadEmocional range: 1..10, nullable: false
        pensamiento size: 3..255, nullable: false
        conducta size: 3..255, nullable: false
    }
}
