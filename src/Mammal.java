/**
 * Created by Sana Eneroth Boukchana
 * Date: 2020-09-27
 * Time: 16:40
 * Project: HealtyPets
 * Copyright: MIT
 */
public abstract class Mammal implements Animal {

    private String name;
    private int weight;

    Mammal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmountOfFood() {
        return weight / getFoodDivisor();
    }

    protected abstract int getFoodDivisor();
    //getFoodDivisor intern implementation = inkapsling (pga kan inte anropas direkt från ex. main)
}
