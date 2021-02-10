package problemsolving;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListWithLeters {

    public static void main (String args[]) {
        List<String> l = new LinkedList<>();
        l.add("abc");
        l.add("Apple");
        l.add("kir");
        l.add("Lol");
        l.add("ad");

        List<String> filterdLs = l.stream()
                .filter(s -> s.substring(0,1).equalsIgnoreCase("a"))
                .collect(Collectors.toList());

        System.out.println(filterdLs.toString());
    }
}
