package javaprogrammingmooc.part11.application;

import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {
        for (Sensor sensor: sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor: sensors) {
            sensor.setOff();
        }
    }
    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("the Sensor is off, or no sensors have been added!");
        }
        int reading = this.sensors.stream().map(Sensor::read).reduce(0, Integer::sum) / this.sensors.size();
        this.readings.add(reading);
        return reading;
    }
    public List<Integer> readings() {
        return this.readings;
    }
}
