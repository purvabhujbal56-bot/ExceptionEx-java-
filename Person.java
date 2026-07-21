//example of comparator
public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person [Name :" +name + ",age = "+age+"]";
    }
    public String getName(){    //// Getter for name
        return name;
    }
    public int getAge(){       //// Getter for age
        return age;
    }
}
