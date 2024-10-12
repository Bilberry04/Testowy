public class Test {
    public static void main(String[] args){
        //System.out.println("Joł joł");

        int inputNumber = 6;
        int testNumber = 6;

        if(inputNumber > testNumber) {
            System.out.println("Liczba " + inputNumber + " jest większe od liczby " + testNumber);
        }

        else if(inputNumber == testNumber) {
        System.out.print("Liczba " + inputNumber + " jest równa liczbie " + testNumber);

            if(inputNumber % 2 == 0){
                System.out.println(" oraz liczba ta jest parzysta");
            }
            else
            {
                System.out.println(" a liczba ta jest nieparzysta");
            }
        }

        else
        {
            System.out.println("Liczba " + inputNumber + " jest mniejsza od liczby " + testNumber);
        }
    }
}