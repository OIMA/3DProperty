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
            <s:if test="listaPais.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaPais">
                        <tr>
                            <td>${idPais}</td>
                            <td>${nombre}</td>
                            <td>
                                <a href="eliminarPais.action?idPais=${idPais}"> Eliminar </a> 
                                <a href="consultarPais.action?idPais=${idPais}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Pais.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Pais.</h1>
            <s:form action="guardarPais" method="post" name="">
                <s:textfield label="Nombre" name="pais.nombre"/>
                <s:submit value="Guardar"/>
            </s:form>
        </div>
        <div id="modificaciones">
            <h1>Editar Pais.</h1>
            <s:form action="editarPais" method="post" name="">
                <s:hidden name="pais.idPais" value="%{pais.idPais}"/>
                <s:textfield label="Nombre" name="pais.nombre" value="%{pais.nombre}"/>
                <s:hidden name="pais.status" value="%{pais.status}"/>
                <s:submit value="Actualizar"/>
            </s:form>
        </div>
    </body>
</html>
