<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.post-resources"/>
<html>
<head>
<title>View <fmt:message key="post.title"/> <fmt:message key="topic.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="topic.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectPost?idKey=${post_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editPostTopic?post_id=${post_id}&topic_id=${topic.id}&"><fmt:message key="navigation.edit"/></a></div>
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
	<a href="${pageContext.request.contextPath}/deletePostTopic?post_id=${post_id}&related_topic_id=${topic.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
