import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MyList list = new MyArrayList();

        list.add("Kamran");
        list.add("Kamran");
        list.add("Kamran");
        list.add("Kamran");
        list.add("Kamran");
        list.add("Valid");
        list.add("Valid");
        list.add("Valid");
        list.add("Valid");
        list.add("Valid");
        list.add("Kenan");
        list.add("Kamal");
        list.add("Taleh");
        list.add("Seymur");
        list.add("Valeh");
        list.add("Qalib");
        list.add("Yaqub");
        list.add("Cosqun");

        System.out.println(list);
        System.out.println(list.size());

//        list.remove(2);
//        list.remove(3);
//        list.remove(6);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.get(2));


        list.remove("Valid");

        System.out.println(list);
        System.out.println(list.size());


        list.remove("Eti");

        list.remove(0);

        System.out.println(list);
        System.out.println(list.size());


        list.remove(7);

        System.out.println(list);
        System.out.println(list.size());


        MyList list2 = new MyArrayList();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addAll(list2);

        System.out.println(list);
        System.out.println(list.size());

        list.set(8, "TEST");

        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
        list.clear();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());


//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Valid");

    }
}
