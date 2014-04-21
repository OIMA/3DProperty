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
        <h1>Hola mundo!</h1>
        <s:a action="formularioAlumno"> Insertar alumno</s:a><!-- -->
        <s:a action="consulta"> Consultar alumno </s:a>
    </body>
</html>
