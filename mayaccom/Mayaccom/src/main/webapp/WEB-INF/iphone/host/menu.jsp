<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include-iphone.jsp"/>
<fmt:setBundle basename="bundles.host-resources"/>
<ul class="pageitem">
<li class="menu">
	<a class="button" href="${pageContext.request.contextPath}/indexHost">
		<img src="images/icons/view.png" /><span class="name"><fmt:message key="host.title"/>s</span><span class="arrow"></span>
	</a>
</li>
</ul>