//Example of Functional Interface type

import java.util.function.*;

public class FunctionalDemo {
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        Supplier<String> s1 = () -> "Purva";
        System.out.println(s1.get());
        print(s1.get());

        Supplier<Double> random =() -> Math.random();
        System.out.println(random.get());

        Consumer<String> c = (s) -> System.out.println(s); //consumer passing value to another consumer
        c.accept("Adios");

        Consumer<String> c1 = System.out::println;      //:: - method referrence
        c1.accept("hello");
        
        Consumer<String> c2 = FunctionalDemo::print;
        c2.accept("aloha");
        
        Predicate<Integer> nonNegative = (x) -> x >= 0;
        System.out.println(nonNegative.test(3));
        System.out.println(nonNegative.test(-2));

        Predicate<Integer> isEven = (x) -> x % 2 == 0; //predicate
        System.out.println(isEven.test(5));

        BiPredicate<String , String> contains = 
        (str,con) -> str.contains(con);  //bipredicate
        System.out.println(contains.test("mumbai", "u"));

        Function<Integer,Integer> square = (x) -> x*x ;
        System.out.println(square.apply(5));

        BiFunction<Integer,Integer,Integer> greater = 
        (a,b) -> a>b? a:b;
        System.out.println(greater.apply(10, 20));
    }
}
