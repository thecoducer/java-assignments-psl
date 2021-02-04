import java.util.Scanner;
class CalIntrst{

static double calInterest(int amt){
        double interest;
  if(amt<=1000){
    interest=(amt*4*1)/100;
      return interest;
        }
   else if(amt>1000 && amt<=5000){
              interest=(amt*4.5*1)/100;
      return interest;
        }
  else{
        interest=(amt*5*1)/100;
      return interest;
         }
     
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int amt=sc.nextInt();
System.out.print(calInterest(amt));
}
}