import java.io.*;

class MovieTheatre

{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

System.out.println("Enter total no of attendees");

int n=sc.nextInt();

System.out.println("Total Income: "+((5*n)-(20+(0.5*n))));

}

}