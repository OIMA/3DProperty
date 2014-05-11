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
    </head>
    <body>
        ${usuarioSession.idUsuario}
        <s:url id="destinatariosURL" action="consultarDestinatariosJson"/>
        <s:url id="propiedadURL" action="consultarPropiedadesPorUsuarioJson"/>
        <s:form id="formularioChat" action="guardarMensaje">
            <s:textarea label="Mensaje" name="mensaje.mensaje" />
            <input type="hidden" name="mensaje.idRemitente.idUsuario" value="${usuarioSession.idUsuario}" />
            <sj:autocompleter 
                id="usuario" 
                name="idUsuario"
                label="Seleccione"
                href="%{destinatariosURL}" 
                list="usuarioList"
                listValue="nombreUsuario"
                listKey="idUsuario"
                onChangeTopics="recargarPropiedades"
	    	onFocusTopics="recargarPropiedades"
	    	onSelectTopics="recargarPropiedades"
                loadMinimumCount="2"
                />
            <sj:select 
                href="%{propiedadesURL}" 
                id="propiedad" 
                reloadTopics="recargarPropiedades" 
                name="mensaje.idPropiedad.idPropiedad"
                formIds="formularioChat"
                list="listaPropiedad"
                listKey="idPropiedad" 
                listValue="nombre"
                headerKey="-1" 
                headerValue="Seleccione una Propiedad" 
                />
        </s:form>
        <br/>
    </body>
</html>

