import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<Object>();
        while(true) {
            System.out.print("Выберите способ ввода:\n" +
                    "Введите 1 - Ввод вручную\n" +
                    "Введите 2 - Ввод из файла\n" +
                    "Введите 3 - Случайный ввод\n" +
                    "Введите 4 - Завершить работу программы\n\n" +
                    "Вы ввели:");
            switch (in.nextInt()) {
                case 1:
                    list = Manual(list);
                    System.out.println(list);
                    break;
                case 2:
                    list = File(list);
                    System.out.println(list);
                    break;
                case 3:
                    list = Random(list);
                    System.out.println(list);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
    static private ArrayList<Object> Manual(ArrayList<Object> list){
        list.add(5);
        return list;
    }
    static private ArrayList<Object> File(ArrayList<Object> list){
        list.add(5);
        return list;
    }
    static private ArrayList<Object> Random(ArrayList<Object> list){
        list.add(Math.random());
        return list;
    }
}