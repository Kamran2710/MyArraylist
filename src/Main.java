import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyList list = new MyArrayList();

        list.add("Kamran");
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
        list.remove(2);
        list.remove(3);
        list.remove(6);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(2));




    }
}
