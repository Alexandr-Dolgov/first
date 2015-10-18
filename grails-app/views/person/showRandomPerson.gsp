<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="bootstrap"/>
</head>

<body>
<div class="container">
    <div>
        <p>Имя: ${name}</p>
        <p>Дата рождения: ${birthDate}</p>
    </div>

    <div align="center">
        <h2>
            <g:link action="showRandomPerson">
                Случайный человек
            </g:link>
        </h2>
    </div>

    <div align="center">
        <h2>
            <g:link action="showRandomTodayPerson">
                ДР сегодня
            </g:link>
        </h2>
    </div>
</div>
</body>
</html>