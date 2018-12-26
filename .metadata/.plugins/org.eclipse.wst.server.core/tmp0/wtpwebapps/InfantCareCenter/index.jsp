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
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
      <div class="container">
        <a class="navbar-brand" href="index.html">Start Bootstrap</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="about.html">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="services.html">Services</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="contact.html">Contact</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Portfolio
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
                <a class="dropdown-item" href="portfolio-1-col.html">1 Column Portfolio</a>
                <a class="dropdown-item" href="portfolio-2-col.html">2 Column Portfolio</a>
                <a class="dropdown-item" href="portfolio-3-col.html">3 Column Portfolio</a>
                <a class="dropdown-item" href="portfolio-4-col.html">4 Column Portfolio</a>
                <a class="dropdown-item" href="portfolio-item.html">Single Portfolio Item</a>
              </div>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Blog
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
                <a class="dropdown-item" href="blog-home-1.html">Blog Home 1</a>
                <a class="dropdown-item" href="blog-home-2.html">Blog Home 2</a>
                <a class="dropdown-item" href="blog-post.html">Blog Post</a>
              </div>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Other Pages
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
                <a class="dropdown-item" href="full-width.html">Full Width Page</a>
                <a class="dropdown-item" href="sidebar.html">Sidebar Page</a>
                <a class="dropdown-item" href="faq.html">FAQ</a>
                <a class="dropdown-item" href="404.html">404</a>
                <a class="dropdown-item" href="pricing.html">Pricing Table</a>
              </div>
            </li>
            

	<style>
	.warn {
		border : 1px red solid;
	}
</style>


        
        <c:choose>
        	<c:when test="${empty loginInfo.getMEMBER_ID()}">
        		<div class="btn-group">
		       		<button class="btn btn-outline-primary" data-toggle="modal" data-target="#loginForm">
						로그인
					</button>
		       		<button class="btn btn-outline-primary" data-toggle="modal" data-target="#joinForm">
						회원가입
		       		</button>
        		</div>
        	</c:when>
			
			<c:when test="${loginInfo.getMEMBER_ID().equals('admin')}">
        		<div class="btn-group">
		       		 <button class="btn btn-outline-info" onclick="location.href='./boardSuspendList.kly'">
	        	    	관리자 모드
	        	    </button>
	        	    <button class="btn btn-outline-danger" onclick="location.href='./memberLogout.kly'">
	        	    	로그아웃
	        	    </button>
        		</div>
        	</c:when>
        	
        	<c:otherwise>
	        	<div class="btn-group">
	        	    <button class="btn btn-outline-primary" onclick="location.href='./memberDetail.kly'">
	        	    	마이페이지
	        	    </button>
	        	    <button class="btn btn-outline-danger" onclick="location.href='./memberLogout.kly'">
	        	    	로그아웃
	        	    </button>
	        	</div>
        	</c:otherwise>
        </c:choose>
		

        
