package com.dojo.javapatterns.factory.food.without_pattern;

import com.dojo.javapatterns.factory.food.ItalianFood;
import com.dojo.javapatterns.factory.food.JapaneseFood;
import com.dojo.javapatterns.factory.food.MexicanFood;
import com.dojo.javapatterns.factory.food.PeruvianFood;

import java.util.List;

public class Restaurant {

    public static void main (String... args) {
        System.out.println("*** Restaurant opened! Our menu for today is ***\n");

        ItalianFood italianFood = new ItalianFood();
        List<String> italianDishes = italianFood.listDishes();
        System.out.println("\nItalian dishes: ");
        italianDishes.forEach(dish -> System.out.println("- " + dish));

        JapaneseFood japaneseFood = new JapaneseFood();
        List<String> japaneseDishes = japaneseFood.listDishes();
        System.out.println("\nJapanese dishes: ");
        japaneseDishes.forEach(dish -> System.out.println("- " + dish));

        MexicanFood mexicanFood = new MexicanFood();
        List<String> mexicanDishes = mexicanFood.listDishes();
        System.out.println("\nMexican dishes: ");
        mexicanDishes.forEach(dish -> System.out.println("- " + dish));

        PeruvianFood peruvianFood = new PeruvianFood();
        List<String> peruvianDishes = peruvianFood.listDishes();
        System.out.println("\nPeruvian dishes: ");
        peruvianDishes.forEach(dish -> System.out.println("- " + dish));

        System.out.println("\n*** Clients just ordered ***\n");

        int italianDishIndex = (int) (Math.random() * italianDishes.size());
        italianFood.buyIngredients(italianDishes.get(italianDishIndex));
        italianFood.cook(italianDishes.get(italianDishIndex));
        System.out.println("\n");

        int japaneseDishIndex = (int) (Math.random() * japaneseDishes.size());
        japaneseFood.buyIngredients(japaneseDishes.get(japaneseDishIndex));
        japaneseFood.cook(japaneseDishes.get(japaneseDishIndex));
        System.out.println("\n");

        int mexicanDishIndex = (int) (Math.random() * mexicanDishes.size());
        mexicanFood.buyIngredients(mexicanDishes.get(mexicanDishIndex));
        mexicanFood.cook(mexicanDishes.get(mexicanDishIndex));
        System.out.println("\n");

        int peruvianDishIndex = (int) (Math.random() * peruvianDishes.size());
        peruvianFood.buyIngredients(peruvianDishes.get(peruvianDishIndex));
        peruvianFood.cook(peruvianDishes.get(peruvianDishIndex));
        System.out.println("\n");
    }
}
