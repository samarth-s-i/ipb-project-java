<%-- 
    Document   : user.jsp
    Created on : Apr 5, 2016, 11:29:26 AM
    Author     : java3
--%>
<%@page import="pack.Dbconn"%>
<%@page import="org.apache.catalina.Session"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
        <meta name="description" content="A Bootstrap based app landing page template">
        <meta name="author" content="">
        <link rel="shortcut icon" href="assets/ico/favicon.ico">

        <title>IPB - Forgot Password</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/custom.css" rel="stylesheet">
        <link href="css/flexslider.css" rel="stylesheet">

        <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,300,700' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Noto+Sans:400,700' rel='stylesheet' type='text/css'>


    </head>

    <body>
        <%

            if (request.getParameter("msgg") != null) {%>
        <script>alert('Login failed');</script>
        <%}
        %>

        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!--						<a class="navbar-brand" href="#topWrap">
                                                                            <span class="fa-stack fa-lg">
                                                                                    <i class="fa fa-circle fa-stack-2x"></i>
                                                                                    <i class="fa fa-mobile fa-stack-1x fa-inverse"></i>							</span>
                                                                            App<span class="title">Bay</span>
                                                                    </a>-->
                </div>
                <div class="collapse navbar-collapse appiNav">
                    <ul class="nav navbar-nav">
                        <li><a href="index_1.html">Home</a></li>
                        <li><a href="user.jsp">Back to Login</a></li>
                        <!--<li><a href="index_1.html">Logout</a></li>-->
                    </ul>

                </div><!--/.nav-collapse -->
            </div>
        </div>

        <div id="topWrap" class="jumbotron">
            <div class="container">
                <div class="col-md-6 col-md-push-6 jumboText">
                    <%
                        String user = request.getParameter("mail");

                        HttpSession session2 = request.getSession(true);
                        Connection con = Dbconn.getConnection();
                        System.out.println("Database connected");

                        Statement st = con.createStatement();
                        ResultSet rt = st.executeQuery("select * from register where email='" + user + "'");
                        System.out.println("result set executed");
                        if (rt.next()) {
                            String p = rt.getString("email");
                            if (p.equals(user)) {
                    %>
                    <h2 style="margin-left:200px;">Email (<%=user%>) verified Click on send OTP</h2>
                    <form action="forgot_password" style="color:black;" method="post">
                        <input type="hidden" name="email" value="<%=user%>">
                        <input type="submit" class="myButton" style="margin-left: 220px" value="Send OTP"/>
                        &nbsp; &nbsp; <input type="reset" class="myButton" /><br></br>
                    <%} else {
                    %> <script>alert('failed');
                        window.location = "otp.jsp";
                    </script><%
                        }
                    } else {
                    %> <script>alert('invalid email');
                        window.location = "otp.jsp";
                    </script><%
                        }

                    %>

                </div>
                <div class="col-md-6 col-md-pull-6 hidden-xs">
                    <div class="mobile">
                    </div>
                </div>

            </div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/flexslider.js"></script>

        <script type="text/javascript">
                        $(document).ready(function () {

                            $('.mobileSlider').flexslider({
                                animation: "slide",
                                slideshowSpeed: 3000,
                                controlNav: false,
                                directionNav: true,
                                prevText: "&#171;",
                                nextText: "&#187;"
                            });
                            $('.flexslider').flexslider({
                                animation: "slide",
                                directionNav: false
                            });

                            $('a[href*=#]:not([href=#])').click(function () {
                                if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') || location.hostname == this.hostname) {
                                    var target = $(this.hash);
                                    target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                                    if ($(window).width() < 768) {
                                        if (target.length) {
                                            $('html,body').animate({
                                                scrollTop: target.offset().top - $('.navbar-header').outerHeight(true) + 1
                                            }, 1000);
                                            return false;
                                        }
                                    } else {
                                        if (target.length) {
                                            $('html,body').animate({
                                                scrollTop: target.offset().top - $('.navbar').outerHeight(true) + 1
                                            }, 1000);
                                            return false;
                                        }
                                    }

                                }
                            });

                            $('#toTop').click(function () {
                                $('html,body').animate({
                                    scrollTop: 0
                                }, 1000);
                            });

                            var timer;
                            $(window).bind('scroll', function () {
                                clearTimeout(timer);
                                timer = setTimeout(refresh, 50);
                            });
                            var refresh = function () {
                                if ($(window).scrollTop() > 100) {
                                    $(".tagline").fadeTo("slow", 0);
                                } else {
                                    $(".tagline").fadeTo("slow", 1);
                                }
                            };

                        });
        </script>
    </body>
</html>