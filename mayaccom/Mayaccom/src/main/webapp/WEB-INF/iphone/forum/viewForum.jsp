<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.forum-resources"/>
<html>
<head>
<title>View <fmt:message key="forum.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="forum.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexForum"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editForum?idKey=${forum.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="forum.id.title"/>: ${forum.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="forum.name.title"/></span>
			<p>
				${forum.name}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="forum.description.title"/></span>
			<p>
				${forum.description}
			</p>
		</li>
	</ul>
	<ul class="pageitem">
		<li class="menu">
			<a href="${pageContext.request.contextPath}/listForumTopics?idKey=${forum.id}&">
				<span class="name"><fmt:message key="topic.title"/>s</span>
				<span class="arrow"></span>
			</a>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteForum?idKey=${forum.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
