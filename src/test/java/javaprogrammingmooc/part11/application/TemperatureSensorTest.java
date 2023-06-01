package javaprogrammingmooc.part11.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureSensorTest {

    @Test
    public void testReadOnReturnsValidTemp() {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.setOn();

        int reading = sensor.read();
        Assertions.assertTrue(reading >= -30 && reading <= 30);

        System.out.println("Temperature reads: " + reading);
    }

    @Test
    public void testReadOffThrowsIllegalException() {
        TemperatureSensor sensor = new TemperatureSensor();

        Assertions.assertThrows(IllegalStateException.class, () -> {
            sensor.read();
        });
        System.out.println("Sensor is off");
    }

    @Test
    public void testIsOnReturnsTrue() {
        TemperatureSensor sensor = new TemperatureSensor();

        Assertions.assertFalse(sensor.isOn());
        sensor.setOn();
        Assertions.assertTrue(sensor.isOn());

        System.out.println("Sensor is on: " + sensor.isOn());

}
}