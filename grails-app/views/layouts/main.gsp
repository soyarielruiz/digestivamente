<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>

    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="apple-touch-icon" sizes="57x57" href="apple-icon-57x57.png"/>
    <asset:link rel="apple-touch-icon" sizes="60x60" href="apple-icon-60x60.png"/>
    <asset:link rel="apple-touch-icon" sizes="72x72" href="apple-icon-72x72.png"/>
    <asset:link rel="apple-touch-icon" sizes="76x76" href="apple-icon-76x76.png"/>
    <asset:link rel="apple-touch-icon" sizes="114x114" href="apple-icon-114x114.png"/>
    <asset:link rel="apple-touch-icon" sizes="120x120" href="apple-icon-120x120.png"/>
    <asset:link rel="apple-touch-icon" sizes="144x144" href="apple-icon-144x144.png"/>
    <asset:link rel="apple-touch-icon" sizes="152x152" href="apple-icon-152x152.png"/>
    <asset:link rel="apple-touch-icon" sizes="180x180" href="apple-icon-180x180.png"/>
    <asset:link rel="icon" type="image/png" sizes="192x192"  href="android-icon-192x192.png"/>
    <asset:link rel="icon" type="image/png" sizes="32x32" href="favicon-32x32.png"/>
    <asset:link rel="icon" type="image/png" sizes="96x96" href="favicon-96x96.png"/>
    <asset:link rel="icon" type="image/png" sizes="16x16" href="favicon-16x16.png"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
    <asset:link rel="manifest" href="/manifest.json"/>

    <meta name="msapplication-TileColor" content="#ffffff"/>
    <meta name="msapplication-TileImage" content="/ms-icon-144x144.png"/>
    <meta name="theme-color" content="#ffffff"/>
    
    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

%{--<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">--}%
%{--    <a class="navbar-brand" href="/#"><asset:image src="grails.svg" alt="Grails Logo"/></a>--}%
%{--    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">--}%
%{--        <span class="navbar-toggler-icon"></span>--}%
%{--    </button>--}%

%{--    <div class="collapse navbar-collapse" aria-expanded="false" style="height: 0.8px;" id="navbarContent">--}%
%{--        <ul class="nav navbar-nav ml-auto">--}%
%{--            <g:pageProperty name="page.nav"/>--}%
%{--        </ul>--}%
%{--    </div>--}%

%{--</nav>--}%

<g:layoutBody/>

%{--<div class="footer row" role="contentinfo">--}%
%{--    <div class="col">--}%
%{--        <a href="http://guides.grails.org" target="_blank">--}%
%{--            <asset:image src="advancedgrails.svg" alt="Grails Guides" class="float-left"/>--}%
%{--        </a>--}%
%{--        <strong class="centered"><a href="http://guides.grails.org" target="_blank">Grails Guides</a></strong>--}%
%{--        <p>Building your first Grails app? Looking to add security, or create a Single-Page-App? Check out the <a href="http://guides.grails.org" target="_blank">Grails Guides</a> for step-by-step tutorials.</p>--}%

%{--    </div>--}%
%{--    <div class="col">--}%
%{--        <a href="http://docs.grails.org" target="_blank">--}%
%{--            <asset:image src="documentation.svg" alt="Grails Documentation" class="float-left"/>--}%
%{--        </a>--}%
%{--        <strong class="centered"><a href="http://docs.grails.org" target="_blank">Documentation</a></strong>--}%
%{--        <p>Ready to dig in? You can find in-depth documentation for all the features of Grails in the <a href="http://docs.grails.org" target="_blank">User Guide</a>.</p>--}%

%{--    </div>--}%

%{--    <div class="col">--}%
%{--        <a href="https://grails-slack.cfapps.io" target="_blank">--}%
%{--            <asset:image src="slack.svg" alt="Grails Slack" class="float-left"/>--}%
%{--        </a>--}%
%{--        <strong class="centered"><a href="https://grails-slack.cfapps.io" target="_blank">Join the Community</a></strong>--}%
%{--        <p>Get feedback and share your experience with other Grails developers in the community <a href="https://grails-slack.cfapps.io" target="_blank">Slack channel</a>.</p>--}%
%{--    </div>--}%
%{--</div>--}%


<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
