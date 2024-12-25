import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReader {
     
    private boolean isValidPath(String fileName) {
        try {
            Paths.get(fileName);
            return Files.exists(Paths.get(fileName));   
        } catch (InvalidPathException e) {
            return false;   
        }
    }

     
    public ArrayList<Human> ReadHumans(String fileName) {
        ArrayList<Human> humans = new ArrayList<>();

         
        if (!isValidPath(fileName)) {
            System.out.println("Неверный путь к файлу: " + fileName);
            return humans;   
        }

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                var items = line.split(" ");

                 
                if (items.length != 3) {
                    System.out.println("Ошибка: строка должна содержать 3 поля для Human.");
                    continue;
                }

                try {
                    int age = Integer.parseInt(items[1]);
                    if (age < 0 || age > 150) {
                        System.out.println("Ошибка: возраст должен быть в пределах от 0 до 150.");
                        continue;
                    }

                    if (!items[2].equalsIgnoreCase("Male") && !items[2].equalsIgnoreCase("Female")) {
                        System.out.println("Ошибка: Пол должен быть 'Male' или 'Female'.");
                        continue;
                    }

                    humans.add(new Human.HumanBuilder()
                            .setSurname(items[0])
                            .setAge(age)
                            .setGender(items[2])
                            .build());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: возраст должен быть целым числом.");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + fileName);
        }
        return humans;
    }

     
    public ArrayList<Barrel> ReadBarrels(String fileName) {
        ArrayList<Barrel> barrels = new ArrayList<>();

         
        if (!isValidPath(fileName)) {
            System.out.println("Неверный путь к файлу: " + fileName);
            return barrels;
        }

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                var items = line.split(" ");

                 
                if (items.length != 3) {
                    System.out.println("Ошибка: строка должна содержать 3 поля для Barrel.");
                    continue;
                }

                try {
                    double volume = Double.parseDouble(items[0]);
                    if (volume <= 0) {
                        System.out.println("Ошибка: объем должен быть положительным числом.");
                        continue;
                    }

                     
                    if (items[1].isEmpty() || items[2].isEmpty()) {
                        System.out.println("Ошибка: материал и содержание не могут быть пустыми.");
                        continue;
                    }

                    barrels.add(new Barrel.BarrelBuilder()
                            .setVolume(volume)
                            .setMaterial(items[1])
                            .setContent(items[2])
                            .build());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: объем должен быть числом.");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + fileName);
        }
        return barrels;
    }

     
    public ArrayList<Animal> ReadAnimals(String fileName) {
        ArrayList<Animal> animals = new ArrayList<>();

         
        if (!isValidPath(fileName)) {
            System.out.println("Неверный путь к файлу: " + fileName);
            return animals;
        }

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                var items = line.split(" ");

                 
                if (items.length != 3) {
                    System.out.println("Ошибка: строка должна содержать 3 поля для Animal.");
                    continue;
                }

                 
                if (items[0].isEmpty() || items[1].isEmpty()) {
                    System.out.println("Ошибка: Вид животного и цвет глаз не могут быть пустыми.");
                    continue;
                }


                if (!items[2].equalsIgnoreCase("true") && !items[2].equalsIgnoreCase("false")) {
                    System.out.println("Ошибка: Шерсть должна быть 'true' или 'false'.");
                    continue;
                }

                boolean hasFur = Boolean.parseBoolean(items[2]);
                animals.add(new Animal.AnimalBuilder()
                        .setType(items[0])
                        .setEyeColor(items[1])
                        .setHasFur(hasFur)
                        .build());
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + fileName);
        }
        return animals;
    }
}
