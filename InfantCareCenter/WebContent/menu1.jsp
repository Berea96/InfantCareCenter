<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Modern Business - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/modern-business.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <%@include file="./navbarTemplate.jsp" %>

    <!-- Page Content -->
    <div class="container">

      <!-- Page Heading/Breadcrumbs -->
      <h1 class="mt-4 mb-3">Menu
        <small>1</small>
      </h1>

      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="index.html">Home</a>
        </li>
        <li class="breadcrumb-item active">Menu1</li>
        <li class="breadcrumb-item active">Menu1-1</li>
      </ol>

      <!-- Content Row -->
      <div class="row">
        <!-- Sidebar Column -->
        <div class="col-lg-3 mb-4">
          <div class="list-group">
            <a href="menu1.jsp" class="list-group-item active">메뉴1</a>
            <a href="menu1_1.jsp" class="list-group-item bg-light">메뉴1-1</a>
            <a href="menu1_2.jsp" class="list-group-item bg-light">메뉴1-2</a>
          </div>
        </div>
        <!-- Content Column -->
        <div class="col-lg-9 mb-4">
	        <div class="jumbotron" style="background-image: url('img/Switzerland1.jpg'); background-size: cover;">
	          <h2>이미지?</h2>
	          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Soluta, et temporibus, facere perferendis veniam beatae non debitis, numquam blanditiis necessitatibus vel mollitia dolorum laudantium, voluptate dolores iure maxime ducimus fugit.</p>
	        </div>
	        <div class="jumbotron bg-light">
	        	<table class="table table-bordered">
	        		<thead>
	        			<tr>
	        				<th scope="col">번호</th>
	        				<th scope="col">제목</th>
	        				<th scope="col">작성자</th>
	        				<th scope="col">작성일</th>
	        			</tr>
	        		</thead>
	        		<tbody>
	        			<tr>
	        				<th scope="row">1</th>
	        				<td>제목입니다</td>
	        				<td>작 성자</td>
	        				<td>2018-12-27</td>
	        			</tr>
	        			<tr>
	        				<th scope="row">2</th>
	        				<td>제목입니다</td>
	        				<td>작 성자</td>
	        				<td>2018-12-27</td>
	        			</tr>
	        			<tr>
	        				<th scope="row">3</th>
	        				<td>제목입니다</td>
	        				<td>작 성자</td>
	        				<td>2018-12-27</td>
	        			</tr>
	        			<tr>
	        				<th scope="row">4</th>
	        				<td>제목입니다</td>
	        				<td>작 성자</td>
	        				<td>2018-12-27</td>
	        			</tr>
	        			<tr>
	        				<th scope="row">5</th>
	        				<td>제목입니다</td>
	        				<td>작 성자</td>
	        				<td>2018-12-27</td>
	        			</tr>
	        		</tbody>
	        	</table>
	        </div>
        </div>
      </div>
      <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2018</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
