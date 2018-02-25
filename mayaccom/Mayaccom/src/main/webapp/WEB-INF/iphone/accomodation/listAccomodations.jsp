<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accomodation-resources"/>
<html>
<head>
<title><fmt:message key="accomodation.title"/>s</title>
</head>
<body>
	<div id="topbar">
		<div id="title"><fmt:message key="accomodation.title"/>s</div>
		<div id="leftnav"><a href="${pageContext.request.contextPath}"><fmt:message key="navigation.back"/></a></div>
		<div id="rightbutton"><a href="${pageContext.request.contextPath}/newAccomodation"><fmt:message key="navigation.new"/></a></div>
	</div>
	<div id="content">
		<ul class="pageitem">
			<c:forEach items="${accomodations}" var="current" varStatus="i">
			<li class="menu">
				<a href="${pageContext.request.contextPath}/selectAccomodation?idKey=${current.id}&">
					<span class="name">					
						${current.id}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.name}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.address}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.city}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.zipCode}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.capacity}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.link1}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.link2}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.link3}
					</span>					
					<span class="arrow"></span>
					<span class="name">					
						${current.areaM2}
					</span>					
					<span class="arrow"></span>
				</a>
			</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
