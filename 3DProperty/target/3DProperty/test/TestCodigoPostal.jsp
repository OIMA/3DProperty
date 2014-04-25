<%-- 
    Document   : CodigoPostalsAdmin
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
            <s:if test="listaCodigoPostal.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Número</th>
                        <th>Localidad</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaCodigoPostal">
                        <tr>
                            <td>${idCodigoPostal}</td>
                            <td>${numero}</td>
                            <td>${idLocalidad.nombre}</td>
                            <td>
                                <a href="eliminarCodigoPostal.action?idCodigoPostal=${idCodigoPostal}"> Eliminar </a> 
                                <a href="consultarCodigoPostal.action?idCodigoPostal=${idCodigoPostal}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en CodigoPostal.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de CodigoPostales.</h1>
            <s:if test="listaLocalidad.size>0">
                <s:form action="guardarCodigoPostal" method="post" name="">
                    <s:textfield label="Número" name="codigoPostal.numero" value=""/>
                    <s:select 
                        name="codigoPostal.idLocalidad.idLocalidad" 
                        list="listaLocalidad"
                        listKey="%{idLocalidad}"
                        listValue="%{nombre}"
                        label="Localidad"
                        />
                    <s:submit value="Guardar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testLocalidad.action">Localidades</a>.
            </s:else>
        </div>
        <div id="modificaciones">
            <h1>Editar CodigoPostal.</h1>
            <s:if test="listaLocalidad.size>0">    
                <s:form action="editarCodigoPostal" method="post" name="">
                    <s:hidden name="codigoPostal.idCodigoPostal" value="%{codigoPostal.idCodigoPostal}"/>
                    <s:textfield label="Número" name="codigoPostal.numero" value="%{codigoPostal.numero}"/>
                    <s:select 
                        name="codigoPostal.idLocalidad.idLocalidad" 
                        list="listaLocalidad"
                        listKey="%{idLocalidad}"
                        listValue="%{nombre}"
                        value="%{codigoPostal.idLocalidad.idLocalidad}"
                        label="Localidad"
                        />
                    <s:hidden name="codigoPostal.status" value="%{codigoPostal.status}"/>
                    <s:submit value="Actualizar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testLocalidad.action">Localidades</a>.
            </s:else>
        </div>
    </body>
</html>
