import java.util.Scanner;

public class Calculadora {

        public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
            
         int opcion=0 ;
         int num1=0;
         int num2=0;
         
          float total=0.0f;
          System.out.println("operaciones aritmeticas ");
          System.out.println("1 suma ");
          System.out.println("2 resta ");
          System.out.println("3 multiplicacion ");
          System.out.println("4 division");
          System.out.println(" ");
          System.out.println("teclea la opcion  ");
          opcion = in.nextInt();
          System.out.println("teclea un numero  ");
          num1 = in.nextInt();
          System.out.println("teclea otro numero  ");
          num2 = in.nextInt();
          switch (opcion)
          {
                case 1:
                    total = num1 + num2;
                    break; 
                case 2: 
                    total = num1 - num2;
                    break;
                case 3:
                    total = num1 * num2;
                    break;
                case 4:
                    total =(float)num1/(float)num2;
           break;
          }
          System.out.println("El resultado es: " + total);
    }
}
