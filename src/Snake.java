/**
 * Created by Sana Eneroth Boukchana
 * Date: 2020-09-26
 * Time: 16:14
 * Project: HealtyPets
 * Copyright: MIT
 */
public class Snake implements Animal{

    private String name;
    private int weight;

    public Snake(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int getAmountOfFood() {
        return 20;
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.SNAKEPELLETS;
    }

    @Override
    public String getName() {
        return name;
    }
}
