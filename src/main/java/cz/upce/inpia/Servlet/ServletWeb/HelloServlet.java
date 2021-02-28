package cz.upce.inpia.Servlet.ServletWeb;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World from Jan Mrazek!";
    }
    

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("the GET request has been made to /hello");

        response.setContentType("text/plain");

        response.getWriter().println("Here is Line");


        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");


    }

    public void destroy() {
    }
}