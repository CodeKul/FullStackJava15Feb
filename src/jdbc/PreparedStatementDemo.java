package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {

        try {
            int id;
            String name,address;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id");
            id = scanner.nextInt();
            System.out.println("Enter name");
            name = scanner.next();
            System.out.println("Enter add");
            address = scanner.next();

            String str = "insert into employee(id,name,address) values(?,?,?)";

            Class.forName("com.mysql.jdbc.Driver"); //Registering driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java15feb?characterEncoding=latin1","root","password");

            PreparedStatement statement = connection.prepareStatement(str);

            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setString(3,address);


            int i = statement.executeUpdate();

            System.out.println("row inserted=>"+i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}
