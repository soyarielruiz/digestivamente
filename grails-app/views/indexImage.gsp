<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Digestivamente</title>
    <style type="text/css" media="screen">
    
    #container {
        margin-left: auto;
        margin-right: auto;
        margin-top: auto;
        margin-bottom: auto;
        width: 50%;
        height: 50%;
        display: table;
        background-color: #ccc;         
    }

    #container .image-container {
        text-align: center;
        vertical-align: middle;
        display: table-cell;
    }

    #container .image-container img {
        max-width: 800px;
        max-height: 600px;        
    }

    @media (max-width:767px){
        img {
            width: 360px;
            height: 400px;
        }
    }

    </style>
</head>
<body>

<div id="content" role="main">
    <div id="container">
        <div class="image-container">
            <a href="${createLink(action:'redirect', controller: 'indexImage')}">
                <img src="https://i.ibb.co/GVGj75G/DIGESTIVAMENTE-editable.png" alt="logo">
            </a>
        </div>
    </div>

</div>

</body>
</html>