<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
    /* The image used */
    background-image: url("Images/body7.jpg");

    /* Full height */

    /* Center and scale the image nicely */
   
}   </style>

<body>
<div>
<h1 style="text-align:center; color: blue">Login Details</h1>
<div>
<table  style="color:black" align="center"><br/>

    <form  name="myForm"    action="Login"  method="post">
    
  
  
		 <tr>
                <td width="30%"><h3>User_Name:</h3></td>
                <td width="50%"><input type ="text"  name ="uname" style="width:250px;height:20px;text-transform:capitalize;border-radius:5px" />&nbsp;</td>
            </tr>
         <tr>
                <td width="30%" ><h3>Password:</h3></td>
                <td width="50%"><input type ="password" name ="password" style="width:250px;height:20px;text-transform:capitalize;border-radius:5px;" />&nbsp;</td>
            </tr>
             <tr>
                <td><a href="Admin.jsp"/>Admin Login</td>
                </tr>
           <tr>
           
             <td><input  class="btn" type="submit" name="btnInsert" value="LOGIN"style ="width:150px;height:30px;color:seashell;border-radius:5px;background-color:purple;"/></td>
                
            </tr></form></table>
            </div>
            </div>
            

</body>
</html>