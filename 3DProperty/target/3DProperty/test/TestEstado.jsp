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
            <s:if test="listaEstado.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Pais</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaEstado">
                        <tr>
                            <td>${idEstado}</td>
                            <td>${nombre}</td>
                            <td>${estado.idPais.nombre}</td>
                            <td>
                                <a href="eliminarEstado.action?idEstado=${idEstado}"> Eliminar </a> 
                                <a href="consultarEstado.action?idEstado=${idEstado}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Estado.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Estados.</h1>
            <s:form action="guardarEstado" method="post" name="">
                <s:textfield label="Nombre" name="estado.nombre" value=""/>
                <s:select 
                    name="estado.idPais.idPais" 
                    list="listaPaises"
                    listKey="%{idPais}"
                    listValue="%{nombre}"
                    headerKey="0"
                    headerValue="Selecciona un pais..."/>
                
                <s:submit value="Guardar"/>
            </s:form>
        </div>
        <div id="modificaciones">
            <h1>Editar Estado.</h1>
            <s:form action="editarEstado" method="post" name="">
                <s:hidden name="estado.idEstado" value="%{estado.idEstado}"/>
                <s:textfield label="Descripción" name="estado.descripcion" value="%{estado.descripcion}"/>
                <s:textfield label="Monto" name="estado.monto" value="%{estado.monto}"/>
                <s:hidden name="estado.status" value="%{estado.status}"/>
                <s:submit value="Actualizar"/>
            </s:form>
        </div>
    </body>
</html>
