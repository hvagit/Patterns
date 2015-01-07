/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Henrik
 */
// Menu acts as a factory and cache for CoffeeFlavour flyweight objects
class Menu {
  private Map<String, CoffeeFlavour> flavours = new HashMap<String, CoffeeFlavour>();
 
  // Dynamisk tilføjelse af smagsvarianter.
  // Dermed kan pattern mere end en enum
  CoffeeFlavour lookup(String flavorName) {
    if (!flavours.containsKey(flavorName))
      flavours.put(flavorName, new CoffeeFlavour(flavorName));
    return flavours.get(flavorName);
  }
 
  int totalCoffeeFlavoursMade() {
    return flavours.size();
  }
}