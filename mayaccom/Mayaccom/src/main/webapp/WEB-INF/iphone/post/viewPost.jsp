<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.post-resources"/>
<html>
<head>
<title>View <fmt:message key="post.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="post.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexPost"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editPost?idKey=${post.id}&"><fmt:message key="navigation.edit"/></a></div>
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
	<ul class="pageitem">
		<li class="menu">
			<c:if test='${post.host == null}'>
			<a href="${pageContext.request.contextPath}/newPostHost?post_id=${post.id}&">
				<span class="name"><fmt:message key="navigation.new"/> <fmt:message key="host.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
			<c:if test='${post.host != null}'>
			<a href="${pageContext.request.contextPath}/selectPostHost?post_id=${post.id}&host_id=${post.host.id}&">
				<span class="name"><fmt:message key="host.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
		</li>
		<li class="menu">
			<c:if test='${post.topic == null}'>
			<a href="${pageContext.request.contextPath}/newPostTopic?post_id=${post.id}&">
				<span class="name"><fmt:message key="navigation.new"/> <fmt:message key="topic.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
			<c:if test='${post.topic != null}'>
			<a href="${pageContext.request.contextPath}/selectPostTopic?post_id=${post.id}&topic_id=${post.topic.id}&">
				<span class="name"><fmt:message key="topic.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deletePost?idKey=${post.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
