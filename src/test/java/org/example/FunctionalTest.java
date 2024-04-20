package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionalTest {

    @Test
    public void theFunctionalResult()
    {
        FunctionOfArgument f1 = new Function_1(-2, 5, 2, 2);
        FunctionOfArgument f2 = new Function_3(0, 5, 1, 1, 2, 2);

        Functional ff1 = new Functional_1();

        assertEquals(15, ff1.theFunctionalResult(f1), 0.01);
        assertEquals(1.5, ff1.theFunctionalResult(f2), 0.01);

        Functional ff2 = new Functional_2(0, 10, 0.01);

        FunctionOfArgument f3 = new Function_1(0, 10, 1, 1);
        FunctionOfArgument f4 = new Function_3(0, 10, 1, 1, 2, 2);
        FunctionOfArgument f6 = new Function_2(0, 10, 2, 3);

        assertEquals(60, ff2.theFunctionalResult(f3), 0.01);
        assertEquals(5, ff2.theFunctionalResult(f4), 0.01);
        assertEquals(0.56, ff2.theFunctionalResult(f6), 0.01);

        FunctionOfArgument f5 = new Function_3(0, 9, 1, 1, 2, 2);

        try
        {
            ff2.theFunctionalResult(f5);
        }
        catch(Exception exception)
        {
            System.out.println("выход за пределы");
        }
    }
}