<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Użytkownik
  Date: 12.11.2018
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Panel rejestracji użytkownika</title>
</head>
<body>
<br>
<h2 align="center" style="color: darkblue">Zarejestruj się w Cyfrowej Bibliotece</h2

<form:form/>

<form:form cssStyle="text-align: center">

<h3 style="text-align: center">Dane osobowe </h3>

<div align="center">
    Wprowadź imię: &nbsp&nbsp <input type="text" name="name" placeholder="Imię"><br><br>
    Wprowadź nazwisko :&nbsp <input type="text" name="lastName" placeholder="Nazwisko"><br><br>
    Wprowadź miejscowość : <input type="text" name="locality" placeholder="Miejscowość"><br><br>
    Wprowadź email : <input type="text" name="email" placeholder="Email"><br>
</div>

<h3 style="text-align: center"> Dane konta </h3>

<div align="center">
    Wprowadź login : <input type="text" name="login" placeholder="Login "><br><br>
    Wprowadź hasło : <input type="password" name="password" placeholder="Hasło"><br><br>
    Potwierdź hasło : &nbsp <input type="password" placeholder="Powtórz hasło"><br><br>

    <input class="button" type="submit" formaction="registerPanel" value="Załóż konto"
           style="width: 100px; height: 30px;">

    </form:form>

</body>
</html>
