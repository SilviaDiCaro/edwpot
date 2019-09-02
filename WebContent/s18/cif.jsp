<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!-- usa una tag library -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core if</title>
</head>
<body>
    <h1>This JSP expects x or y as parameter</h1>
    <c:if test="${param.x != null}"> <!-- "c" sta per core perché l'ho specificato alla riga 2->prefix="c" -->
        <p>Parameter x is ${param.x}</p>
    </c:if>
    <c:if test="${param.y != null}">
        <p>Parameter y is ${param.y}</p>
    </c:if>
</body>
</html>
<!-- attributo all'interno dell'open tag nome="valore". Attributo uri dellìelemento taglib
indicizza le componenti caricate in lib -->