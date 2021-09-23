package nl.han.ica.oose.dea.lauren;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    private StringCalculator sut;

    @BeforeEach
    public void setup(){ sut = new StringCalculator();}

    @Test
    void executeWithEmptyStringTest(){
        // Act
        var testValue = sut.sum("");

        // Assert
        Assertions.assertEquals(0, testValue);
    }

    @Test
    void executeWithSingleNumberTest(){
        // Act
        var testValue = sut.sum("1");

        // Assert
        Assertions.assertEquals(1, testValue);
    }

    @Test
    void executeWithMultipleNumbersSeparatedByCommaTest(){
        // Act
        var testValue = sut.sum("1,2");

        // Assert
        Assertions.assertEquals(3, testValue);
    }

    @Test
    void executeWithMultipleNumbersSeparatedByNewLineDelimiterTest(){
        // Act
        var testValue = sut.sum("1\n2");

        // Assert
        Assertions.assertEquals(3, testValue);
    }

    @Test
    void executeWithMultipleNumbersSeparatedByCommaAndNewLineDelimiterTest(){
        // Act
        var testValue = sut.sum("1\n2,3");

        // Assert
        Assertions.assertEquals(6, testValue);
    }

    @Test
    void executeWithMultipleNumbersSeparatedBySpecifiedDelimiterTest(){
        // Act
        var testValue = sut.sum("//;\n1;2");

        // Assert
        Assertions.assertEquals(3, testValue);
    }

    @Test
    void executeWithNumberAbove1000Test(){
        // Act
        var testValue = sut.sum("2,1001");

        // Assert
        Assertions.assertEquals(2, testValue);
    }

    @Test
    void executeWithLongDelimiterTest(){
        // Act
        var testValue = sut.sum("//[***]\n1***2***3");

        // Assert
        Assertions.assertEquals(6, testValue);
    }

    @Test
    void executeWithMultipleDelimitersTest(){
        // Act
        var testValue = sut.sum("//[*][%]\n1*2%3");

        // Assert
        Assertions.assertEquals(6, testValue);
    }
}
