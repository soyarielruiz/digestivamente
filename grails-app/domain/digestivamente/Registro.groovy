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
        emociones inList: ["muy bien", "bien", "regular", "mal", "muy mal"], nullable: false
        intensidadEmocional range: 1..10, nullable: false
        pensamiento size: 3..255, nullable: false
        conducta size: 3..255, nullable: false
    }
}
