package List;


import java.util.*;
public class HashMap1 {
  public static void main(String args[]) {
    HashMap < Integer, String > hm = new HashMap < Integer, String > ();
    System.out.println("Initial list of elements: " + hm);
    hm.put(100, "Indonesia");
    hm.put(101, "Raya");

    System.out.println("After invoking put() method ");
    for (Map.Entry m: hm.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }

    hm.putIfAbsent(102, "Merdeka");
    System.out.println("After invoking putIfAbsent() method ");
    for (Map.Entry m: hm.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
    HashMap < Integer, String > map = new HashMap < Integer, String > ();
    map.put(103, "Merdeka!");
    map.putAll(hm);
    System.out.println("After invoking putAll() method ");
    for (Map.Entry m: map.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }
}
