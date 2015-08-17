package model;

/**
 * Created by yevhenii on 8/15/15.
 */
public class Food {
    private final String name;
    private final Integer calories;
    private final Double proteins;
    private final Double carbohydrates;
    private final Double fat;

    public Food(String name, Integer calories, Double proteins, Double carbohydrates, Double fat) {
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public Integer getCalories() {
        return calories;
    }

    public Double getProteins() {
        return proteins;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public Double getFat() {
        return fat;
    }
}
