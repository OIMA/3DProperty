<%-- 
    Document   : PanelDiseniador
    Created on : Apr 6, 2014, 6:49:09 PM
    Author     : OIMA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Panel diseniador</title>
        <%@include file="../../inc/jstl.jsp" %>
        <sb:head includeStyles="false" />

        <%@include file="../../inc/Header.jsp" %>
        <link href='<%=request.getContextPath()%>/style/css/3dp.css' type="text/css" rel="stylesheet"/>
        <link href='<%=request.getContextPath()%>/style/css/plugins/dataTables/dataTables.bootstrap.css' type="text/css" rel="stylesheet"/>
        <link href="<%=request.getContextPath()%>/style/css/x3d/x3dom.css" type="text/css" rel="stylesheet"/>
        <link href="<%=request.getContextPath()%>/style/css/x3d/disenio.css" type="text/css" rel="stylesheet"/>
        <script src='<%=request.getContextPath()%>/js/plugins/rating/jquery.raty.min.js' type="text/javascript" ></script>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="../../inc/Navigator.jsp" %>
            <div class="page-wrapper">
                <div class="container" id="container">
                    <div class="row clearfix">
                        <div class="col-md-12 column">
                            <div class="row clearfix">
                                <div class="col-lg-8 column" id="canvasX3D">
                                    <div class="tabbable" id="tabs-435131">
                                        <ul class="nav nav-tabs">
                                            <li class="active">
                                                <a href="#disenio" data-toggle="tab">Dise&ntilde;o</a>
                                            </li>
                                            <li>
                                                <a href="#images" data-toggle="tab">Im&aacute;genes</a>
                                            </li>
                                        </ul>
                                        <div class="tab-content">
                                            <div class="tab-pane active" id="disenio">
                                                <div id="canvas">
                                                    <div class="overItem">
                                                        <div class=""><h1>Nombre de la propiedad</h1></div>
                                                        <button id="botonMaximizar" type="button" class="btn btn-xs btn-danger">Maximizar</button>
                                                    </div>
                                                    <div class="overItem overLogo">
                                                        <a href="index.action" class="pull-left">
                                                            <img src="<%=request.getContextPath()%>/images/2.png" class="media-object" alt=''  height="40" width="90"/>
                                                        </a></div>
                                                    <x3d id='x3domCanvas' showStat='false' showLog='false' x='0px' y='0px'>
                                                        <scene DEF='scene'>
                                                            <NavigationInfo 
                                                                type="'fly'" 
                                                                headlight='false'>
                                                            </NavigationInfo>
<!--                                                            <viewpoint 
                                                                DEF='Camera10' 
                                                                id='cam10' 
                                                                description='Camera10' 
                                                                orientation='0 -1 0 1.57' 
                                                                position='-32 3 0' 
                                                                fieldOfView='1.025'>
                                                            </viewpoint>-->
                                                            <viewpoint DEF='Camera05' id='cam05' description='Camera05' orientation='0.298 -0.950 0.085 0.587' position='216.844 4.875 -40.776' fieldOfView='1.288'></viewpoint>
                                                            <background 
                                                                backUrl='"skybox/day/desert/BK.png"' 
                                                                bottomUrl='"skybox/day/desert/DN.png"' 
                                                                frontUrl='"skybox/day/desert/FR.png"' 
                                                                leftUrl='"skybox/day/desert/LF.png"' 
                                                                rightUrl='"skybox/day/desert/RT.png"' 
                                                                topUrl='"skybox/day/desert/UP.png"'>
                                                            </background>
                                                            <inline url="<%=request.getContextPath()%>/x3d/disenios/4.x3d" ></inline>
                                                        </scene>
                                                    </x3d>
                                                    <div>
                                                        Califica este disenio
                                                        <div  data-score="1" id="rating-id"></div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="images">
                                                <p>
                                                    <!--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Para las imagenes %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%-->
                                                </p>
                                            </div>
                                            <div class="tab-pane" id="promotor">
                                                <p>
                                                    <!--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Para El promotor %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%-->
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4 column" id="instrucciones">
                                    <h1>Controles</h1>
                                    <div class="media well">
                                        <a href="#" class="pull-left">
                                            <img src="<%=request.getContextPath()%>/images/icons/leftClick.png" class="media-object" alt=''  height="80" width="70"/>
                                        </a>
                                        <div class="media-body">
                                            <h4 class="media-heading">
                                                Click izquierdo
                                            </h4> Para moverte a trav&eacute;s del dise&ntilde;o debes usar un Mouse, 
                                            dando click sobre la pantalla donde se encuentra el dise&ntilde;o y con el rat&oacute;n
                                            puedes darle la direcci&oacute;n que tu quieras.
                                        </div>
                                        <a href="#" class="pull-left">
                                            <img src="<%=request.getContextPath()%>/images/icons/rightClick.png" class="media-object" alt=''  height="80" width="70"/>
                                        </a>
                                        <div class="media-body">
                                            <h4 class="media-heading">Click derecho</h4>
                                            Con click derecho te puedes mover hacia atr&aacute;s, es decir que puedes retroceder de forma similar 
                                            a con el click izquierdo.
                                        </div>

                                        <div class="media">
                                            <a href="#" class="pull-left">
                                                <!--<img src="http://lorempixel.com/64/64/" class="media-object" alt='' />-->
                                            </a>
                                            <div class="media-body">
                                                <h4 class="media-heading">
                                                    M&aacute;s diversi&oacute;n
                                                </h4> 
                                                En la esquina superior izquierda del dise&ntilde;o se encuentra el bot&oacute;n 
                                                para <label class="label label-danger">maximizar</label> la pantalla, y basta con 
                                                presionarlo otra vez para restaurar el tama&ntilde;o original.
                                            </div>
                                        </div>
                                        <div class="media">
                                            <a href="#" class="pull-left">
                                                <!--<img src="http://lorempixel.com/64/64/" class="media-object" alt='' />-->
                                            </a>
                                            <div class="media-body">
                                                <h4 class="media-heading">
                                                    Califica este dise&ntilde;o
                                                </h4> 
                                                Si est&aacute;s interesado en este dise&ntilde;o o zona tur&iacute;stica, puedes calificar 
                                                dando click sobre las estrellas debajo del mismo.
                                                <div  data-score="3.5" id="show-rating"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row clearfix">
                        <div class="col-md-12 column">

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../../inc/scripts.jsp" %>
        <script src='<%=request.getContextPath()%>/js/x3d/x3dom.js' type="text/javascript" ></script>
        <script src='<%=request.getContextPath()%>/js/x3d/interaccionDisenio.js' type="text/javascript" ></script>

    </body>
</html>