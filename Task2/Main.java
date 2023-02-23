package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        System.out.println(list.stream().
                map(integer -> integer * integer).
                reduce(0, Integer::sum));

    }
}
