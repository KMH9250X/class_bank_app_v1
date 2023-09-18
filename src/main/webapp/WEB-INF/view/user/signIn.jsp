<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/view/layout/header.jsp"%>

<div class="col-sm-8">
	<h2>로그인 페이지</h2>
	<h5>어서오세요 환영합니다.</h5>
	<div class="bg-light p-md-5 h-75">
		<form action="" method="post">
			<div class="form-group">
				<label for="username">User Name :</label> <input type="text"
					class="form-control" id="username" placeholder="Enter username"
					name="username">
			</div>
			<div class="form-group">
				<label for="pwd">Password :</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password"
					name="password">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>
</div>
</div>
</div>

<%@ include file="/WEB-INF/view/layout/footer.jsp"%>