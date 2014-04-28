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
        <s:url id="diseniadorURL" action="consultarDiseniadoresJson"/>
        <s:url id="disenioURL" action="consultarDiseniosJson"/>
        <div id="consultas">
            <s:if test="listaDiseniadorPropiedad.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Usuario</th>
                        <th>Propiedad</th>
                    </tr>
                    <s:iterator value="listaDiseniadorPropiedad">
                        <tr>
                            <td>${idDiseniadorPropiedad}</td>
                            <td>${idUsuario.nombre}</td>
                            <td>${idPropiedad.nombre}</td>
                            <td>
                                <a href="eliminarDiseniadorPropiedad.action?idDiseniadorPropiedad=${idDiseniadorPropiedad}"> Eliminar </a> 
                                <a href="consultarDiseniadorPropiedad.action?idDiseniadorPropiedad=${idDiseniadorPropiedad}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Diseniador Propiedad.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Diseniador Propiedades.</h1>
            <s:form action="guardarDiseniadorPropiedad" method="post" name="">
                <sj:select 
                        href="%{diseniadorURL}" 
                        id="usuario" 
                        name="diseniadorPropiedad.idUsuario.idUsuario" 
                        list="listaUsuario" 
                        listKey="idUsuario" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione un Usuario"
                        label="Diseñador"
                        />
                <sj:select 
                        href="%{disenioURL}" 
                        id="propiedad" 
                        name="diseniadorPropiedad.idDisenio.idDisenio" 
                        list="listaDisenio" 
                        listKey="idDisenio" 
                        listValue="idDisenio" 
                        headerKey="-1"
                        headerValue="Seleccione un Diseño"
                        label="Diseño ID"
                        />
                <s:submit value="Guardar"/>
            </s:form>
        </div>
    </body>
</html>
