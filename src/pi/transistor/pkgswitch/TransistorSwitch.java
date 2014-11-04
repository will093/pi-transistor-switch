/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.transistor.pkgswitch;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;

/**
 *
 * @author will
 */
public class TransistorSwitch {
    
    private boolean closed = false;
    private final GpioController gpio;
    private final GpioPinDigitalOutput pin;    

    public TransistorSwitch(Pin pinNumber) {
        gpio = GpioFactory.getInstance();
        pin = gpio.provisionDigitalOutputPin(pinNumber, "mySwitch", PinState.LOW);
    }
        
    public void open() {
        pin.low();
        closed = false;
    }
    
    public void close() {
        pin.high();
        closed = true;
    }
    
    public void toggle() {
        pin.toggle();
        if (closed == true) {
            closed = false;
        } else if (closed == false) {
            closed = true;
        }
    }   
    
    public boolean isClosed() {
        if (closed == true) {
            return true;
        } else {
            return false;
        }
    }
}
