<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Paesi Europei</title>
</head>
<body>
<i>Paesi europei</i>
<sql:query dataSource="jdbc/hr" var="countries">select c.country_id, c.country_name from regions r join countries c on(r.region_id = c.region_id)
where r.region_id = 1</sql:query> <!-- connessione al db. var=variabile  -->

</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach var="cur" items="${countries.rows}"> <!-- rows collezione di tutte le righe. cur è la riga corrente  -->
            <tr>
                <td>${cur.COUNTRY_ID}</td> <!-- nomi vengono da Oracle, non li decidiamo noi -->
                <td>${cur.COUNTRY_NAME}</td>
            </tr>
        </c:forEach>
    </table>