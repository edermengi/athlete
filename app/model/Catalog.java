package model;

import java.util.List;

/**
 * Created by yevhenii on 8/15/15.
 */
public class Catalog {
    private final List<Food> foodCatalog;

    public Catalog(List<Food> foodCatalog) {
        this.foodCatalog = foodCatalog;
    }

    public List<Food> getFoodCatalog() {
        return foodCatalog;
    }
}
