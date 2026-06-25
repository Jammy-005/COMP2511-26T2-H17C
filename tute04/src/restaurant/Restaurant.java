package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.chargingStrategies.*;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardStrategy();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();
    
    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public void setChargingStrategy(String chargingStrategy) {
        this.chargingStrategy = switch (chargingStrategy) {
            case "standard" -> new StandardStrategy();
            case "holiday" -> new HolidayStrategy();
            case "happyHour" -> new HappyHourStrategy();
            case "prize" -> new PrizeStrategy();
            default -> new StandardStrategy();
        };
    }

    public double cost(List<Meal> order, String payee) {
        return chargingStrategy.cost(order, payee, members);
        // return switch (chargingStrategy) {
        //     case "standard" -> order.stream().mapToDouble(meal -> meal.getCost()).sum();
        //     case "holiday" -> order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
        //     case "happyHour" -> {
        //         if (members.contains(payee)) {
        //             yield order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        //         } else {
        //             yield order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        //         }
        //     }
        //     default -> 0;
        // };
    }

    public void displayMenu() {
        double modifier = chargingStrategy.getModifier();
        // switch (chargingStrategy) {
        //     case "standard" -> 1;
        //     case "holiday" -> 1.15;
        //     case "happyHour" -> 0.7;
        //     default -> 0;
        // };

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
    }
}
