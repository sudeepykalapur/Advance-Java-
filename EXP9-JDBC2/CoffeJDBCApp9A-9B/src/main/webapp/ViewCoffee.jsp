<%@ page import="java.sql.*" %>
<html>
<head><title>Coffee List</title></head>
<body>
    <h2>Available Coffee Products</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>

        <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
        %>
                <tr>
                    <td><%= rs.getInt("id") %></td>
                    <td><%= rs.getString("coffee_name") %></td>
                    <td><%= rs.getDouble("priced") %></td>
                </tr>
        <%
            }

            con.close();

        } catch (Exception e) {
            out.println("<tr><td colspan='3'>Error: " + e.getMessage() + "</td></tr>");
        }
        %>
    </table>
    <br>
    <a href="insert_coffee.html">Add New Coffee</a>
</body>
</html>
