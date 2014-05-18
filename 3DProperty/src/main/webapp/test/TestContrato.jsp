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
                <script src="<%=request.getContextPath()%>/js/Eliminar.js"></script>
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
                                <a metodo="eliminarContrato.action" nombre="idContrato" ide="${idContrato}" class="eliminacion" href="#"> Eliminar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Contrato.</h1>
            </s:else>

        </div>
    </body>
</html>
