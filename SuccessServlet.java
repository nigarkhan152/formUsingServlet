package register;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class SuccessServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse resp)throws ServletException,IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("this is success servlet");
        out.println("<h2>Successfully registered</h2>");
    }
}
