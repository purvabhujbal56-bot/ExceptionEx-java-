//example of collection 
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        
        LinkedList<String> lst = new LinkedList<String>();    //linkedlist
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

        ArrayList<String> ar = new ArrayList<String>();    //arraylist
        ar.add("IBM");
        ar.add("apple");
        ar.add("Jboss");
        
        ar.addAll(lst);    //merging a collection into another
        System.out.println("-- traversing over merged collection");
        for(String e: ar)
            System.out.println(e);

        HashSet<String> set = new HashSet<String>(ar);        //to covert arraylist into set
        System.out.println("--traversing over set collection");
        for (String e : set) {
            System.out.println(e);
        }

        TreeSet<String> tree = new TreeSet<String>(set);        //to sort 
        System.out.println("--traversing over set collection");
        for (String e : tree) {
            System.out.println(e);
        }
    }
}
