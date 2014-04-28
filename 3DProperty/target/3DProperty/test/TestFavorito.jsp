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
            <s:if test="listaFavorito.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Usuario</th>
                        <th>Propiedad</th>
                        <th>Estrellas</th>
                    </tr>
                    <s:iterator value="listaFavorito">
                        <tr>
                            <td>${idFavorito}</td>
                            <td>${idUsuario.nombre}</td>
                            <td>${idPropiedad.nombre}</td>
                            <td>${noEstrellas}</td>
                            <td>
                                <a href="eliminarFavorito.action?idFavorito=${idFavorito}"> Eliminar </a> 
                                <a href="consultarFavorito.action?idFavorito=${idFavorito}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Favorito.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Favoritos.</h1>
            <s:form action="guardarFavorito" method="post" name="">
                <sj:select 
                        href="%{usuarioURL}" 
                        id="usuario" 
                        name="favorito.idUsuario.idUsuario" 
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
                        name="favorito.idPropiedad.idPropiedad" 
                        list="listaPropiedades" 
                        listKey="idPropiedad" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione una Propiedad"
                        label="Propiedad"
                        />
                <s:textfield label="No. Estrellas" name="favorito.noEstrellas"/>
                <s:submit value="Guardar"/>
            </s:form>
        </div>
    </body>
</html>
