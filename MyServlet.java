import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MyServlet extends HttpServlet{
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
   res.setContentType("text/html");
   PrintWriter pw= res.getWriter();
   pw.write("welcome to servlet");
  }
}