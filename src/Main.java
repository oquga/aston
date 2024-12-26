import Comparators.*;
import Domain.*;
import Readers.*;
import Searchers.*;
import Sorters.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("""
                    Выберите способ ввода:
                    Введите 1 - Ввод из файла
                    Введите 2 - Ввод вручную
                    Введите 3 - Случайный ввод
                    Введите 4 - Завершить работу программы
 
                    Вы ввели:""");
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
                System.out.print("""
                        Выберите вводимый класс:
                        Введите 1 - Human
                        Введите 2 - Animal
                        Введите 3 - Barrel
                        Введите 4 - Назад
 
                        Вы ввели:""");
                switch (in.next()) {
                    case "1":
                        ArrayList<Human> humans = manualReader.getHumans(amount);
                        HumansSort(humans);
                        flag = false;
                        break;
                    case "2":
                        ArrayList<Animal> animals = manualReader.getAnimals(amount);
                        AnimalsSort(animals);
                        flag = false;
                        break;
                    case "3":
                        ArrayList<Barrel> barrels = manualReader.getBarrels(amount);
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

    static private void File() {
        Scanner in = new Scanner(System.in);
        FileReader fileReader = new FileReader();
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Путь файла:");
                String file = in.nextLine();
                File f = new File(file);
                if (!f.exists() || !f.isFile()) {
                    System.out.println("Неверный путь к файлу. Попробуйте снова.");
                    return;
                }
                System.out.print("""
                        Выберите вводимый класс:
                        Введите 1 - Human
                        Введите 2 - Animal
                        Введите 3 - Barrel
                        Введите 4 - Назад
 
                        Вы ввели:""");
                switch (in.next()) {
                    case "1":
                        ArrayList<Human> humans = fileReader.readHumans(file);
                        if (humans == null) {
                            System.out.println("Ошибка в формате данных для Human.");
                            return;
                        }
                        HumansSort(humans);
                        flag = false;
                        break;
                    case "2":
                        ArrayList<Animal> animals = fileReader.readAnimals(file);
                        if (animals == null) {
                            System.out.println("Ошибка в формате данных для Animal.");
                            return;
                        }
                        AnimalsSort(animals);
                        flag = false;
                        break;
                    case "3":
                        ArrayList<Barrel> barrels = fileReader.readBarrels(file);
                        if (barrels == null) {
                            System.out.println("Ошибка в формате данных для Barrel.");
                            return;
                        }
                        BarrelsSort(barrels);
                        flag = false;
                        break;
                    case "4":
                        flag = false;
                        break;
                    default:
                        System.out.println("Неверный ввод. Попробуйте снова.");
                        break;
                }
            } catch (IOException ex1) {
                System.out.println("Ошибка при работе с файлом: " + ex1.getMessage());
            } catch (Exception ex2) {
                System.out.println("Произошла ошибка: " + ex2.getMessage());
            }
        }
    }
    static private void Random(){
        Scanner in = new Scanner(System.in);
        RandomReader randomReader = new RandomReader();
        boolean flag = true;
        try {
            while (flag) {
                System.out.println("Сколько записей хотите сгенерировать?:");
                int amount = in.nextInt();
                System.out.print("""
                        Выберите вводимый класс:
                        Введите 1 - Human
                        Введите 2 - Animal
                        Введите 3 - Barrel
                        Введите 4 - Назад
 
                        Вы ввели:""");
                switch (in.next()) {
                    case "1":
                        ArrayList<Human> humans = randomReader.getHumans(amount);
                        HumansSort(humans);
                        flag = false;
                        break;
                    case "2":
                        ArrayList<Animal> animals = randomReader.getAnimals(amount);
                        AnimalsSort(animals);
                        flag = false;
                        break;
                    case "3":
                        ArrayList<Barrel> barrels = randomReader.getBarrels(amount);
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
            System.out.print("""
                    Выберите по какому признаку сортировать:
                    Введите 1 - Surname
                    Введите 2 - Age
                    Введите 3 - Gender
                    Введите 4 - В начало
 
                    Вы ввели:""");
            switch (in.next()) {
                case "1":
                    Comparator<Human> comparator1 = new HumanSurnameComparator();
                    humans = sortHuman.sort(humans, comparator1);
                    System.out.println("Sorted by Surname:");
                    for (Human human : humans) {
                        System.out.println("Surname: " + human.getSurname() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Surname:\n");
                        HumanSearch(humans, new Human.HumanBuilder().setSurname(in.next()).build(), comparator1);
                    }
                    break;
                case "2":
                    Comparator<Human> comparator2 = new HumanAgeComparator();
                    humans = sortHuman.sort(humans, comparator2);
                    System.out.println("Sorted by Age:");
                    for (Human human : humans) {
                        System.out.println("Surname: " + human.getSurname() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Age:\n");
                        HumanSearch(humans, new Human.HumanBuilder().setAge(in.nextInt()).build(), comparator2);
                    }
                    break;
                case "3":
                    Comparator<Human> comparator3 = new HumanGenderComparator();
                    humans = sortHuman.sort(humans, comparator3);
                    System.out.println("Sorted by Gender:");
                    for (Human human : humans) {
                        System.out.println("Surname: " + human.getSurname() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Gender, Male/Female?:\n");
                        HumanSearch(humans, new Human.HumanBuilder().setGender(in.next()).build(), comparator3);
                    }
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
            System.out.print("""
                    Выберите по какому признаку сортировать:
                    Введите 1 - Type
                    Введите 2 - Eye Color
                    Введите 3 - Has Fur
                    Введите 4 - В начало
 
                    Вы ввели:""");
            switch (in.next()) {
                case "1":
                    Comparator<Animal> comparator1 = new AnimalTypeComparator();
                    animals = sortAnimal.sort(animals, comparator1);
                    System.out.println("Animals sorted by Type:");
                    for (Animal animal : animals) {
                        System.out.println("Type: "+animal.getType() + ", Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Type:\n");
                        AnimalSearch(animals, new Animal.AnimalBuilder().setType(in.next()).build(), comparator1);
                    }
                    break;
                case "2":
                    Comparator<Animal> comparator2 = new AnimalEyeColorComparator();
                    animals = sortAnimal.sort(animals, comparator2);
                    System.out.println("Animals sorted by Eye Color:");
                    for (Animal animal : animals) {
                        System.out.println("Type: "+animal.getType() + ", Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Eye Color:\n");
                        AnimalSearch(animals, new Animal.AnimalBuilder().setEyeColor(in.next()).build(), comparator2);
                    }
                    break;
                case "3":
                    Comparator<Animal> comparator3 = new AnimalFurComparator();
                    animals = sortAnimal.sort(animals, comparator3);
                    System.out.println("Animals sorted by Fur Presence:");
                    for (Animal animal : animals) {
                        System.out.println("Type: "+animal.getType() + ", Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Fur Presence, true/false?:\n");
                        AnimalSearch(animals, new Animal.AnimalBuilder().setHasFur(in.nextBoolean()).build(), comparator3);
                    }
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
            System.out.print("""
                    Выберите по какому признаку сортировать:
                    Введите 1 - Volume
                    Введите 2 - Material
                    Введите 3 - Content
                    Введите 4 - В начало
 
                    Вы ввели:""");
            switch (in.next()) {
                case "1":
                    Comparator<Barrel> comparator1 = new BarrelVolumeComparator();
                    barrels = sortBarrel.sort(barrels, comparator1);
                    System.out.println("Sorted by Volume:");
                    for (Barrel barrel : barrels) {
                        System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Volume:\n");
                        BarrelSearch(barrels, new Barrel.BarrelBuilder().setVolume(Double.parseDouble(in.next())).build(), comparator1);
                    }
                    break;
                case "2":
                    Comparator<Barrel> comparator2 = new BarrelMaterialComparator();
                    barrels = sortBarrel.sort(barrels, comparator2);
                    System.out.println("Sorted by Material:");
                    for (Barrel barrel : barrels) {
                        System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Material:\n");
                        BarrelSearch(barrels, new Barrel.BarrelBuilder().setMaterial(in.next()).build(), comparator2);
                    }
                    break;
                case "3":
                    Comparator<Barrel> comparator3= new BarrelContentComparator();
                    barrels = sortBarrel.sort(barrels, comparator3);
                    System.out.println("Sorted by Contents:");
                    for (Barrel barrel : barrels) {
                        System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
                    }
                    System.out.println("Провести поиск?: y/n \n");
                    if (in.next().equals("y")) {
                        System.out.println("Введите Content:\n");
                        BarrelSearch(barrels, new Barrel.BarrelBuilder().setContent(in.next()).build(), comparator3);
                    }
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    static private void HumanSearch(ArrayList<Human> humans, Human searching, Comparator<Human> comparator){
        SearchHuman searchHuman = new SearchHuman();
        int index = searchHuman.search(humans, searching, comparator);
        if (index != -1){
            System.out.println("\nНомер человека в коллекции " + index + "\n" +
                    "Surname: " + humans.get(index).getSurname() +
                    ", Age: " + humans.get(index).getAge() +
                    ", Gender: " + humans.get(index).getGender());
            System.out.println();
        }
        else System.out.println("Человек не найден");
    }
    static private void AnimalSearch(ArrayList<Animal> animals, Animal searching, Comparator<Animal> comparator){
        SearchAnimal searchAnimal = new SearchAnimal();
        int index = searchAnimal.search(animals, searching, comparator);
        if (index != -1){
            System.out.println("\nНомер животного в коллекции " + index + "\n" +
                    "Type: " + animals.get(index).getType() +
                    ", Eye Color: " + animals.get(index).getEyeColor() +
                    ", Fur Presence: " + animals.get(index).getHasFur());
            System.out.println();
        }
        else System.out.println("Животное не найдено");
    }
    static private void BarrelSearch(ArrayList<Barrel> barrels, Barrel searching, Comparator<Barrel> comparator){
        SearchBarrel searchBarrel = new SearchBarrel();
        int index = searchBarrel.search(barrels, searching, comparator);
        if (index != -1){
            System.out.println("\nНомер бочки в коллекции " + index + "\n" +
                    "Volume: " + barrels.get(index).getVolume() +
                    ", Material: " + barrels.get(index).getMaterial() +
                    ", Content: " + barrels.get(index).getContent());
            System.out.println();
        }
        else System.out.println("Бочка не найдена");
    }

}