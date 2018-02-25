<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.topic-resources"/>
<html>
<head>
<title><fmt:message key="topic.title"/> <fmt:message key="post.title" />s</title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="topic.title"/> <fmt:message key="post.title" />s</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectTopic?idKey=${topic.id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/newTopicPosts?topic_id=${topic.id}&"><fmt:message key="navigation.new"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="topic.id.title"/>: ${topic.id}</span>
	<ul class="pageitem">
		<c:forEach items="${topic.posts}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectTopicPosts?topic_id=${topic.id}&posts_id=${current.id}&">
					<span class="name">
						${current.id}
					
						${current.content}
					
					</span>
					<span class="arrow"></span>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>
