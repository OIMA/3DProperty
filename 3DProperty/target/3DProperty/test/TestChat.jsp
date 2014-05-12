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
        <script src="js/Chat.js"></script>
        <s:url id="destinatariosURL" action="consultarDestinatariosJson"/>
        <s:url id="guardarMensajeURL" action="guardarMensajeJson"/>
        <s:form id="formularioChat" action="guardarMensajeJson" method="POST" >
            <s:textarea label="Mensaje" name="mensaje.mensaje" cssClass="form-control"/>
            <input type="hidden" name="mensaje.idRemitente.idUsuario" value="${usuarioSession.idUsuario}" />
            <sj:autocompleter
                id="usuario" 
                name="idUsuario"
                label="Destinatario"
                href="%{destinatariosURL}" 
                list="usuarioList"
                listValue="nombreUsuario"
                listKey="idUsuario"
                loadMinimumCount="2"
                cssClass="form-control"
                onSelectTopics="autocompleteChange"
                selectBoxIcon="true"
                />
            <!--
                id="usuario" id: no importa
                name="idUsuario" el nombre que se recibe en el control, agregar en el control aparte de este atributo nombreAtributo_widget
                label="Destinatario" el label a mostrar
                href="%{destinatariosURL}" el url esta declarado mas arriba
                list="usuarioList" la lista de donde obtendra los valoes
                listValue="nombreUsuario" lo que va a mostrar
                listKey="idUsuario" el value de los option
                loadMinimumCount="2" a los cuantos caracteres escritos empieza a buscar el autocolpeter
                cssClass="form-control" 
                onSelectTopics="autocompleteChange" que pasa cuando se aleja
                selectBoxIcon="true"
            -->
            <div id="selectPropiedades" class="control-group">
            </div>
            <sj:submit 
	            	id="envioJS"
	            	href="%{guardarMensajeURL}" 
	            	targets="mensajes"
	            	value="Enviar Mensaje" 
	            	button="true"
	            	/>
            <div id="mensajes"></div>
        </s:form>
        <br/>
    </body>
</html>

