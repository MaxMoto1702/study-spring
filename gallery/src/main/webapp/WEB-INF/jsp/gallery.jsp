<%--
    Created by IntelliJ IDEA.
    User: m
    Date: 19.04.2015
    Time: 22:48
    To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Gallery</title>
</head>
<body>
<h1>Gallery</h1>

<div align="center">
    <c:forEach items="${pictures}" var="picture">
        <div class="picture-view" style="height: 300px; width: 300px; display: inline-block">
            <div style="height: 75%; width: 90%" align="center">
                <a href="/gallery/view/${picture.id}">
                    <img src="${picture.thumbPath}" style="height: 100%; width: 100%">
                </a>
            </div>
            <div style="height: 10%;width: 100%">
                <div align="left" style="width: 50%; display: inline-block">
                        ${picture.name}
                </div>
                <div align="right" style="width: 50%; display: inline">
                    <fmt:formatDate value="${picture.createDate}" pattern="hh:mm d MMM yyyy"/>
                </div>
            </div>
            <div align="left" style="height: 15%; width: 100%">
                    ${picture.description}
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
