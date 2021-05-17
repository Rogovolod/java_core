

import javax.swing.tree.TreeNode;
import java.text.NumberFormat;
import java.util.*;
import java.util.Arrays.*;

public class Main {
    public static void main(String[] args) throws Error {
//        System.out.println("Hello world");
        /*List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);
        Iterator<String> iter = list.iterator();
        System.out.println(iter.next());
        System.out.println(iter.next());
        iter.remove();
        System.out.println(list);*/
//        HashMap<String, String> map = new HashMap<>();
//        int e = 1<<30;
//        System.out.println(e);

            int k = 3;
            String s = "welcomeToJava";
        String st = s.substring(0, k);
        String en = s.substring(s.length() - k);
        System.out.println(st.compareTo(en));
        System.out.println(st);
        System.out.println(en);
    }


}