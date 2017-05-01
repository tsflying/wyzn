<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>万友智能</title>
<link href="<%=path%>/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="header">
  	<div id="row2">
    <!-- .nav -->
      	<ol class="nav">
          <li class="first"><a href="index.do">主页</a></li>
          <li><a href="abtouUs.do">关于我们</a></li>
          <li><a href="news.do">新闻中心</a></li>
          <li><a href="products.do">产品展示</a></li>
          <li><a href="services.do">服务项目</a></li>
          <li class="last"><a href="contact.do">联系我们</a></li>
        </ol>
      	<!-- /.nav -->
   </div>
</div>
<div id="content"><div id="one">
<div id="sidebar">
<div id="services">
<p class="Services"><a href="#">Services</a></p>
<ul>
<li><a href="#">Strategy</a><br /><img src="<%=path%>/imgs/12.jpg" alt="img" /></li>
<li><a href="#">Investment banking<br /><img src="<%=path%>/imgs/12.jpg" alt="img" /></a></li>
<li><a href="#">Marceting consalting</a><br /><img src="<%=path%>/imgs/12.jpg" alt="img" /></li>
<li><a href="#">Research</a><br /><img src="<%=path%>/imgs/12.jpg" alt="img" /></li>
<li><a href="#">Project managment</a><br /><img src="<%=path%>/imgs/12.jpg" alt="img" /></li>
<li><a href="#">Tax services</a><br /><img src="<%=path%>/imgs/12.jpg" alt="img" /></li>
<li><a href="#">Business Banking</a></li></ul></div><br />
<p class="Services"><a href="#">Advantages</a></p>
<div class="wrapper">
   <img src="<%=path%>/imgs/13.jpg" alt="" title="" />
   <p><strong>Partnership</strong></p><p>Pellentesque pellentesque. Donec congue tempus velit.</p>
</div>
<div class="wrapper1">
   <img src="<%=path%>/imgs/14.jpg" alt="" title="" />
   <p><strong>Technologies</strong></p><p>Pellentesque pellentesque. Donec congue tempus .</p>
</div>
</div>

<div id="center">
<br />
<p class="name">联系我们</p>
<img src="<%=path%>/imgs/05.jpg"  alt="img" />

<div class="g"><img src="<%=path%>/imgs/wyzn2.png"  alt="img" style=" width: 227px; height: 224px;"/></div>
<div class="d"><br /><p><span class="s">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</span></p>  <p>Morbi aliquet euismod nulla. Maecenas facilisis consectetuer purus. Nulla vestibulum molestie elit.</p><br /> <br /> <p>Pellentesque pellentesque. Donec congue tempus velit. Sed aliquet risus ut sem.<br /> </p>
<span class="s"> Pellentesque nisi </span>tincidunt  odio.<br /><br /><br /><br /><br /></div>
<p class="news">最近新闻动态<br /><br /><br /></p>
<p><img src="<%=path%>/imgs/05.jpg"  alt="img" /></p>
<div class="left"><br /><br />
<p><p><a href="#"><img class="gg" src="<%=path%>/imgs/07.jpg" alt="img" /></a></p><p class="dd"><span class="s">Morbi aliquet euismod </span><br />
   Maecenas facilisis ut consectetuer purus odio.Pellentesque pellentesque<br /><br /></p></p><br /><br /><br /><br />
<p><p><br /><a href="#"><img class="gg" src="<%=path%>/imgs/08.jpg" alt="img" /></a></p><p class="dd"><span class="s">Morbi aliquet euismod </span><br /> Pellentesque pellentesque. Maecenas facilisis ut consectetuer purus odio.<br /><br /><br /></p></p>
<p><a href="#"><img src="<%=path%>/imgs/09.jpg" alt="img" /></a></p></div>
<div class="right"><br /><br />
<p><p><a href="#"><img class="gg" src="<%=path%>/imgs/07.jpg" alt="img" /></a></p><p class="dd"><span class="s">Morbi aliquet euismod </span><br />Donec congue tempus velit. Maecenas facilisis ut consectetuer purus odio.<br /><br /></p></p><br /><br /><br /><br />
<p><p><br /><a href="#"><img class="gg" src="<%=path%>/imgs/08.jpg" alt="img" /></a></p><p class="dd"><span class="s">Morbi aliquet euismod </span><br />
   Maecenas facilisis ut consectetuer purus odio.Donec congue tempus velit<br /><br /><br /></p></p>
</div>
</div></div>

</div>

<div id="footer">
<div id="footercenter">
<div id="related">
<br />
<p class="text">Related Links</p><br />
<ul class="style">
<li><a target="_blank" href="#">Strategies</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li>
<li><a target="_blank" href="#">Resent issues</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li>
<li><a target="_blank" href="#">FAQ</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li>
<li><a target="_blank" href="#">Solutions</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li>
<li><a target="_blank" href="#">Contacts</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li></ul>
</div>


<div id="address">
<br />
<p class="text">Address</p>
<br />
<p>9870 St Vincent Place,</p>
<p>Glasgow, DC 45 Fr 45.</p>
<br />
<p>Freephone:  +1 800 559 6580</p>
<p>Telephone:  +1 800 603 6035</p>
<p>FAX:        +1 800 889 9898</p>
</div>


<div id="company">
<br />
<p class="text">Company</p>
<br />
<ul class="style">
<li><a target="_blank" href="#">About us</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li>
<li><a target="_blank" href="#">Work team</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li>
<li><a target="_blank" href="#">What we do</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li>
<li><a target="_blank" href="#">Clients</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li>
<li><a target="_blank" href="#">Managment</a><br /><img src="<%=path%>/imgs/16.jpg" alt="img" /></li></ul>
</div>


<div id="testmonials">
<br />
<p class="text">Testimonials</p>
<br />
<p>Utoluptates estudesu usandaeItaque earumumos rerum hic teneturamos sapientemi delectu ut reiciedesto ndisum voluptatibus ass maiores alias dolore ipsum mode festum.</p>
<br />
<p><img src="<%=path%>/imgs/17.jpg" alt="img" /></p><br />
<p><strong> Alex Grow (New York) </strong></p>            </div>


</div>
</div>


<div id="footer1">
<div id="footer2">
<br />

<div class="cc"><a href="#">TWITTER</a>&nbsp; |&nbsp;<a href="#"> FACEBOOK</a>&nbsp; |&nbsp; <a href="#">BLOG</a></div>
</div>
</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>
