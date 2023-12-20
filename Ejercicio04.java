package taller08;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String[] estudiantes={"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera=true;
        while (bandera){
            System.out.printf("%s\n","ingrese una letra");
            inicial=entrada.nextLine();
            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i].startsWith(inicial.toUpperCase())){
                    System.out.printf("%s %s %s %s\n","La inicial coincide con la inicial",inicial,"del estudiante",estudiantes[i]);
                    i=estudiantes.length;
                    bandera=false;
                }         
            }
            if (bandera){
                System.out.printf("%s\n","No se encontraron coincidencias");
                bandera=false;
            }
        }
    }
}
