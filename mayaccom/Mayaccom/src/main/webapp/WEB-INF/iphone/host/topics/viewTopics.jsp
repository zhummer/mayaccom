<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.host-resources"/>
<html>
<head>
<title>View <fmt:message key="host.title"/> <fmt:message key="topic.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="topic.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/listHostTopics?idKey=${host_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editHostTopics?host_id=${host_id}&topics_id=${topic.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="topic.id.title"/>: ${topic.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="topic.name.title"/></span>
			<p>
				${topic.name}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="topic.lastposterid.title"/></span>
			<p>
				${topic.lastPosterId}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="topic.lastpostat.title"/></span>
			<p>
				<fmt:formatDate dateStyle="short" type="both" value="${topic.lastPostAt.time}"/>
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteHostTopics?host_id=${host_id}&related_topics_id=${topic.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
