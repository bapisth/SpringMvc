<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<ul style="list-style: none; line-height: 28px;">

	<li><spring:url value="/index" var="homeUrl" htmlEscape="true" />
		<a href="/TilesDemo/welcome">Home</a></li>

	<li><spring:url value="/viewPerson" var="personListUrl"
			htmlEscape="true" /> <a href="/TilesDemo/viewPerson">Person List</a>
	</li>

</ul>