<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bellmin World - Register</title>
    <link rel="stylesheet" href=../../../resources/styles.css>
</head>
<body>
   <header>
        <h1>Welcome to Bellmin World</h1>
        <nav>
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="/members">Members</a></li>
                <li><a href="/posts">Posts</a></li>
                <li><a href="/contact">Contact</a></li>
                
            </ul>
            <div class="functions">
            	<ul>
            		<li><a href="/signup">Sign Up</a></li>
            		<li><a href="/login">Login</a></li>
            	</ul>
            </div>
        </nav>
    </header>

    <main>
        <section>
             <div class="signup-container">
        		<h2>회원 가입</h2>
        		<form action="register.php" method="POST">
		            <label for="username">Name:</label>
		            <input type="text" id="username" name="username" required>
		
		            <label for="email">Email:</label>
		            <input type="email" id="email" name="email" required>
		
		            <label for="password">Password:</label>
		            <input type="password" id="password" name="password" required>
		
		            <label for="confirmPassword">Password Confirm:</label>
		            <input type="password" id="confirmPassword" name="confirmPassword" required>
		
		            <button type="submit">가입하기</button>
       			</form>
        	<p>이미 계정이 있으신가요? <a href="/login">로그인</a></p>
        </section>
    </main>

    <footer>
        &copy; 2023 Bellmin World
    </footer>
</body>
</html>