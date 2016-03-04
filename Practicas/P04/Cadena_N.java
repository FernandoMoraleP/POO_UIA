import java.io.*;

public class Cadena_N {

    public static void main(String[] args) throws IOException {

        int i;
        String teclado;
        String salida;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Introdusca la palabra o frase a rotar :");
        teclado = br.readLine();

        for (i = 0; i <= teclado.length() - 1; i++) {

            teclado = teclado.charAt(teclado.length() - 1) + teclado.substring(0, teclado.length() - 1);
            System.out.println(teclado);
        }

    }
}
