<%-- 
    Document   : ConsultarEstados
    Created on : Apr 22, 2014, 11:17:28 AM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
        <%@include file="../inc/jstl.jsp" %>
        <%@include file="../inc/Header.jsp" %>
    </head>
    <body>
        <h1>Consultar estado!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Pais</th>
                    <th>Editar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator
                    value="listaEstados">
                    <tr>
                        <td>${idEstado}</td>
                        <td>${nombre}</td>
                        <td>${idPais.nombre}</td>
                        <td><button class="botonEditar" value="${idEstado}">Editar</button></td>
                        <td><button class="botonEliminar" value="${idEstado}">Eliminar</button></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
        <%@include file="../inc/scripts.jsp" %>
        <script src="js/Catalogos.js"></script>
    </body>
</html>
