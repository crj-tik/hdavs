package com.parent.hdavs.test;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPin;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinDirection;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.trigger.GpioCallbackTrigger;
import com.pi4j.io.gpio.trigger.GpioPulseStateTrigger;
import com.pi4j.io.gpio.trigger.GpioSetStateTrigger;
import com.pi4j.io.gpio.trigger.GpioSyncStateTrigger;
import com.pi4j.io.gpio.event.GpioPinListener;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import com.pi4j.io.gpio.event.PinEventType;

/**
 * @Author CRJ
 * @Date 2022.04.25/2022/4/25
 **/


public class MyLed3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("<--Pi4J--> GPIO Control Example ... started.");

        int x = 100;
        // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();
        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin0 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED0", PinState.HIGH);
        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED1", PinState.HIGH);
        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "MyLED2", PinState.HIGH);

        // set shutdown state for this pin
        pin0.setShutdownOptions(true, PinState.LOW);
        // set shutdown state for this pin
        pin1.setShutdownOptions(true, PinState.LOW);
        // set shutdown state for this pin
        pin2.setShutdownOptions(true, PinState.LOW);

        while (x-- > 0){
            pin0.toggle();
            Thread.sleep(1000);
            pin1.toggle();
            Thread.sleep(1000);
            pin2.toggle();
            Thread.sleep(1000);
        }
        gpio.shutdown();
        System.out.println("Exiting ControlGpioExample");

    }

}
