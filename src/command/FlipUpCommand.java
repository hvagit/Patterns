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
/* The Command for turning on the light - ConcreteCommand #1 */
// Kunne være et request til nogle MF-operationer.
public class FlipUpCommand implements Command {
   private Light theLight;
 
   public FlipUpCommand(Light light) {
      this.theLight = light;
   }
 
   public void execute(){
      theLight.turnOn();
   }
}