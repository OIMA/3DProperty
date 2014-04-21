<%-- 
    Document   : Registro
    Created on : Apr 6, 2014, 6:49:09 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
        <%@include file="../../inc/Header.jsp" %>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="../../inc/Navigator.jsp" %>
            <div class="page-wrapper">
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <!--                        <h1>
                                                    Favor de llenar el registro completo
                                                </h1>-->
                        <div class="row clearfix">
                            <form class="form-horizontal" role="form">
                                <div class="col-md-offset-1 col-md-3 column">
                                    <h2>Datos personales</h2>
                                    <div class="form-group">
                                        <label>Nombre de usuario *</label>
                                        <input type="text" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>Contrase&ntilde;a *</label>
                                        <input type="password" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>Nombre(s) *</label>
                                        <input type="text" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>Apellido Paterno *</label>
                                        <input type="text" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>Apellido Materno *</label>
                                        <input type="text" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>Fecha nacimiento *</label>
                                        <input type="date" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>CURP</label>
                                        <input type="text" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>RFC</label>
                                        <input type="text" class="form-control" />
                                    </div>
                                </div>
                                <div class="col-md-offset-1 col-md-3 column">
                                    <h2>Domicilio</h2>
                                    <div class="form-group">
                                        <label>Pais *</label>
                                        <select class="form-control" name="pais">
                                            <option>M&eacute;xico</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Estado *</label>
                                        <select class="form-control" name="estado">
                                            <option>M&eacute;xico</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Municipio *</label>
                                        <select class="form-control" name="municipio">
                                            <option>Metepec</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Codigo postal *</label>
                                        <select class="form-control" name="codigoPostal">
                                            <option>52170</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Colonia *</label>
                                        <select class="form-control" name="pais">
                                            <option>Inf. Sn Fco.</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Calle *</label>
                                        <input class="form-control" type="text" name="calle" value="" />
                                    </div>
                                    <div class="form-group">
                                        <label>No_exterior *</label>
                                        <input class="form-control" type="text" name="calle" value="" />
                                    </div>
                                    <div class="form-group">
                                        <label>No_interior</label>
                                        <input class="form-control" type="text" name="calle" value="" />
                                    </div>
                                </div>
                                <div class="col-md-offset-1 col-md-2 column">
                                    <h2>Contacto</h2>
                                    <div class="form-group">
                                        <label>Tel&eacute;fono fijo *</label>
                                        <input class="form-control" type="text" name="telefono" value="" />
                                    </div>
                                    <div class="form-group">
                                        <label>Tel&eacute;fono m&oacute;vil *</label>
                                        <input class="form-control" type="text" name="" value="" />
                                    </div>
                                    <div class="form-group">
                                        <label>E-Mail *</label>
                                        <input class="form-control" type="text" name="" value="" />
                                    </div>
                                    <div class="form-group">
                                        <label>Otro medio</label>
                                        <input class="form-control" type="text" name="" value="" />
                                    </div>
                                     <div class="form-group">
                                         <button class="btn btn-block btn-lg btn-success disabled" type="submit" >Registrarse</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
