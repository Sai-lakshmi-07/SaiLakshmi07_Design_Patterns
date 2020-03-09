package StrategyPattern;

public class Main {
    public static void main(String[] args)
    {
        ContextQuery query=new ContextQuery(new Add());
        System.out.println("111 + 73 = " + query.execute(111,73));
        query=new ContextQuery(new Subtract());
        System.out.println("111 - 73 = " + query.execute(111,73));
        query=new ContextQuery(new Multiply());
        System.out.println("111 * 73 = " + query.execute(111,73));
        query=new ContextQuery(new Division());
        System.out.println("111 / 73 = " + query.execute(111,73));
    }
}
