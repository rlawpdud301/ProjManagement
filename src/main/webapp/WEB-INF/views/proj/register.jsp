<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%@ include file="../include/header.jsp"%>
<section class="content">
	<div class="row">
		<div class="col-sm-12">
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">NEW PROJ</h3>
				</div>
				<form action="register" method="post">
					<div class="box-body">
						<div class="form-group">
							<label>프로젝트 이름</label> <input type="text" name="proj_name"
								class="form-control" placeholder="Enter name">
						</div>
						<div class="form-group">
							<label>프로젝트 내용</label>
							<textarea rows="5" class="form-control" name="proj_cont"
								placeholder="Enter Content"></textarea>
						</div>
						<div class="form-group">
							<label>시작날짜</label> <input type="text" id="datepickerStr"	class="form-control" name="start_date" placeholder="Start Date" readonly="readonly">
						</div>
						<div class="form-group">
							<label>마감날짜</label> <input type="text" id="datepickerEnd"	name="end_date" class="form-control" placeholder="Start Date" readonly="readonly">
						</div>
						<div class="form-group">
							<label>상태</label> <select name="progress">
								<option value="준비">준비</option>
								<option value="진행중">진행중</option>
								<option value="종료">종료</option>
								<option value="보류">보류</option>
							</select>
						</div>
					</div>
					<div class="box-footer">
						<button type="submit" class="btn btn-primary">Insert</button>
						<input type="reset" class="btn btn-primary" value="cancel">
					</div>
				</form>
			</div>
		</div>
	</div>
</section>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
$( function() {
	$( "#datepickerStr" ).datepicker();
	$( "#datepickerStr" ).datepicker( "option", "dateFormat","yy-mm-dd");
	$( "#datepickerEnd" ).datepicker();
	$( "#datepickerEnd" ).datepicker("option", "dateFormat","yy-mm-dd");
	} );
</script>

<%@ include file="../include/footer.jsp"%>