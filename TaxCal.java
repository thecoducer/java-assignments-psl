import java.util.*;
public class TaxCal{

static double calTax(int gp){
 double res;
if(gp<=240){
   return 0;
     }
else if(gp>240 && gp<480){
   res=(gp*15)/100;
   return res;
  }
  else{
       res=(gp*28)/100;
       return res;
  }
}
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int gp=sc.nextInt();
 System.out.print(calTax(gp));
}
}