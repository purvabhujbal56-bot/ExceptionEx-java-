//example of collection 
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("microsoft");
        lst.add("google");
        lst.add("apple");
        lst.add(2,"oracle");

        System.out.println("-- traversing using loop");
        for(int i=0;i<lst.size();i++)
            System.out.println(lst.get(i));

        System.out.println("-- traversing using iterator");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) 
            System.out.println(itr.next());

        System.out.println("--traversing using for-each");
        for(String e : lst)
            System.out.println(e);

        System.out.println("-- traversing using for-each method");
        lst.forEach(System.out::println);
    }
}
