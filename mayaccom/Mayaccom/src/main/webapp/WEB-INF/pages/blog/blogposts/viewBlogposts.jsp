<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.blog-resources"/>
<html>
<head>
<title>View <fmt:message key="blog.title"/> <fmt:message key="blogpost.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="blogpost.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectBlog?idKey=${blog_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="blogpost.id.title"/>:
						</td>
						<td>
							${blogpost.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="blogpost.content.title"/>:
						</td>
						<td>
							${blogpost.content}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="blogpost.creationts.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${blogpost.creationTs.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
