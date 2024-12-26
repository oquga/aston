package Readers;

import Domain.*;
import Interfaces.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class ManualReader implements Reader {
    public ArrayList<Human> getHumans(int amount) {
        ArrayList<Human> humans = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите информацию в формате \"Johnson 21 Male\" " + amount + " раз:");

        for (int i = 0; i < amount; i++) {
            String[] data = in.nextLine().split(" ");

            if (data.length != 3) {
                System.out.println("Ошибка: должно быть 3 поля для человека.");
                i--;
                continue;
            }

            int age;
            try {
                age = Integer.parseInt(data[1]);
                if (age < 0 || age > 150) {
                    System.out.println("Ошибка: возраст должен быть между 0 и 150.");
                    i--;
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: возраст должен быть числом.");
                i--;
                continue;
            }

            if (!data[2].equalsIgnoreCase("Male") && !data[2].equalsIgnoreCase("Female")) {
                System.out.println("Ошибка: Пол должен быть 'Male' или 'Female'.");
                i--;
                continue;
            }

            humans.add(new Human.HumanBuilder()
                    .setSurname(data[0])
                    .setAge(age)
                    .setGender(data[2])
                    .build());
        }
        return humans;
    }

    public ArrayList<Animal> getAnimals(int amount) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите информацию в формате \"Dog Brown True\" " + amount + " раз:");

        for (int i = 0; i < amount; i++) {
            String[] data = in.nextLine().split(" ");

            if (data.length != 3) {
                System.out.println("Ошибка: должно быть 3 поля для животного.");
                i--;
                continue;
            }

            if (data[0].isEmpty()) {
                System.out.println("Ошибка: вид животного не может быть пустым.");
                i--;
                continue;
            }

            if (data[1].isEmpty()) {
                System.out.println("Ошибка: цвет глаз не может быть пустым.");
                i--;
                continue;
            }

            boolean hasFur;
            if (!data[2].equalsIgnoreCase("true") && !data[2].equalsIgnoreCase("false")) {
                System.out.println("Ошибка: шерсть должна быть 'True' или 'False'.");
                i--;
                continue;
            } else {
                hasFur = Boolean.parseBoolean(data[2]);
            }

            animals.add(new Animal.AnimalBuilder()
                    .setType(data[0])
                    .setEyeColor(data[1])
                    .setHasFur(hasFur)
                    .build());
        }
        return animals;
    }

    public ArrayList<Barrel> getBarrels(int amount) {
        ArrayList<Barrel> barrels = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите информацию в формате \"2.2 Wood Grain\" " + amount + " раз:");

        for (int i = 0; i < amount; i++) {
            String[] data = in.nextLine().split(" ");

            if (data.length != 3) {
                System.out.println("Ошибка: должно быть 3 поля для бочки.");
                i--;
                continue;
            }

            double volume;
            try {
                volume = Double.parseDouble(data[0]);
                if (volume <= 0) {
                    System.out.println("Ошибка: объем должен быть положительным числом.");
                    i--;
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: объем должен быть числом.");
                i--;
                continue;
            }

            if (data[1].isEmpty() || data[2].isEmpty()) {
                System.out.println("Ошибка: материал и содержание не могут быть пустыми.");
                i--;
                continue;
            }

            barrels.add(new Barrel.BarrelBuilder()
                    .setVolume(volume)
                    .setMaterial(data[1])
                    .setContent(data[2])
                    .build());
        }
        return barrels;
    }
}
