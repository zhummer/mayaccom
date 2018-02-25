<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.topic-resources"/>
<html>
<head>
<title>View <fmt:message key="topic.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="topic.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexTopic"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editTopic?idKey=${topic.id}&"><fmt:message key="navigation.edit"/></a></div>
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
	<ul class="pageitem">
		<li class="menu">
			<c:if test='${topic.host == null}'>
			<a href="${pageContext.request.contextPath}/newTopicHost?topic_id=${topic.id}&">
				<span class="name"><fmt:message key="navigation.new"/> <fmt:message key="host.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
			<c:if test='${topic.host != null}'>
			<a href="${pageContext.request.contextPath}/selectTopicHost?topic_id=${topic.id}&host_id=${topic.host.id}&">
				<span class="name"><fmt:message key="host.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
		</li>
		<li class="menu">
			<c:if test='${topic.forum == null}'>
			<a href="${pageContext.request.contextPath}/newTopicForum?topic_id=${topic.id}&">
				<span class="name"><fmt:message key="navigation.new"/> <fmt:message key="forum.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
			<c:if test='${topic.forum != null}'>
			<a href="${pageContext.request.contextPath}/selectTopicForum?topic_id=${topic.id}&forum_id=${topic.forum.id}&">
				<span class="name"><fmt:message key="forum.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
		</li>
		<li class="menu">
			<a href="${pageContext.request.contextPath}/listTopicPosts?idKey=${topic.id}&">
				<span class="name"><fmt:message key="post.title"/>s</span>
				<span class="arrow"></span>
			</a>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteTopic?idKey=${topic.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
