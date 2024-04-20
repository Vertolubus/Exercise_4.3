package org.example;

//задание 4.2.4
public class Functional_2 <T extends FunctionOfArgument> implements Functional<T>
{
    private double begin;
    private double end;
    private double eps;

    public Functional_2(double begin, double end, double eps) {
        this.begin = begin;
        this.end = end;
        this.eps = eps;
    }

    @Override
    public double theFunctionalResult(T f)
    {
        if(begin < f.beginOfInterval() || end > f.endOfInterval())
        {
            throw new IllegalArgumentException();
        }

        double res = 0;
        double res1;
        double n = 2;
        double step;
        do
        {
            res1 = res;
            step = (end - begin) / n;
            res = 0;
            for (double i = 0; i < n; i++)
            {
                res+= step * f.theFunctionResult(end - i * step);
            }
            n *= 2;
        }
        while (Math.abs(res - res1) > eps);
        return res;
    }

    public void setBegin(double begin) {
        this.begin = begin;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public void setEps(double eps) {
        this.eps = eps;
    }
}
