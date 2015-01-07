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
// NB: Instances of CoffeeFlavour will be the Flyweights
//...hver flyweight-variant gemmes i menuen.

// Ikke ofte, at der opfindes en ny variant.
class CoffeeFlavour {
  private final String name;
 
  CoffeeFlavour(String newFlavor) {
    this.name = newFlavor;
  }
 
  @Override
  public String toString() {
    return name;
  }
}