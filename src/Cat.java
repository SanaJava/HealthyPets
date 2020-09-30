/**
 * Created by Sana Eneroth Boukchana
 * Date: 2020-09-26
 * Time: 16:14
 * Project: HealthyPets
 * Copyright: MIT
 */
public class Cat extends Mammal{

    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    protected int getFoodDivisor() {
        return 150;
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.CATFOOD;
    }

}
