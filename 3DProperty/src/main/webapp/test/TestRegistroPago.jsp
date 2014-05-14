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
        <s:url id="contratoURL" action="consultarContratosJson"/>
        <s:url id="pagoURL" action="consultarPagosJson"/>
        <div id="consultas">
            <s:if test="listaRegistroPago.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Fecha de Inicio</th>
                        <th>Fecha de Vencimiento</th>
                        <th>Contrato</th>
                        <th>Propiedad</th>
                        <th>Tipo de Pago</th>
                    </tr>
                    <s:iterator value="listaRegistroPago">
                        <tr>
                            <td>${idRegistroPago}</td>
                            <td>${fechaInicio}</td>
                            <td>${fechaVencimiento}</td>
                            <td>${idContrato.idContrato}</td>
                            <td>${idContrato.idPropiedad.nombre}</td>
                            <td>${idPago.descripcion}</td>
                            <td>
                                <a href="eliminarRegistroPago.action?idRegistroPago=${idRegistroPago}"> Eliminar </a> 
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Registro Pago.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Registro Pago.</h1>
            <s:form action="guardarRegistroPago" method="post" name="">
                <s:textfield name="registroPago.fechaInicio" label="Fecha de inicio"/>
                <s:textfield name="registroPago.fechaVencimiento" label="Fecha de vencimiento"/>
                <sj:select 
                    href="%{contratoURL}" 
                    id="contrato" 
                    name="registroPago.idContrato.idContrato" 
                    list="listaContrato" 
                    listKey="idContrato" 
                    listValue="descripcion" 
                    headerKey="-1"
                    headerValue="Seleccione un Contrato"
                    
                    label="Contrato"
                    />
                <sj:select 
                    href="%{pagoURL}" 
                    id="pago" 
                    name="registroPago.idPago.idPago" 
                    list="listaPago" 
                    listKey="idPago" 
                    listValue="descripcion" 
                    headerKey="-1"
                    headerValue="Seleccione un Pago"
                    label="Pago"
                    />
                <s:submit value="Guardar"/>
            </s:form>
        </div>
    </body>
</html>
