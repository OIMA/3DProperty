<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
<!--            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>-->
            <a class="navbar-brand" href="index.action">3DProperty & Tourism</a>
        </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
        <c:if test="sesion" var="s" scope="session">
            <%@include file="Messages.jsp" %>
            <%@include file="Properties.jsp" %>
            <%@include file="Favorites.jsp" %>
            <%@include file="User.jsp" %>
        </c:if>
        <li><a href="registrarse.action">Registro</a></li>
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class=""></i> Iniciar sesi&oacute;n <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li>
                    <div class="row clearfix">
                        <div class="col-lg-10 col-lg-offset-1 column">
                            <form role="form" action="<c:url value='j_spring_security_check' />" method="post">
                                <div class="form-group">
                                    <label>Nombre usuario</label>
                                    <input type="text" class="form-control" name="j_username"/>
                                </div>
                                <div class="form-group">
                                    <label >Contrase&ntilde;a</label>
                                    <input type="password" class="form-control" name="j_password"/>
                                </div>
                                <div class="form-group">
                                </div>
                                <button type="submit" class="btn btn-primary btn-block btn-xl">
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    Iniciar sesi&oacute;n
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                </button>
                            </form>
                        </div>
                    </div>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
    </ul>
    <!-- /.navbar-top-links -->

</nav>