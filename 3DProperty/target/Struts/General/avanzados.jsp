<%-- 
    Document   : ver_datos
    Created on : Feb 4, 2014, 7:39:38 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib prefix = "s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Los datos capturados fueron avanzados:</h1>
        <h2>Nombre: <s:property value="alumno.nombre"/></h2>
        <h2>Carrera: <s:property value="alumno.carrera"/></h2>
        <h2>Semestre: <s:property value="alumno.semestre"/></h2>
        <h1><s:property value="txt"/></h1>
    </body>
</html>
