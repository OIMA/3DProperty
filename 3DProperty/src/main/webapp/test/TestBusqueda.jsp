<%-- 
    Document   : TestChat
    Created on : 10-may-2014, 18:17:26
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
        <script src="js/Busqueda.js"></script>
    </head>
    <s:url id="busquedaURL" action="obtenerListaClaveJson"/>

    <sj:autocompleter
        id="idPC" 
        name="idPalabraClave"
        label="Introduzca Palabra Clave"
        href="%{busquedaURL}" 
        list="palabraClaveList"
        listValue="palabra"
        listKey="idPalabraClave"
        loadMinimumCount="2"
        cssClass="form-control"
        value=""
        onSelectTopics="autocompleteChange"
        />
    <div id="inyeccionPropiedades"></div>
</body>
</html>

