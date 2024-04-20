package org.example;
import static java.lang.Math.sin;

//задание 4.2.2
public class Function_2 implements FunctionOfArgument
{
    private double begin;
    private double end;
    private double a;
    private double b;

    public Function_2(double begin, double end, double a, double b) {
        this.begin = begin;
        this.end = end;
        this.a = a;
        this.b = b;
    }

    @Override
    public double theFunctionResult(double x)
    {
        if(x < begin || x > end)
        {
            throw new IllegalArgumentException();
        }
        return a * sin(b * x);
    }

    @Override
    public double beginOfInterval()
    {
        return begin;
    }

    @Override
    public double endOfInterval()
    {
        return end;
    }
}
