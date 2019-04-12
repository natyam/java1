package edu.utn.vista;

import java.util.Scanner;

import edu.utn.modelo.Boxeador;
import edu.utn.modelo.Entrenador;


public class TestEntrenador {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Entrenador e= new Entrenador();
		Boxeador b= new Boxeador();
		while(e.getCont()<5)
		{
			System.out.println("Ingrese el nombre del jugador");
			b.setNombre(scan.next());
			System.out.println("Ingrese el peso del jugador");
			b.setPeso(scan.nextDouble());
			
			e.llenarListaboxeadores(b);
			//e.mostrarboxeadores();
			
		}
		System.out.println("El entrenador tiene los jugadores: ");
		//System.out.println(e.getListaboxeadores());
		
		//b.mostrar(e.getListaboxeadores());
			
	
		System.out.println();
		System.out.println("..............");
		//e.mostrarboxeadores();
		
	}

}
