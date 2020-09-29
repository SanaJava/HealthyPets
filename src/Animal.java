/**
 * Created by Sana Eneroth Boukchana
 * Date: 2020-09-26
 * Time: 16:25
 * Project: HealthyPets
 * Copyright: MIT
 */
public interface Animal {

    public String getName();

    public int getAmountOfFood();

    public FoodType getFoodType();

    enum FoodType {
        DOGFOOD, CATFOOD, SNAKEPELLETS
    }

}

