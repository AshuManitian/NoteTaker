<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   	<%@include file="all_js_css.jsp" %>
</head>
<body>
	<%@include file="navbar.jsp" %>
	<h1>Please fill the form below</h1>
	<form action="saveNoteServlet" method="post">
	  <div class="mb-3">
	    <label for="title" class="form-label">Title</label>
	    <input type="text" class="form-control" id="title" aria-describedby="title_help" required>
<!-- 	    <div id="title_help" class="form-text">We'll never share your email with anyone else.</div> -->
	  </div>
	  <div class="mb-3">
	    <label for="content" class="form-label">Note Content</label>
	   <textarea class="form-control" id="content" placeholder="enter you content here..." style="height:300px;" required ></textarea>
	  </div>

     <div class="container text-center">
      	<button type="submit" class="btn btn-primary">add Note</button>
      </div>
    
</form>
</body>
</html>