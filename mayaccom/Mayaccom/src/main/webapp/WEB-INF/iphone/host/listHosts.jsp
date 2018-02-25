<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.host-resources"/>
<html>
<head>
<title><fmt:message key="host.title"/>s</title>
</head>
<body>
	<div id="topbar">
		<div id="title"><fmt:message key="host.title"/>s</div>
		<div id="leftnav"><a href="${pageContext.request.contextPath}"><fmt:message key="navigation.back"/></a></div>
		<div id="rightbutton"><a href="${pageContext.request.contextPath}/newHost"><fmt:message key="navigation.new"/></a></div>
	</div>
	<div id="content">
		<ul class="pageitem">
			<c:forEach items="${hosts}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectHost?idKey=${current.id}&">
					<span class="name">					
						${current.id}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.contactPerson}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.phone1}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.phone2}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.phone3}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.email}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.username}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.password}
					</span>					
					<span class="arrow"></span>
				</a>
			</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
