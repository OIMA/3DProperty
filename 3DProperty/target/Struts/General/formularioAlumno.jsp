<%-- 
    Document   : formularioAlumno
    Created on : 28-ene-2014, 20:08:54
    Author     : Jesus
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib prefix = "s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>OIMA</title>
    </head>
    <body>
        <h1>Formulario con STRUTS2 :)</h1>
        <s:form id="formularioDePrueba" action="guardarAlumno" method="post" name="alumno">
            <s:textfield id="campoNombre" label="Nombre" name="alumno.nombre"/>
            <s:textfield id="campoApPat" label="ApPat" name="alumno.ap_pat"/>
            <s:textfield id="campoApMat" label="ApMat" name="alumno.ap_mat"/>
            <s:textfield id="campoCarrera" label="Carrera de la persona" name="alumno.carrera"/>
            <s:textfield id="campoSemestre" label="Semestre" name="alumno.semestre"/>
            <s:textfield id="campoPromedio" label="Promedio" name="alumno.promedio"/>
            <s:textfield id="campoFechaNacimento" label="Fecha de Nacimiento" name="alumno.fecha_nacimiento"/>
            <s:submit value="Enviar datos" />
        </s:form>
    </body>
</html>
