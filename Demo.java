public class Demo {
    private Object data;        //object class data remain generic
    public Demo(Object data){
        this.data = data;
    }
    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data = data;
    }
    public static void main(String[] args) {
        Demo d1 = new Demo(99);
        System.out.println(d1.getData());
        Demo d2 = new Demo("hola");
        System.out.println(d2.getData());
    }
}
