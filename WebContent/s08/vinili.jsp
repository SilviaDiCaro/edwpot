<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> <!-- info sulla pagina -->
<%@ page import="java.util.*"%> <!-- il codice java usa qualcosa nella libreria java.util -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSP &amp; request</title>
</head> 
<body>
    <h1>Hello!</h1>
    <p>
        The user name
        <%
            @SuppressWarnings("unchecked") 
            Set<Character> set = (Set<Character>) request.getAttribute("set"); /* (dalla request faccio una getattribute per set ma gli attributi sono visti come mappa chiave(stringa)valore(object)). non sa se è scorretto e fa il warning (lo sopprimo). oggetto che casto come set */
            if (set == null || set.isEmpty()) { /* verifico che non sia null (potrei aver sbagliato a scrivere) */
                out.print("is empty"); /* verifico non sia vuoto */
            } else {
                out.print("contains these letters:");

                Iterator<Character> it = set.iterator(); /* iteratore= puntatore, oggetto che vede il set e si posiziona prima del primo elemento. punta a un elemento fittizio prima del prima elemento e stampa i successori con it.next() */
                while (it.hasNext()) {
                    out.print(" " + it.next()); /*i set non hanno indice, le liste sì*/
                }
            }
        %>
    </p>
</body>
</html>

<%-- 
<%@ info aggiuntiva sul documento jsp --%>