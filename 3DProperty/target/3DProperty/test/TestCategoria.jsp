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
                                <a href="eliminarCategoria.action?idCategoria=${idCategoria}"> Eliminar </a> 
                                <a href="consultarCategoria.action?idCategoria=${idCategoria}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Categoria.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Categoria.</h1>
            <s:form action="guardarCategoria" method="post" name="">
                <s:textfield label="Nombre" name="categoria.nombre" value=""/>
                <s:textfield label="Descripción" name="categoria.descripcion" value=""/>
                <s:submit value="Guardar"/>
            </s:form>
        </div>
        <div id="modificaciones">
            <h1>Editar Categoria.</h1>
            <s:form action="editarCategoria" method="post" name="">
                <s:hidden name="categoria.idCategoria" value="%{categoria.idCategoria}"/>
                <s:textfield label="Nombre" name="categoria.nombre" value="%{categoria.nombre}"/>
                <s:textfield label="Descripción" name="categoria.descripcion" value="%{categoria.descripcion}"/>
                <s:hidden name="categoria.status" value="%{categoria.status}"/>
                <s:submit value="Actualizar"/>
            </s:form>
        </div>
    </body>
</html>
