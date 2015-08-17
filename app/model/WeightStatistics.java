package model;

/**
 * Created by yevhenii on 8/15/15.
 */
public class WeightStatistics {
    private final Double weight;
    private final Double fat;
    private final Double visceralFat;
    private final Double muscles;

    public WeightStatistics(Double weight, Double fat, Double visceralFat, Double muscles) {
        this.weight = weight;
        this.fat = fat;
        this.visceralFat = visceralFat;
        this.muscles = muscles;
    }
}
