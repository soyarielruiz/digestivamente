package digestivamente

class Usuario {

    String nombreDeUsuario
    String contraseña
    String nombres
    String apellidos
    Date fechaDeNacimiento
    String sexo
    String nivelEducativo
    String trabajo
    String lugarDeResidencia
    String grupoFamiliar
    String diagnosticoDeTrastornoMental
    String enfermedades
    String estresores
    String medicacion
    String tiempoQueTieneSII
    String antecedentesPersonales
    String antecedentesFamiliares
    String otrosAspectosRelevantes

    List<Informe> informes
    List<RegistroSemanal> registrosSemanales

    static constraints = {
        nombreDeUsuario size: 3..20, nullable: false
        contraseña size: 3..20, nullable: false, password: true
        nombres size: 3..255, blank: false, nullable: false
        apellidos size: 3..255, blank: false, nullable: false
        fechaDeNacimiento nullable: false
        sexo inList: ["M","F","N/A"], nullable: false
        nivelEducativo inList: ["Primario", "Secundario", "Terciario", "Universitario", "N/A"], nullable: false
        trabajo size: 3..255, blank: false, nullable: false
        lugarDeResidencia size: 3..255, blank: false, nullable: false
        grupoFamiliar size: 3..255, blank: false, nullable: false
        diagnosticoDeTrastornoMental size: 3..255, blank: false, nullable: true
        enfermedades size: 3..255, blank: false, nullable: true
        estresores size: 3..255, blank: false, nullable: true
        medicacion size: 3..255, blank: false, nullable: true
        tiempoQueTieneSII size: 3..255, blank: false, nullable: true
        antecedentesPersonales size: 3..255, blank: false, nullable: true
        antecedentesFamiliares size: 3..255, blank: false, nullable: true
        otrosAspectosRelevantes size: 3..255, blank: false, nullable: true
    }
}
