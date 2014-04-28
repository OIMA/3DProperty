<%-- 
    Document   : EstadosAdmin
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
        <s:url id="usuarioURL" action="consultarUsuariosJson"/>
        <s:url id="propiedadURL" action="consultarPropiedadesJson"/>
        <div id="consultas">
            <s:if test="listaHistorial.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Usuario</th>
                        <th>Propiedad</th>
                        <th>Fecha</th>
                    </tr>
                    <s:iterator value="listaHistorial">
                        <tr>
                            <td>${idHistorial}</td>
                            <td>${idUsuario.nombre}</td>
                            <td>${idPropiedad.nombre}</td>
                            <td>${fecha}</td>
                            <td>
                                <a href="eliminarHistorial.action?idHistorial=${idHistorial}"> Eliminar </a> 
                                <a href="consultarHistorial.action?idHistorial=${idHistorial}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Historial.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Historial.</h1>
            <s:form action="guardarHistorial" method="post" name="">
                <sj:select 
                        href="%{usuarioURL}" 
                        id="usuario" 
                        name="historial.idUsuario.idUsuario" 
                        list="listaUsuario" 
                        listKey="idUsuario" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione un Usuario"
                        label="Usuario"
                        />
                <sj:select 
                        href="%{propiedadURL}" 
                        id="propiedad" 
                        name="historial.idPropiedad.idPropiedad" 
                        list="listaPropiedades" 
                        listKey="idPropiedad" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione una Propiedad"
                        label="Propiedad"
                        />
                <s:textfield label="Fecha" name="historial.fecha"/>
                <s:submit value="Guardar"/>
            </s:form>
        </div>
    </body>
</html>
