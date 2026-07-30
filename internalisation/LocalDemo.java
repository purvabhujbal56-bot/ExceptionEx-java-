package internalisation;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
    public static void main(String[] args) {
        //ResourceBundle bundle = ResourceBundle.getBundle("internalisation.msgs", Locale.of("hi"));
        ResourceBundle bundle = ResourceBundle.getBundle("internalisation.msgs");

        System.out.println(bundle.getString("greeting"));
        System.out.println(bundle.getString("message"));

    }
}
