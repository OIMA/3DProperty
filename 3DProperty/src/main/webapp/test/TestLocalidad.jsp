<%-- 
    Document   : LocalidadsAdmin
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
        <s:url id="paisURL" action="consultarPaisesJson"/> 
        <s:url id="estadoURL" action="consultaEstadosPorPaisJson"/>
        <div id="consultas">
            <s:if test="listaLocalidad.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Estado</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaLocalidad">
                        <tr>
                            <td>${idLocalidad}</td>
                            <td>${nombre}</td>
                            <td>${idEstado.nombre}</td>
                            <td>
                                <a href="eliminarLocalidad.action?idLocalidad=${idLocalidad}"> Eliminar </a> 
                                <a href="consultarLocalidad.action?idLocalidad=${idLocalidad}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Localidad.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Localidades.</h1>
            <s:if test="listaEstado.size>0">
                <s:form id="formularioLocalidad" action="guardarLocalidad" method="post" name="">
                    <s:textfield label="Nombre" name="localidad.nombre" value=""/>
                    <sj:select 
                        href="%{paisURL}" 
                        id="pais" 
                        onChangeTopics="recargarEstados" 
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
                        name="localidad.idEstado.idEstado"
                        formIds="formularioLocalidad"
                        list="listaEstado"
                        listKey="idEstado" 
                        listValue="nombre" 
                        headerKey="-1" 
                        headerValue="Seleccione un Estado" 
                        />
                    <s:submit value="Guardar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testEstado.action">Estados</a>.
            </s:else>
        </div>
        <div id="modificaciones">
            <h1>Editar Localidad.</h1>
            <s:if test="listaEstado.size>0">    
                <s:form action="editarLocalidad" method="post" name="">
                    <s:hidden name="localidad.idLocalidad" value="%{localidad.idLocalidad}"/>
                    <s:textfield label="Nombre" name="localidad.nombre" value="%{localidad.nombre}"/>
                    <s:select 
                        name="localidad.idEstado.idEstado" 
                        list="listaEstado"
                        listKey="%{idEstado}"
                        listValue="%{nombre}"
                        value="%{localidad.idEstado.idEstado}"
                        />
                    <s:hidden name="localidad.status" value="%{localidad.status}"/>
                    <s:submit value="Actualizar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testEstado.action">Estados</a>.
            </s:else>
        </div>
    </body>
</html>
