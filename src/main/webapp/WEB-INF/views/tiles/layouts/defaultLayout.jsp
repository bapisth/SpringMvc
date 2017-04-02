<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title" /></title>
<%-- 
	<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link> --%>


<!-- Bootstrap core CSS -->
<link href="<c:url value='/static/assets/css/bootstrap.css' />"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<c:url value='/static/assets/css/style.css' />"
	rel="stylesheet">
<link href="<c:url value='/static/assets/css/font-awesome.min.css' />"
	rel="stylesheet">
<script src="<c:url value='/static/assets/js/modernizr.js' />"></script>
</head>

<body>
	<header id="header">
		<tiles:insertAttribute name="header" />
	</header>

	<%-- <section id="sidemenu">
			<tiles:insertAttribute name="menu" />
		</section> --%>


	<section id="site-content">
		<div class="container mtb">
			<div class="row">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
	</section>

	<footer id="footer">
		<tiles:insertAttribute name="footer" />
	</footer>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="<c:url value='/static/assets/js/bootstrap.min.js' />"></script>
	<script src="<c:url value='/static/assets/js/retina-1.1.0.js' />"></script>
	<script src="<c:url value='/static/assets/js/jquery.hoverdir.js' />"></script>
	<script src="<c:url value='/static/assets/js/jquery.hoverex.min.js' />"></script>
	<script src="<c:url value='/static/assets/js/jquery.prettyPhoto.js' />"></script>
	<script src="<c:url value='/static/assets/js/jquery.isotope.min.js' />"></script>
	<script src="<c:url value='/static/assets/js/custom.js' />"></script>
</body>
</html>