<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.post-resources"/>
<html>
<head>
<title>Edit <fmt:message key="post.title"/> <fmt:message key="host.title" /></title>
</head>
<body>
<div id="topbar" class="black">
	<div id="title">
	<c:choose>
		<c:when test='${newFlag}' >
			  <fmt:message key="navigation.new"/> <fmt:message key="host.title"/>
		</c:when>
		<c:otherwise>
			<fmt:message key="navigation.edit"/> <fmt:message key="host.title"/>
		</c:otherwise>
	</c:choose>
	</div>
	<div id="leftnav"><a href="javascript:history.go(-1)"><fmt:message key="navigation.back"/></a></div>
	<div id="bluerightbutton"><a href="javascript:document.editform.submit();">Save</a></div>
</div>
<div id="content">

<form:form name="editform" action="${pageContext.request.contextPath}/savePostHost" method="POST" modelAttribute="host">

	<c:choose>
		<c:when test='${newFlag}' >
			<ul class="pageitem">
				<li class="smallfield">
					<span class="header"><fmt:message key="host.id.title"/></span>
					<form:input id="Host_id" path="id"/>
				</li>
			</ul>
		</c:when>
		<c:otherwise>
			<span class="graytitle"><fmt:message key="host.id.title"/>:  ${host.id}</span>
			<form:textarea cssStyle="display:none" id="Host_id" path="id"/>
		</c:otherwise>
	</c:choose>

		<ul class="pageitem">
		<li class="smallfield">
			<span class="header"><fmt:message key="host.contactperson.title"/></span>
			<form:input id="Host_contactPerson" path="contactPerson"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="host.phone1.title"/></span>
			<form:input id="Host_phone1" path="phone1"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="host.phone2.title"/></span>
			<form:input id="Host_phone2" path="phone2"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="host.phone3.title"/></span>
			<form:input id="Host_phone3" path="phone3"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="host.email.title"/></span>
			<form:input id="Host_email" path="email"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="host.username.title"/></span>
			<form:input id="Host_username" path="username"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="host.password.title"/></span>
			<form:input id="Host_password" path="password"/>
		</li>
		</ul>
<c:choose>
	<c:when test='${newFlag}' >
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	</c:when>
	<c:otherwise>
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	<a href="${pageContext.request.contextPath}/deletePostHost?post_id=${post_id}&related_host_id=${host.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
	</c:otherwise>
</c:choose>
		<input type=hidden name="post_id" value="${post_id}">


</form:form>
</div>
</body>
</html>
