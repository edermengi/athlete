package model;

import java.util.Date;
import java.util.List;

/**
 * Created by yevhenii on 8/14/15.
 */
public class Day {
    private final User user;
    private final Date date;

    private final List<Eating> eatings;
    private final WeightStatistics weightStatistics;

    public Day(User user, Date date, List<Eating> eatings, WeightStatistics weightStatistics) {
        this.user = user;
        this.date = date;
        this.eatings = eatings;
        this.weightStatistics = weightStatistics;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public List<Eating> getEatings() {
        return eatings;
    }

    public WeightStatistics getWeightStatistics() {
        return weightStatistics;
    }
}
