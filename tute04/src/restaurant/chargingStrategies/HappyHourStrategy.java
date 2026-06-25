package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class HappyHourStrategy implements ChargingStrategy {
    private static final double MODIFIER_STANDARD = 0.7;
    private static final double MODIFIER_MEMBER = 0.6;

    @Override
    public double cost(List<Meal> order, String payee, List<String> members) {
        if (members.contains(payee)) {
            return order.stream().mapToDouble(meal -> meal.getCost() * MODIFIER_MEMBER).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * MODIFIER_STANDARD).sum();
        }
    }

    @Override
    public double getModifier() {
        return MODIFIER_STANDARD;
    }
}
