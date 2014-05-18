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
        <script src="<%=request.getContextPath()%>/js/Chat.js"></script>
    </head>
    <body>
        ${usuarioSession.idUsuario}<!--si aparece un numero hay sesion-->
        <div id="mensajes">
            <div id="mensajesEnviados">
                <table id="mensajesEnviadosTable">
                    <thead>
                        <tr>
                            <th>Mensaje</th>
                            <th>Para</th>
                            <th>Acerca De Propiedad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="mensajeList">
                            <tr>
                                <td>${mensaje}</td>
                                <td>${idDestinatario.nombreUsuario}</td>
                                <td>${idPropiedad.nombre}</td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div id="mensajesRecibidos">
                <table>
                    <thead>
                        <tr>
                            <th>Mensaje</th>
                            <th>De:</th>
                            <th>Acerca De Propiedad</th>
                            <th>Leido ?</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="mensajeRecibidosList">
                            <tr>
                                <td>${mensaje}</td>
                                <td>${idRemitente.nombreUsuario}</td>
                                <td>${idPropiedad.nombre}</td>
                                <td>${statusLeido}</td>
                                <td>
                                    <a href="#" class="marcarMensaje" ide="${idMensaje}">Marcar como leido.</a>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
        </div>
        <!--Ojo son necesarios-->
        <input id="nombreUsuario" type="hidden" value="${usuarioSession.nombreUsuario}" />
        <s:url id="destinatariosURL" action="consultarDestinatariosJson"/>
        <s:url id="guardarMensajeURL" action="guardarMensajeJson"/>
        <div id="Mensaje">
            <s:form id="formularioChat" action="guardarMensajeJson" method="POST" >
                <s:textarea id="mensaje" label="Mensaje" name="mensaje.mensaje" cssClass="form-control"/>
                <input id="idUsuario" type="hidden" name="mensaje.idRemitente.idUsuario" value="${usuarioSession.idUsuario}" />
                <sj:autocompleter
                    id="destinatario" 
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
                    value=""
                    autoFocus="true"
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
                    onCompleteTopics="mensajesComplete"
                    id="envioJS"
                    href="%{guardarMensajeURL}" 
                    value="Enviar Mensaje" 
                    button="true"
                    targets="hiddenMensajes"
                    />
                <div id="hiddenMensajes"></div>
            </s:form>
        </div>
        <br/>
    </body>
</html>

