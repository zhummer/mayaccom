<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.post-resources"/>
<html>
<head>
<title><fmt:message key="post.title"/> <fmt:message key="topic.title" />s</title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="post.title"/> <fmt:message key="topic.title" />s</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectPost?idKey=${post.id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/newPostTopic?post_id=${post.id}&"><fmt:message key="navigation.new"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="post.id.title"/>: ${post.id}</span>
	<ul class="pageitem">
		<c:forEach items="${post.topic}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectPostTopic?post_id=${post.id}&topic_id=${current.id}&">
					<span class="name">
						${current.id}
					
						${current.name}
					
						${current.lastPosterId}
					
						<fmt:formatDate dateStyle="medium" timeStyle="medium" type="both" value="${current.lastPostAt.time}"/>
					
					</span>
					<span class="arrow"></span>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>
