package taller08;
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadEst = 28;
        double mayorNota, menorNota, promedioClase = 0;
        double promedioEst[] = new double[cantidadEst];
        System.out.println("Promedios Estudiantes: ");
        for (int i = 0; i < promedioEst.length; i++){
            promedioEst[i] = (double) (Math.random() * (9 - 0 + 1) + 0);
            System.out.printf("%s%d%s %.2f\n","Estudiante [",(i+1),"] promedio de:",promedioEst[i]);
        }
        for (int i = 0; i < promedioEst.length; i++)
            promedioClase=promedioClase+promedioEst[i];
        promedioClase=promedioClase/promedioEst.length;
        System.out.printf("%s %.2f\n","Promedio del paralelo C:",promedioClase);
        System.out.println("Lista estudiantes con notas por encima del promedio: ");
        for (int i = 0; i < promedioEst.length; i++)
            if (promedioEst[i]>promedioClase) 
                System.out.printf("%s%d%s %.2f\n","El estudiante [",(i+1),"] con un promedio de:",promedioEst[i]);
        System.out.println("Lista estudiantes con notas por debajo del promedio: ");
        for (int i = 0; i < promedioEst.length; i++)
            if (promedioEst[i]<promedioClase) 
                System.out.printf("%s%d%s %.2f\n","El estudiante [",(i+1),"] con un promedio de:",promedioEst[i]);
        mayorNota = promedioEst[0];
        menorNota = promedioEst[0];
        for (int i = 0; i < promedioEst.length; i++) {
            if (promedioEst[i] > mayorNota) 
                mayorNota = promedioEst[i];
            else{ 
                if (promedioEst[i] < menorNota) 
                menorNota = promedioEst[i];
            }
        }
        System.out.printf("La mayor nota es: %.2f\n", mayorNota);
        System.out.printf("La menor nota es: %.2f\n", menorNota);
    }
}
