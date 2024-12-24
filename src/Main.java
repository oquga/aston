import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Выберите способ ввода:\n" +
                    "Введите 1 - Ввод из файла\n" +
                    "Введите 2 - Ввод вручную\n" +
                    "Введите 3 - Случайный ввод\n" +
                    "Введите 4 - Завершить работу программы\n\n" +
                    "Вы ввели:");
            switch (in.nextInt()) {
                case 1:
                    File();
                    break;
                case 2:
                    Manual();
                    break;
                case 3:
                    Random();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Вы не ввели вариант/выбранного варианта не существует");
            }
        }
    }

    static private void Manual(){
        Scanner in = new Scanner(System.in);
        ManualReader manualReader = new ManualReader();
        System.out.println("Сколько записей хотите сделать?:");
        int amount = in.nextInt();
        System.out.print("Выберите вводимый класс:\n" +
                "Введите 1 - Human\n" +
                "Введите 2 - Animal\n" +
                "Введите 3 - Barrel\n\n" +
                "Вы ввели:");
        switch (in.nextInt()){
            case 1:
                ArrayList<Human> humans = manualReader.ManualHumans(amount);
                System.out.println(humans.get(0) + " " + humans.get(1));
                break;
            case 2:
                ArrayList<Animal> animals = manualReader.ManualAnimals(amount);
                System.out.println(animals);
                break;
            case 3:
                ArrayList<Barrel> barrels = manualReader.ManualBarrels(amount);
                System.out.println(barrels);
                break;
            default:
                System.out.println("Неверный ввод");
                Manual();
        }
    }

    static private void File() throws IOException{
        Scanner in = new Scanner(System.in);
        FileReader fileReader = new FileReader();
        System.out.println("Путь файла:");
        String file = in.nextLine();
        System.out.print("Выберите вводимый класс:\n" +
                "Введите 1 - Human\n" +
                "Введите 2 - Animal\n" +
                "Введите 3 - Barrel\n\n" +
                "Вы ввели:");
        switch (in.nextInt()){
            case 1:
                ArrayList<Human> humans = fileReader.ReadHumans(file);
                System.out.println(humans);
                break;
            case 2:
                ArrayList<Animal> animals = fileReader.ReadAnimals(file);
                System.out.println(animals);
                break;
            case 3:
                ArrayList<Barrel> barrels = fileReader.ReadBarrels(file);
                System.out.println(barrels);
                break;
            default:
                System.out.println("Неверный ввод/файл не найден");
                File();
        }
    }

    static private void Random(){
        Scanner in = new Scanner(System.in);
        RandomReader randomReader = new RandomReader();
        System.out.println("Сколько записей хотите сгенерировать?:");
        int amount = in.nextInt();
        System.out.print("Выберите вводимый класс:\n" +
                "Введите 1 - Human\n" +
                "Введите 2 - Animal\n" +
                "Введите 3 - Barrel\n\n" +
                "Вы ввели:");
        switch (in.nextInt()){
            case 1:
                ArrayList<Human> humans = randomReader.RandomHumans(amount);
                System.out.println(humans);
                break;
            case 2:
                ArrayList<Animal> animals = randomReader.RandomAnimals(amount);
                System.out.println(animals);
                break;
            case 3:
                ArrayList<Barrel> barrels = randomReader.RandomBarrels(amount);
                System.out.println(barrels);
                break;
            default:
                System.out.println("Неверный ввод");
                Random();
        }
    }
}