
package ch4ex11;
import java.util.Scanner;
public class Ch4Ex11 {

     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int b,p,f;
        double cost,tax,holder,change;
        
        System.out.println("Please enter the number of burgers:");
            b=input.nextInt();
        System.out.println("Please enter the number of fries:");
            f=input.nextInt();
        System.out.println("Please enter the number of cans of pop:");
            p=input.nextInt();
        
        
        cost=(b*1.69)+(f*1.09)+(p*0.99);
        
        System.out.format("Total before tax:%.2f",cost);
            holder=cost*0.13;
        System.out.format("\nTax:%.2f",holder);
            holder=cost+cost*0.13;
        System.out.format("\nTotal after tax:%.2f\n",holder);
        
        
        System.out.println("Enter amount tendered:");
            change=input.nextDouble();
            holder=change-cost;
        System.out.format("Change due: %.2f",holder);
    }
    
}
