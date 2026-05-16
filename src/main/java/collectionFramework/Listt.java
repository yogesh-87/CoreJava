package collectionFramework;
import java.util.*;
public class Listt {
    static void main() {


        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(34);
        list1.add(56);
        list1.add(60);
        list1.add(34);
        System.out.println(list1);

        Set<Integer> set1 = new HashSet<>(list1);
        System.out.println(set1);

    }
}
