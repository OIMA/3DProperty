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
        <%@include file="../inc/scripts.jsp" %>
        <%@include file="../inc/Header.jsp" %>
    </head>
    <body>
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
                <s:form action="guardarUsuario" method="post" name="">
                    <s:textfield label="Nombre Usuario" name="usuario.nombreUsuario" value=""/>
                    <s:password label="Contraseña" name="usuario.contrasenia" value=""/>
                    <s:textfield label="Nombre" name="usuario.nombre" value=""/>
                    <s:textfield label="Apellido Paterno" name="usuario.apPat" value=""/>
                    <s:textfield label="Apellido Materno" name="usuario.apMat" value=""/>
                    <s:textfield label="Telefono" name="usuario.telefono" value=""/>
                    <s:textfield label="E-Mail" name="usuario.email" value=""/>
                    <s:textfield label="Fecha de Nacimiento" name="usuario.fechaNacimiento" value=""/>
                    <s:textfield label="RFC" name="usuario.rfc" value=""/><!--1. Administrador, 2. Diseñador, 3. Usuario Registrado, 4. Usuario General-->
                    <s:textfield label="CURP" name="usuario.curp" value=""/>
                    <s:select label="Tipo de Usuario"
                              list="#@java.util.LinkedHashMap@{'1':'Administrador','2':'Diseñador','3':'Cliente'}"
                              name="usuario.tipoUsuario"
                              /><!--onchange="consulta_roles(this.value,'div_roles')"-->
                    <s:textfield label="Calle" name="usuario.calle" value=""/>
                    <s:textfield label="No. Exterior" name="usuario.noExterior" value=""/>
                    <s:textfield label="No. Interior" name="usuario.noInterior" value=""/>
                    <s:select 
                        name="usuario.idColonia.idColonia" 
                        list="listaColonia"
                        listKey="%{idColonia}"
                        listValue="%{nombre}"
                        label="Colonia"
                        />
                    <s:submit value="Guardar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testColonia.action">Colonia</a>.
            </s:else>
        </div>
        <div id="modificaciones">
            <h1>Editar Codigo Postal.</h1>
            <s:if test="listaColonia.size>0">    
                <s:form action="editarUsuario" method="post" name="">
                    <s:hidden name="usuario.idUsuario" value="%{usuario.idUsuario}"/>
                    <s:textfield label="Nombre Usuario" name="usuario.nombreUsuario" value="%{usuario.nombreUsuario}"/>
                    <s:password label="Contraseña" name="usuario.contrasenia" value="%{usuario.contrasenia}"/>
                    <s:textfield label="Nombre" name="usuario.nombre" value="%{usuario.nombre}"/>
                    <s:textfield label="Apellido Paterno" name="usuario.apPat" value="%{usuario.apPat}"/>
                    <s:textfield label="Apellido Materno" name="usuario.apMat" value="%{usuario.apMat}"/>
                    <s:textfield label="Telefono" name="usuario.telefono" value="%{usuario.telefono}"/>
                    <s:textfield label="E-Mail" name="usuario.email" value="%{usuario.email}"/>
                    <s:textfield label="Fecha de Nacimiento" name="usuario.fechaNacimiento" value="%{usuario.fechaNacimiento}"/>
                    <s:textfield label="RFC" name="usuario.rfc" value="%{usuario.rfc}"/><!--1. Administrador, 2. Diseñador, 3. Usuario Registrado, 4. Usuario General--!>
                    <s:textfield label="CURP" name="usuario.curp" value="%{usuario.curp}"/>
                    <s:select label="Tipo de Usuario"
                              list="#@java.util.LinkedHashMap@{'1':'Administrador','2':'Diseñador','3':'Cliente'}"
                              name="usuario.tipoUsuario"
                              value="%{usuario.tipoUsuario}"
                              /><!--onchange="consulta_roles(this.value,'div_roles')"-->
                    <s:textfield label="Calle" name="usuario.calle" value="%{usuario.calle}"/>
                    <s:textfield label="No. Exterior" name="usuario.noExterior" value="%{usuario.noExterior}"/>
                    <s:textfield label="No. Interior" name="usuario.noInterior" value="%{usuario.noInterior}"/>
                    <s:select 
                        name="usuario.idColonia.idColonia" 
                        list="listaColonia"
                        listKey="%{idColonia}"
                        listValue="%{nombre}"
                        label="Colonia"
                        value="%{usuario.idColonia.idColonia}"
                        />
                    <s:hidden name="usuario.status" value="%{usuario.status}"/>
                    <s:submit value="Actualizar"/>
                </s:form>
            </s:if>
            <s:else>
                No Datos en <a href="testColonia.action">Colonia</a>.
            </s:else>
        </div>

        <br/>
        <s:url id="paisURL" action="consultarPaisesJson"/> 
        <sj:select 
            href="%{paisURL}" 
            id="idPais2" 
            onChangeTopics="recargarEstados" 
            name="idPais1" 
            list="listaPais" 
            listKey="idPais" 
            listValue="nombre" 
            emptyOption="true" 
            headerKey="-1"
            headerValue="Seleccione un estado"
            />

        <s:url id="estadoURL" action="consultaEstadosPorPaisJson"/> 
        <sj:select 
            href="%{estadoURL}" 
            id="selectWithReloadTopic" 
            reloadTopics="recargarEstados" 
            name="idPais" 
            list="listaEstado"
            listKey="idEstado" 
            listValue="nombre"
            emptyOption="true" 
            headerKey="-1" 
            headerValue="Seleccione un estado" 
            />
    </body>
</html>
