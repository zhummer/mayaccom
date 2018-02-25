<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accomodation-resources"/>
<html>
<head>
<title>View <fmt:message key="accomodation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="accomodation.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexAccomodation"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.id.title"/>:
						</td>
						<td>
							${accomodation.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.name.title"/>:
						</td>
						<td>
							${accomodation.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.address.title"/>:
						</td>
						<td>
							${accomodation.address}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.city.title"/>:
						</td>
						<td>
							${accomodation.city}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.zipcode.title"/>:
						</td>
						<td>
							${accomodation.zipCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.capacity.title"/>:
						</td>
						<td>
							${accomodation.capacity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.link1.title"/>:
						</td>
						<td>
							${accomodation.link1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.link2.title"/>:
						</td>
						<td>
							${accomodation.link2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.link3.title"/>:
						</td>
						<td>
							${accomodation.link3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="accomodation.aream2.title"/>:
						</td>
						<td>
							${accomodation.areaM2}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="host.title"/></h1>
					
						<c:if test='${accomodation.host != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="host.id.title"/>:
						</td>
						<td>
							${accomodation.host.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="host.contactperson.title"/>:
						</td>
						<td>
							${accomodation.host.contactPerson}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="host.phone1.title"/>:
						</td>
						<td>
							${accomodation.host.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="host.phone2.title"/>:
						</td>
						<td>
							${accomodation.host.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="host.phone3.title"/>:
						</td>
						<td>
							${accomodation.host.phone3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="host.email.title"/>:
						</td>
						<td>
							${accomodation.host.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="host.username.title"/>:
						</td>
						<td>
							${accomodation.host.username}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="host.password.title"/>:
						</td>
						<td>
							${accomodation.host.password}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editAccomodationHost?accomodation_id=${accomodation.id}&host_id=${accomodation.host.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteAccomodationHost?accomodation_id=${accomodation.id}&related_host_id=${accomodation.host.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${accomodation.host == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAccomodationHost?accomodation_id=${accomodation.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="host.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="content.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAccomodationContents?accomodation_id=${accomodation.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="content.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="content.id.title"/></th>
						<th class="thead"><fmt:message key="content.editorcontent.title"/></th>
						<th class="thead"><fmt:message key="content.contentname.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${accomodation.contents}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectAccomodationContents?accomodation_id=${accomodation.id}&contents_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editAccomodationContents?accomodation_id=${accomodation.id}&contents_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteAccomodationContents?accomodation_id=${accomodation.id}&related_contents_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.editorContent}
						&nbsp;
						</td>
						<td>
							${current.contentName}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>