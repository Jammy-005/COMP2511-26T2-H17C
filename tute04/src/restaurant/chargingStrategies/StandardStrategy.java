package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {
    private static final double MODIFIER = 1;

    @Override
    public double cost(List<Meal> order, String payee, List<String> members ) {
        return order.stream().mapToDouble(meal -> meal.getCost() * MODIFIER).sum();
    }

    @Override
    public double getModifier() {
        return MODIFIER;
    }
}
