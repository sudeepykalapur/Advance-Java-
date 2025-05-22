<%@ page import="java.sql.*" %>
<html>
<head>
    <title>View Coffee List</title>
</head>
<body>
    <h2>Coffee Records Starting with 'D'</h2>

    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>

        <%
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

                // Corrected SQL query and column name "priced"
                String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                while(rs.next()) {
        %>
                    <tr>
                        <td><%= rs.getInt("id") %></td>
                        <td><%= rs.getString("coffee_name") %></td>
                        <td><%= rs.getDouble("priced") %></td>
                    </tr>
        <%
                }

                rs.close();
                st.close();
                con.close();

            } catch (Exception e) {
                out.println("<p>Error: " + e.getMessage() + "</p>");
            }
        %>
    </table>

    <br>
    <a href="insert.jsp">Add New Coffee</a>
</body>
</html>
