<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="../include/header.jsp" %>
<section class="content">
	<div class="row">
		<div class="col-sm-12">
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">List All</h3>
				</div>
				<div class="box-header">
					<a href="${pageContext.request.contextPath}/proj/register">[새 프로젝트 등록]</a>
				</div>
				<div class="box-body">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>프로젝트 이름</th>
								<th>시작날짜</th>
								<th>종료날짜</th>
								<th>상태</th>								
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list }" var="proj">
								<tr>
									<td><a href="${pageContext.request.contextPath}/proj/read?proj_no=${proj.proj_no}">${proj.proj_name }</a></td>									
									<td>${proj.start_date }</td>
									<td>${proj.end_date }</td>				
									<td>${proj.progress }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				
			</div>
		</div>
	</div>
</section>
<%@ include file="../include/footer.jsp" %>