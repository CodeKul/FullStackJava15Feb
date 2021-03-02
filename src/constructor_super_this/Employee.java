package constructor_super_this;

public class Employee {


    //Instance variable
    int id;
    String name;
    String address;

    public Employee(int id,String name,String address){//local variable
        this.id = id;
        this.name = name;
        this.address = address;

    }

    private void show(){
        System.out.println("id=>"+id+" name=>"+name+" address=>"+address);
    }

    private void display(){
        this.show();

    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Sachin","Pune");
        employee.display();
    }
}
