//this  class is abstract and the methods will implemented in a 
//child class! 
package pro;
abstract public class  money{ 
private final  double lmoney=1.0;
   public double to_usd(double x)
   {
       return lmoney*x;
   }
   
   public double to_me(double x)
   {
       return x/lmoney;
   }
   
}

//***************************************************
class etb extends money{
    private final double lmoney=0.023;
    public double to_usd(double x) {
return lmoney*x;
    }
    
    public double to_me(double x)
   {
       return x/lmoney;
   }
   
} 

//********************************************************
class usd extends money{
    private final  double lmoney=1.0;
    public double to_usd(double x) {
return lmoney*x;
    }
    
     public double to_me(double x)
   {
       return x/lmoney;
   }
   
}
    

//*************************************************
class rupee extends money{
    private final  double lmoney=0.014;
    public double to_usd(double x) {
return lmoney*x;
    }
    
   public double to_me(double x)
   {
       return x/lmoney;
   }
   
}
//*************************************************
class pound extends money{
    private final  double lmoney=1.41;
    public double to_usd(double x) {
return lmoney*x;
    }
    
  public double to_me(double x)
   {
       return x/lmoney;
   }
   
}
//*********************************************************
//*************************************************
class euro extends money{
    private final  double lmoney=1.21;
    public double to_usd(double x) {
return lmoney*x;
    }
    
  public double to_me(double x)
   {
       return x/lmoney;
   }
   
}
//*************************************************
class yuan extends money{
    private final  double lmoney=0.16;
    public double to_usd(double x) {
return lmoney*x;
    }
    
  public double to_me(double x)
   {
       return x/lmoney;
   }
   
}
//+++++++++++++++++++++++++++++++++++++++++++++++++****
//****************************************************