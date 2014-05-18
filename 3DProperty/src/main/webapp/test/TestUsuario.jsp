<%-- 
    Document   : UsuariosAdmin
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
        <div id="consultas">
            
            <s:if test="listaUsuario.size>0">
                <script src="<%=request.getContextPath()%>/js/Eliminar.js"></script>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre Usuario</th>
                        <th>Contrase&ntilde;a</th>
                        <th>Nombre</th>
                        <th>Apellido Paterno</th>
                        <th>Apellido Materno</th>
                        <th>Telefono</th>
                        <th>e-mail</th>
                        <th>Fecha de Nacimiento</th>
                        <th>RFC</th>
                        <th>CURP</th>
                        <th>Tipo Usuario</th>
                        <th>Calle</th>
                        <th>No. Exterior</th>
                        <th>No. Interior</th>
                        <th>Colonia</th>
                        <th>Codigo Postal</th>
                        <th>Localidad</th>
                        <th>Estado</th>
                        <th>Pais</th>
                        <th>Acciones</th>
                    </tr>
                    <s:iterator value="listaUsuario">
                        <tr>
                            <td>${idUsuario}</td>
                            <td>${nombreUsuario}</td>
                            <td>${contrasenia}</td>
                            <td>${nombre}</td>
                            <td>${apPat}</td>
                            <td>${apMat}</td>
                            <td>${telefono}</td>
                            <td>${email}</td>
                            <td>${fechaNacimiento}</td>
                            <td>${rfc}</td>
                            <td>${curp}</td>
                            <td>${tipoUsuario}</td>
                            <td>${calle}</td>
                            <td>${noExterior}</td>
                            <td>${noInterior}</td>
                            <td>${idColonia.nombre}</td>
                            <td>${idColonia.idCodigoPostal.numero}</td>
                            <td>${idColonia.idCodigoPostal.idLocalidad.nombre}</td>
                            <td>${idColonia.idCodigoPostal.idLocalidad.idEstado.nombre}</td>
                            <td>${idColonia.idCodigoPostal.idLocalidad.idEstado.idPais.nombre}</td>
                            <td>
                                <a metodo="eliminarUsuario.action" nombre="idUsuario" ide="${idUsuario}" class="eliminacion" href="#"> Eliminar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Usuario.</h1>
            </s:else>

        </div>
</body>
</html>
