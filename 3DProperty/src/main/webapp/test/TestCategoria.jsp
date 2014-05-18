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
        
    </head>
    <body>
        <div id="consultas">
            <s:if test="listaCategoria.size>0">
                <script src="<%=request.getContextPath()%>/js/Eliminar.js"></script>
                <table>
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Descripci&oacute;n</th>
                        <th>Acciones</th>
                    </tr>
                    </thead>
                    <s:iterator value="listaCategoria">
                        <tr>
                            <td>${idCategoria}</td>
                            <td>${nombre}</td>
                            <td>${descripcion}</td>
                            <td>
                                <a metodo="eliminarCategoria.action" nombre="idCategoria" ide="${idCategoria}" class="eliminacion" href="#"> Eliminar </a> 
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Categoria.</h1>
            </s:else>

        </div>
    </body>
</html>
