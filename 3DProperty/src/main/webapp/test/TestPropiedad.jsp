<%-- 
    Document   : PropiedadsAdmin
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
        <s:url id="localidadURL" action="consultaLocalidadesPorEstadoJson"/>
        <s:url id="codigoPostalURL" action="consultaCodigosPostalesPorLocalidadJson"/> 
        <s:url id="coloniaURL" action="consultaColoniasPorCodigoPostalJson"/> 
        <s:url id="categoriaURL" action="consultarCategoriasJson"/> 
        <div id="consultas">
            <s:if test="listaPropiedades.size>0">
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Descripci&oacute;n</th>
                        <th>Extensi&oacute;n</th>
                        <th>No. de Ba&ntilde;os</th>
                        <th>No. de habitaciones</th>
                        <th>No. de pisos</th>
                        <th>Color 1</th>
                        <th>Color 2</th>
                        <th>Fecha de Construccion</th>
                        <th>Tipo de Fachada</th>
                        <th>Calle</th>
                        <th>No. Exterior</th>
                        <th>No. Interior</th>
                        <th>Colonia</th>
                        <th>Codigo Postal</th>
                        <th>Localidad</th>
                        <th>Estado</th>
                        <th>Pais</th>
                        <th>Categoria</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaPropiedades">
                        <tr>
                            <td>${idPropiedad}</td>
                            <td>${nombre}</td>
                            <td>${descripcion}</td>
                            <td>${extension}</td>
                            <td>${noBanios}</td>
                            <td>${noHabitaciones}</td>
                            <td>${noPisos}</td>
                            <td>${color1}</td>
                            <td>${color2}</td>
                            <td>${fechaConstruccion}</td>
                            <td>${tipoFachada}</td>
                            <td>${calle}</td>
                            <td>${noExterior}</td>
                            <td>${noInterior}</td>
                            <td>${idColonia.nombre}</td>
                            <td>${idColonia.idCodigoPostal.numero}</td>
                            <td>${idColonia.idCodigoPostal.idLocalidad.nombre}</td>
                            <td>${idColonia.idCodigoPostal.idLocalidad.idEstado.nombre}</td>
                            <td>${idColonia.idCodigoPostal.idLocalidad.idEstado.idPais.nombre}</td>
                            <td>${idCategoria.nombre}</td>
                            <td>
                                <a href="eliminarPropiedad.action?idPropiedad=${idPropiedad}"> Eliminar </a> 
                                <a href="consultarPropiedad.action?idPropiedad=${idPropiedad}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Propiedad.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Propiedades.</h1>
            <s:form id="altaPropiedad" action="guardarPropiedad" method="post" name="" theme="bootstrap">
                    <s:textfield label="Nombre" name="propiedad.nombre" value=""/>
                    <s:textfield label="Descripción" name="propiedad.descripcion" value=""/>
                    <s:textfield label="Extensión" name="propiedad.extension" value=""/>
                    <s:textfield label="No. de Baños" name="propiedad.noBanios" value=""/>
                    <s:textfield label="No. de Habitaciones" name="propiedad.noHabitaciones" value=""/>
                    <s:textfield label="No. de Pisos" name="propiedad.noPisos" value=""/>
                    <s:textfield label="Color 1" name="propiedad.color1" value=""/>
                    <s:textfield label="Color 2" name="propiedad.color2" value=""/>
                    <s:textfield label="Fecha de Construcción" name="propiedad.fechaConstruccion" value=""/>
                    <s:textfield label="Tipo de Fachada" name="propiedad.tipoFachada" value=""/>
                    <s:textfield label="Calle" name="propiedad.calle" value=""/>
                    <s:textfield label="No. Exterior" name="propiedad.noExterior" value=""/>
                    <s:textfield label="No. Interior" name="propiedad.noInterior" value=""/>
                    <sj:select 
                        href="%{paisURL}" 
                        id="pais" 
                        onChangeTopics="recargarEstados,recargarLocalidades,recargarCodigosPostales,recargarColonias" 
                        name="idPais" 
                        list="listaPais" 
                        listKey="idPais" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione un Pais"
                        label="Pais"
                        />

                    <sj:select 
                        href="%{estadoURL}" 
                        id="estado" 
                        reloadTopics="recargarEstados"
                        onChangeTopics="recargarLocalidades,recargarCodigosPostales,recargarColonias"
                        name="idEstado"
                        formIds="altaPropiedad"
                        list="listaEstado"
                        listKey="idEstado" 
                        listValue="nombre" 
                        headerKey="-1" 
                        headerValue="Seleccione un Estado"
                        label="Estado"
                        /> 
                    
                    <sj:select 
                        href="%{localidadURL}" 
                        id="localidad" 
                        reloadTopics="recargarLocalidades"
                        onChangeTopics="recargarCodigosPostales,recargarColonias"
                        name="idLocalidad"
                        formIds="altaPropiedad"
                        list="listaLocalidad"
                        listKey="idLocalidad" 
                        listValue="nombre"
                        headerKey="-1" 
                        headerValue="Seleccione una Localidad"
                        label="Localidad"
                        />
                    
                    <sj:select 
                        href="%{codigoPostalURL}" 
                        id="codigoPostal" 
                        reloadTopics="recargarCodigosPostales"
                        onChangeTopics="recargarColonias"
                        name="idCodigoPostal"
                        formIds="altaPropiedad"
                        list="listaCodigoPostal"
                        listKey="idCodigoPostal" 
                        listValue="numero" 
                        headerKey="-1" 
                        headerValue="Seleccione un Codigo Postal" 
                        label="Codigo Postal"
                        />
                    
                    <sj:select 
                        href="%{coloniaURL}" 
                        id="colonia" 
                        reloadTopics="recargarColonias" 
                        name="propiedad.idColonia.idColonia"
                        formIds="altaPropiedad"
                        list="listaColonia"
                        listKey="idColonia" 
                        listValue="nombre"
                        headerKey="-1" 
                        headerValue="Seleccione una Colonia" 
                        label="Colonia"
                        />
                    <sj:select 
                        href="%{categoriaURL}" 
                        id="categoria" 
                        name="propiedad.idCategoria.idCategoria" 
                        list="listaCategoria" 
                        listKey="idCategoria" 
                        listValue="nombre" 
                        headerKey="-1"
                        headerValue="Seleccione una Categoria"
                        label="Categoria"
                        />
                    <s:submit value="Guardar"/>
                    
                </s:form>
        </div>
    </body>
</html>
