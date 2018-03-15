package nl.codecentric.mockingexample.example

import mockit.Tested
import org.junit.Test

class CalculatorTest{

    @Tested
    lateinit var calculator: Calculator;

    @Test
    fun name() {
        calculator.getInterest();
    }
}