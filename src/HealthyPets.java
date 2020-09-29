import javax.swing.*;
import java.util.ArrayList;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * Created by Sana Eneroth Boukchana
 * Date: 2020-09-26
 * Time: 16:02
 * Project: HealthyPets
 * Copyright: MIT
 */
public class HealthyPets {
    public static void main(String[] args) {

        ArrayList<Animal> allAnimals = new ArrayList<>();

        allAnimals.add(new Dog("Sixten", 5000));
        allAnimals.add(new Dog("Dogge", 10000));
        allAnimals.add(new Cat("Venus", 5000));
        allAnimals.add(new Cat("Ove", 3000));
        allAnimals.add(new Snake("Hypno", 1000));

        String name = JOptionPane.showInputDialog(null, "What guest will be feed?");

        Animal animal = findAnimal(allAnimals, name);

        if (animal != null) {
            String foodName = animal.getFoodType().getTypeOfFood();
            JOptionPane.showMessageDialog(null,
                    name + " should eat " + animal.getAmountOfFood() + "g of " + foodName);
        } else if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog
                    (null,
                            "Ooops please restart the program and try again",
                            "ERROR", ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    name + " is not here unfortunately.");
        }
    }

    public static Animal findAnimal(ArrayList<Animal> animals, String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
}
