//import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
    public static void main(String[] args) {
        //Comparator<Person> ageComp = (p1,p2) -> p1.getAge() - p2.getAge();   //sort by age
       
        //Comparator<Person> nameComp = (p1, p2) -> p1.getName().compareTo(p2.getName());   //sort by name

        TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("polo", 21));  //another file person
        people.add(new Person("Mili", 44));
        people.add(new Person("leo", 34));

        for(Person p : people)
            System.out.println(p);
    }
}
