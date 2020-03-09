package StrategyPattern;

public class ContextQuery {
    private Calculator strategy;
    public ContextQuery(Calculator strategy)
    {
        this.strategy=strategy;
    }
    public float execute(float a,float b)
    {
        return strategy.calculation(a,b);
    }
}
