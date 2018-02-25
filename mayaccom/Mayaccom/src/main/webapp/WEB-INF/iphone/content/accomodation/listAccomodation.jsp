<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.content-resources"/>
<html>
<head>
<title><fmt:message key="content.title"/> <fmt:message key="accomodation.title" />s</title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="content.title"/> <fmt:message key="accomodation.title" />s</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectContent?idKey=${content.id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/newContentAccomodation?content_id=${content.id}&"><fmt:message key="navigation.new"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="content.id.title"/>: ${content.id}</span>
	<ul class="pageitem">
		<c:forEach items="${content.accomodation}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectContentAccomodation?content_id=${content.id}&accomodation_id=${current.id}&">
					<span class="name">
						${current.id}
					
						${current.name}
					
						${current.address}
					
						${current.city}
					
						${current.zipCode}
					
						${current.capacity}
					
						${current.link1}
					
						${current.link2}
					
						${current.link3}
					
						${current.areaM2}
					
					</span>
					<span class="arrow"></span>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>
