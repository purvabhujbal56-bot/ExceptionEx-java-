interface Hello  {
    void greet();
}

public class InterfaceEx {
    class HelloInner implements Hello{
        @Override
        public void greet(){
            System.out.println("Hello inner impl");
        }
    }
    public void nestedDemo(){
        class HelloNestedimpl implements Hello {
            @Override
            public void greet(){
                System.out.println("hello nested impl");
            }  
        };
        new HelloNestedimpl().greet();   
    }
    public static void main(String[] args) {
        InterfaceEx demo = new InterfaceEx();
        Hello hi = demo.new HelloInner();
        hi.greet();
    }
}
