/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.transistor.pkgswitch;

import com.pi4j.io.gpio.RaspiPin;
import java.util.Scanner;

/**
 *
 * @author will
 */
public class SwitchRunner {
    
    public static void main(String[] args) {
        TransistorSwitch mySwitch = new TransistorSwitch(RaspiPin.GPIO_01);
        Scanner userInput = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Enter 'o' to open switch or 'c' to close: ");
            input = userInput.next();
            if (input.equals("o")) {
                mySwitch.open();
            } else if(input.equals("c")) {
                mySwitch.close();
            }
        }
    }    
}
