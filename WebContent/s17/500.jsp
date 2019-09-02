<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error page</title>
</head>
<body>
    <h1>Internal error</h1>

    <div>
        <div>Exception: ${pageContext.exception["class"]}</div> <!-- trova l'eccezione, dì qual è -->
        <div>Message: ${pageContext.exception["message"]}</div> <!-- messaggio eccezione -->
    </div>
    
    <p>For more details, ask ${initParam.admin}</p> <!-- chiedi al responsabile della pagina -->

    <a href="/edwpot/">The edwpot home page</a>
</body>
</html>