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
        <%@include file="../inc/Header.jsp" %>
        <%@include file="../inc/scripts.jsp" %>
    </head>
    <body>
        <div id="consultas">
            <s:url id="paisURL" action="consultarPaisesJson"/> 
            <s:url id="estadoURL" action="consultaEstadosPorPaisJson"/>
            <s:url id="localidadURL" action="consultaLocalidadesPorEstadoJson"/>
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
                <h1>No hay datos en Codigo Postal.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Codigo Postales.</h1>
            <s:if test="listaLocalidad.size>0">
                <s:form id="formularioCodigoPostal" action="guardarCodigoPostal" method="post" name="">
                    <s:textfield label="Número" name="codigoPostal.numero" value=""/>
                    <sj:select 
                        href="%{paisURL}" 
                        id="pais" 
                        onChangeTopics="recargarEstados,recargarLocalidades" 
                        name="idPais" 
                        list="listaPais" 
                        listKey="idPais" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione un Pais"
                        />

                    <sj:select 
                        href="%{estadoURL}" 
                        id="estado" 
                        reloadTopics="recargarEstados"
                        onChangeTopics="recargarLocalidades"
                        name="idEstado"
                        formIds="formularioCodigoPostal"
                        list="listaEstado"
                        listKey="idEstado" 
                        listValue="nombre" 
                        headerKey="-1" 
                        headerValue="Seleccione un Estado" 
                        /> 

                    <sj:select 
                        href="%{localidadURL}" 
                        id="localidad" 
                        reloadTopics="recargarLocalidades"
                        name="codigoPostal.idLocalidad.idLocalidad"
                        formIds="formularioCodigoPostal"
                        list="listaLocalidad"
                        listKey="idLocalidad" 
                        listValue="nombre"
                        headerKey="-1" 
                        headerValue="Seleccione una Localidad" 
                        />
                    <s:submit value="Guardar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testLocalidad.action">Localidades</a>.
            </s:else>
        </div>
        <div id="modificaciones">
            <h1>Editar Codigo Postal.</h1>
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
