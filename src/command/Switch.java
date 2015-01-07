/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henrik
 */
/* The Invoker class */

// Gemmer en hel række af commands og udfører dem efterfølgende.
// Hvorfor skal de forskellige Commands gemmes?
// De skal have tid til at kommunikere med den faktiske enhed - lyset.
// Commands kunne være kald til mainframe...
public class Switch {
   private List<Command> history = new ArrayList<Command>();
 
   public void storeAndExecute(Command cmd) {
      this.history.add(cmd); // optional 
      cmd.execute();
   }
}