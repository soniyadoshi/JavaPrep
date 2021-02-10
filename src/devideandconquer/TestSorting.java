package devideandconquer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {
    public static void main(String args[]) {
        testPerson();
    }

    public static void testStudent() {
        Student st = new Student(1, "abc", "K");

        Student st1 = new Student(4, "abc", "1");
        Student st2 = new Student(4, "abc", "1");

        Student st3 = new Student(2, "abx", "5");
        Student st4 = new Student(10, "eabc", "2");

        List<Student> ls = new ArrayList<>();
        ls.add(st);
        ls.add(st1);
        ls.add(st2);
        ls.add(st3);
        ls.add(st4);

        Collections.sort(ls);
        System.out.println(ls.toString());

        Collections.sort(ls, new NameComparator());
        System.out.println(ls.toString());

        System.out.println(st1.equals(st2));

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }

    public static void testPerson() {

        Person p1 = new Person("a", "b", 7);
        Person p2 = new Person("a", "e", 7);
        Person p3 = new Person("a", "c", 7);
        Person p4 = new Person("d", "d", 7);
        Person p5 = new Person("a", "b", 7);

        List<Person> l1 = new ArrayList<>();

        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p4);
        l1.add(p5);

        Collections.sort(l1, new PersonNameComparator());
        Collections.sort(l1, new PersonLastNameComparator());

        System.out.println(l1.toString());

    }
}
