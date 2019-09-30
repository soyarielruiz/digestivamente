package digestivamente

import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if (Environment.current == Environment.DEVELOPMENT) {
            Registro juanRegistro1 = new Registro(
                    hora: '2019-09-28T22:58:56.028',
                    escalaBristol: 3,
                    sensacionesFisicas: 'Hinchazón',
                    emociones: 'mal',
                    intensidadEmocional: 7,
                    pensamiento: 'Voy a desaprobar Análisis Matemático',
                    conducta: 'Estoy estudiando para el final'
            ).save()

            Registro juanRegistro2 = new Registro(
                    hora: '2019-09-28T23:58:56.028',
                    escalaBristol: 5,
                    sensacionesFisicas: 'Dolor de panza',
                    emociones: 'mal',
                    intensidadEmocional: 9,
                    pensamiento: 'Voy a desaprobar Análisis Matemático',
                    conducta: 'Sigo estudiando para el final'
            ).save()

            Registro mariaRegistro1 = new Registro(
                    hora: '2019-09-24T23:58:56.028',
                    escalaBristol: 5,
                    sensacionesFisicas: 'Dolor de panza',
                    emociones: 'muy mal',
                    intensidadEmocional: 5,
                    pensamiento: 'Voy a desaprobar Algebra',
                    conducta: 'Estoy estudiando para el final de Algebra'
            ).save()

            RegistroDiario juanRegistroDiario1 = new RegistroDiario(
                    registrosIndividuales: [juanRegistro1, juanRegistro2],
                    fecha: new Date(2019, 9, 28),
                    estadoAnimo: 7
            ).save()

            RegistroDiario mariaRegistroDiario1 = new RegistroDiario(
                    registrosIndividuales: [mariaRegistro1],
                    fecha: new Date(2019, 9, 24),
                    estadoAnimo: 5
            ).save()

            RegistroSemanal juanRegistroSemanal1 = new RegistroSemanal(
                    registrosDiarios: [juanRegistroDiario1],
                    estresoresSemanales: "Tuve dos finales"
            ).save()

            RegistroSemanal mariaRegistroSemanal1 = new RegistroSemanal(
                    registrosDiarios: [mariaRegistroDiario1],
                    estresoresSemanales: "Tuve muchos dias dificiles"
            ).save()

            Usuario juan = new Usuario(
                    nombreDeUsuario: "juanperez",
                    contraseña: "asdfgh",
                    nombres: "Juan",
                    apellidos: "Perez",
                    fechaDeNacimiento: new Date(1990, 12, 25),
                    sexo: "M",
                    email: "juan@example.com",
                    nivelEducativo: "Secundario",
                    trabajo: "Estudiante",
                    lugarDeResidencia: "Ciudad de Buenos Aires",
                    grupoFamiliar: "Padre, madre y dos hermanos",
                    diagnosticoDeTrastornoMental: "Trastorno bipolar",
                    enfermedades: "Diabetes",
                    estresores: "Facultad, Familia",
                    medicacion: "Ninguna",
                    tiempoQueTieneSII: "",
                    antecedentesPersonales: "",
                    antecedentesFamiliares: "",
                    otrosAspectosRelevantes: "",
                    informes: [],
                    registrosSemanales: [juanRegistroSemanal1]
            ).save()

            Usuario maria = new Usuario(
                    nombreDeUsuario: "mariagarcia",
                    contraseña: "654321",
                    nombres: "Maria",
                    apellidos: "Garcia",
                    fechaDeNacimiento: new Date(1988, 2, 12),
                    sexo: "F",
                    email: "maria@example.com",
                    nivelEducativo: "Secundario",
                    trabajo: "Administrativa",
                    lugarDeResidencia: "Ciudad de Buenos Aires",
                    grupoFamiliar: "Padre y madre",
                    diagnosticoDeTrastornoMental: "Ninguno",
                    enfermedades: "Ninguna",
                    estresores: "Facultad, Familia",
                    medicacion: "Ninguna",
                    tiempoQueTieneSII: "",
                    antecedentesPersonales: "",
                    antecedentesFamiliares: "",
                    otrosAspectosRelevantes: "",
                    informes: [],
                    registrosSemanales: [mariaRegistroSemanal1]
            ).save()

            Sistema sistema = new Sistema(
                    usuarios: [juan, maria]
            ).save()

            def destroy = {
            }
        }
    }
}
