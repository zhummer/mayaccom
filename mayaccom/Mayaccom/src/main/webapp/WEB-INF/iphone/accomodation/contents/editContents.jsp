<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accomodation-resources"/>
<html>
<head>
<title>Edit <fmt:message key="accomodation.title"/> <fmt:message key="content.title" /></title>
</head>
<body>
<div id="topbar" class="black">
	<div id="title">
	<c:choose>
		<c:when test='${newFlag}' >
			  <fmt:message key="navigation.new"/> <fmt:message key="content.title"/>
		</c:when>
		<c:otherwise>
			<fmt:message key="navigation.edit"/> <fmt:message key="content.title"/>
		</c:otherwise>
	</c:choose>
	</div>
	<div id="leftnav"><a href="javascript:history.go(-1)"><fmt:message key="navigation.back"/></a></div>
	<div id="bluerightbutton"><a href="javascript:document.editform.submit();">Save</a></div>
</div>
<div id="content">

<form:form name="editform" action="${pageContext.request.contextPath}/saveAccomodationContents" method="POST" modelAttribute="content">

	<c:choose>
		<c:when test='${newFlag}' >
			<ul class="pageitem">
				<li class="smallfield">
					<span class="header"><fmt:message key="content.id.title"/></span>
					<form:input id="Content_id" path="id"/>
				</li>
			</ul>
		</c:when>
		<c:otherwise>
			<span class="graytitle"><fmt:message key="content.id.title"/>:  ${content.id}</span>
			<form:textarea cssStyle="display:none" id="Content_id" path="id"/>
		</c:otherwise>
	</c:choose>

		<ul class="pageitem">
		<li class="textbox">
			<span class="header"><fmt:message key="content.editorcontent.title"/></span>
			<form:textarea rows="10" id="Content_editorContent" path="editorContent"/>
		</li>
		<li class="smallfield">
			<span class="header"><fmt:message key="content.contentname.title"/></span>
			<form:input id="Content_contentName" path="contentName"/>
		</li>
		</ul>
<c:choose>
	<c:when test='${newFlag}' >
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	</c:when>
	<c:otherwise>
	<a href="javascript:document.editform.submit();" class="bigButton blue"><fmt:message key="navigation.save"/></a>
	<a href="${pageContext.request.contextPath}/deleteAccomodationContents?accomodation_id=${accomodation_id}&related_contents_id=${content.id}&" class="bigButton red"><fmt:message key="navigation.delete"/></a>
	</c:otherwise>
</c:choose>
		<input type=hidden name="accomodation_id" value="${accomodation_id}">


</form:form>
</div>
</body>
</html>
