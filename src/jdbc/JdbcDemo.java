package jdbc;


import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver"); //Registering driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java15feb?characterEncoding=latin1","root","password");

            Statement statement = connection.createStatement();

            String sql  = "select * from employee";

            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            while (rs.next()){

                int id = rs.getInt(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                System.out.println(rsm.getColumnName(1)+" "+id+rsm.getColumnName(2)+name+rsm.getColumnName(3)+address);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}
