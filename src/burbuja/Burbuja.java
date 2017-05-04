/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

/**
 *
 * @author alexj
 */
public class Burbuja {
    //creamos e inicializamos el array con los numeros a usar y 
    //la variable que usamos para el bucle while
    static int numeros[] = {10, 7, 21, 32, 4};
    static int cambios = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comprobarNumero(numeros);
        imprimirNumeros(numeros);
    }
    //metodo que usamos para comprobar los numeros y ordenarlos
    static void comprobarNumero(int numeros[]) {
        while (cambios < numeros.length) {
            for (int i = 0; i < numeros.length-1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    //creo las variables para guardar el valor de las posiciones y sustituirlas entre si
                    int numeroMayor = numeros[i];
                    int numeroMenor = numeros [i+1];
                    numeros[i] = numeroMenor;
                    numeros[i+1] = numeroMayor;
                    cambios++;
                }
            }
        }
    }
    
    //imprimimos el array ya modificado
    static void imprimirNumeros(int numeros[]){
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + "\t");
        }
    }
}
