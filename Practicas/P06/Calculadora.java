import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        int pripar;
        int segpar;
        float Total = 0.0f;
        do {
            System.out.println("Operaciones aritmeticas \n");
            System.out.println("1.- Suma ");
            System.out.println("2.- Resta ");
            System.out.println("3.- Multiplicacion ");
            System.out.println("4,- Division");
            System.out.println("0.- Salir ");
            System.out.println("Elija una operacion");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Teclea el primer numero");
                    pripar = in.nextInt();
                    System.out.println("Teclea el segundo numero");
                    segpar = in.nextInt();
                    Total = pripar + segpar;
                    break;
                case 2:
                    System.out.println("Teclea el primer numero");
                    pripar = in.nextInt();
                    System.out.println("Teclea el segundo numero");
                    segpar = in.nextInt();
                    Total = pripar - segpar;
                    break;
                case 3:
                    System.out.println("Teclea el primer numero");
                    pripar = in.nextInt();
                    System.out.println("Teclea el segundo numero");
                    segpar = in.nextInt();
                    Total = pripar * segpar;
                    break;
                case 4:
                   System.out.println("Teclea el primer numero");
                    pripar = in.nextInt();
                    System.out.println("Teclea el segundo numero");
                    segpar = in.nextInt();
                    Total = (float) pripar / (float) segpar;
                    break;
                case 0:
                    break;
            }
            System.out.println("El resultado es: " + Total + "\n\n");
        } while (opcion != 0);

    }

}