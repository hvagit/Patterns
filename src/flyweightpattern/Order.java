/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpattern;

/**
 *
 * @author Henrik
 */

// Ordrer har vi masser af
// Ligesom der er en slags begrænsning på flavours, burde der også være begrænsning på bordnr.
class Order {
  private final int tableNumber;
  private final CoffeeFlavour flavour;
 
  Order(int tableNumber, CoffeeFlavour flavor) {
    this.tableNumber = tableNumber;
    this.flavour = flavor;
  }
 
  void serve() {
    System.out.println("Serving " + flavour + " to table " + tableNumber);
  }
}
 