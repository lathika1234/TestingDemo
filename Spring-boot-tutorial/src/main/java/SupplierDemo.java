import java.net.SocketOption;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo{

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "a");
        map.put(2,"b");
        map.entrySet().stream().filter(v->v.getValue().startsWith("a")).forEach(obj -> System.out.println(obj)); //map uses stream and forEach
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj -> System.out.println(obj));
    }
}
