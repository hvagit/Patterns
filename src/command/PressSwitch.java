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
/* The Command interface */
/* The test class or client */

// Kunne være kald fra en java server.
public class PressSwitch {
    
    static String on = "ON";
    static String off = "OFF";

   public static void main(String args[]){
        press(on);
        press(on);
        press(off);
   }    
   
   public static void press(String arg){
      Light lamp = new Light();
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);
 
      Switch mySwitch = new Switch();
 
      switch(arg) {
         case "ON":
            mySwitch.storeAndExecute(switchUp);
         break;
         case "OFF":
            mySwitch.storeAndExecute(switchDown);
         break;
         default:
            System.out.println("Argument \"ON\" or \"OFF\" is required.");
       }
   }
}