<%-- 
    Document   : CodigoPostalsAdmin
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
        <div id="consultas">
            <s:url id="paisURL" action="consultarPaisesJson"/> 
            <s:url id="estadoURL" action="consultaEstadosPorPaisJson"/>
            <s:url id="localidadURL" action="consultaLocalidadesPorEstadoJson"/>
            <s:if test="listaCodigoPostal.size>0">
                <script src="<%=request.getContextPath()%>/js/Eliminar.js"></script>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Número</th>
                        <th>Localidad</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaCodigoPostal">
                        <tr>
                            <td>${idCodigoPostal}</td>
                            <td>${numero}</td>
                            <td>${idLocalidad.nombre}</td>
                            <td>
                                <a metodo="eliminarCodigoPostal.action" nombre="idCodigoPostal" ide="${idCodigoPostal}" class="eliminacion" href="#"> Eliminar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Codigo Postal.</h1>
            </s:else>
        </div>
    </body>
</html>
