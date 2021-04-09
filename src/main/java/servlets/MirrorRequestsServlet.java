package servlets;

import templater.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MirrorRequestsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        final String key = request.getParameter("key");
        response.getWriter().println(key);
        response.setContentType("text/html;charset=utf-");
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
