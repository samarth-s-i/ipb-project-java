
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class forgot_password extends HttpServlet {

    public String to;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String subject = "OTP";
//        String to = "samarthitagi@gmail.com";
            to = request.getParameter("email");
            String from = "sammuitagi@gmail.com";
            Random rand = new Random();
            int otp_temp = rand.nextInt(900000) + 100000;
            String otp = Integer.toString(otp_temp);
            String m1 = "Please check for the OTP your otp is-\n";
            String message = m1 + otp;
            //Sender ID,While using route4 sender id should be 6 characters long.
            String senderId = "IPB";
            //Your message to send, Add URL encoding here.
            sendEmail(message, subject, to, from);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>forgot_password</title>");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">");
            out.println("<link rel=\"shortcut icon\" href=\"assets/ico/favicon.ico\">");
            out.println("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">");
            out.println("<link href=\"css/custom.css\" rel=\"stylesheet\">");
            out.println("<link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">");

            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<div  id = \"topWrap\" class=\"jumbotron\">");
            out.println("<div class=\"container\">");
            out.println("<div class=\"col-md-6 col-md-push-6 jumboText\">");

            out.println("<center>");
            out.println("<h3 style=\"color:grey\">OTP has been sent succesfully! <br/><br/><br/></h3>");
            out.println("<form style=\"color:grey\" action=" + "'validate_otp.jsp'" + ">");
//            request.setAttribute("otp", otp);
//            RequestDispatcher rd = request.getRequestDispatcher("validate_otp.jsp");
            out.println("<input type=" + "'hidden'" + "name=" + "'otp'" + "value=" + otp + ">");
            out.println("<input type=" + "'text'" + "name=" + "'otp1'" + "placeholder=" + "\"Enter your otp here\"" + ">");
            out.println("<input type=" + "'hidden'" + "name=" + "'email'" + "value=" + to + ">");
            out.println("<input type=" + "'submit'" + ">");
            out.println("<h3 style=\"color:grey\"> <br/><br/>Enter the OTP in the given field</h3><br/><br/><br/><br/><br/>");
            out.println("</form><br/><br/>");
            out.println("<a href=" + "'user.jsp'" + ">" + "Back to login page" + "</a><br/><br/><br/><br/><br/>");
            out.println("<center>");
            out.println("</div");
            out.println("</div");
            out.println("</div");
            out.println("</div");
            out.println("</div");
            out.println("</body>");
            out.println("</html>");
        }

    }

    private static void sendEmail(String message, String subject, String to, final String from) {

        //Variable for gmail
        String host = "smtp.gmail.com";

        //get the system properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES " + properties);

        //setting important information to properties object
        //host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        //Step 1: to get the session object..
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "uxfitujsezcdedqf");
            }

        });

        session.setDebug(true);

        //Step 2 : compose the message [text,multi media]
        MimeMessage m = new MimeMessage(session);

        try {

            //from email
//		m.setFrom(from);
            //adding recipient to message
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            //adding subject to message
            m.setSubject(subject);

            //adding text to message
            m.setText(message);

            //send 
            //Step 3 : send the message using Transport class
            Transport.send(m);

            System.out.println("Sent success...................");
        } catch (MessagingException e) {
        }

    }
}
