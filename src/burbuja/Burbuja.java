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

    static int numeros[] = {10, 7, 21, 32, 4};
    static int cambios = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comprobarNumero(numeros);
        imprimirNumeros(numeros);
    }

    static void comprobarNumero(int numeros[]) {
        while (cambios < numeros.length) {
            for (int i = 0; i < numeros.length-1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int numeroMayor = numeros[i];
                    int numeroMenor = numeros [i+1];
                    numeros[i] = numeroMenor;
                    numeros[i+1] = numeroMayor;
                    cambios++;
                }
            }
        }
    }
    static void imprimirNumeros(int numeros[]){
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + "\t");
        }
    }
}
