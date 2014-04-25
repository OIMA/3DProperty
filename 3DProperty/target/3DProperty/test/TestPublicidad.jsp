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
            <s:if test="listaPublicidad.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Detalle</th>
                        <th>Ruta</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaPublicidad">
                        <tr>
                            <td>${idPublicidad}</td>
                            <td>${detalle}</td>
                            <td>${ruta}</td>
                            <td>
                                <a href="eliminarPublicidad.action?idPublicidad=${idPublicidad}"> Eliminar </a> 
                                <a href="consultarPublicidad.action?idPublicidad=${idPublicidad}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Publicidad.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Publicidad.</h1>
            <s:form action="guardarPublicidad" method="post" name="" enctype="multipart/form-data">
                <s:textfield label="Detalle" name="publicidad.detalle"/>
                <s:file label="Seleccione un archivo" name="archivoPublicidad"/>
                <s:submit value="Guardar"/>
            </s:form>
        </div>
        <div id="modificaciones">
            <h1>Editar Publicidad.</h1>
            <s:form action="editarPublicidad" method="post" name="" enctype="multipart/form-data">
                <s:hidden name="publicidad.idPublicidad" value="%{publicidad.idPublicidad}"/>
                <s:textfield label="Detalle" name="publicidad.detalle" value="%{publicidad.detalle}"/>
                <s:file label="Seleccione un archivo" name="archivoPublicidad"/>
                <s:hidden name="publicidad.status" value="%{publicidad.status}"/>
                <s:submit value="Actualizar"/>
            </s:form>
        </div>
        Imagen:<img src="<s:property value="archivoPublicidadFileName"/>" alt=""/>
    </body>
</html>
