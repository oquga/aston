package Readers;

import Domain.Animal;
import Domain.Barrel;
import Domain.Human;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReader {
    public ArrayList<Human> readHumans(String fileName) throws IOException, NumberFormatException {
        ArrayList<Human> humans = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = reader.readLine()) != null ) {
                var items = line.split(" ");
                humans.add(new Human.HumanBuilder()
                        .setSurname(items[0])
                        .setAge(Integer.parseInt(items[1]))
                        .setGender(items[2])
                        .build());
            }
        }
        return humans;
    }

    public ArrayList<Barrel> readBarrels(String fileName) throws IOException, NumberFormatException {
        ArrayList<Barrel> barrels = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                var items = line.split(" ");
                barrels.add(new Barrel.BarrelBuilder()
                        .setVolume(Double.parseDouble(items[0]))
                        .setMaterial(items[1])
                        .setContent(items[2])
                        .build());
            }
        }
        return barrels;
    }

    public ArrayList<Animal> readAnimals(String fileName) throws IOException, NumberFormatException {
        ArrayList<Animal> animals = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                var items = line.split(" ");
                animals.add(new Animal.AnimalBuilder()
                        .setType(items[0])
                        .setEyeColor(items[1])
                        .setHasFur(Boolean.parseBoolean(items[2]))
                        .build());
            }
        }
        return animals;
    }
}