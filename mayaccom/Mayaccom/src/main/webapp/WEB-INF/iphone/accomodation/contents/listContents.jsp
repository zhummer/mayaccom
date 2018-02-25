<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accomodation-resources"/>
<html>
<head>
<title><fmt:message key="accomodation.title"/> <fmt:message key="content.title" />s</title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="accomodation.title"/> <fmt:message key="content.title" />s</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectAccomodation?idKey=${accomodation.id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/newAccomodationContents?accomodation_id=${accomodation.id}&"><fmt:message key="navigation.new"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="accomodation.id.title"/>: ${accomodation.id}</span>
	<ul class="pageitem">
		<c:forEach items="${accomodation.contents}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectAccomodationContents?accomodation_id=${accomodation.id}&contents_id=${current.id}&">
					<span class="name">
						${current.id}
					
						${current.editorContent}
					
						${current.contentName}
					
					</span>
					<span class="arrow"></span>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>