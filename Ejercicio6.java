public class Ejercicio6 {
public static void main(String[] args) {
String palabra = "luna";
palabra = palabra.toLowerCase();
String invertida = "";

for (int i = palabra.length() - 1; i >= 0; i--) {
    invertida += palabra.charAt(i);
}

if (palabra.equals(invertida)) {
    System.out.println( palabra +" :Se lee igual al reves");
} else {
    System.out.println(palabra + " :No se lee igual al reves");
}
}

}
