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
            <s:if test="listaPago.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Descripci&oacute;n</th>
                        <th>Monto</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaPago">
                        <tr>
                            <td>${idPago}</td>
                            <td>${descripcion}</td>
                            <td>$&nbsp; ${monto}</td>
                            <td>
                                <a href="eliminarPago.action?idPago=${idPago}"> Eliminar </a> 
                                <a href="consultarPago.action?idPago=${idPago}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Pago.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Pagos.</h1>
            <s:form action="guardarPago" method="post" name="">
                <s:textfield label="Descripción" name="pago.descripcion"/>
                <s:textfield label="Monto" name="pago.monto"/>
                <s:submit value="Guardar"/>
            </s:form>
        </div>
        <div id="modificaciones">
            <h1>Editar Pago.</h1>
            <s:form action="editarPago" method="post" name="">
                <s:hidden name="pago.idPago" value="%{pago.idPago}"/>
                <s:textfield label="Descripción" name="pago.descripcion" value="%{pago.descripcion}"/>
                <s:textfield label="Monto" name="pago.monto" value="%{pago.monto}"/>
                <s:hidden name="pago.status" value="%{pago.status}"/>
                <s:submit value="Actualizar"/>
            </s:form>
        </div>
    </body>
</html>
