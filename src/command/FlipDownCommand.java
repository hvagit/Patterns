/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Henrik
 */
/* The Command for turning off the light - ConcreteCommand #2 */
// Kunne være et request til nogle MF-operationer.
public class FlipDownCommand implements Command {
   private Light theLight;
 
   public FlipDownCommand(Light light) {
      this.theLight = light;
   }
 
   public void execute() {
      theLight.turnOff();
   }
}