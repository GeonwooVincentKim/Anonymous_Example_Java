package chap13;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        out.println(list.size());

        // Show error because there is no exist data in the ArrayList.
        // out.println(list.get(0));

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        out.println(list);

        list.add(2, "Database");
        list.add("iBATIS");
        out.println(list);

        int size = list.size();
        out.println("총 객체 수 : " + size);
        out.println();

        String skill = list.get(2);
        out.println("2: " + skill);
        out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            out.println(i + " : " + str);
        }

        out.println();
    }
}
