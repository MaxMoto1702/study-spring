<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<table>
    <tr>
        <td>
            <tiles:insertAttribute name="top"/>
        </td>
    </tr>
    <tr>
        <td>
            <tiles:insertAttribute name="content"/>
        </td>
        <td>
            <tiles:insertAttribute name="side"/>
        </td>
    </tr>
    <tr>
        <td>
            <tiles:insertAttribute name="footer"/>
        </td>
    </tr>
</table>
</body>
</html>