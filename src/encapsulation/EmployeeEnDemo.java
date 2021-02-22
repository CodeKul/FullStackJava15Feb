package encapsulation;

public class EmployeeEnDemo {

    private int id;
    private String name;
    private String add;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAdd(){
        return add;
    }


    public void setAdd(String add){
        this.add = add;
    }
    public static void main(String[] args) {

        EmployeeEnDemo employeeEnDemo = new EmployeeEnDemo();
        employeeEnDemo.setId(1);
        employeeEnDemo.setAdd("Pune");
        employeeEnDemo.setName("Sachin");

        System.out.println("Id="+employeeEnDemo.getId());
        System.out.println("name="+employeeEnDemo.getName());
        System.out.println("add="+employeeEnDemo.getAdd());
    }

}
