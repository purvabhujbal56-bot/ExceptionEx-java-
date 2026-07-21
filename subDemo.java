public class subDemo<T, S> extends Demo<T> {

    private S temp;

    // Constructor
    public subDemo(T data, S temp) {
        super(data);
        this.temp = temp;
    }

    // Getter
    public S getTemp() {
        return temp;
    }

    // Setter
    public void setTemp(S temp) {
        this.temp = temp;
    }

    public static void main(String[] args) {

        subDemo<String, Integer> s1 = new subDemo<>("Jack", 23);
        System.out.println("Name : " + s1.getData());
        System.out.println("Age  : " + s1.getTemp());

        subDemo<String, Double> s2 = new subDemo<>("John", 85.5);
        System.out.println("Name : " + s2.getData());
        System.out.println("Marks: " + s2.getTemp());
    }
}