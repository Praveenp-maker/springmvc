<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <body>


            <h1>${msg}</h1>
            <h1>Add New User</h1>
            <form:form method="post" action="insert">
                <table>
                    <tr>
                        <td>Id :</td>
                        <td>
                            <form:input path="id" />
                        </td>
                    </tr>
                    <tr>
                        <td>Name : </td>
                        <td>
                            <form:input path="name" />
                        </td>
                    </tr>

                    <tr>
                        <td>Age :</td>
                        <td>
                            <form:input path="age" />
                        </td>
                    </tr>
                    <tr>
                        <td> </td>
                        <td><input type="submit" value="Save" /></td>
                    </tr>
                </table>
            </form:form>
            <!-- Answer : <%= request.getAttribute("ans") %>
${ans} -->
        </body>

        </html>