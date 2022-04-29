package com.parent.hdavs.test;
import com.pi4j.io.gpio.*;
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

        int x = 10;
        // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();
        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin0 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED0", PinState.HIGH);
        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED1", PinState.HIGH);
        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "MyLED2", PinState.HIGH);
        final GpioPinDigitalInput pin3 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_03,"MyIn");
        // set shutdown state for this pin
        pin0.setShutdownOptions(true, PinState.LOW);
        // set shutdown state for this pin
        pin1.setShutdownOptions(true, PinState.LOW);
        // set shutdown state for this pin
        pin2.setShutdownOptions(true, PinState.LOW);


        final GpioPinPwmOutput pin4 = gpio.provisionPwmOutputPin(RaspiPin.GPIO_04);
        pin4.getPwm();



        while (x-- > 0){
            pin0.low();
            pin1.low();
            pin2.low();
            System.out.println("pin012: 000---"+pin0.toString()+"-"+pin0+"-"+pin0.toString());
            Thread.sleep(10000);
            pin0.low();
            pin1.low();
            pin2.high();
            System.out.println("pin012: 001---"+pin0.toString()+"-"+pin0.toString()+"-"+pin0.toString());
            Thread.sleep(10000);
            pin0.low();
            pin1.high();
            pin2.low();
            System.out.println("pin012: 010---"+pin0.toString()+"-"+pin0.toString()+"-"+pin0.toString());
            Thread.sleep(10000);
            pin0.high();
            pin1.low();
            pin2.low();
            System.out.println("pin012: 100---"+pin0.toString()+"-"+pin0.toString()+"-"+pin0.toString());
            Thread.sleep(10000);
            pin0.high();
            pin1.low();
            pin2.high();
            System.out.println("pin012: 101---"+pin0.toString()+"-"+pin0.toString()+"-"+pin0.toString());
            Thread.sleep(10000);
            pin0.high();
            pin1.high();
            pin2.low();
            System.out.println("pin012: 110---"+pin0.toString()+"-"+pin0.toString()+"-"+pin0.toString());
            Thread.sleep(10000);
            pin0.high();
            pin1.high();
            pin2.high();
            System.out.println("pin012: 111---"+pin0.toString()+"-"+pin0.toString()+"-"+pin0.toString());
            Thread.sleep(10000);
        }
        gpio.shutdown();
        System.out.println("Exiting ControlGpioExample");

    }

}
