public class car {

    private String model;
    private String[] features;

    public car(String model, String[] features) {
        this.model = model;
        this.features = features;
    }

    // Method to display specifications
    public void specs() {
        System.out.println("Features of " + model);
        for (String s : features) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        String[] featureList = {
            "Air Conditioning",
            "Power Steering",
            "ABS"
        };

        car car1 = new car("Honda City", featureList);

        car1.specs();
    }
}