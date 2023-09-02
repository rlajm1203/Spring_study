<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bellmin World - Home</title>
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
        <section id="home">
            <h2>Home Page</h2>
            <p>Welcome to Bellmin World! This is the home page.</p>
        </section>

        <section id="members">
            <h2>Members</h2>
            <ul>
                <li>User 1</li>
                <li>User 2</li>
                <li>User 3</li>
            </ul>
        </section>

        <section id="posts">
            <h2>Posts</h2>
            <ul>
                <li>Post 1</li>
                <li>Post 2</li>
                <li>Post 3</li>
            </ul>
        </section>
    </main>

    <footer>
        <p>&copy; 2023 Bellmin World</p>
    </footer>
</body>
</html>