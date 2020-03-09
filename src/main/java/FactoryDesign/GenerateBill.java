package FactoryDesign;
import java.util.*;

public class GenerateBill {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Plan for which bill is to be generated :\n");
        String plan=sc.next();
        System.out.print("Enter the number of units for Plan : ");
        int unit=sc.nextInt();
        SelectPlan sp=new SelectPlan();
        Plan res_plan=sp.getPlan(plan);
        double r = res_plan.getRate();
        System.out.print("Total Bill amount : ");
        System.out.print(r*unit);

    }
}
