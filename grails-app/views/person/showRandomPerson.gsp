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
    <img src="${resource(dir: 'images', file: 'banner.jpg')}"
         width="392" height="72" alt="vertical banner"/>
</div>
<div class="container">
    <div class="row">
        <div class="col-sm-3">
            <div class="container">
                <img src="data:image/jpeg;base64,${photo}" width="180">
            </div>
        </div>
        <div class="col-sm-7">
            <div class="container">
                <p>Имя: ${name}</p>
                <p>Дата рождения: ${birthDate}</p>
                <p>info</p>
                <p>info</p>
                <p>info</p>
                <p>info</p>
                <p>info</p>
                <p>info</p>
                <p>info</p>
            </div>
        </div>
        <div class="col-sm-2">
            <div class="container hidden-xs">
                <img src="${resource(dir: 'images', file: 'banner.jpg')}"
                     width="120" height="600" alt="vertical banner"/>
            </div>
        </div>
    </div>
</div>
</body>
</html>