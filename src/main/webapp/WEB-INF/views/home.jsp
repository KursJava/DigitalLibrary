<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

<html>
<head>
    <title>Cyfrowa Bibliteka-Strona glówna</title>
</head>
<body>
<h1 style="color: darkblue" align="center">Witamy w Cyfrowej Bibliotece </h1>

<div align="center" style="font-size: medium">
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et<br>
    dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex<br>
    ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat <br>
    nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim <br>
    id est laborum."
</div>
<br><br>

<form:form cssStyle="text-align: center">
    <input class="button" type="submit" formaction="login" value="Logowanie" style="width: 100px; height: 30px;">&nbsp&nbsp&nbsp&nbsp&nbsp
    <input class="button" type="submit" formaction="register" value="Rejestracja"
           style="width: 100px; height: 30px;"><br><br>
</form:form>
<br>

<div align="center">
    <img src="../../resources/picture/spring.jpg" width="188" height="269"/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <img src="../../resources/picture/hibernate.jpg" width="188" height="269">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <img src="../../resources/picture/git.jpg" width="188" height="269">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <img src="../../resources/picture/java.jpg" width="188" height="269">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <img src="../../resources/picture/junit.jpg" width="188" height="269">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <img src="../../resources/picture/maven.jpg" width="188" height="269">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
</div>
<br><br>
<footer id="fotter">
    <p>
        Development by: Karol Sidor &nbsp&nbsp&nbsp&nbsp
        Kontakt: karolsidor11@wp.pl
    </p>

</footer>

</body>
</html>