<%@page import="java.util.List"%>

    <%@page import="model.Customer" %>
    <%@page import="CustomerDto.Customermapper" %>
    <%@page import="model.CustomerDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>all customers</title>
</head>
<body>

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">UID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
 
 <%List<Customer> list=(List<Customer>)request.getAttribute("success");
 Customermapper impl=new Customermapper();
 for(Customer c:list){
 CustomerDto dto=impl.customerToCustomerDto(c);

 %>


	<tbody>
    <tr>
      <td><%out.println(dto.getUId()); %></td>
      <td><%out.println(dto.getFirstname()); %></td>
      <td><%out.println(dto.getLastname()); %></td>
      <td><%out.println(dto.getEmail()); %></td>
    </tr>
 
  </tbody>
<%}%>
</table>

  
</body>
</html>
