import java.util.Scanner;

public class App {
    
    public static int rng(int hard){
        int i = (int)(Math.random()*hard);
        return i;
    }

    public static int rules(){
        System.out.print("We created a number between a range \nTry to guess the number.\nInput -1 to exit\n");
        System.out.println("Select your difficulty");
        System.out.println("1. Very Easy (0-10)\n2. Easy (0-100)\n3. Medium (0-1000)\n4. Hard (0-10000)");
        System.out.println("Start!!!");
        while(true){
        int dif = input();
            switch(dif){
                case 1:return 10;
                case 2:return 100;
                case 3:return 1000;
                case 4:return 10000;
                default:System.out.println("Wrong input");
            }
        }
        
    }

    public static void guess(int rng){
       int g;
        do{
            System.out.print("Guess : ");
            g = input();
            if(g==-1)
            {
                break;
            }
            if(g>rng)
            {System.out.println("your number is greater");}
            else if (g<rng)
            {System.out.println("your number is smaller");}
        }while (g!=rng);

        if (g==-1)
        {System.out.println("You lose");}
        else
        {System.out.println("You Win !!!");}
        
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        return guess;
        
    }

    public static void main(String[] args) {
        int diff = rules();
        int rn = rng(diff);
        guess(rn);
        
    }
}
