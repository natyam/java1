package edu.utn.vista;

import java.util.Scanner;

import edu.utn.controlador.Clasificador;
import edu.utn.modelo.Boxeador;
import edu.utn.modelo.Entrenador;
import edu.utn.modelo.TipoEntrenador;


public class TestEntrenador {
	public static void main(String[] args) {
		//Scanner scan= new Scanner(System.in);
		//hago un entrenador para cada nombre
		//Entrenador e= new Entrenador();
		Entrenador a= new Entrenador(TipoEntrenador.AAA);
		Entrenador b= new Entrenador(TipoEntrenador.BBB);
		Entrenador c= new Entrenador(TipoEntrenador.CCC);
		Entrenador d= new Entrenador(TipoEntrenador.DDD);
		
		Boxeador box= new Boxeador();
		while(a.getCont()<5)
		{
			box= new Boxeador();
			Scanner scan= new Scanner(System.in);
			System.out.println("Ingrese el nombre del jugador");
			box.setNombre(scan.nextLine());
			System.out.println("Ingrese el peso del jugador");
			box.setPeso(scan.nextDouble());
			Clasificador.clasificar(box.getPeso(), box);
			a.llenarListaboxeadores(box);
			
			
		}
		a.mostrarBoxeadores(a.getListaboxeadores());
		System.out.println("El entrenador tiene los jugadores: ");

	
		System.out.println();
		System.out.println("..............");
		
	}

}
