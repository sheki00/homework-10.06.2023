import java.util.ArrayList;
import java.util.List;

public class ListReversal {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        List<Integer> reversedList = new ArrayList<>();

        for (int i = list1.size() - 1; i >= 0; i--) {
            reversedList.add(list1.get(i));
        }

        System.out.println("Original list: " + list1);
        System.out.println("Reversed list: " + reversedList);
    }
}