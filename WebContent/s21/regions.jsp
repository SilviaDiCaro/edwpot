<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<sql:query dataSource="jdbc/hr" var="regions">select * from regions</sql:query> <!-- connessione al db. var=variabile  -->
<title>HR Regions</title> 
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach var="cur" items="${regions.rows}"> <!-- rows collezione di tutte le righe. cur è la riga corrente  -->
            <tr>
                <td>${cur.REGION_ID}</td> <!-- nomi vengono da Oracle, non li decidiamo noi -->
                <td>${cur.REGION_NAME}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>