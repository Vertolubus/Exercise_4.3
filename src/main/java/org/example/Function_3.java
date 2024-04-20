package org.example;

//задание 4.2.2
public class Function_3 implements FunctionOfArgument
{
    private double begin;
    private double end;
    private double a;
    private double b;
    private double c;
    private double d;

    public Function_3(double begin, double end, double a, double b, double c, double d) {
        this.begin = begin;
        this.end = end;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double theFunctionResult(double x)
    {
        if(x < begin || x > end)
        {
            throw new IllegalArgumentException();
        }
        if(c * x + d == 0)
        {
            throw new IllegalArgumentException();
        }
        return (a * x + b) / (c * x + d);
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
