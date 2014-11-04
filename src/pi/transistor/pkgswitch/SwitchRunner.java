/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.transistor.pkgswitch;

import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author will
 */
public class SwitchRunner {
    
    public static void main(String[] args) throws InterruptedException {
        TransistorSwitch mySwitch;
        mySwitch = new TransistorSwitch(RaspiPin.GPIO_01);
        while (true) {
            mySwitch.open();
            Thread.sleep(1000);
            mySwitch.close();
            Thread.sleep(1000);
        }
    }
    
}
