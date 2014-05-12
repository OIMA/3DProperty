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
        <s:url id="usuarioURL" action="consultarUsuariosContratoJSON"/>
        <s:url id="propiedadURL" action="consultarPropiedadesContratoJSON"/>
        <div id="consultas">
            <s:if test="listaContrato.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Fecha</th>
                        <th>Descripcion</th>
                        <th>Propiedad</th>
                        <th>Usuario</th>
                    </tr>
                    <s:iterator value="listaContrato">
                        <tr>
                            <td>${idContrato}</td>
                            <td>${fecha}</td>
                            <td>${descripcion}</td>
                            <td>${idUsuario.nombre}</td>
                            <td>${idPropiedad.nombre}</td>
                            <td>
                                <a href="eliminarContrato.action?idContrato=${idContrato}"> Eliminar </a> 
                                <a href="consultarContrato.action?idContrato=${idContrato}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Contrato.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Contratos.</h1>
            <s:form action="guardarContrato" method="post" name="">
                <sj:select 
                        href="%{usuarioURL}" 
                        id="usuario" 
                        name="contrato.idUsuario.idUsuario" 
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
                        name="contrato.idPropiedad.idPropiedad" 
                        list="listaPropiedad" 
                        listKey="idPropiedad" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione una Propiedad"
                        label="Propiedad"
                        />
                <s:textfield label="Descripcion" name="contrato.descripcion"/>
                <s:textfield label="Fecha" name="contrato.fecha"/>
                <s:submit value="Guardar"/>
            </s:form>
        </div>
    </body>
</html>
