<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="dd.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hello JavaBeans</title>
</head>
<body>
    <h1>Hello!</h1>

    <!-- JavaBean accessed through scriptlet -->
    <div>
        <!-- calling toString() implicitly -->
        <span>User is <%=request.getAttribute("user")%></span> <!-- user is null -->
    </div>
    <div>
        <%
            User usr = (User) request.getAttribute("user"); // user is null
        %>
        User is <span><%=usr.getName()%>, <%=usr.getId()%></span> <!-- stampa una eccezione perché user è null -->
    </div>

    <!-- JavaBean accessed through standard action --> 
    <jsp:useBean id="user" class="dd.User" scope="request"> <!-- se nell'url metto localhost...fetch.JSP, Tomcat va su edwpot, cerca fetch.jsp e fino alla riga 15 esegue. Se commento 19-21, non dà più eccezione e stampa "Bob" e "42" -->
        <jsp:setProperty name="user" property="name" value="Bob" /> <!-- se invece non metto il .jsp, esegue fetcher.java. Prende la servlet e non la jsp -->
        <jsp:setProperty name="user" property="id" value="42" />
    </jsp:useBean>

    <div>
        User by Standard Action is
        <jsp:getProperty name="user" property="name" />,
        <jsp:getProperty name="user" property="id" />
    </div>
</body>
</html>