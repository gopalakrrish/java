import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
//        numbers.insert(40);
        numbers.print();
        System.out.println(numbers);
        numbers.removeAt(2);
//        numbers.insert(100);
        numbers.print();
        System.out.println(numbers);
        System.out.println("index of 30 is " + numbers.indexOf(30));
    }
}