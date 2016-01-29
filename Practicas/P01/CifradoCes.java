
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class CifradoCes {
    
static public BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

public static String LetrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
public static String LetrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

public static int Pos = 3;

public static String Cifrar(String TxT){
	String Cifrado = "";
	for(int n = 0;n<TxT.length();n++){
		if((LetrasMinusculas.indexOf(TxT.charAt(n))!=-1)||(LetrasMayusculas.indexOf(TxT.charAt(n))!=-1))
		Cifrado+=(LetrasMinusculas.indexOf(TxT.charAt(n))!=-1)?LetrasMinusculas.charAt(((LetrasMinusculas.indexOf(TxT.charAt(n)))+Pos)%LetrasMinusculas.length()):LetrasMayusculas.charAt((LetrasMayusculas.indexOf(TxT.charAt(n))+Pos)%LetrasMayusculas.length());
		else
		Cifrado+=TxT.charAt(n);
	}
	return Cifrado;
}

public static String DesCifrar(String TxT){
	String DesCifrado = "";
	for(int n = 0;n<TxT.length();n++){
		if((LetrasMinusculas.indexOf(TxT.charAt(n))!=-1)||(LetrasMayusculas.indexOf(TxT.charAt(n))!=-1))
		DesCifrado+=(LetrasMinusculas.indexOf(TxT.charAt(n))!=-1)?LetrasMinusculas.charAt((LetrasMinusculas.indexOf(TxT.charAt(n))-Pos)%LetrasMinusculas.length()):LetrasMayusculas.charAt((LetrasMayusculas.indexOf(TxT.charAt(n))-Pos)%LetrasMayusculas.length());
		else
		DesCifrado+=TxT.charAt(n);
	}
	return DesCifrado;
}

public static void main(String[] args) {
    try {
        String texto1;
        System.out.println("Intrudusca el texto que desea Cifrar: ");
        texto1 =  teclado.readLine();
        String textoENC = Cifrar(texto1);
        System.out.println("El texto cifrado es: "+ textoENC);

        String texto2;
        System.out.println("Intrudusca el texto que desea Descifrar: ");
        texto2 =  teclado.readLine();
        String textoDES = DesCifrar(texto2);
        System.out.println("El texto descifrado es: "+ textoDES);            
    }
    catch (Exception e){
        System.out.print(e.getMessage());
    }
}
    


}
