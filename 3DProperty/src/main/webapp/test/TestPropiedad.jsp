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
                <script src="<%=request.getContextPath()%>/js/Eliminar.js"></script>
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
                                <a metodo="eliminarPropiedad.action" nombre="idPropiedad" ide="${idPropiedad}" class="eliminacion" href="#"> Eliminar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Propiedad.</h1>
            </s:else>

        </div>
    </body>
</html>
