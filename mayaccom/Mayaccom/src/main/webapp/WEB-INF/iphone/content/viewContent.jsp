<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.content-resources"/>
<html>
<head>
<title>View <fmt:message key="content.title"/></title>
</head>
<body>
<div id="topbar">
	<div id="title"><fmt:message key="content.title"/> Details</div>
	<div id="leftnav"><a href="${pageContext.request.contextPath}/indexContent"><fmt:message key="navigation.back"/></a></div>
	<div id="rightnav"><a href="${pageContext.request.contextPath}/editContent?idKey=${content.id}&"><fmt:message key="navigation.edit"/></a></div>
</div>
<div id="content">
	<span class="graytitle"><fmt:message key="content.id.title"/>: ${content.id}</span>
	<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="content.editorcontent.title"/></span>
			<p>
				${content.editorContent}
			</p>
		</li>
		<li class="textbox">
			<span class="header"><fmt:message key="content.contentname.title"/></span>
			<p>
				${content.contentName}
			</p>
		</li>
	</ul>
	<ul class="pageitem">
		<li class="menu">
			<c:if test='${content.accomodation == null}'>
			<a href="${pageContext.request.contextPath}/newContentAccomodation?content_id=${content.id}&">
				<span class="name"><fmt:message key="navigation.new"/> <fmt:message key="accomodation.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
			<c:if test='${content.accomodation != null}'>
			<a href="${pageContext.request.contextPath}/selectContentAccomodation?content_id=${content.id}&accomodation_id=${content.accomodation.id}&">
				<span class="name"><fmt:message key="accomodation.title"/></span>
				<span class="arrow"></span>
			</a>
			</c:if>
		</li>
	</ul>
	<a href="${pageContext.request.contextPath}/deleteContent?idKey=${content.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
</div>
</body>
</html>
