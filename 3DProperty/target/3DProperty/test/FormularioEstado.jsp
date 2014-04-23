<%-- 
    Document   : FormularioEstado
    Created on : Apr 21, 2014, 7:57:37 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
        <%@include file="../inc/jstl.jsp" %>
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:form action="InsertarEstado" method="post">
            <s:textfield label="Nombre" name="estado.nombre"/>
            <s:if test="listaPaises.size > 0">
                <s:select 
                    name="estado.idPais.idPais" 
                    list="listaPaises"
                    listKey="%{idPais}"
                    listValue="%{nombre}"
                    headerKey="0"
                    headerValue="Selecciona un pais...">
                
            </s:select>
            </s:if>
            <s:else>
                gatas
            </s:else>
            <s:submit value="guardar" />
        </s:form>
    </body>
</html>
