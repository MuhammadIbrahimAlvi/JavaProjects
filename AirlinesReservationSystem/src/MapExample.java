import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {
    public static void main(String[] args){
        System.out.println("<== Map Internal Architecture ==>");
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter Name");
        String name = input.nextLine();
        System.out.println("Enter EmployeeID");
        int employeeID = input.nextInt();
        Employee empObj = new Employee(name,employeeID);
        Employee empObj1 = new Employee(name,employeeID);
        Employee empObj2 = new Employee(name,employeeID);

//        HashMap mapObj = new HashMap();

//        mapObj.put(1,empObj);

//        System.out.println(mapObj);

        System.out.println("<== Concurrent Hashmap ==>");

        ConcurrentHashMap<Integer,Employee> employObj = new ConcurrentHashMap<Integer, Employee>();

        employObj.put(1,empObj);

        employObj.put(2,empObj1);

        employObj.put(3,empObj2);

        System.out.println(employObj);
    }
}


class Employee{
    public String name;
    private int employeeID;

    String key;

    Employee(String name, int employeeID){
        this.name = name;
        this.employeeID = employeeID;
    }

    public String toString(){
        return "The Employee name is: "+name+" and his ID is: "+employeeID;
    }
    @Override
    public int hashCode()
    {
        return (int)key.charAt(0);
    }

    @Override
    public boolean equals(Object obj)
    {
        return key.equals((String)obj);
    }
}
