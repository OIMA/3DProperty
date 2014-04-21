<%-- 
    Document   : index
    Created on : 22-nov-2013, 10:48:49
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
        <h1>Ingreso al sistema</h1>
        <s:actionerror cssStyle="color:red; size:12px" />
        <s:form action="login" name="login" id="loginForm" method="POST" namespace="/"  >
            <s:textfield name="usuario.usuario" label="Usuario" />
            <s:textfield name="usuario.pass" label="Password" />
            <s:submit value="Entrar al Sistema" />            
        </s:form>
    </body>
</html>
