import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer c = (i) -> {
//            System.out.println(i);
//        };
//        c.accept(2);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().forEach((i) ->System.out.println(i));
    }
}
