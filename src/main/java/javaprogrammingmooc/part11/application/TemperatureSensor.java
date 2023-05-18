package javaprogrammingmooc.part11.application;

import java.util.Random;
public class TemperatureSensor implements Sensor {
    private boolean onOrOff;
    private int value;
    public TemperatureSensor() {
        this.onOrOff = false;
    }
    public boolean isOn() {
        return onOrOff;
    }
    public void setOn() {
        this.onOrOff = true;
    }
    public void setOff() {
        this.onOrOff = false;
    }
    public int read() {
        if (onOrOff) {
            return new Random().nextInt(61) - 30;
        } else {
            throw new IllegalStateException("Sensor is off!");
        }
    }

}
