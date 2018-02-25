<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.forum-resources"/>
<html>
<head>
<title><fmt:message key="forum.title"/>s</title>
</head>
<body>
	<div id="topbar">
		<div id="title"><fmt:message key="forum.title"/>s</div>
		<div id="leftnav"><a href="${pageContext.request.contextPath}"><fmt:message key="navigation.back"/></a></div>
		<div id="rightbutton"><a href="${pageContext.request.contextPath}/newForum"><fmt:message key="navigation.new"/></a></div>
	</div>
	<div id="content">
		<ul class="pageitem">
			<c:forEach items="${forums}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectForum?idKey=${current.id}&">
					<span class="name">					
						${current.id}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.name}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
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
