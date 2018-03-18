<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.accomodation-resources"/>
<html>
<head>
<title>List <fmt:message key="accomodation.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="accomodation.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAccomodation"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="accomodation.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="accomodation.id.title"/></th>
					<th class="thead"><fmt:message key="accomodation.address.title"/></th>
					<th class="thead"><fmt:message key="accomodation.aream2.title"/></th>
					<th class="thead"><fmt:message key="accomodation.capacity.title"/></th>
					<th class="thead"><fmt:message key="accomodation.city.title"/></th>
					<th class="thead"><fmt:message key="accomodation.link1.title"/></th>
					<th class="thead"><fmt:message key="accomodation.link2.title"/></th>
					<th class="thead"><fmt:message key="accomodation.link3.title"/></th>
					<th class="thead"><fmt:message key="accomodation.name.title"/></th>
					<th class="thead"><fmt:message key="accomodation.zipcode.title"/></th>
					<th class="thead"><fmt:message key="accomodation.personid.title"/></th>
					<th class="thead"><fmt:message key="accomodation.type.title"/></th>
					<th class="thead"><fmt:message key="accomodation.description.title"/></th>
					<th class="thead"><fmt:message key="accomodation.active.title"/></th>
					<th class="thead"><fmt:message key="accomodation.rate.title"/></th>
					<th class="thead"><fmt:message key="accomodation.comment.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${accomodations}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectAccomodation?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editAccomodation?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteAccomodation?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.address}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.areaM2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.capacity}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.city}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.link1}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.link2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.link3}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.name}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.zipCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.personId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.type}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.description}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.active}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.rate}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.comment}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>