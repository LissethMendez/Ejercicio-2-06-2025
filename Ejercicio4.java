public class Ejercicio4 {
public static void main(String[] args) {
   String frase = "Bienvenido a la informática";
int ultimaPalabra = frase.lastIndexOf(" ");
String nuevaFrase = frase.substring(0, ultimaPalabra);
System.out.println(nuevaFrase);
}
}


