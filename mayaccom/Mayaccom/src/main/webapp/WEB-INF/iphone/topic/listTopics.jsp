<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.topic-resources"/>
<html>
<head>
<title><fmt:message key="topic.title"/>s</title>
</head>
<body>
	<div id="topbar">
		<div id="title"><fmt:message key="topic.title"/>s</div>
		<div id="leftnav"><a href="${pageContext.request.contextPath}"><fmt:message key="navigation.back"/></a></div>
		<div id="rightbutton"><a href="${pageContext.request.contextPath}/newTopic"><fmt:message key="navigation.new"/></a></div>
	</div>
	<div id="content">
		<ul class="pageitem">
			<c:forEach items="${topics}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectTopic?idKey=${current.id}&">
					<span class="name">					
						${current.id}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.name}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.lastPosterId}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
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
