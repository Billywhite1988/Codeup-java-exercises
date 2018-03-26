import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
    public class HelloServlets extends HttpServlet {
        private int counter = 0;

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");


            PrintWriter out = response.getWriter();

            String name = request.getParameter("name");
            if (name != null) {
                response.getWriter().println("<h1>Hello, " + name + "</h1>");
            } else {
                out.println("<h1>Hello World</h1>");
            }
            // you could also getServletName() in place of name and delete String name = request getParameter("name")
            counter += 1;
            response.getWriter().println("<h3>Number of page visits: " + counter + ".</h3>");



        }
    }
