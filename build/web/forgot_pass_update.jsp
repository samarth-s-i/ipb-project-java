


<%@page import="pack.Dbconn"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.net.ConnectException"%>

<%
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");
    try {
//   Class.forName("org.sqlite.JDBC");
//  Connection con=DriverManager.getConnection("jdbc:sqlite:/home/ibn/Desktop/Nadanapathy/NetBeansProjects/multi-autority _cloud_storage/multiauthority");

//       
        String sql = "UPDATE register SET pass='" + pass + "', repass='" + pass + "' WHERE email='" + email + "'";
        Connection con = Dbconn.getConnection();
        // Connection con = 

        Statement st = con.createStatement();
        int i = st.executeUpdate(sql);

        if (i != 0) {
            //  out.println("<script>alert('registered')</script>");
            response.sendRedirect("user.jsp?msg=success");
        } else {
            response.sendRedirect("user.jsp?msgg=failed");
        }
        con.close();
    } catch (Exception e) {
        out.println(e.getMessage());
    }
%>