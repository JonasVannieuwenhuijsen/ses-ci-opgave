
public class Calculator {

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 0;

        c = bereken(a,b);

        System.out.println("Resultaat is: " + c);
    }

    public static int bereken(int a, int b) {
        int result = a + b;
        return result;
    }

}
