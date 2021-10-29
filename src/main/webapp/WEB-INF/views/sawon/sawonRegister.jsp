<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>

		<script type="text/javascript">
		
			// 회원가입 버튼
			function btn_register() {
				var id = document.getElementById("id");
				var pw = document.getElementById("pw");
				var pw2 = document.getElementById("pw2");
				var name = document.getElementById("name");
				var birth = document.getElementById("birth");
				var gender = document.getElementById("gender");
				var email = document.getElementById("email");
				var addr = document.getElementById("addr");
				var tel = document.getElementById("tel");
				var dept = document.getElementById("dept");
				var isadmin = document.getElementById("isadmin");
				
				if(id.value=="") {
					alert("아이디를 입력하세요.");
					id.focus();
					return false;
				}
				
				if(pwa)
			}
			
			// 아이디 중복 체크 버튼
			function btn_idCheck() {
				
			}
		</script>

	</head>
	
	<body>
	
	<section>
		<form action="${path}/sawon/sawonRegister" method="post">
			<div>
				<label for="id">아이디</label>
				<input type="text" id="id"/>
				<button type="button" onclick="btn_idCheck()">중복확인</button>
			</div>
			<div>
				<label for="pw">비밀번호</label>
				<input type="password" id="pw"/>
			</div>
			<div>
				<label for="pw2">비밀번호 재확인</label>
				<input type="password" id="pw2"/>
			</div>
			<div>
				<label for="name">이름</label>
				<input type="text" id="name"/>
			</div>
			<div>
				<label for="birth">생년월일</label>
				<input type="date" id="bitrh"/>
			</div>
			<div>
				성별
				<select name="gender">
					<option value="none">=== 선택 ===</option>
					<option value="m">남자</option>
					<option value="w">여자</option>
				</select>
			</div>
			<div>
				<label for="email">이메일</label>
				<input type="email" id="email"/>
			</div>
			<div>
				<label for="addr">주소</label>
				<input type="text" id="addr"/>
			</div>
			<div>
				<label for="tel">전화번호</label>
				<input type="tel" id="tel"/>
			</div>
			<div>
				부서
				<select name="dept">
					<option value="none">=== 선택 ===</option>
					<option value="DEPT001">경영관리부</option>
					<option value="DEPT002">SI사업부</option>
					<option value="DEPT003">인프라서비스부</option>
					<option value="DEPT004">데이터테크서비스본부</option>
				</select>
			</div>
			<div>
				관리자 여부
				<input type="radio" name="isadmin" value="y"/>예
				<input type="radio" name="isadmin" value="n" checked/>아니오
			</div>
			
			<div>
				<button type="submit" onclick="btn_register()">가입하기</button>
			</div>
			
		
		</form>
	</section>
	
	
	
	</body>
</html>