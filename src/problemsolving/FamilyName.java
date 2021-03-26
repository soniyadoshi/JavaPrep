package problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Mark43
public class FamilyName {
    public static void main(String args[]) {

        List<Person> allNAmes = new ArrayList<>();

        allNAmes.add(new Person("John", "Doe", 13));
        allNAmes.add(new Person("John", "Doe", 62));
        allNAmes.add(new Person("Janet", "Doe", 14));
        allNAmes.add(new Person("Jenny", "Smith", 34));
        allNAmes.add(new Person("Jenny", "Smith", 12));
        allNAmes.add(new Person("John", "Doe", 32));

        Map<String, Integer> countMap = new HashMap<>();

        String result = "";
        Integer maxCnt = 0;

        for (Person p : allNAmes) {
            String k = p.getfName() + "&" + p.getlName();
            countMap.put(k, countMap.getOrDefault(k, 0) + 1);
        }

        for (Map.Entry<String,Integer> entry : countMap.entrySet()) {
            int count = countMap.get(entry.getKey());
            if (count > maxCnt) {
                result = entry.getKey().split("&")[1];
                maxCnt = count;
            }
        }

        System.out.println(result);
    }
}

class Person {
    String fName;
    String lName;
    int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
