package javaprogrammingmooc.part11.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StandardSensorTest {

    @Test
    public void testReadMatchesInitialValue() {
        int value = 10;
        StandardSensor sensor = new StandardSensor(value);

        int reading = sensor.read();
        Assertions.assertEquals(value, reading);

        System.out.println("Reading: " + reading);
    }

    @Test
    public void testIsOnReturnsTrue() {
        StandardSensor sensor = new StandardSensor(0);
        Assertions.assertTrue(sensor.isOn());
        System.out.println("Sensor is on: " + sensor.isOn());
    }

    @Test
    public void testSetOnAndOffAlwaysOnReturnsTrue() {
        StandardSensor sensor = new StandardSensor(0);

        sensor.setOn();
        sensor.setOff();
        Assertions.assertTrue(sensor.isOn());

        System.out.println("Sensor is on: " + sensor.isOn());
    }
}
