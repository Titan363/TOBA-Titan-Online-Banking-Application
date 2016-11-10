/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import javax.servlet.http.*;
/**
 *
 * @author Titan
 */
public class LoginServlet extends HttpServlet {
    public void service(ServletRequest request, ServletResponse response)
        throws ServletException, IOException {
    
    }
    
}

 protected void doGet( HttpServletRequest request,
                        HttpServletResponse response)
        throws ServletException, IOException {

      response.getWriter().write("<html><body>GET response</body></html>");
  }
.init()
{}
.service()
{}
.destroy()
{}