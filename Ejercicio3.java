public class Ejercicio3 {
public static void main(String[] args) {
   String frase = "ejercicio de prueba";
String[] palabras = frase.split(" ");
String resultado = "";

for (String palabra : palabras) {
    if (!palabra.isEmpty()) {
        resultado += palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase() + " ";
    }
}
System.out.println(resultado.trim());
  }

}

