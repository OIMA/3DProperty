<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix = "s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OIMA</title>
    </head>
    <body>
        <h1>Lista de alumnos!</h1>
        <s:if test="listaAlumnos.size>0" >
            <table>
                <tr>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <th>CARRERA</th>
                    <th>SEMESTRE</th>
                    <th>PROMEDIO</th>
                    <th>FECHA_DE_NAC</th>
                    <th>FECHA CON FORMATO</th>
                </tr>
                <tr>
                    <th>${idAlumno}</th>
                    <th>${nombre} ${ap_pat} ${ap_mat}</th>
                    <th>${carrera}</th>
                    <th>${semestre}</th>
                    <th>${promedio}</th>
                    <th>${fecha_nacimiento}</th>
                <th><s:date name="fecha_nacimiento" format="dd/MM/yyyy"/></th>
                </tr>
            </table>
        </s:if><s:else><h1>No hay alumnos!</h1></s:else>
    </body>
</html>
