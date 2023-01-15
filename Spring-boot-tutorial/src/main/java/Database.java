import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan","IT" ,40000));
        list.add(new Employee(177, "Bikesh","CIVIL" ,30000));
        list.add(new Employee(178, "Rakesh","CORE" ,60000));
        list.add(new Employee(179, "Prakash","SOCIAL" ,50000));
        return list;
    }
}
