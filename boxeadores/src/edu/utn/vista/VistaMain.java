package edu.utn.vista;

import java.util.Scanner;

import edu.utn.controlador.Clasificador;
import edu.utn.modelo.Boxeador;
import edu.utn.modelo.Entrenador;




public class VistaMain {
	public static void main(String[] args) {
		System.out.println("Ingrese los boxeadores");
		Scanner scan= new Scanner(System.in);
		int i=0;
		Boxeador b= new Boxeador();
		Entrenador e= new Entrenador();
		String nombre;
		double peso;
		int tipoe;
		while(i!=20)
		{
			System.out.println("Ingrese nombre:");
			nombre=scan.next();
			System.out.println("Ingrese el peso: ");
			peso=scan.nextDouble();
			b.setNombre(nombre);
			b.setPeso(peso);
			Clasificador.clasificar(peso, b);
			System.out.println("el boxeador pertenete a la categoria: ");
			System.out.println(b.getCat());
			//hasta aca funciona bien
			
			
			
			tipoe= Clasificador.buscarentrenador(b.getCat());
			System.out.println("asigno entrenador");
			System.out.println(tipoe);
			
			
			
			
		}
	}

}
