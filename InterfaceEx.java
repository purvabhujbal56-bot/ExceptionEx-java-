@FunctionalInterface
interface Hello  {  //functional interface
    void greet();
}

public class InterfaceEx {   //class inside class
    class HelloInner implements Hello{
        @Override
        public void greet(){
            System.out.println("Hello inner impl");
        }
    }
// class inside method
    public void nestedDemo(){
        class HelloNestedimpl implements Hello {
            @Override
            public void greet(){
                System.out.println("hello nested impl");
            }  
        };
        new HelloNestedimpl().greet();   
    }

public void anonymousDemo(){     //anonymous class
    Hello h = new Hello() {
        @Override
        public void greet(){
            System.out.println("Hello anonymous demo");
        }
    };
    h.greet();
}
    public static void main(String[] args) {
        InterfaceEx demo = new InterfaceEx();
        Hello hi = demo.new HelloInner();
        
        hi.greet();
        demo.nestedDemo();
        demo.anonymousDemo();

        Hello h = () -> System.out.println("hello lamda");     //lamda expression 
        h.greet();

    }
}
