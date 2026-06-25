package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class PrizeStrategy implements ChargingStrategy {
    private int numCustomers = 0;
    private static final double STANDARD_MODIFIER = 1;
    private static final int PRIZE_CUSTOMERS = 1;
    private static final double PRIZE_MODIFIER = 0;


    @Override
    public double cost(List<Meal> order, String payee, List<String> members) {
        numCustomers++;
        if (numCustomers == PRIZE_CUSTOMERS) {
            numCustomers = 0;
            return order.stream().mapToDouble(meal -> meal.getCost() * PRIZE_MODIFIER).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * STANDARD_MODIFIER).sum();
        }
    }

    @Override
    public double getModifier() {
        return STANDARD_MODIFIER;
    }
}
