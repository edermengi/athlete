package model;

/**
 * Created by yevhenii on 8/15/15.
 */
public class Eating {
    private final Integer weight;
    private final Food food;

    public Eating(Integer weight, Food food) {
        this.weight = weight;
        this.food = food;
    }

    public Integer getWeight() {
        return weight;
    }

    public Food getFood() {
        return food;
    }
}
