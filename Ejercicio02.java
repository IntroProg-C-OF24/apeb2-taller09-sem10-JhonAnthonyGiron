package taller08;
public class Ejercicio02 {
    public static void main(String[] args) {
        int arreglo[] = new int[]{1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int abajoMedia = 0, arribaMedia = 0;
        double mediaAritmetica, suma=0;
        for (int i = 0; i < arreglo.length; i++) 
            suma=suma+arreglo[i];
        mediaAritmetica = suma/arreglo.length;
        for (int i = 0; i < arreglo.length; i++) 
            if (arreglo[i] > mediaAritmetica)
                arribaMedia++;
            else 
                abajoMedia++;
        System.out.printf("%s %.2f\n ","Media Aritmética: " , mediaAritmetica);
        System.out.printf("%s %d\n","Elementos por encima de la media:" , arribaMedia);
        System.out.printf("%s %d\n","Elementos por debajo de la media: " , abajoMedia);
    }
}