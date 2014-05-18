<%-- 
    Document   : LocalidadsAdmin
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
        <s:url id="paisURL" action="consultarPaisesJson"/> 
        <s:url id="estadoURL" action="consultaEstadosPorPaisJson"/>
        <div id="consultas">
            <s:if test="listaLocalidad.size>0">
                <script src="<%=request.getContextPath()%>/js/Eliminar.js"></script>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Estado</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaLocalidad">
                        <tr>
                            <td>${idLocalidad}</td>
                            <td>${nombre}</td>
                            <td>${idEstado.nombre}</td>
                            <td>
                                <a metodo="eliminarLocalidad.action" nombre="idLocalidad" ide="${idLocalidad}" class="eliminacion" href="#"> Eliminar </a> 
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Localidad.</h1>
            </s:else>

        </div>
    </body>
</html>
