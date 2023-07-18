import java.util.Scanner;

public class Condition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if(n>=10 && n<=50)
        {
            System.out.println("Deepshikha is average Student");
        }else if(n>=51 && n<=80)
        {
            System.out.println("Deepshikha is moderate Student");
        }else if(n>=81 && n<=100){
            System.out.println("Deepshikha is good Student");
        }
        else{
            System.out.println("Deepshikha is best Student");
        }
        
        sc.close();
    }
}