<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Человек дня</title>
</head>

<body>
<div align="center">
    <div align="left" style="width: 50%">
        <div style="width: 75%; float: left">
            <g:if test="${name != null}">
                <p>Имя: ${name}</p>
                <p>Дата рождения: ${birthDate}</p>
            </g:if>
            <g:else>
                <h3>Сегодня никто не родился</h3>
            </g:else>
        </div>
        <div style="width: 25%; float: right">
            <ul>
                <li>
                    <g:link action="index">
                        Админка
                    </g:link>
                </li>
            </ul>
        </div>
        <div align="center" style="clear: both">
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
</div>
</body>
</html>