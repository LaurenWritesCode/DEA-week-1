package nl.han.ica.oose.dea.testedfizzbuzz;

import nl.han.ica.oose.dea.testedfizzbuzz.Exception.NegativeInputException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    void setup() {
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest() {
        // Arrange

        // Act
        var testValue = sut.execute(37);

        // Assert
        assertEquals("37", testValue);
    }

    @Test
    void executeWithFizzValueTest() {
        // Arrange

        // Act
        var testValue = sut.execute(3);

        // Assert
        assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithBuzzValueTest() {
        // Arrange

        // Act
        var testValue = sut.execute(5);

        // Assert
        assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithFizzBuzzValueTest() {
        // Arrange

        // Act
        var testValue = sut.execute(15);

        // Assert
        assertEquals("FizzBuzz", testValue);
    }

    @Test
    void executeWithNegativeIntTest() {
        // Arrange

        // Assert
        Exception ex = assertThrows(NegativeInputException.class, () -> {
            // Act
            var testValue = sut.execute(-1);
        });

        // Assert
        assertEquals(ex.getMessage(), "Input should be a positive integer");
    }
}
