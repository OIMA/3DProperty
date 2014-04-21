<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">3DProperty & Tourism</a>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
        <c:if test="sesion" var="s" scope="session">
            <%@include file="Messages.jsp" %>
            <%@include file="Properties.jsp" %>
            <%@include file="Favorites.jsp" %>
            <%@include file="User.jsp" %>
        </c:if>
        <li><a href="registro.action">Registrate!</a></li>
    </ul>
    <!-- /.navbar-top-links -->

</nav>