<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.topic-resources"/>
<html>
<head>
<title>View <fmt:message key="topic.title"/> <fmt:message key="post.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="post.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/listTopicPosts?idKey=${topic_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editTopicPosts?topic_id=${topic_id}&posts_id=${post.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="post.id.title"/>: ${post.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="post.content.title"/></span>
			<p>
				${post.content}
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteTopicPosts?topic_id=${topic_id}&related_posts_id=${post.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
