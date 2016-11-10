<%-- 
    Document   : footer
    Created on : Nov 9, 2016, 7:50:18 PM
    Author     : Titan
--%>


        <footer>
            <%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
            <%
                GregorianCalendar currentDate = new GregorianCalendar();
                int postDate = currentDate.get(Calendar.DATE);
            %>
            <p>Titan Banking, ${postDate}</p>
        </footer>
    </body>
</html>


