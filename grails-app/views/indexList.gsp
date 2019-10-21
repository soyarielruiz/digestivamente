<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Digestivamente</title>
    <style type="text/css" media="screen">
    @media screen and ( min-width: 801px ) and (max-width: 1024px ) {
     .small-menu { 
          display:none; 
     }
.large-menu { 
          display:inline; 
     }
.large-menu ul { 
          list-style-type:none; 
     }
.large-menu ul li {
          display:inline;
     }
}
@media screen and (min-width: 1025px ) {
.small-menu { 
          display:none; 
     }
     .large-menu { 
          display:inline; 
     }
}
    </style>
</head>
<body>
<content tag="nav">
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Application Status <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a href="#">Environment: ${grails.util.Environment.current.name}</a></li>
            <li class="dropdown-item"><a href="#">App profile: ${grailsApplication.config.grails?.profile}</a></li>
            <li class="dropdown-item"><a href="#">App version:
                <g:meta name="info.app.version"/></a>
            </li>
            <li role="separator" class="dropdown-divider"></li>
            <li class="dropdown-item"><a href="#">Grails version:
                <g:meta name="info.app.grailsVersion"/></a>
            </li>
            <li class="dropdown-item"><a href="#">Groovy version: ${GroovySystem.getVersion()}</a></li>
            <li class="dropdown-item"><a href="#">JVM version: ${System.getProperty('java.version')}</a></li>
            <li role="separator" class="dropdown-divider"></li>
            <li class="dropdown-item"><a href="#">Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</a></li>
        </ul>
    </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Artefacts <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a href="#">Controllers: ${grailsApplication.controllerClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Domains: ${grailsApplication.domainClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Services: ${grailsApplication.serviceClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Tag Libraries: ${grailsApplication.tagLibClasses.size()}</a></li>
        </ul>
    </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Installed Plugins <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                <li class="dropdown-item"><a href="#">${plugin.name} - ${plugin.version}</a></li>
            </g:each>
        </ul>
    </li>
</content>

%{--<div class="svg" role="presentation">--}%
%{--    <div class="grails-logo-container">--}%
%{--        <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>--}%
%{--    </div>--}%
%{--</div>--}%

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Bienvenido a Digestivamente</h1>

        <p>
            Este proyecto es un prototipo de aplicación para la asignatura Aplicaciones Informaticas.
            Abajo se pueden encontrar los formularios para dar de alta a las principales entidades del sistema.
        </p>

        <div id="controllers" role="navigation" class="mx-auto large-menu">
            <ul class="list-inline mx-auto center justify-content-center">
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller alert alert-primary mx-auto" style="display: ${c.getStaticPropertyValue('nombre', String) != 'IndexImage' ? 'show' : 'none'}">
                            <g:link controller="${c.logicalPropertyName}">${c.getStaticPropertyValue('nombre', String)}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </section>
</div>

</body>
</html>
