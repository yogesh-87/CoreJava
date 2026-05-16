package collectionFramework;
import java.util.*;
public class map {
    static void main() {

       Map<String , String> map = new HashMap<>();

       map.put("in","india");
       map.put("us","united state");
       map.put("pak", "pakistan");

       System.out.println(map);


        System.out.println(map.containsKey("id"));


        Collection<String> keyset = map.values();
        System.out.println(keyset);

        Set<Map.Entry<String, String>> entries =
                map.entrySet();

        System.out.println(entries);

        System.out.println("following are the Keys and their Respective Values : ");
        for(Map.Entry<String , String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
