<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.post-resources"/>
<html>
<head>
<title>View <fmt:message key="post.title"/> <fmt:message key="host.title" /></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="host.title"/></div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/selectPost?idKey=${post_id}&"><fmt:message key="navigation.back"/></a></div>
	<div id="rightbutton"><a href="${pageContext.request.contextPath}/editPostHost?post_id=${post_id}&host_id=${host.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="host.id.title"/>: ${host.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="host.contactperson.title"/></span>
			<p>
				${host.contactPerson}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="host.phone1.title"/></span>
			<p>
				${host.phone1}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="host.phone2.title"/></span>
			<p>
				${host.phone2}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="host.phone3.title"/></span>
			<p>
				${host.phone3}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="host.email.title"/></span>
			<p>
				${host.email}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="host.username.title"/></span>
			<p>
				${host.username}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="host.password.title"/></span>
			<p>
				${host.password}
			</p>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deletePostHost?post_id=${post_id}&related_host_id=${host.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
