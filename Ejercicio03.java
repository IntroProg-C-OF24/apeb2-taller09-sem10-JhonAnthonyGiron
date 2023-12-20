package taller08;
public class Ejercicio03 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < promediosCualitativos.length; i++) {
            if (promedios[i]<6) 
                promediosCualitativos[i]= "Regular";
            else if (promedios[i]<9)
                promediosCualitativos[i]= "Bueno";
            else
                promediosCualitativos[i]= "Sobresaliente";
        }
        for (int i = 0; i < promediosCualitativos.length; i++) {
            System.out.printf("%s %s %.1f %s %s\n",estudiantes[i],"promedio:",promedios[i],"Promedio cualitativo:",promediosCualitativos[i]);
        }
    }
}
