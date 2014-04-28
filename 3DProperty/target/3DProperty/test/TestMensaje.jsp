<%-- 
    Document   : MensajesAdmin
    Created on : 18-mar-2014, 14:25:21
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
        <s:url id="propiedadURL" action="consultarPropiedadesJson"/>
        <s:url id="remitenteURL" action="consultarUsuariosJson"/>
        <s:url id="destinatarioURL" action="consultarUsuariosJson"/>
        <div id="consultas">
            <s:if test="listaMensaje.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>De</th>
                        <th>Para</th>
                        <th>Mensaje</th>
                        <th>Leido</th>
                        <th>Acerca de:</th>
                    </tr>
                    <s:iterator value="listaMensaje">
                        <tr>
                            <td>${idMensaje}</td>
                            <td>${idRemitente.nombreUsuario}</td>
                            <td>${idDestinatario.nombreUsuario}</td>
                            <td>${mensaje}</td>
                            <td>${statusLeido}</td>
                            <td>${idPropiedad.nombre}</td>
                            <td>
                                <a href="eliminarMensaje.action?idMensaje=${idMensaje}"> Eliminar </a> 
                                <a href="consultarMensaje.action?idMensaje=${idMensaje}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Mensaje.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Mensajes.</h1>
            <s:form action="guardarMensaje" method="post" name="">
                <s:textfield label="Mensaje" name="mensaje.mensaje" value=""/>
                <sj:select 
                        href="%{remitenteURL}" 
                        id="remitente" 
                        name="mensaje.idRemitente.idUsuario" 
                        list="listaUsuario" 
                        listKey="idUsuario" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione un Remitente"
                        label="Remitente"
                        />
                <sj:select 
                        href="%{destinatarioURL}" 
                        id="destinatario" 
                        name="mensaje.idDestinatario.idUsuario" 
                        list="listaUsuario" 
                        listKey="idUsuario" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione un Destinatario"
                        label="Destinatario"
                        />
                <sj:select 
                        href="%{propiedadURL}" 
                        id="propiedad" 
                        name="mensaje.idPropiedad.idPropiedad" 
                        list="listaPropiedades" 
                        listKey="idPropiedad" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione una Propiedad"
                        label="Propiedad"
                        />
                <s:submit value="Guardar"/>
            </s:form>
        </div>
    </body>
</html>
