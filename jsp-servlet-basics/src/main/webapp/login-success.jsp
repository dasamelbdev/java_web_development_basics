<!DOCTYPE html>
<html>
 <head><title>First JSP</title></head>
 <body>

<h1>Welcome <%=request.getParameter("username")%> </h1>

  <p>sign in time : <%=request.getAttribute("sign-in-time")%></p>

 </body>
 </html>