import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Base: ");
        int base=sc.nextInt();
        
        System.out.print("Power: ");
        int power=sc.nextInt();
        
        int x=1,answer=1;
        
        while(x<=power)
        {
            answer=base*answer;
            x++;
        }
        System.out.println("Answer: "+answer);
        
    }
    
}
