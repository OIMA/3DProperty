<!DOCTYPE html>
<html>
    <head>
        <title>3DProperty</title>
        <%@include file="inc/Header.jsp" %>

    </head>

    <body>
        <%--<%@include file="includes/PanelAdministrador.jsp" %>--%>
        <div id="wrapper">
            <%@include file="inc/Navigator.jsp" %>
            <%--<%@include file="includes/PanelAdministrador.jsp" %>--%>


            <div class="page-wrapper">
                <%--<%@include file="includes/PanelAdministrador.jsp" %>--%>
                <%@include file="inc/Carousel.jsp" %>
                <div class="container" id="focus">
                    <div class="row clearfix">
                        <div class="col-md-12 column"><br/><br/></div>
                        <div class="col-md-12 column">
                            <ul class="nav nav-tabs">
                                <li class="active">
                                    <a href="Index.action">Inicio</a>
                                </li>
                                <li>
                                    <a href="Hogar.action">Hogar</a>
                                </li>
                                <li class="">
                                    <a href="Turismo.action">Turismo</a>
                                </li>
                                <li class="">
                                    <a href="Historia.action">Historia</a>
                                </li>
                                <li class="">
                                    <a href="Arquitectura.action">Arquitectura</a>
                                </li>
                                <li class="">
                                    <a href="Comercio.action">Comercio</a>
                                </li>
                                <li class="">
                                    <a href="Civil.action">Civil</a>
                                </li>
                                <!--                                <li class="">
                                                                    <a href="Examen.action">Examen</a>
                                                                </li>-->
                                                                <li class="dropdown pull-right">
                                                                    <a href="#" data-toggle="dropdown" class="dropdown-toggle">Contacto<strong class="caret"></strong></a>
                                                                    <ul class="dropdown-menu">
                                                                        <li>
                                                                            <a href="#">Due&ntilde;os</a>
                                                                        </li>
                                                                        <li>
                                                                            <a href="#">Dise&ntilde;adores</a>
                                                                        </li>
                                                                        <li>
                                                                            <a href="#">Administradores</a>
                                                                        </li>
                                                                        <li class="divider">
                                                                        </li>
                                                                        <li>
                                                                            <a href="#">Nosotros</a>
                                                                        </li>
                                                                    </ul>
                                                                </li>
                            </ul>
                            <div class="row clearfix">
                                <div class="row clearfix">
                                    <div class="col-md-8 column text-center">
                                        <h3 class="text-center text-danger">
                                            <!--                                            3DProperty & Tourism-->
                                        </h3><img alt="740x140" src="images/3DProperty2.png" />
                                        <p>

                                            <em>
                                            </em> 

                                            <small>
                                            </small>
                                        </p>
                                    </div>
                                    <div class="col-md-4 column">
                                        <form role="form" method="post" action="<c:url value='j_spring_security_check' />">
                                            <div class="form-group">
                                                <label>Nombre de usuario</label><input type="text" class="form-control" name="j_username" />
                                            </div>
                                            <div class="form-group">
                                                <label >Contrase&ntilde;a</label><input type="password" class="form-control" name="j_password" />
                                            </div>
                                            <!--                                            <div class="form-group">
                                                                                            <label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" />
                                                                                            <p class="help-block">
                                                                                                Example block-level help text here.
                                                                                            </p>
                                                                                        </div>-->
                                            <!--<div class="checkbox">-->
                                            <!--<label><input type="checkbox" /> Check me out</label>-->
                                            <!--</div>--> 
                                            <button type="submit" class="btn btn-default">Iniciar</button>
                                        </form>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-4 column">
                                        <div class="thumbnail">
                                            <img alt="300x200" src="http://lorempixel.com/600/200/people" />
                                            <div class="caption">
                                                <h3>
                                                    Lo nuevo...
                                                </h3>
                                                <p>
                                                    Si quieres conocer lo que suben los usuarios, debes entrar aqui, donde 
                                                    te pondr&aacute;s al tanto de cada dise&ntilde;o nuevo que sea subido al sitio.
                                                </p>
                                                <p>
                                                    <a class="btn btn-primary" href="#">Ir a...</a> <a class="btn" href="#">Leer m&aacute;s...</a>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 column">
                                        <div class="thumbnail">
                                            <img alt="300x200" src="http://lorempixel.com/600/200/city" />
                                            <div class="caption">
                                                <h3>
                                                    Lo m&aacute;s visitado...
                                                </h3>
                                                <p>                                                    <a href="pagoAdmin.action">Tabla Procedimiento</a>

                                                    Aqui puedes ver los sitios m&aacute;s visitados por ti 
                                                    y por otros usuarios
                                                </p>
                                                <p>
                                                    <a class="btn btn-primary" href="#">Ir a...</a> <a class="btn" href="#">Leer m&aacute;s...</a>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 column">
                                        <div class="thumbnail">
                                            <img alt="300x200" src="http://lorempixel.com/600/200/sports" />
                                            <div class="caption">
                                                <h3>
                                                    Lo mejor calificado...
                                                </h3>
                                                <p>
                                                    Visita las zonas que han recibido m&aacute;s estrellas y 
                                                    califica a las mejores.
                                                </p>
                                                <p>
                                                    <a class="btn btn-primary" href="#">Ir a...</a> <a class="btn" href="#">Leer m&aacute;s...</a>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->
                </div>
                <!-- /#page-wrapper -->

            </div>
            <!-- /#wrapper -->
        </div>
        <%@include file="inc/scripts.jsp" %>
        <script type="text/javascript" src="js/Navigation.js"></script>
        <footer class="footer" style="background-color:#c2c2c2">
            Este es el pie de pagina y se esta trabajando en ello
        </footer>
    </body>

</html>
