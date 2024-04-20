package org.example;

//задание 4.2.4
public class Functional_1 <T extends FunctionOfArgument> implements Functional<T>
{
    @Override
    public double theFunctionalResult(T f)
    {
        return f.theFunctionResult(f.beginOfInterval()) + f.theFunctionResult(f.endOfInterval()) + f.theFunctionResult((f.beginOfInterval() + f.endOfInterval()) / 2);
    }
}
