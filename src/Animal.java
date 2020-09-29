/**
 * Created by Sana Eneroth Boukchana
 * Date: 2020-09-26
 * Time: 16:25
 * Project: HealthyPets
 * Copyright: MIT
 */
public interface Animal {

    String getName();

    int getAmountOfFood();

    FoodType getFoodType();

    enum FoodType {
        DOGFOOD("dog food"), CATFOOD("cat food"), SNAKEPELLETS("snake pellets");

        FoodType(String typeOfFood){
            this.typeOfFood = typeOfFood;
        }
        private String typeOfFood;

        public String getTypeOfFood() {
            return typeOfFood;
        }
    }


}