<script>
	var overlap = 0; // 0  중복체크 안함, 1 했고 중복 안됌
	var passConfirm = 0;

	/* 아이디 중복체크 */
	function idCheck() {
		var id = document.getElementById("joinId");
		
		console.log("idCheck 실행");
		if(id.value == ""){
			console.log("null if문 실행")
			alert('id를 입력해주세요');
			return;
		} else if(id.value.match(/[가-힣ㄱ-ㅎㅏ-ㅣ]/)) {
			alert('아이디는 한글을 제외해 주세요.');
			return;
		}
	
		
 		var req = new XMLHttpRequest();
		req.onreadystatechange = function() {
			if(this.readyState == 4 && this.status == 200) {
				var out = JSON.parse(this.responseText);
				if(out.result == "yes") {
					alert('아이디가 존재합니다.');
				} else {
					alert('사용 가능한 아이디 입니다.');
					overlap = 1; // 중복체크 완료
					var checkbutton = document.getElementById("checkButton");
					checkbutton.className += " disabled";
					id.disabled = true;
					console.log('버튼 비활성화 완료');
					document.getElementById("tempId").value = id.value;
				}
			}
		}
		req.open("GET","./idOverlapCheck.do?check="+id.value, true);
		req.send();
	}
	
	/* 패스워드 일치 알림 */
	function passCheck() {
		var pass1 = $("#pass1").val();
		var pass2 = $("#pass2").val();
		if(pass1 != pass2) {
			$("#passCheckMessage").html("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
			$("#pass1").addClass("warn");
			$("#pass2").addClass("warn")
		} else {
			$("#passCheckMessage").html("");
			$("#pass1").removeClass("warn");
			$("#pass2").removeClass("warn");
			 passConfirm = 1;
		}
	}
	
	/* 가입 버튼 */
	function join() {
		var email = $("#inputEmail").val();
		if(overlap==0) {
			alert("id 중복체크를 해주세요.");
			return false;
		} else if(passConfirm==0) {
			alert("비밀번호가 일치하지 않습니다.");
			return false;
		} else if(email=="") {
			console.log(email);
			alert("이메일을 입력해 주세요.");
			return false;
		} else if(overlap==1 && passConfirm==1) {
			$("#joinFomat").submit();
		}
	}
</script>



	<!-- 회원 비밀번호 찾기(modal) -->
	<form action="memberFindPass.kly" method="post">
	<div class="modal" id="MissingForm">
		<div class="modal-dialog  modal-lg">
			<div class="modal-content">
                   <div class="modal-header">
                       <h4 class="modal-title">비밀번호 찾기</h4>
                       <button type="button" class="close" data-dismiss="modal">&times;</button>
                   </div>
				
				<div class="modal-body">
					현재 아이디를 입력하시면, 가입 정보에 기입된 이메일로 안내 메일을 발송해 드립니다.
						<input class="form-control" type="text" name="memberID" placeholder="아이디를 입력해주세요.">
				</div>
				
				<div class="modal-footer">
					<p style="color:red;" id="passCheckMessage"></p>
					<button class="btn btn-info" type="submit">이메일 전송</button>
	
				</div>
			</div>
		</div>
	</div>
	</form>
            
          </ul>
        </div>
        
        
        
      </div>
    </nav>
    
    
            <!-- 로그인(modal) -->
        <div class="modal" id="loginForm">
            <div class="modal-dialog">
                <div class="modal-content">
                    
                       <div class="modal-header">
                        <h4 class="modal-title">로그인</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    
                    <form action="memberLogin.do" method="post">
                        <div class="form-group">
                            <div class="modal-body">
                                    <div class="container">
                                       <a href="./index.jsp"><img src="./images/kly.png" style="display:block; height: 300px" /></a>
                                    </div>
                                    
                                    <h5><label>아이디</label></h5>
                                    <input class="form-control" name="loginId" type="text" id="id" />
                                    <h5><label>비밀번호</label></h5>
                                    <input class="form-control" name="loginPwd" type="password" id="pwd" />
                                    <a data-toggle="modal" data-target="#MissingForm"><u>혹시 비밀번호를 잊어버리셨나요?</u></a>
                            </div>
                            <div class="modal-footer">
                                <button class="btn btn-primary" type="submit">로그인</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!-- 회원가입(modal) -->
        <div class="modal" id="joinForm">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">회원가입</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <form action="memberJoin.do" method="post" id="joinFomat">
                        <div class="form-group">
                            <div class="modal-body">
                                
                                <div class="row">
									<div class="col-sm">
		                                <h5><label>아이디</label></h5>
		                            	<div class="row">
											<div class="col-sm-9">
		                                		<input class="form-control" name="MEMBER_ID" type="text" maxlength="10" id="joinId" placeholder="아이디를 입력해 주세요." />
		                                		<input class="form-control" name="memberID" type="hidden" maxlength="10" id="tempId" placeholder="아이디를 입력해 주세요." />
											</div>
									
											<div class="col-sm-3">
												<button type="button" class="btn btn-info" id="checkButton" onclick="idCheck()">중복체크</button> <!-- 중복체크 완료시 disable -->
											</div>
										</div>
									</div>
                                </div>

								<div class="row mt-2 mb-2">
									
									<div class="col-sm">
										<label><h5>비밀번호</h5></label>
										<input class="form-control" name="MEMBER_PW" type="password" id="pass1" onkeyup="passCheck()" placeholder="비밀번호를 입력해 주세요."/>
									</div>
									
									<div class="col-sm">
										<label><h5>비밀번호 확인</h5></label>
										<input class="form-control" type="password" id="pass2" onkeyup="passCheck()" placeholder="한번 더  입력해 주세요."/>
									</div>
									
                                </div>
                                
                                <label><h5>이메일</h5></label>
                                <input class="form-control" name="MEMBER_EMAIL" type="email" id="inputEmail" placeholder="이메일을 입력해 주세요."/>
                                    
                            </div>
							<div class="modal-footer">
								<p style="color:red;" id="passCheckMessage"></p>
                                <button type="button" class="btn btn-primary" onclick="join()">가입</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    
    

    <header>
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <!-- Slide One - Set the background image for this slide in the line below -->
          <!-- ë©ì¸íì´ì§ ì´ë¯¸ì§ ì¤í¬ë¡¤? -->
          <div class="carousel-item active" style="background-image: url('./img/infant.jpg')">
            <div class="carousel-caption d-none d-md-block">
              <h3>First Slide</h3>
              <p>This is a description for the first slide.</p>
            </div>
          </div>
          <!-- Slide Two - Set the background image for this slide in the line below -->
          <div class="carousel-item" style="background-image: url('http://placehold.it/1900x1080')">
            <div class="carousel-caption d-none d-md-block">
              <h3>Second Slide</h3>
              <p>This is a description for the second slide.</p>
            </div>
          </div>
          <!-- Slide Three - Set the background image for this slide in the line below -->
          <div class="carousel-item" style="background-image: url('http://placehold.it/1900x1080')">
            <div class="carousel-caption d-none d-md-block">
              <h3>Third Slide</h3>
              <p>This is a description for the third slide.</p>
            </div>
          </div>
        </div>
        <!-- ë©ì¸ ì´ë¯¸ì§ ì¤í¬ë¡¤ ì´ì ë²í¼ -->
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <!-- ë©ì¸ ì´ë¯¸ì§ ì¤í¬ë¡¤ ë¤ìë²í¼ -->
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    </header>

    <!-- Page Content -->
    <div class="container">

      <h1 class="my-4">Welcome to Modern Business</h1>

      <!-- Marketing Icons Section -->
      <div class="row">
        <div class="col-lg-4 mb-4">
          <div class="card h-100">
            <h4 class="card-header">Card Title</h4>
            <div class="card-body">
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary">Learn More</a>
            </div>
          </div>
        </div>
        <div class="col-lg-4 mb-4">
          <div class="card h-100">
            <h4 class="card-header">Card Title</h4>
            <div class="card-body">
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis ipsam eos, nam perspiciatis natus commodi similique totam consectetur praesentium molestiae atque exercitationem ut consequuntur, sed eveniet, magni nostrum sint fuga.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary">Learn More</a>
            </div>
          </div>
        </div>
        <div class="col-lg-4 mb-4">
          <div class="card h-100">
            <h4 class="card-header">Card Title</h4>
            <div class="card-body">
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary">Learn More</a>
            </div>
          </div>
        </div>
      </div>
      <!-- /.row -->

      <!-- Portfolio Section -->
      <h2>Portfolio Heading</h2>

      <div class="row">
        <div class="col-lg-4 col-sm-6 portfolio-item">
          <div class="card h-100">
            <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <a href="#">Project One</a>
              </h4>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur eum quasi sapiente nesciunt? Voluptatibus sit, repellat sequi itaque deserunt, dolores in, nesciunt, illum tempora ex quae? Nihil, dolorem!</p>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6 portfolio-item">
          <div class="card h-100">
            <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <a href="#">Project Two</a>
              </h4>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6 portfolio-item">
          <div class="card h-100">
            <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <a href="#">Project Three</a>
              </h4>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos quisquam, error quod sed cumque, odio distinctio velit nostrum temporibus necessitatibus et facere atque iure perspiciatis mollitia recusandae vero vel quam!</p>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6 portfolio-item">
          <div class="card h-100">
            <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <a href="#">Project Four</a>
              </h4>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6 portfolio-item">
          <div class="card h-100">
            <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <a href="#">Project Five</a>
              </h4>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae.</p>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6 portfolio-item">
          <div class="card h-100">
            <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <a href="#">Project Six</a>
              </h4>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Itaque earum nostrum suscipit ducimus nihil provident, perferendis rem illo, voluptate atque, sit eius in voluptates, nemo repellat fugiat excepturi! Nemo, esse.</p>
            </div>
          </div>
        </div>
      </div>
      <!-- /.row -->

      <!-- Features Section -->
      <div class="row">
        <div class="col-lg-6">
          <h2>Modern Business Features</h2>
          <p>The Modern Business template by Start Bootstrap includes:</p>
          <ul>
            <li>
              <strong>Bootstrap v4</strong>
            </li>
            <li>jQuery</li>
            <li>Font Awesome</li>
            <li>Working contact form with validation</li>
            <li>Unstyled page elements for easy customization</li>
          </ul>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis, omnis doloremque non cum id reprehenderit, quisquam totam aspernatur tempora minima unde aliquid ea culpa sunt. Reiciendis quia dolorum ducimus unde.</p>
        </div>
        <div class="col-lg-6">
          <img class="img-fluid rounded" src="http://placehold.it/700x450" alt="">
        </div>
      </div>
      <!-- /.row -->

      <hr>

      <!-- Call to Action Section -->
      <div class="row mb-4">
        <div class="col-md-8">
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Molestias, expedita, saepe, vero rerum deleniti beatae veniam harum neque nemo praesentium cum alias asperiores commodi.</p>
        </div>
        <div class="col-md-4">
          <a class="btn btn-lg btn-secondary btn-block" href="#">Call to Action</a>
        </div>
      </div>

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
