<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.content-resources"/>
<html>
<head>
<title>View <fmt:message key="content.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="content.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexContent"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="content.id.title"/>:
						</td>
						<td>
							${content.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="content.editorcontent.title"/>:
						</td>
						<td>
							${content.editorContent}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="content.contentname.title"/>:
						</td>
						<td>
							${content.contentName}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="accomodation.title"/></h1>
					
						<c:if test='${content.accomodation != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.id.title"/>:
						</td>
						<td>
							${content.accomodation.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.name.title"/>:
						</td>
						<td>
							${content.accomodation.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.address.title"/>:
						</td>
						<td>
							${content.accomodation.address}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.city.title"/>:
						</td>
						<td>
							${content.accomodation.city}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.zipcode.title"/>:
						</td>
						<td>
							${content.accomodation.zipCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.capacity.title"/>:
						</td>
						<td>
							${content.accomodation.capacity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.link1.title"/>:
						</td>
						<td>
							${content.accomodation.link1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.link2.title"/>:
						</td>
						<td>
							${content.accomodation.link2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.link3.title"/>:
						</td>
						<td>
							${content.accomodation.link3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="accomodation.aream2.title"/>:
						</td>
						<td>
							${content.accomodation.areaM2}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editContentAccomodation?content_id=${content.id}&accomodation_id=${content.accomodation.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteContentAccomodation?content_id=${content.id}&related_accomodation_id=${content.accomodation.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${content.accomodation == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newContentAccomodation?content_id=${content.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="accomodation.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>