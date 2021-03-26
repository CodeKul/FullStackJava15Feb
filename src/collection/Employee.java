package collection;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String name;
    String address;


    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        Employee obj1 = new Employee(1, "Sachin", "Pune");
        Employee obj2 = new Employee(2, "Sagar", "Mumbai");
        Employee obj3 = new Employee(3, "Sahil", "Nagpur");

        List<Employee> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        list.forEach(s->{
            System.out.println("Id=>"+s.id);
            System.out.println("name=>"+s.name);
            System.out.println("Address=>"+s.address);
        });
    }
}
