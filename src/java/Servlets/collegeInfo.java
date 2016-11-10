/*
This Servlet is used for referencing information
 
package Servlets;

/**
 *
 * @author Titan
 
import java.io.Serializable;
public class collegeInfo implements Serializable{
    private String firstName;
    private String lastName;
    
    public User(){
        firstName ="";
        lastName ="";
    }
    
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}

  $(attribute)
    
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    request.SetAttributes("currentYear", currentYear);
    
    <p>The current year is $(currentYear)</p>

    $(attribute.property)

    User user = new User(firstName, lastName, email);
    request.setAttribute("user", user);

    <p>Hello $(user.firstName)</p>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <c:if test="${essage !=null}">
    <p><i>${message}</i></p>
    </c:if>


*/