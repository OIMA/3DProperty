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
    </head>
    <body>
        <div id="wrapper">
            <%@include file="../../inc/Navigator.jsp" %>
            <div class="page-wrapper">
                <div class="container">
                    <div class="row clearfix">
                        <div class="col-md-12 column">
                            <div class="row clearfix">
                                <div class="col-lg-8 column" id="canvasX3D">
                                    <div class="overItem">
                                        <button id="botonMaximizar" onclick="toggleFullScreen()" type="button" class="btn btn-xs btn-danger">Maximizar</button>
                                    </div>
                                    <x3d id='x3domCanvas' showStat='false' showLog='false' x='0px' y='0px'>
                                        <scene DEF='scene'>
                                            <NavigationInfo 
                                                type="'freefly'" 
                                                headlight='false'>
                                            </NavigationInfo>
                                            <viewpoint 
                                                DEF='Camera10' 
                                                id='cam10' 
                                                description='Camera10' 
                                                orientation='0 -1 0 1.57' 
                                                position='-32 3 0' 
                                                fieldOfView='1.025'>
                                            </viewpoint>
                                            <background 
                                                backUrl='"skybox/day/desert/BK.png"' 
                                                bottomUrl='"skybox/day/desert/DN.png"' 
                                                frontUrl='"skybox/day/desert/FR.png"' 
                                                leftUrl='"skybox/day/desert/LF.png"' 
                                                rightUrl='"skybox/day/desert/RT.png"' 
                                                topUrl='"skybox/day/desert/UP.png"'>
                                            </background>
                                            <inline url="<%=request.getContextPath()%>/x3d/1.x3d" ></inline>
                                        </scene>
                                    </x3d>
                                </div>
                                <div class="col-md-4 column">
                                    <h1><%=request.getContextPath()%>/x3d/1.x3d</h1>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../../inc/scripts.jsp" %>
        <script src='<%=request.getContextPath()%>/js/3dp.js' type="text/javascript" ></script>
        <script src='<%=request.getContextPath()%>/js/x3d/x3dom.js' type="text/javascript" ></script>
    </body>
</html>