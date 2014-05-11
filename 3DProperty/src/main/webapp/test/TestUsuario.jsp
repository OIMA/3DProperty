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
                                <a href="eliminarUsuario.action?idUsuario=${idUsuario}"> Eliminar </a> 
                                <a href="consultarUsuario.action?idUsuario=${idUsuario}"> Editar </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <h1>No hay datos en Usuario.</h1>
            </s:else>

        </div>
        <div id="altas">
            <h1>Alta de Usuarios.</h1>
            <s:if test="listaColonia.size>0">
                <s:form id="formularioUsuario" action="guardarUsuario" method="post" name="">
                    <s:textfield label="Nombre Usuario" name="usuario.nombreUsuario" value="" cssClass="sl nn campo" maxLength="45"/>
                    <s:password label="Contraseña" name="usuario.contrasenia" value=""/>
                    <s:textfield label="Nombre" name="usuario.nombre" value="" cssClass="sl nn campo"/>
                    <s:textfield label="Apellido Paterno" name="usuario.apPat" value="" cssClass="sl nn campo"/>
                    <s:textfield label="Apellido Materno" name="usuario.apMat" value="" cssClass="sl nn campo"/>
                    <s:textfield label="Telefono" name="usuario.telefono" value="" cssClass="sn campo"/>
                    <s:textfield label="E-Mail" name="usuario.email" value="" cssClass="em campo"/>
                    <s:textfield label="Fecha de Nacimiento" name="usuario.fechaNacimiento" value="" cssClass="ff nn campo"/>
                    <s:textfield label="RFC" name="usuario.rfc" value="" cssClass="rfc nn campo"/><!--1. Administrador, 2. Diseñador, 3. Usuario Registrado, 4. Usuario General-->
                    <s:textfield label="CURP" name="usuario.curp" value="" cssClass="curp nn campo"/>
                    <s:select label="Tipo de Usuario"
                              list="#@java.util.LinkedHashMap@{'ROLE_ADMINISTRADOR':'Administrador','ROLE_DISENIADOR':'Diseñador','ROLE_CLIENTE':'Cliente'}"
                              name="usuario.tipoUsuario" 
                              cssClass="cc campo"
                              /><!--onchange="consulta_roles(this.value,'div_roles')"-->
                    <s:textfield label="Calle" name="usuario.calle" value="" cssClass="sl nn campo"/>
                    <s:textfield label="No. Exterior" name="usuario.noExterior" value="" cssClass="sn nn campo"/>
                    <s:textfield label="No. Interior" name="usuario.noInterior" value=""/>
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
                        cssClass="cc campo"
                        />

                    <sj:select 
                        href="%{estadoURL}" 
                        id="estado" 
                        reloadTopics="recargarEstados"
                        onChangeTopics="recargarLocalidades,recargarCodigosPostales,recargarColonias"
                        name="idEstado"
                        formIds="formularioUsuario"
                        list="listaEstado"
                        listKey="idEstado" 
                        listValue="nombre" 
                        headerKey="-1" 
                        headerValue="Seleccione un Estado" 
                        cssClass="cc campo"
                        /> 
                    
                    <sj:select 
                        href="%{localidadURL}" 
                        id="localidad" 
                        reloadTopics="recargarLocalidades"
                        onChangeTopics="recargarCodigosPostales,recargarColonias"
                        name="idLocalidad"
                        formIds="formularioUsuario"
                        list="listaLocalidad"
                        listKey="idLocalidad" 
                        listValue="nombre"
                        headerKey="-1" 
                        headerValue="Seleccione una Localidad" 
                        cssClass="cc campo"
                        />
                    
                    <sj:select 
                        href="%{codigoPostalURL}" 
                        id="codigoPostal" 
                        reloadTopics="recargarCodigosPostales"
                        onChangeTopics="recargarColonias"
                        name="idCodigoPostal"
                        formIds="formularioUsuario"
                        list="listaCodigoPostal"
                        listKey="idCodigoPostal" 
                        listValue="numero" 
                        headerKey="-1" 
                        headerValue="Seleccione un Codigo Postal" 
                        cssClass="cc campo"
                        />
                    
                    <sj:select 
                        href="%{coloniaURL}" 
                        id="colonia" 
                        reloadTopics="recargarColonias" 
                        name="usuario.idColonia.idColonia"
                        formIds="formularioUsuario"
                        list="listaColonia"
                        listKey="idColonia" 
                        listValue="nombre"
                        headerKey="-1" 
                        headerValue="Seleccione una Colonia" 
                        cssClass="cc campo"
                        />
                    <s:submit value="Guardar" id="botonSubmit" cssClass="vf"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testColonia.action">Colonia</a>.
            </s:else>
        </div>
        

        <br/>
        
    </body>
</html>
