/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
/**
 *
 * @author Titan
 */
public class TransactionServlet extends HttpServlet{
    public void service(ServletRequest req, ServletResponse res)
        throws ServletException, IOException {
        PrintWriter htmlOut = res.getWriter();
        res.setContentType("text/html");
        htmlOut.println("<html><head><title>Servlet Example output </title></head><body><p>Hello!</p></body></html>");
        htmlOut.close();
    }
}
