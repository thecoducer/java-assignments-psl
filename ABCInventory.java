import java.io.*;
abstract class product{
    
    int pid;
    String pname;
    int pslno;
    abstract void display(int pid,String pname,int pslno);
        
    
}
abstract class softProduct extends product{
    //abstract void display(int pid,String pname,int pslno);
   String OS="windows";
   String Memory="150mb";
   String LicenseKey1="456835";
   String LicenseKey2="356865";
}

class MicrosoftOffice extends softProduct{
    void display(int pid,String pname,int pslno){
        this.pid=pid;
        this.pname=pname;
        this.pslno=pslno;
        System.out.println(this.pid);
        System.out.println(this.pname);
        System.out.println(this.pslno);
        System.out.println(super.OS);
        System.out.println(super.LicenseKey1);
    }
}
class Tally extends softProduct{
    
    void display(int pid,String pname,int pslno){
        this.pid=pid;
        this.pname=pname;
        this.pslno=pslno; 
        System.out.println(this.pid);
        System.out.println(this.pname);
        System.out.println(this.pslno);
        System.out.println(super.OS);
        System.out.println(super.LicenseKey2);
    }
}

class ABCInventory {
	public static void main (String[] args) {
	    product p[]=new product[10];
	        p[0]=new MicrosoftOffice();
	        p[1]=new Tally();
	      p[0].display(1,"moffice",100);
	       p[1].display(2,"tally",101);
	 
	}
}