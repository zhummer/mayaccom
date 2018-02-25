<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.host-resources"/>
<html>
<head>
<title>View <fmt:message key="host.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="host.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexHost"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="host.id.title"/>:
						</td>
						<td>
							${host.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="host.contactperson.title"/>:
						</td>
						<td>
							${host.contactPerson}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="host.phone1.title"/>:
						</td>
						<td>
							${host.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="host.phone2.title"/>:
						</td>
						<td>
							${host.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="host.phone3.title"/>:
						</td>
						<td>
							${host.phone3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="host.email.title"/>:
						</td>
						<td>
							${host.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="host.username.title"/>:
						</td>
						<td>
							${host.username}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="host.password.title"/>:
						</td>
						<td>
							${host.password}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="post.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newHostPosts?host_id=${host.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="post.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="post.id.title"/></th>
						<th class="thead"><fmt:message key="post.content.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${host.posts}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectHostPosts?host_id=${host.id}&posts_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editHostPosts?host_id=${host.id}&posts_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteHostPosts?host_id=${host.id}&related_posts_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.content}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="topic.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newHostTopics?host_id=${host.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="topic.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="topic.id.title"/></th>
						<th class="thead"><fmt:message key="topic.name.title"/></th>
						<th class="thead"><fmt:message key="topic.lastposterid.title"/></th>
						<th class="thead"><fmt:message key="topic.lastpostat.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${host.topics}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectHostTopics?host_id=${host.id}&topics_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editHostTopics?host_id=${host.id}&topics_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteHostTopics?host_id=${host.id}&related_topics_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.name}
						&nbsp;
						</td>
						<td>
							${current.lastPosterId}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.lastPostAt.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="accomodation.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newHostAccomodations?host_id=${host.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="accomodation.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="accomodation.id.title"/></th>
						<th class="thead"><fmt:message key="accomodation.name.title"/></th>
						<th class="thead"><fmt:message key="accomodation.address.title"/></th>
						<th class="thead"><fmt:message key="accomodation.city.title"/></th>
						<th class="thead"><fmt:message key="accomodation.zipcode.title"/></th>
						<th class="thead"><fmt:message key="accomodation.capacity.title"/></th>
						<th class="thead"><fmt:message key="accomodation.link1.title"/></th>
						<th class="thead"><fmt:message key="accomodation.link2.title"/></th>
						<th class="thead"><fmt:message key="accomodation.link3.title"/></th>
						<th class="thead"><fmt:message key="accomodation.aream2.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${host.accomodations}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectHostAccomodations?host_id=${host.id}&accomodations_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editHostAccomodations?host_id=${host.id}&accomodations_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteHostAccomodations?host_id=${host.id}&related_accomodations_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.name}
						&nbsp;
						</td>
						<td>
							${current.address}
						&nbsp;
						</td>
						<td>
							${current.city}
						&nbsp;
						</td>
						<td>
							${current.zipCode}
						&nbsp;
						</td>
						<td>
							${current.capacity}
						&nbsp;
						</td>
						<td>
							${current.link1}
						&nbsp;
						</td>
						<td>
							${current.link2}
						&nbsp;
						</td>
						<td>
							${current.link3}
						&nbsp;
						</td>
						<td>
							${current.areaM2}
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