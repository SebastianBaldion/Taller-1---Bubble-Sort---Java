
package taller1.bubble.sort;

/**
 * 
 * @author Sebastian Baldion
 */
public class Taller1BubbleSort {

    public static void main(String[] args) {
        
        int Array[] = new int[]{48, 75, 36, 19, 53, 1, 7, 93, 64, 24, 16, 5};
        System.out.println("Datos Ingresados:");
        
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        
        BubbleSort(Array);
        System.out.println("\n");
        System.out.println("Datos Organizados:");
        
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    private static void BubbleSort(int[] DatosIngresados) {
        int n = DatosIngresados.length;
        int temp;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (DatosIngresados[j - 1] > DatosIngresados[j]) {
                    temp = DatosIngresados[j - 1];
                    DatosIngresados[j - 1] = DatosIngresados[j];
                    DatosIngresados[j] = temp;
                }
            }
        }
    }
}
    


    