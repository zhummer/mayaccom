<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.topic-resources"/>
<html>
<head>
<title>View <fmt:message key="topic.title"/> <fmt:message key="forum.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="forum.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectTopic?idKey=${topic_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editTopicForum?topic_id=${topic_id}&forum_id=${forum.id}&"><fmt:message key="navigation.edit"/></a></div>
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
	<a href="${pageContext.request.contextPath}/deleteTopicForum?topic_id=${topic_id}&related_forum_id=${forum.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
