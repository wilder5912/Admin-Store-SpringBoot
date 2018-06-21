<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>

    <c:url value="/css/main.css" var="jstlCss" />

    <title>Title</title>


</head>
    <body>
        <form:form  action="/login" modelAttribute="user" method="post" id="search-form">

            <div>
                email:
                        <form:input path="emailUser" id="emailU" />
                        <form:errors path="emailUser" element="div" cssClass="red-text text-error"/>
            </div>
           <div>
               password:
                    <form:input path="passwordUser" id="passwordU" />
                   <form:errors path="passwordUser" element="div" cssClass="red-text text-error"/>
           </div>

            <div>
                <button type="submit">Submit</button>
            </div>
        </form:form>

        <script type="text/javascript"
                src="webjars/jquery/2.2.4/jquery.min.js"></script>

        <script type="text/javascript" src="js/main.js"></script>


    </body>
</html>
