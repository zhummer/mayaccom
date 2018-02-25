<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.topic-resources"/>
<html>
<head>
<title><fmt:message key="topic.title"/> <fmt:message key="forum.title" />s</title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="topic.title"/> <fmt:message key="forum.title" />s</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectTopic?idKey=${topic.id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/newTopicForum?topic_id=${topic.id}&"><fmt:message key="navigation.new"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="topic.id.title"/>: ${topic.id}</span>
	<ul class="pageitem">
		<c:forEach items="${topic.forum}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectTopicForum?topic_id=${topic.id}&forum_id=${current.id}&">
					<span class="name">
						${current.id}
					
						${current.name}
					
						${current.description}
					
					</span>
					<span class="arrow"></span>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>
