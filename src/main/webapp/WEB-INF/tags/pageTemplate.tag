<%@tag description="base page template" pageEncoding="UTF-8"%>
<%@attribute name="pageTitle" %>
<!DOCTYPE html>
<html class="h-100">
<head>
    <title>${pageTitle}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@6.0.0-alpha.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="d-flex flex-column h-100">

    <jsp:include page="/WEB-INF/pages/menu.jsp"/>

    <div class="flex-shrink-0 mt-5 pt-4">
      <div class="container">
         <jsp:doBody/>
    </div>
    </div>

    <jsp:include page="/WEB-INF/pages/footer.jsp" />


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@6.0.0-alpha.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>