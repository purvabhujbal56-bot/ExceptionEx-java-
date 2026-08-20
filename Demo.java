//example of generics

public class Demo<T> {
    private T data;        //object class data remain generic(can store any type of data)
    public Demo(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }
    public static void main(String[] args) {
        /*Demo d1 = new Demo(99);
        System.out.println(d1.getData());
        Demo d2 = new Demo("hola");
        System.out.println(d2.getData());*/
        //System.out.println(d2.getData());

        Demo<Integer> d1 = new Demo<Integer>(99);
        Demo<String> d2 = new Demo<String>("aloha");
       // Demo<String> d2 = new Demo<String>("aloha");

        System.out.println(d1.getData());
        System.out.println(d2.getData());

    }
}
