<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.content-resources"/>
<html>
<head>
<title><fmt:message key="content.title"/>s</title>
</head>
<body>
	<div id="topbar">
		<div id="title"><fmt:message key="content.title"/>s</div>
		<div id="leftnav"><a href="${pageContext.request.contextPath}"><fmt:message key="navigation.back"/></a></div>
		<div id="rightbutton"><a href="${pageContext.request.contextPath}/newContent"><fmt:message key="navigation.new"/></a></div>
	</div>
	<div id="content">
		<ul class="pageitem">
			<c:forEach items="${contents}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectContent?idKey=${current.id}&">
					<span class="name">					
						${current.id}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.editorContent}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.contentName}
					</span>					
					<span class="arrow"></span>
				</a>
			</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
