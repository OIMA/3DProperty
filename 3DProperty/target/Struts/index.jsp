<!DOCTYPE html>
<html>
    <head>
        <title></title>
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
                <div class="container">
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
                                    <a href="Examen.action">Examen</a>
                                </li>
                                <!--                                <li class="dropdown pull-right">
                                                                    <a href="#" data-toggle="dropdown" class="dropdown-toggle">Dropdown<strong class="caret"></strong></a>
                                                                    <ul class="dropdown-menu">
                                                                        <li>
                                                                            <a href="#">Action</a>
                                                                        </li>
                                                                        <li>
                                                                            <a href="#">Another action</a>
                                                                        </li>
                                                                        <li>
                                                                            <a href="#">Something else here</a>
                                                                        </li>
                                                                        <li class="divider">
                                                                        </li>
                                                                        <li>
                                                                            <a href="#">Separated link</a>
                                                                        </li>
                                                                    </ul>
                                                                </li>-->
                            </ul>
                            <div class="row clearfix">
                                <div class="row clearfix">
                                    <div class="col-md-8 column">
                                        <h3 class="text-center text-danger">
                                            h3. Lorem ipsum dolor sit amet.
                                        </h3><img alt="140x140" src="http://lorempixel.com/140/140/" />
                                        <p>
                                            Lorem ipsum dolor sit amet, <strong>consectetur adipiscing elit</strong>. 
                                            Aliquam eget sapien sapien. Curabitur in metus urna. In hac habitasse 
                                            platea dictumst. Phasellus eu sem sapien, sed vestibulum velit. 
                                            Nam purus nibh, lacinia non faucibus et, pharetra in dolor. 
                                            Sed iaculis posuere diam ut cursus. 
                                            <em>Morbi commodo sodales nisi id sodales. Proin consectetur, nisi id 
                                                commodo imperdiet, metus nunc consequat lectus, id bibendum diam 
                                                velit et dui.
                                            </em> 
                                            Proin massa magna, vulputate nec bibendum nec, 
                                            posuere nec lacus. 
                                            <small>Aliquam mi erat, aliquam vel luctus eu, pharetra quis elit. 
                                                Nulla euismod ultrices massa, et feugiat ipsum consequat eu.
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
                                            <button type="submit" class="btn btn-default">Submit</button>
                                        </form>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="thumbnail">
                                            <img alt="300x200" src="http://lorempixel.com/600/200/people" />
                                            <div class="caption">
                                                <h3>
                                                    Thumbnail label
                                                </h3>
                                                <p>
                                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                                </p>
                                                <p>
                                                    <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="thumbnail">
                                            <img alt="300x200" src="http://lorempixel.com/600/200/city" />
                                            <div class="caption">
                                                <h3>
                                                    Thumbnail label
                                                </h3>
                                                <p>                                                    <a href="pagoAdmin.action">Tabla Procedimiento</a>

                                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                                </p>
                                                <p>
                                                    <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="thumbnail">
                                            <img alt="300x200" src="http://lorempixel.com/600/200/sports" />
                                            <div class="caption">
                                                <h3>
                                                    Thumbnail label
                                                </h3>
                                                <p>
                                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                                </p>
                                                <p>
                                                    <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
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
        <%@include file="includes/scripts.jsp" %>

    </body>

</html>
