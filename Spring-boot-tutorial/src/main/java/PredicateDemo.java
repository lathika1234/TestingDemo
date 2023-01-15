import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().filter(i -> i%2==0).forEach((i) ->System.out.println("Print Even " +i));
    }
}
