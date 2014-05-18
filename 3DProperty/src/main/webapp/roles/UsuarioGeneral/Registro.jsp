<%-- 
    Document   : Registro
    Created on : Apr 6, 2014, 6:49:09 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <%@include file="../../inc/jstl.jsp" %>
        <sb:head includeStyles="false" />

        <%@include file="../../inc/Header.jsp" %>
        <!--<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/plugins/datepicker/css/datepicker.css"/>-->
    </head>
    <body>
        <s:url id="paisURL" action="consultarPaisesJson"/> 
        <s:url id="estadoURL" action="consultaEstadosPorPaisJson"/>
        <s:url id="localidadURL" action="consultaLocalidadesPorEstadoJson"/>
        <s:url id="codigoPostalURL" action="consultaCodigosPostalesPorLocalidadJson"/> 
        <s:url id="coloniaURL" action="consultaColoniasPorCodigoPostalJson"/> 
        <div id="wrapper">
            <%@include file="../../inc/Navigator.jsp" %>
            <div class="page-wrapper">
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <!--                        <h1>
                                                    Favor de llenar el registro completo
                                                </h1>-->
                        <div class="row clearfix">
                            <div class="container">
                                <s:form  id="formularioUsuario" theme="bootstrap" class="form-horizontal" role="form" action="guardarUsuario"  method="post">
                                    <s:textfield label="Nombre Usuario" name="usuario.nombreUsuario" value="" cssClass="form-control sl nn campo" maxLength="45"/>
                                    <s:password label="Contraseña" name="usuario.contrasenia" value="" cssClass="form-control"/>
                                    <s:textfield label="Nombre" name="usuario.nombre" value="" cssClass="form-control sl nn campo"/>
                                    <s:textfield label="Apellido Paterno" name="usuario.apPat" value="" cssClass="form-control sl nn campo"/>
                                    <s:textfield label="Apellido Materno" name="usuario.apMat" value="" cssClass="form-control sl nn campo"/>
                                    <s:textfield label="Telefono" name="usuario.telefono" value="" cssClass="form-control sn campo"/>
                                    <s:textfield label="E-Mail" name="usuario.email" value="" cssClass="form-control em campo"/>
                                    <div class="form-group">
                                        <label>Fecha Nacimiento</label>
                                        <input type="text" class="form-control" name="usuario.fechaNacimiento"/>
                                    </div>
                                    <s:textfield label="RFC" name="usuario.rfc" value="" cssClass="form-control rfc nn campo"/><!--1. Administrador, 2. Diseñador, 3. Usuario Registrado, 4. Usuario General-->
                                    <s:textfield label="CURP" name="usuario.curp" value="" cssClass="form-control curp nn campo"/>
                                    <s:hidden name="usuario.tipoUsuario" value="ROLE_CLIENTE"/>
                                    <!--onchange="consulta_roles(this.value,'div_roles')"-->
                                    <s:textfield label="Calle" name="usuario.calle" value="" cssClass="form-control sl nn campo"/>
                                    <s:textfield label="No. Exterior" name="usuario.noExterior" value="" cssClass="form-control sn nn campo"/>
                                    <s:textfield label="No. Interior" name="usuario.noInterior" value="" cssClass="form-control sn campo"/>
                                    <label class="label label-primary">Pais</label>
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
                                        cssClass="form-control cc campo"
                                        />
                                    <label class="label label-primary">Estado</label>
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
                                        cssClass="form-control cc campo"
                                        /> 
                                    <label class="label label-primary">Municipio</label>
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
                                        cssClass="form-control cc campo"
                                        />
                                    <label class="label label-primary">C&oacute;digo postal</label>
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
                                        cssClass="form-control cc campo"
                                        />
                                    <label class="label label-primary">Colonia</label>
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
                                        cssClass="form-control cc campo"
                                        />
                                    <s:submit value="Guardar" id="botonSubmit" cssClass="form-control vf"/>
                                </s:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../../inc/scripts.jsp" %>
        <!--<script type="text/javascript" src="<%=request.getContextPath()%>/js/plugins/datepicker/js/bootstrap-datepicker.js"></script>-->
        <!--<script type="text/javascript" src="<%=request.getContextPath()%>/js/validacion.js"></script>-->
    </body>
</html>