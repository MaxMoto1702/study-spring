<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title></title>
</head>
<body>
<h1>Load picture</h1>
<sf:form method="post" 
         modelAttribute="picture"
         enctype="multipart/form-data">
    <fieldset>
        <table cellspacing="0">
            <tr>
                <th><label for="picture_name">Name:</label></th>
                <td><sf:input path="name" id="picture_name"/></td>
            </tr>
            <tr>
                <th><label for="picture_description">Description:</label></th>
                <td><sf:textarea path="description" id="picture_description"/></td>
            </tr>
            <tr>
                <th><label for="image">Profile image:</label></th>
                <td><input name="image" id="image" type="file"/>
            </tr>
        </table>
        <input type="submit"/>
    </fieldset>
</sf:form>
</body>
</html>
