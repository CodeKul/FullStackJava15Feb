package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        Student student1 = new Student(11, "Ravi", "Pune");
        Student student2 = new Student(2, "Ajay", "Kolhapur");
        Student student3 = new Student(333, "Rahul", "Mumbai");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);


        Collections.sort(list);

        list.forEach(s->{
            System.out.println("Id=>"+s.id+ " Name=>"+s.name+ " Address=>"+s.address);
        });
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    //
//    @Override
//    public int compareTo(Student student) {
//        if(this.id ==student.id){
//            return 0;
//        }else if(this.id> student.id){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
}
