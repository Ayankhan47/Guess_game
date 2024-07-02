import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        int n,noofguess = 10;
        Scanner sc = new Scanner(System.in);
        int guess = (int)(Math.random()*100)+1;
        do{
            System.out.println("guess the number btw 1-100 : ");
            n = sc.nextInt();
            if(n==guess){
                System.out.println("WINNER !!!!!!");
                break;
            }
            if(--noofguess==0){
                System.out.println("bade bahi aap haar gaye!!!");
                System.out.println("Answer is : " + guess)
                break;
            }if(guess>n){
                System.out.println("think bigger !!!");
            }else{
                System.out.println("think smaller !!!");
            }
        }while(true);
    }
}