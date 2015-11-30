<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="bootstrap"/>
</head>

<body>
<header class="container">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#main-navbar-collapse" aria-expanded="false">
                    <span class="sr-only">Открыть меню</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Brand</a>
            </div>

            <div class="collapse navbar-collapse" id="main-navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><g:link action="showRandomTodayPerson">Персона дня</g:link></li>
                    <li><a href="#">Кто ещё сегодня родился</a></li>
                    <li><g:link action="showRandomPerson">Случайный человек</g:link></li>
                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Войти</a></li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<div class="container visible-xs">
    <img class="center-block" src="${resource(dir: 'images', file: 'banner.jpg')}"
         width="392" height="72" alt="vertical banner"/>
</div>
<div class="container spacer">
    <div class="row">
        <div class="col-sm-10">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-4">
                    <p class="text-center">${name} (${birthDate})</p>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4">
                    <img class="center-block" src="data:image/jpeg;base64,${photo}" width="180">
                </div>
                <div class="col-sm-8">
                    <div class="container">
                        <p>info</p>
                        <p>info</p>
                        <p>info</p>
                        <p>info</p>
                        <p>info</p>
                        <p>info</p>
                        <p>info</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-2 hidden-xs">
            <img class="center-block" src="${resource(dir: 'images', file: 'banner.jpg')}"
                 width="120" height="600" alt="vertical banner"/>
        </div>
    </div>
</div>
</body>
</html>