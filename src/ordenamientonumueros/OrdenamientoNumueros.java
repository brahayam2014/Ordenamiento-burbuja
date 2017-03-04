

package ordenamientoPorBurbuja;

import java.util.Scanner;


 ///@author BRAHAYAM CARDENAS CARDENAS 

public class ordenamiento {
    
    private int vector[], auxiliar;
    private int longVector;
    private Scanner teclado = new Scanner(System.in);  
    
    public ordenamiento() {
        iniciaVector();
        llenaDatos();
        ordenaDatos();
        muestraDatos();
    }
    
    public void iniciaVector() {
     System.out.println("Ingrese longitud del vector: ");
     longVector = teclado.nextInt();
     vector = new int[longVector];
    }
    
    public void llenaDatos (){
        for (int i = 0; i < longVector; i++){
            System.out.println("Ingrese el primer numero para el vector " + (i+1));
            vector[i] = teclado.nextInt();
        }
    }
    
    public void ordenaDatos (){
        for (int i = 0; i < longVector; i++){
            for (int j = i; j < longVector; j++){
                if (vector [i]> vector[j]){
                    auxiliar = vector[i];
                    vector[i] = vector[j];
                    vector[j] = auxiliar;
                }
            }
        }
    }
    
    public void muestraDatos (){
        for (int i = 0; i < longVector; i++){
            System.out.println("datos ordenados por el metodo burbuja: \n\n\n " + vector[i]);
            
        }
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
         ordenamientoPorBurbuja ordenaBurbuja = new ordenamientoPorBurbuja();
    }
    
}
