<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Student Table</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Surname</th>
                    <th>Name</th>
                    <th>Student Code</th>
                    <th>Student Activity</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${studentIter}" var="item">
                    <tr>
                        <td>${item.surname}</td>
                        <td>${item.name}</td>
                        <td>${item.studentCode}</td>
                        <td>${item.studentActivityRating}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>