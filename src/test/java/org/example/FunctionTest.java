package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void theFunctionResultTest()
    {
        FunctionOfArgument f1 = new Function_1(-2, 5, 2, 2);
        assertEquals(4, f1.theFunctionResult(1), 0.01);
        try
        {
            f1.theFunctionResult(6);
        }
        catch (Exception exception)
        {
            System.out.println("Выход за границу");
        }

        FunctionOfArgument f2 = new Function_2(0, 10, 1, 3.14);
        assertEquals(0, f2.theFunctionResult(1), 0.01);
        try
        {
            f2.theFunctionResult(11);
        }
        catch (Exception exception)
        {
            System.out.println("Выход за границу");
        }

        FunctionOfArgument f3 = new Function_3(0, 10, 1, 3, 2, 1);
        assertEquals(1, f3.theFunctionResult(2), 0.01);
        try
        {
            f3.theFunctionResult(11);
        }
        catch (Exception exception)
        {
            System.out.println("Выход за границу");
        }
        try
        {
            f3.theFunctionResult(-0.5);
        }
        catch (Exception exception)
        {
            System.out.println("Знаменатель равен 0");
        }

        FunctionOfArgument f4 = new Function_4(0, 10, 1, 1);
        assertEquals(3.71, f4.theFunctionResult(1), 0.01);
        try
        {
            f4.theFunctionResult(11);
        }
        catch (Exception exception)
        {
            System.out.println("Выход за границу");
        }
    }

    @Test
    public void beginOfIntervalTest()
    {
        FunctionOfArgument f1 = new Function_1(-2, 5, 2, 2);
        FunctionOfArgument f2 = new Function_2(0, 10, 1, 3.14);
        FunctionOfArgument f3 = new Function_3(5, 10, 1, 3, 2, 1);
        FunctionOfArgument f4 = new Function_4(-1, 10, 1, 1);
        assertEquals(-2, f1.beginOfInterval(), 0.01);
        assertEquals(0, f2.beginOfInterval(), 0.01);
        assertEquals(5, f3.beginOfInterval(), 0.01);
        assertEquals(-1, f4.beginOfInterval(), 0.01);
    }

    @Test
    public void endOfInterval()
    {
        FunctionOfArgument f1 = new Function_1(-2, 5, 2, 2);
        FunctionOfArgument f2 = new Function_2(0, 10, 1, 3.14);
        FunctionOfArgument f3 = new Function_3(5, 19, 1, 3, 2, 1);
        FunctionOfArgument f4 = new Function_4(-1, 0, 1, 1);
        assertEquals(5, f1.endOfInterval(), 0.01);
        assertEquals(10, f2.endOfInterval(), 0.01);
        assertEquals(19, f3.endOfInterval(), 0.01);
        assertEquals(0, f4.endOfInterval(), 0.01);
    }
}