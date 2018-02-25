<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.host-resources"/>
<html>
<head>
<title>View <fmt:message key="host.title"/> <fmt:message key="accomodation.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="accomodation.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/listHostAccomodations?idKey=${host_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editHostAccomodations?host_id=${host_id}&accomodations_id=${accomodation.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="accomodation.id.title"/>: ${accomodation.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.name.title"/></span>
			<p>
				${accomodation.name}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.address.title"/></span>
			<p>
				${accomodation.address}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.city.title"/></span>
			<p>
				${accomodation.city}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.zipcode.title"/></span>
			<p>
				${accomodation.zipCode}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.capacity.title"/></span>
			<p>
				${accomodation.capacity}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.link1.title"/></span>
			<p>
				${accomodation.link1}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.link2.title"/></span>
			<p>
				${accomodation.link2}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.link3.title"/></span>
			<p>
				${accomodation.link3}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="accomodation.aream2.title"/></span>
			<p>
				${accomodation.areaM2}
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteHostAccomodations?host_id=${host_id}&related_accomodations_id=${accomodation.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
