package taller08;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numeroMarcas;
        System.out.printf("%s ","Ingrese el numero de marcas que desea ingresar:");
        numeroMarcas=scanner.nextInt();
        String marcas[]=new String[numeroMarcas];
        for (int i = 0; i < marcas.length; i++) {
            System.out.printf("%s %d%s","Ingrese la marca",(i+1),": ");
            String marca=scanner.next();
            if (marca.toUpperCase().startsWith("A")||marca.toUpperCase().startsWith("C")||marca.toUpperCase().startsWith("T")){
                System.out.printf("%s %s %s\n","La marca",marca,"no cumple");
                i--;
            }else
                marcas[i]=marca;   
        }
        System.out.println("-------Marcas Ingresadas-------");
        for (int i = 0; i < marcas.length; i++) 
            System.out.printf("%s %d %s %s\n","La marca",(i+1),"es: ", marcas[i]); 
    }
}