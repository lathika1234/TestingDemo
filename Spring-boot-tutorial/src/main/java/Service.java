import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Service {
    public static void main(String[] args) {

        List<Employee> list = new Database().getEmployees();
        //traditional method
//        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//        System.out.println(list);
//        Collections.sort(list,(o1,o2)-> (int)(o1.getSalary()- o2.getSalary()));
//        System.out.println(list);

        //sort using stream
//        list.stream().sorted((o1,o2)-> (int)(o1.getSalary()- o2.getSalary())).forEach(i-> System.out.println(i));
//        list.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(i-> System.out.println(i));

        //using comparator keyword
        list.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(i-> System.out.println(i));
    }
}

