package Students;

import java.util.ArrayList;

public class Product {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();

        list.add("Banana: " + "50 som 1 kilo");
        list.add("WaterMelon: " + "200 som 5 kilo");

        list.set(1, "150 som");

        for (String j: list) {
            System.out.println(j);
        }
    }
}
