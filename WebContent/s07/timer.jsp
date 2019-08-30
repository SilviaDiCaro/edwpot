<%@ page import="java.time.LocalTime"%> <!-- import di una libreria java (in) -->
<!DOCTYPE html> 
<html>
<head>
<meta charset="utf-8">
<title>Hello JSP</title>
</head>
<body>
    <h1>
        <%
            out.print(LocalTime.now());
        %> <!-- solo tag di apertura dentro al quale c'è codice java. "out" è la pagina stessa -->
    </h1>
</body>
</html>