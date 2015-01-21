/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Henrik
 */
// Extension of a simple coffee without any extra ingredients
public class SimpleCoffee extends Coffee {
    public double getCost() {
        return 1;
    }
 
    public String getIngredients() {
        return "Coffee";
    }
}