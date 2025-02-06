import java.util.*;

public class Hashing {
    public static void main(String[]args) {
      HashMap<String, Integer> map = new HashMap<>();

      //insertion operation
      map.put("India", 120);
      map.put("China", 150);
      map.put("US",80);

      System.out.println(map);

      //updation operation
      map.put("China",200);
      System.out.println(map);

      //search operation
      if(map.containsKey("China")) {
        System.out.println("Key is present in the map");
      } else {
        System.out.println("Key is not present in the map");
      }

      //getting value from key using get
      System.out.println(map.get("China"));
      System.out.println(map.get("Indenosia"));
    }
}
