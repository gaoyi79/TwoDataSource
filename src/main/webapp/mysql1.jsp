<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
		xmlns:jsp="http://java.sun.com/JSP/Page"
		xmlns:c="http://java.sun.com/jsp/jstl/core"
		xmlns:joda="http://www.joda.org/joda/time/tags"
		xmlns:spring="http://www.springframework.org/tags" version="2.0">
<body>
	<div>
		<jsp:directive.page contentType="text/html;charset=UTF-8" />
		<jsp:output omit-xml-declaration="yes" />
		<c:if test="${not empty objs}">
			<table>
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Version</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${objs}" var="obj">
						<tr>
							<td>${user.id}</td>
							<td>${user.name}</td>
							<td>${user.version}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>