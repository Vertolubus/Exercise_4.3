package org.example;

//задание 4.2.2
public class Function_4 implements FunctionOfArgument
{
    private double begin;
    private double end;
    private double a;
    private double b;

    public Function_4(double begin, double end, double a, double b) {
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
        return a * Math.exp(x) + b;
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
