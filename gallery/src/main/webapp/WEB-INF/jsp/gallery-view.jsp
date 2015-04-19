<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>${picture.name}</title>
</head>
<body>
<div align="center">
    <div class="picture-view" style="height: 600px; width: 600px; display: inline-block">
        <div style="height: 75%; width: 90%" align="center">
            <img src="/resources/images/${picture.id}.jpg" style="height: 100%; width: 100%">
        </div>
        <div style="height: 10%;width: 100%">
            <div align="left" style="width: 50%; display: inline-block">
                ${picture.name}
            </div>
            <div align="right" style="width: 50%; display: inline">
                ${picture.createDate.toString()}
            </div>
        </div>
        <div align="left" style="height: 15%; width: 100%">
            ${picture.description}
        </div>
    </div>
</div>
</body>
</html>
