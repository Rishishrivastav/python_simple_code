import java.util.Scanner;
public class pattern {
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("enter the number first no:");
        int a=n.nextInt();
        System.out.println("enter the number first no:");
        int b=n.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.println("("+i+","+j+")");

            }
            
            System.out.println();
        }
    }
}
