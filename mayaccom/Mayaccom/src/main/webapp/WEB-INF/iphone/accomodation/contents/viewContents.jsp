<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accomodation-resources"/>
<html>
<head>
<title>View <fmt:message key="accomodation.title"/> <fmt:message key="content.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="content.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/listAccomodationContents?idKey=${accomodation_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editAccomodationContents?accomodation_id=${accomodation_id}&contents_id=${content.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="content.id.title"/>: ${content.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="content.editorcontent.title"/></span>
			<p>
				${content.editorContent}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="content.contentname.title"/></span>
			<p>
				${content.contentName}
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteAccomodationContents?accomodation_id=${accomodation_id}&related_contents_id=${content.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
