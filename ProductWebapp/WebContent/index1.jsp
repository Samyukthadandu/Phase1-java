<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Title </title>
</head>
<body>
<div align="center">
  <h1>Employee Login Form</h1>
  <form action="<%=request.getContextPath()%>/ProductServlet" method="post">
   <table style="with: 100%">
    <tr>
     <td>ProductID</td>
     <td><input type="text" name="ID" /></td>
    </tr>   

   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>
