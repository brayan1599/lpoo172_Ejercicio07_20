/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_20;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
		double[] numeros = new double[10]; // Create an array of length 10

		// Prompt the user to enter ten numbers
		System.out.print("Ingrese diez numeros: ");
		for (int i = 0; i < numeros.length ; i++)
			numeros[i] = input.nextDouble();

		// Invoke selectionSort
		selectionSort(numeros);

		// Display the sorted numbers
		for (double e: numeros) 
			System.out.print(e + " ");
		System.out.println();
	}

	/** selsctionSort sorts array in accending order */
	public static void selectionSort(double[] lista) {
		for (int i = lista.length - 1; i >= 0; i--) {
			// Find the maximum in the list[i+1...list.length]
			double corrienteMax = lista[i];
			int corrienteMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (corrienteMax < lista[j]) {
					corrienteMax = lista[j];
					corrienteMaxIndex = j;
				}
			}

			// Swap list[i] with list[currentMax] if necessary
			if (corrienteMaxIndex != i) {
				lista[corrienteMaxIndex] = lista[i];
				lista[i] = corrienteMax;
			}
		}
	}
}
