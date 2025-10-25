import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
//        System.out.println(list.contains(30));
//        list.my_removeLast();
//        System.out.println(list.contains(30));
//        System.out.println(list);
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        list.print();
        list.reverse();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}