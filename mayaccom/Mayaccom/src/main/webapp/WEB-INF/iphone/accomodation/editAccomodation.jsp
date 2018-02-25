<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accomodation-resources"/>
<html>
<head>
<title>Edit <fmt:message key="accomodation.title"/></title>
</head>
<body>
<div id="topbar" class="black">
	<div id="title">
	<c:choose>
		<c:when test='${newFlag}' >
		<fmt:message key="navigation.new"/> <fmt:message key="accomodation.title"/>
		</c:when>
		<c:otherwise>
		<fmt:message key="navigation.edit"/> <fmt:message key="accomodation.title"/>
		</c:otherwise>
	</c:choose>
	</div>
	<div id="leftnav"><a href="javascript:history.go(-1)"><fmt:message key="navigation.back"/></a></div>
	<div id="bluerightbutton"><a href="javascript:document.editform.submit();">Save</a></div>
</div>
<div id="content">
<form:form name="editform" action="${pageContext.request.contextPath}/saveAccomodation" method="POST" modelAttribute="accomodation">

		<c:choose>
			<c:when test='${newFlag}' >
			<ul class="pageitem">
			<li class="smallfield">
				<span class="header"><fmt:message key="accomodation.id.title"/></span>
				<form:input id="Accomodation_id" path="id"/>
			</li>
			</ul>
			</c:when>
			<c:otherwise>
			<span class="graytitle"><fmt:message key="accomodation.id.title"/>: ${accomodation.id}</span>
			<form:textarea cssStyle="display:none" id="Accomodation_id" path="id"/>
			</c:otherwise>
		</c:choose>		

	<ul class="pageitem">
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.name.title"/></span>
			<form:input id="Accomodation_name" path="name"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.address.title"/></span>
			<form:input id="Accomodation_address" path="address"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.city.title"/></span>
			<form:input id="Accomodation_city" path="city"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.zipcode.title"/></span>
			<form:input id="Accomodation_zipCode" path="zipCode"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.capacity.title"/></span>
			<form:input id="Accomodation_capacity" path="capacity"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.link1.title"/></span>
			<form:input id="Accomodation_link1" path="link1"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.link2.title"/></span>
			<form:input id="Accomodation_link2" path="link2"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.link3.title"/></span>
			<form:input id="Accomodation_link3" path="link3"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="accomodation.aream2.title"/></span>
			<form:input id="Accomodation_areaM2" path="areaM2"/>
		</li>
	</ul>
	<c:choose>
		<c:when test='${newFlag}' >
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
		</c:when>
		<c:otherwise>
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	<a href="${pageContext.request.contextPath}/deleteAccomodation?idKey=${accomodation.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
		</c:otherwise>
	</c:choose>
</form:form>
</div>
</body>
</html>
