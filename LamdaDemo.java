//example of functinonal interface
@FunctionalInterface

interface Greeting {
    String sayHello();  //function

    private String greet(){           //private method
        return "helo Amigo";
    }
    
    default void sayHola(){      //interface with fully define body
        //System.out.println("hola amigo");
        System.out.println(greet());
    }

    static void sayBon(){            // static with fully define body
        System.out.println("bonjour le monde");
    }
}

public class LamdaDemo {
    public static void main(String[] args) {
        Greeting g1 = () -> "Hello Lamda";
        System.out.println(g1.sayHello());

        Greeting g2 = () ->{
            String msg = "Whatsapp";
            return  msg;
        };
        System.out.println(g2.sayHello());
        g2.sayHola();                        //called inteface

        Greeting.sayBon();                   //call static method
    }
}
