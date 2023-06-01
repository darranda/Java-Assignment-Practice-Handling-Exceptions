package javaprogrammingmooc.part11.application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AverageSensorTest {
    @Test
    public void testReadThrowsExceptionWhenSensorOff() {
        AverageSensor averageSensor = new AverageSensor();
        FakeSensor sensor1 = new FakeSensor();
        FakeSensor sensor2 = new FakeSensor();
        averageSensor.addSensor(sensor1);
        averageSensor.addSensor(sensor2);

        //both sensors off
        sensor1.setOff();
        sensor2.setOff();

        Assertions.assertThrows(IllegalStateException.class, averageSensor::read);
        try {
            averageSensor.read();
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // fake sensor for testing
    private static class FakeSensor implements Sensor {
        private boolean on;
        private int returnValue;

        public FakeSensor() {
            this.on = true;
        }

        public void setReturnValue(int returnValue) {
            this.returnValue = returnValue;
        }

        public void setOff() {
            this.on = false;
        }

        @Override
        public boolean isOn() {
            return on;
        }

        @Override
        public void setOn() {
            this.on = true;
        }

        @Override
        public int read() {
            return returnValue;
        }
    }
}
