<%-- 
    Document   : otra
    Created on : 22-nov-2013, 11:13:59
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesiones</title>
    </head>
    <body>
        <h1>OTRA PÁGINA PROTEGIDA</h1>
        <h1>Las siguientes son variables de sesión</h1>
        <h1>${usuario_sesion.nombre} ${usuario_sesion.paterno} ${usuario_sesion.materno}</h1>
        <br />
        <br />
        <s:a href="inicio.action" >IR AL INICIO</s:a>
        <br />
        <br />
        <s:a href="cerrarsesion.action" >CERRAR SESIÓN</s:a>
    </body>
</html>
