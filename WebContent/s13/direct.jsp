<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hello EL</title>
</head>
<body>
    <h1>Hello!</h1>
    <p>Request parameter x: ${param.x}</p> <!-- chiamata direttamente dall'utente perché accedo direttamente ai parametri -->
    <p>Request parameter y[1]: ${paramValues.y[1]}</p> 
    <p>Header host name: ${header.host}</p>
</body>
</html>
<!-- tutta la jsp è la response -->
<!-- dentro posso mettere anche la logica:  <p>Request parameter x: ${param.x*2}</p> ad esempio -->
<!-- host su cui gira il bw del client. header variabile che dà i paramentri del chiamante, l'ip -->