package javaprogrammingmooc.part11.validatingParameters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testValidNameAndAgeToCreatePersonObject() {
        String name = "Lisa Doe";
        int age = 30;
        Person person = new Person(name, age);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        Assertions.assertEquals(name, person.getName());
        Assertions.assertEquals(age, person.getAge());
    }
    @Test
    public void testEmptyNameToThrowIllegalArgument() {
        String name = "";
        int age = 30;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Person(name, age);
        });
        System.out.println("Empty name");
    }
    @Test
    public void testNegativeAgeToThrowIllegalArgument() {
        String name = "Brian Robinson";
        int age = -5;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Person(name, age);
        });
        System.out.println("Negative age");
    }
}