/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command2;

/**
 *
 * @author Henrik
 */
public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock abcStock = new Stock();

      // Vi laver to commands.
      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);

      // Vi sender de to commands til en broker.
      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      // Noget tid senere udfører broker de tilsendte commands.
      // Bemærk, at command-listen ryddes, når de forskellige commands er udført.
      broker.placeOrders();
   }
}