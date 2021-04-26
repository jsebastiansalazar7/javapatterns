package com.dojo.javapatterns.factory.food.with_pattern;

import com.dojo.javapatterns.factory.food.*;
import com.dojo.javapatterns.factory.food.with_pattern.enums.FoodTypeEnum;

import java.util.List;

public class Restaurant {

    public static void main (String... args) {
        System.out.println("*** Restaurant opened! Our menu for today is ***\n");

        Food italianFood = FoodFactory.getFood(FoodTypeEnum.ITALIAN);
        List<String> italianDishes = listDishes(italianFood, FoodTypeEnum.ITALIAN);

        Food japaneseFood = FoodFactory.getFood(FoodTypeEnum.JAPANESE);
        List<String> japaneseDishes = listDishes(japaneseFood, FoodTypeEnum.JAPANESE);

        Food mexicanFood = FoodFactory.getFood(FoodTypeEnum.MEXICAN);
        List<String> mexicanDishes = listDishes(mexicanFood, FoodTypeEnum.MEXICAN);

        Food peruvianFood = FoodFactory.getFood(FoodTypeEnum.PERUVIAN);
        List<String> peruvianDishes = listDishes(peruvianFood, FoodTypeEnum.PERUVIAN);

        System.out.println("\n*** Clients just ordered ***\n");

        buyIngredientsAndPrepareDish(italianFood, italianDishes);
        buyIngredientsAndPrepareDish(japaneseFood, japaneseDishes);
        buyIngredientsAndPrepareDish(mexicanFood, mexicanDishes);
        buyIngredientsAndPrepareDish(peruvianFood, peruvianDishes);
    }

    private static List<String> listDishes(Food food, FoodTypeEnum foodType) {
        List<String> dishes = food.listDishes();
        System.out.println("\n" + foodType.getFoodType() + " dishes: ");
        dishes.forEach(dish -> System.out.println("- " + dish));
        return dishes;
    }

    private static void buyIngredientsAndPrepareDish(Food food, List<String> dishes) {
        int italianDishIndex = (int) (Math.random() * dishes.size());
        food.buyIngredients(dishes.get(italianDishIndex));
        food.cook(dishes.get(italianDishIndex));
        System.out.println("\n");
    }
}
