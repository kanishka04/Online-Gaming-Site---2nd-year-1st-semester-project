<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Game</title>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="welcome1.css" type="text/css" media="all" />
<!--[if IE 6]><link rel="stylesheet" href="welcome2.css" type="text/css" media="all" /><![endif]-->
<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
<script src="js/fns.js" type="text/javascript"></script>
</head>
<body>
<!-- Page -->
<div id="page" class="shell">
  <!-- Header -->
  <div id="header">

    <div class="cl">&nbsp;</div>
    <!-- Logo -->
    <div id="logo">
      <h1><a href="#">Mini<span>Games</span></a></h1>
      <p class="description">your game zone</p>
    </div>
    <!-- / Logo -->

    <!-- / Main Navigation -->
    <div class="cl">&nbsp;</div>
    <!-- Sort Navigation -->
    <div id="sort-nav">
      <div class="bg-right">
        <div class="bg-left">
          <div class="cl">&nbsp;</div>
          <ul>
            <li class="first active first-active"><a href="#">Review</a><span class="sep">&nbsp;</span></li>
            <li><a href="article.jsp">Latest Articles </a><span class="sep">&nbsp;</span></li>
            <li><a href="searchView.jsp"><form method = "POST" action ="searchAll " >New Releases</form></a><span class="sep">&nbsp;</span></li>
            <li><a href="GameServlet" method ="post">All Games</a><span class="sep">&nbsp;</span></li>
              <li><a href="addGames.jsp">Add Games </a><span class="sep">&nbsp;</span></li>
			<li><a href="LogOutServlet">Log out</a><span class="sep">&nbsp;</span></li>
          </ul>
          <div class="cl">&nbsp;</div>
        </div>
      </div>
    </div>
    <!-- / Sort Navigation -->
  </div>
  <!-- / Header -->
  <!-- Main -->
  <div id="main">
    <div id="main-bot">
      <div class="cl">&nbsp;</div>
      <!-- Content -->
      <div id="content">
        <div class="block">
          <div class="block-bot">
            <div class="block-cnt">
              <div id="slider">
                <div class="buttons"> <span class="prev">prev</span> <span class="next">next</span> </div>
                <div class="holder">
                  <div class="frame">&nbsp;</div>
                  <div class="content">
                    <ul>
                    <li class="fragment">
                      <div class="image">
                      <img src="images/img10.jpg" alt="" /> 
                  </div>
                  <div class="cnt">
                    <div class="cl">&nbsp;</div>
                    <div class="side-a">
                      <a href="downloadStarcraft.jsp"><h4>StarCraft II</h4></a>
                      <ul class="rating">
                        <li><span class="star full-star">&nbsp;</span></li>
                        <li><span class="star full-star">&nbsp;</span></li>
                        <li><span class="star full-star">&nbsp;</span></li>
                        <li><span class="star full-star">&nbsp;</span></li>
                        <li><span class="star empty-star">&nbsp;</span></li>
                        <li><span class="votes">1.456 votes</span></li>
                      </ul>
                    </div>
                    <div class="side-b">
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condi- mentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet.</p>
                    </div>
                    <div class="cl">&nbsp;</div>
                  </div>
                  </li>
                  <li class="fragment">
                    <div class="image"> <img src="images/img10.jpg" alt="" /> </div>
                    <div class="cnt">
                      <div class="cl">&nbsp;</div>
                      <div class="side-a">
                        <a href="downloadStarcraft.jsp"><h4>StarCraft II</h4></a>
                        <ul class="rating">
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star empty-star">&nbsp;</span></li>
                          <li><span class="votes">1.456 votes</span></li>
                        </ul>
                      </div>
                      <div class="side-b">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condi- mentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet.</p>
                      </div>
                      <div class="cl">&nbsp;</div>
                    </div>
                  </li>
                  <li class="fragment">
                    <div class="image"><img src="images/img10.jpg" alt="" ></div>
                    <div class="cnt">
                      <div class="cl">&nbsp;</div>
                      <div class="side-a">
                        <h4>StarCraft II</h4>
                        <ul class="rating">
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star empty-star">&nbsp;</span></li>
                          <li><span class="votes">1.456 votes</span></li>
                        </ul>
                      </div>
                      <div class="side-b">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condi- mentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet.</p>
                      </div>
                      <div class="cl">&nbsp;</div>
                    </div>
                  </li>
                  <li class="fragment">
                    <div class="image"> <img src="images/img10.jpg" alt="" /> </div>
                    <div class="cnt">
                      <div class="cl">&nbsp;</div>
                      <div class="side-a">
                        <h4>StarCraft II</h4>
                        <ul class="rating">
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star full-star">&nbsp;</span></li>
                          <li><span class="star empty-star">&nbsp;</span></li>
                          <li><span class="votes">1.456 votes</span></li>
                        </ul>
                      </div>
                      <div class="side-b">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condi- mentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet.</p>
                      </div>
                      <div class="cl">&nbsp;</div>
                    </div>
                  </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="block">
        <div class="block-bot">
          <div class="head">
            <div class="head-cnt"> <a href="#" class="view-all">view all</a>
              <h3>Top Reviews</h3>
              <div class="cl">&nbsp;</div>
            </div>
          </div>
          <div class="col-articles articles">
            <div class="cl">&nbsp;</div>
            <div class="article">
              <div class="image"> <a href="#"><img src="images/img4.jpg" alt="" /></a> </div>
              <h4><a href="downloadfear.jsp">FEAR 2</a></h4>
              <p class="console"><strong>PSP3</strong></p>
            </div>
            <div class="article">
              <div class="image"> <a href="downloadfallout.jsp"><img src="images/img5.jpg" alt="" /></a> </div>
              <h4><a href="downloadfear.jsp">FALLOUT 3</a></h4>
              <p class="console"><strong>PC</strong></p>
            </div>
            <div class="article">
              <div class="image"> <a href="#"><img src="images/img6.jpg" alt="" /></a> </div>
              <h4><a href="downloadStarcraft.jsp">STARCRAF II</a></h4>
              <p class="console"><strong>PC</strong></p>
            </div>
            <div class="cl">&nbsp;</div>
          </div>
        </div>
      </div>
      <div class="block">
        <div class="block-bot">
          <div class="head">
            <div class="head-cnt"> <a href="#" class="view-all">view all</a>
              <h3>Editor`s Pick</h3>
              <div class="cl">&nbsp;</div>
            </div>
          </div>
          <div class="row-articles articles">
            <div class="cl">&nbsp;</div>
            <div class="article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="downloadfear.jsp"><img src="images\img7.jpg" alt="" /></a> </div>
              <div class="cnt">
                <h4><a href="downloadfear.jsp">F.E.A.R.2</a></h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condimentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet. Maecenas ultricies elit </p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="downloadfear.jsp"><img src="images/img8.jpg" alt="" /></a> </div>
              <div class="cnt">
                <h4><a href="downloadfear.jsp">FALLOUT 3</a></h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condimentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet. Maecenas ultricies elit in mi sagittis fringilla.</p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="article last-article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="downloadStarcraft.jsp"><img src="images/img9.jpg" alt="" /></a> </div>
              <div class="cnt">
                <h4><a href="downloadStarcraft.jsp">STARCRAF II</a></h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condimentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet. Maecenas ultricies elit in mi sagittis fringilla.</p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="cl">&nbsp;</div>
          </div>
        </div>
      </div>
    </div>
    <!-- / Content -->
    <!--  -->
    <div id="sidebar">
      <!-- Search -->
      <div id="search" class="block">
        <div class="block-bot">
          <div class="block-cnt">
            <form method = "POST" action ="search " >
              <div class="cl">&nbsp;</div>
              <div class="fieldplace">
                <input type="text" class="field" placeholder="search" name="name" />
              </div>
              <input type="submit"  class="button" value="GO"  />
              <div class="cl">&nbsp;</div>
            </form>
          </div>
        </div>
      </div>
      <!-- / Search -->
      <!-- Sign In -->
      <div id="sign" class="block">
        <div class="block-bot">
          <div class="block-cnt">
            <div class="cl">&nbsp;</div>
            
            <div class="cl">&nbsp;</div>
            <!--<p class="center"><a href="#">Help?</a>&nbsp;&nbsp;<a href="#">Forgot Password?</a></p>-->
          </div>
        </div>
      </div>
      <!-- / Sign In -->
      <div class="block">
        <div class="block-bot">
          <div class="head">
            <div class="head-cnt">
              <h3>Top Games</h3>
            </div>
          </div>
          <div class="image-articles articles">
            <div class="cl">&nbsp;</div>
            <div class="article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="#"><img src="images/img1.gif" alt="" /></a> </div>
              <div class="cnt">
                <h4><a href="#">TMNT</a></h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie </p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="#"><img src="images/img2.gif" alt="" /></a> </div>
              <div class="cnt">
                <h4><a href="#">F.E.A.R.2</a></h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie </p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="#"><img src="images/img3.gif" alt="" /></a> </div>
              <div class="cnt">
                <h4><a href="#">Steel Fury</a></h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie </p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="cl">&nbsp;</div>
            <a href="#" class="view-all">view all</a>
            <div class="cl">&nbsp;</div>
          </div>
        </div>
      </div>
      <div class="block">
        <div class="block-bot">
          <div class="head">
            <div class="head-cnt">
              <h3>Top Videos</h3>
            </div>
          </div>
          <div class="image-articles articles">
            <div class="cl">&nbsp;</div>
            <div class="article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="#"><img src="images/img1.gif" alt="" /></a> </div>
              <div class="cnt">
                <h4><a href="#">FALLOUT3</a></h4>
                <p>Fallout 3 is a post-apocalyptic action role-playing open world video game developed by Bethesda Game Studios </p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="#"><img src="images/img2.gif" alt="" /></a> </div>
              <div class="cnt">
                <h4><a href="#">Crysis</a></h4>
                <p>Crysis is a first-person shooter video game developed by Crytek and published by Electronic Arts for Microsoft Windows </p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="article">
              <div class="cl">&nbsp;</div>
              <div class="image"> <a href="#"><img src="images/img3.gif" alt="" /></a> </div>
              <div class="cnt">
                 <h4><a href="#">F.E.A.R.2</a></h4> 
                <p>F.E.A.R. 2: Project Origin is a first-person shooter survival horror video game, developed by Monolith Productions and published by Warner Bros.  </p>
              </div>
              <div class="cl">&nbsp;</div>
            </div>
            <div class="cl">&nbsp;</div>
            <a href="#" class="view-all">view all</a>
            <div class="cl">&nbsp;</div>
          </div>
        </div>
      </div>
      <div class="block">
        <div class="block-bot">
          <div class="head">
            <div class="head-cnt">
              <h3>Latest Articles</h3>
            </div>
          </div>
          <div class="text-articles articles">
            <div class="article">
              <h4><a href="#">Dolor amet sodales leo</a></h4>
              <small class="date">21.07.09</small>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scele- risque leo sodales sit amet</p>
            </div>
            <div class="article">
              <h4><a href="#">Amet sed lorem sit</a></h4>
              <small class="date">20.07.09</small>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. </p>
            </div>
            <div class="article">
              <h4><a href="#">Adipsicing elit elementum</a></h4>
              <small class="date">19.07.09</small>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie.</p>
            </div>
            <div class="article">
              <h4><a href="#">Consectetur elit sed molestie</a></h4>
              <small class="date">15.07.09</small>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie.</p>
            </div>
            <div class="cl">&nbsp;</div>
            <a href="#" class="view-all">view all</a>
            <div class="cl">&nbsp;</div>
          </div>
        </div>
      </div>
    </div>
    <!-- / Sidebar -->
    <div class="cl">&nbsp;</div>
    <!-- Footer -->
    <div id="footer">
      <div class="navs">
        <div class="navs-bot">
           <div class="cl">&nbsp;</div>
          <ul>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
          </ul>
          <ul>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
          </ul> 
          <div class="cl">&nbsp;</div>
        </div>
      </div>
      <p class="copy">SLIIT 2nd year group project_GROUP NO 61 </p>
    </div>
    <!-- / Footer -->
  </div></div>
<!-- / Main -->
</div>
<!-- / Page -->
</body>
</html>
