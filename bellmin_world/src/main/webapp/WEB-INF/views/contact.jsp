<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bellmin World - Contact Us</title>
    <link rel="stylesheet" href="../../resources/styles.css">
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
            <h2>Contact Us</h2>
            <p>If you have any questions or would like to get in touch with us, please fill out the form below. We'll get back to you as soon as possible.</p>
            
            <form action="submit_contact_form.php" method="POST">
            	<div class="contact_input">
	                <label for="name">Name</label>
	                <input type="text" id="name" name="name" required>
                </div>
                <div class="contact_input">
	                <label for="email">Email</label>
	                <input type="email" id="email" name="email" required>
                </div>
                <div class="contact_input">
	                <label for="message">Message</label>
	                <textarea id="message" name="message" rows="3" cols="5"></textarea>
                </div>
                <div class="contact_input">
                	<button type="submit">Submit</button>
                </div>
                
            </form>
        </section>
    </main>

    <footer>
        <p>&copy; 2023 Bellmin World. All rights reserved.</p>
    </footer>
</body>
</html>
