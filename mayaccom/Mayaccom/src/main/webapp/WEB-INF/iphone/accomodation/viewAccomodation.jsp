<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accomodation-resources"/>
<html>
<head>
<title>View <fmt:message key="accomodation.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="accomodation.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexAccomodation"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editAccomodation?idKey=${accomodation.id}&"><fmt:message key="navigation.edit"/></a></div>
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
	<ul class="pageitem">
		<li class="menu">
			<c:if test='${accomodation.host == null}'>
			<a href="${pageContext.request.contextPath}/newAccomodationHost?accomodation_id=${accomodation.id}&">
				<span class="name"><fmt:message key="navigation.new"/> <fmt:message key="host.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
			<c:if test='${accomodation.host != null}'>
			<a href="${pageContext.request.contextPath}/selectAccomodationHost?accomodation_id=${accomodation.id}&host_id=${accomodation.host.id}&">
				<span class="name"><fmt:message key="host.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
		</li>
		<li class="menu">
			<a href="${pageContext.request.contextPath}/listAccomodationContents?idKey=${accomodation.id}&">
				<span class="name"><fmt:message key="content.title"/>s</span>
				<span class="arrow"></span>
			</a>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteAccomodation?idKey=${accomodation.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
