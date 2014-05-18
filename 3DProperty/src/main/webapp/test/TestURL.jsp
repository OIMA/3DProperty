<%-- 
    Document   : TestURL
    Created on : 17-may-2014, 21:26:54
    Author     : Jesus
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@include file="../inc/jstl.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Test</title>
        <%@include file="../inc/Header.jsp" %>
        <%@include file="../inc/scripts.jsp" %>
    </head>
    <body>
       
        
        <s:form action="guardarCatalogoFotos" method="post" name="" enctype="multipart/form-data">
            <s:url id="paisURL1" action="consultarPaisesJson"/> 
            <sj:select 
                    href="%{paisURL1}" 
                    id="pais"  
                    name="idPais" 
                    list="listaPais" 
                    listKey="idPais" 
                    listValue="nombre" 
                    headerKey="-1"
                    headerValue="Seleccione un Pais"
                    />
            <s:submit value="Guardar"/>
        </s:form>
        <s:form action="guardarCatalogoFotos" method="post" name="" enctype="multipart/form-data">
            <s:url id="paisURL2" action="consultarPaisesJson"/> 
            <sj:select 
                    href="%{paisUR2}" 
                    id="pais"  
                    name="idPais" 
                    list="listaPais" 
                    listKey="idPais" 
                    listValue="nombre" 
                    headerKey="-1"
                    headerValue="Seleccione un Pais"
                    />
            <s:submit value="Guardar"/>
        </s:form>
</html>

