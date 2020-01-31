<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th><h2>Add a CD collection</h2></th>
</tr>
</table>
<form action="processForm" method="post">
  <div class="form-group">
    <label >CD Title</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label>CD Type</label>
    <select class="form-control" name="type">
      <option value="Unknown">Select...</option>
      <option value="International">International</option>
      <option value="Specialedition">Specialedition</option>
     
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Year</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="year" name="year">
  </div>
 
  
 <input type="submit"/> 
 <input type="reset"/> 
</form>

</body>
</html>