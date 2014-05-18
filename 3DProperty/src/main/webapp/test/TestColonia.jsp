<%-- 
    Document   : ColoniasAdmin
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
    </head>
    <body>
        <div id="consultas">
            <s:if test="listaColonia.size>0">
                <script src="<%=request.getContextPath()%>/js/Eliminar.js"></script>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Número</th>
                        <th>Codigo Postal</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaColonia">
                        <tr>
                            <td>${idColonia}</td>
                            <td>${nombre}</td>
                            <td>${idCodigoPostal.numero}</td>
                            <td>
                                <a metodo="eliminarColonia.action" nombre="idColonia" ide="${idColonia}" class="eliminacion" href="#"> Eliminar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Colonia.</h1>
            </s:else>

        </div>
    </body>
</html>
