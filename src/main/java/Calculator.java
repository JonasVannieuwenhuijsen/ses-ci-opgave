
public class Calculator {

    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = 0;

        c = a + b;

        System.out.println("Resultaat is: " + c);
    }

}
