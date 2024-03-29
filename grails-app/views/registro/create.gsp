<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'registro.label', default: 'Registro')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#create-registro" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="create-registro" class="content scaffold-create" role="main">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.registro}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.registro}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>
            <g:form resource="${this.registro}" method="POST">
                <fieldset class="form">
                    ¿Cómo fue al baño el día de hoy?
                    <g:img uri="https://i.ibb.co/nRzpgDq/bristol.jpg" width="420" height="210"/>
                    <f:field bean="registro" property= "escalaBristol"/>
                    <f:field bean="registro" property= "sensacionesFisicas"/>
                    ¿Cómo se siente?
                    <g:img uri="https://i.ibb.co/TBTWw4z/estado-animo.jpg" width="300" height="100"/>
                    <f:field bean="registro" property= "emociones"/>
                    ¿Con qué intensidad se sintió así?
                    <g:img uri="https://i.ibb.co/Kxns1N3/intensidad.jpg" width="250" height="100"/>
                    <f:field bean="registro" property= "intensidadEmocional"/>
                    ¿Qué estás pensando?
                    <f:field bean="registro" property= "pensamiento"/>
                    ¿Qué estás haciendo?
                    <f:field bean="registro" property= "conducta"/>
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
