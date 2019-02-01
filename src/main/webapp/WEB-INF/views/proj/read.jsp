<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="../include/header.jsp"%>
<section class="content">
	<div class="row">
		<div class="col-sm-12">
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">상세보기</h3>
				</div>
				<div class="box-body">
					<table class="table table-hover">
						<tbody>
							<tr>
								<th style="width: 200px;">프로젝트 이름</th>
								<td>${vo.proj_name }</td>
							</tr>
							<tr>
								<th>프로젝트 내용</th>
								<td>${vo.proj_cont }</td>
							</tr>
							<tr>
								<th>시작날짜</th>
								<td>${vo.start_date }</td>
							</tr>
							<tr>
								<th>종료날짜</th>
								<td>${vo.end_date }</td>
							</tr>
							<tr>
								<th>상태</th>
								<td>${vo.progress }</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="box-footer">
					<button type="submit" class="btn btn-warning" id="bntModify">Modify</button>
					<button type="submit" class="btn btn-danger" id="bntRemove">Remove</button>
					<button type="submit" class="btn btn-primary" id="bntList">Go Back</button>
				</div>	
				<form id="f1" action="" method="post">
					<input type="hidden" name="proj_no" value="${vo.proj_no }">
					<%-- <input type="hidden" name="page" value="${cri.page }"> --%>
				</form>
			</div>
		</div>
	</div>
</section>
<script>
	$(function(){
		$("#bntList").click(function(){
			//location.href = "${pageContext.request.contextPath}/board/listPage";
			$("#f1").attr("action","list");
			$("#f1").attr("method","get");
			$("#f1").submit();
		})
		$("#bntRemove").click(function(){
			$("#f1").attr("action","remove");
			$("#f1").attr("method","get");
			$("#f1").submit();
		})
		$("#bntModify").click(function(){
			$("#f1").attr("method","get");
			$("#f1").attr("action","modify");
			$("#f1").submit();
		})
	})
</script>
<%@ include file="../include/footer.jsp"%>