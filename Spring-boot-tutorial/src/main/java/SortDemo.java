import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(8);
        l1.add(2);
        l1.add(3);
        l1.add(9);
        //Collections.sort(l1);//ascending
        //Collections.reverse(l1);//desc
        //System.out.println(l1);

        //l1.stream().sorted().forEach(i-> System.out.println(i));//asc
        l1.stream().sorted(Comparator.reverseOrder()).forEach(i-> System.out.println(i));//desc
    }


}
