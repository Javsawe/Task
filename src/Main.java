import java.sql.ClientInfoStatus;
import java.util.ArrayList;

import static java.awt.AWTEventMulticaster.remove;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(1, 20);
        list.set(0, 5);


        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);

        System.out.println(list.indexOf(30));
        System.out.println(list.contains(30));
        System.out.println(list.contains(60));
        }
        Integer startValue = 0;
        int endBalue = 10_000;
        int i = 0;
        }

