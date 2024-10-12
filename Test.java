import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        //System.out.println("Joł joł");

       Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w programie ");

       System.out.println("Podaj liczbę: ");
        int inputNumber1 = scanner.nextInt();

        if(inputNumber1 %2==0){
            System.out.println("Liczba jest parzysta");
        }
        else
        {
            System.out.println("Liczba jest nieparzysta");
        }


    }

}