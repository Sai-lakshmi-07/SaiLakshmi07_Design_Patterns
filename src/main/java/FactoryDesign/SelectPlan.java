package FactoryDesign;

public class SelectPlan {
    public Plan getPlan(String PlanType)
    {
        if(PlanType==null)
        {
            return null;
        }
        if(PlanType.equals("Industrial")){
            return new Industrial();
        }
        else if(PlanType.equals("Institutional")){
            return new Institutional();
        }
        else if(PlanType.equals("Domestic")){
            return new Domestic();
        }
        return null;
    }
}
