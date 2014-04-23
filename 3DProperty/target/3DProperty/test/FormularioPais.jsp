<%-- 
    Document   : FormularioPais
    Created on : Apr 21, 2014, 5:46:57 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
        <title>JSP Page</title>
        <%@include file="../inc/jstl.jsp" %>
        
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:form action="InsertarPais" method="post">
            <s:textfield label="Nombre" name="pais.nombre" />
            <s:submit value="Guardar"></s:submit>
        </s:form>
    </body>
</html>
