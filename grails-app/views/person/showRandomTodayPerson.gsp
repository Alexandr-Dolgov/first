<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="bootstrap"/>
</head>

<body>
<div class="container">
    <div>
        <div>
            <g:if test="${name != null}">
                <p>Имя: ${name}</p>
                <p>Дата рождения: ${birthDate}</p>
            </g:if>
            <g:else>
                <h3>Сегодня никто не родился</h3>
            </g:else>
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
</div>
</body>
</html>