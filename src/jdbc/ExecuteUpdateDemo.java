package jdbc;

import java.sql.*;

public class ExecuteUpdateDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver"); //Registering driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java15feb?characterEncoding=latin1","root","password");

            Statement statement = connection.createStatement();

            String insert  = "insert into employee(id,name,address) values(2,'Rakesh','Pune')";
            String update  = "update employee set name = 'Rajesh' where name = 'Rakesh'";
            String delete  = "delete from employee where id=2";

            int i = statement.executeUpdate(delete);
            System.out.println(i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}
