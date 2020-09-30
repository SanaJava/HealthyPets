/**
 * Created by Sana Eneroth Boukchana
 * Date: 2020-09-26
 * Time: 16:13
 * Project: HealthyPets
 * Copyright: MIT
 */
public class Dog extends Mammal {

    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    protected int getFoodDivisor() {
        return 100;
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.DOGFOOD;
    }
}

