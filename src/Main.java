import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
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
            switch (in.next()) {
                case "1":
                    File();
                    break;
                case "2":
                    Manual();
                    break;
                case "3":
                    Random();
                    break;
                case "4":
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
        try {
            System.out.println("Сколько записей хотите сделать?:");
            int amount = in.nextInt();
            boolean flag = true;
            while (flag) {
                System.out.print("Выберите вводимый класс:\n" +
                        "Введите 1 - Human\n" +
                        "Введите 2 - Animal\n" +
                        "Введите 3 - Barrel\n" +
                        "Введите 4 - Назад\n\n" +
                        "Вы ввели:");
                switch (in.next()) {
                    case "1":
                        ArrayList<Human> humans = manualReader.ManualHumans(amount);
                        HumansSort(humans);
                        flag = false;
                        break;
                    case "2":
                        ArrayList<Animal> animals = manualReader.ManualAnimals(amount);
                        AnimalsSort(animals);
                        flag = false;
                        break;
                    case "3":
                        ArrayList<Barrel> barrels = manualReader.ManualBarrels(amount);
                        BarrelsSort(barrels);
                        flag = false;
                        break;
                    case "4":
                        flag = false;
                        break;
                    default:
                        System.out.println("Неверный ввод");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Неверный ввод");
            Manual();
        }
    }

    static private void File() throws IOException {
        Scanner in = new Scanner(System.in);
        FileReader fileReader = new FileReader();
        Boolean flag = true;
        String file = null; // переменная для хранения пути
        while (flag) {
            System.out.println("Введите путь к файлу:");
            file = in.nextLine();

            if (!fileReader.isValidPath(file)) {
                System.out.println("Неверный путь к файлу. Пожалуйста, попробуйте снова.");
                continue; // если путь неверный, просим ввести его снова
            }

            System.out.print("Выберите вводимый класс:\n" +
                    "Введите 1 - Human\n" +
                    "Введите 2 - Animal\n" +
                    "Введите 3 - Barrel\n" +
                    "Введите 4 - Назад\n\n" +
                    "Вы ввели:");
            switch (in.next()) {
                case "1":
                    ArrayList<Human> humans = fileReader.ReadHumans(file); // передаем путь в метод
                    HumansSort(humans);
                    flag = false;
                    break;
                case "2":
                    ArrayList<Animal> animals = fileReader.ReadAnimals(file); // передаем путь в метод
                    AnimalsSort(animals);
                    flag = false;
                    break;
                case "3":
                    ArrayList<Barrel> barrels = fileReader.ReadBarrels(file); // передаем путь в метод
                    BarrelsSort(barrels);
                    flag = false;
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный ввод/файл не найден");
            }
        }
    }

    static private void Random(){
        Scanner in = new Scanner(System.in);
        RandomReader randomReader = new RandomReader();
        Boolean flag = true;
        try {
            while (flag) {
                System.out.println("Сколько записей хотите сгенерировать?:");
                int amount = in.nextInt();
                System.out.print("Выберите вводимый класс:\n" +
                        "Введите 1 - Human\n" +
                        "Введите 2 - Animal\n" +
                        "Введите 3 - Barrel\n" +
                        "Введите 4 - Назад\n\n" +
                        "Вы ввели:");
                switch (in.next()) {
                    case "1":
                        ArrayList<Human> humans = randomReader.RandomHumans(amount);
                        HumansSort(humans);
                        flag = false;
                        break;
                    case "2":
                        ArrayList<Animal> animals = randomReader.RandomAnimals(amount);
                        AnimalsSort(animals);
                        flag = false;
                        break;
                    case "3":
                        ArrayList<Barrel> barrels = randomReader.RandomBarrels(amount);
                        BarrelsSort(barrels);
                        flag = false;
                        break;
                    case "4":
                        flag = false;
                        break;
                    default:
                        System.out.println("Неверный ввод");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Неверный ввод");
            Random();
        }
    }

    static private void HumansSort(ArrayList<Human> humans){
        Scanner in = new Scanner(System.in);
        SortHuman sortHuman = new SortHuman();
        boolean flag = true;
        while (flag) {
            System.out.print("Выберите по какому признаку сортировать:\n" +
                    "Введите 1 - Surname\n" +
                    "Введите 2 - Age\n" +
                    "Введите 3 - Gender\n" +
                    "Введите 4 - В начало\n\n" +
                    "Вы ввели:");
            switch (in.next()) {
                case "1":
                    System.out.println(sortHuman.HumanSurnameSort(humans));
                    break;
                case "2":
                    System.out.println(sortHuman.HumanAgeSort(humans));
                    break;
                case "3":
                    System.out.println(sortHuman.HumanGenderSort(humans));
                    break;
                case "4":
                     flag=false;
                     break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    static private void AnimalsSort(ArrayList<Animal> animals){
        Scanner in = new Scanner(System.in);
        SortAnimal sortAnimal = new SortAnimal();
        boolean flag = true;
        while (flag) {
            System.out.print("Выберите по какому признаку сортировать:\n" +
                    "Введите 1 - Type\n" +
                    "Введите 2 - Eye Color\n" +
                    "Введите 3 - Has Fur\n" +
                    "Введите 4 - В начало\n\n" +
                    "Вы ввели:");
            switch (in.next()) {
                case "1":
                    System.out.println(sortAnimal.AnimalTypeSort(animals));
                    break;
                case "2":
                    System.out.println(sortAnimal.AnimalEyeColorSort(animals));
                    break;
                case "3":
                    System.out.println(sortAnimal.AnimalFurSort(animals));
                    break;
                case "4":
                    flag=false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    static private void BarrelsSort(ArrayList<Barrel> barrels) {
        Scanner in = new Scanner(System.in);
        SortBarrel sortBarrel = new SortBarrel();
        boolean flag = true;
        while (flag) {
            System.out.print("Выберите по какому признаку сортировать:\n" +
                    "Введите 1 - Volume\n" +
                    "Введите 2 - Material\n" +
                    "Введите 3 - Content\n" +
                    "Введите 4 - В начало\n\n" +
                    "Вы ввели:");
            switch (in.next()) {
                case "1":
                    System.out.println(sortBarrel.BarrelVolumeSort(barrels));
                    break;
                case "2":
                    System.out.println(sortBarrel.BarrelMaterialSort(barrels));
                    break;
                case "3":
                    System.out.println(sortBarrel.BarrelContentSort(barrels));
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}