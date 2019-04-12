package edu.utn.vista;

import java.util.Scanner;

import edu.utn.controlador.Clasificador;
import edu.utn.controlador.Gimnasio;
import edu.utn.modelo.Boxeador;
//import edu.utn.modelo.Categoria;
import edu.utn.modelo.Entrenador;



public class VistaMain {
	public static void main(String[] args) {
		
		
		Gimnasio g= new Gimnasio();
		
		
		int i=0;
		Boxeador box= new Boxeador();
		
		int tipoe;
		int aceptado=0, contrecha=0;
		Boxeador[] rechazados= new Boxeador[100];
		
		System.out.println("Ingrese los boxeadores");
		while(i!=07)
		{
			box= new Boxeador();
			Scanner scan= new Scanner(System.in);
			System.out.println("Ingrese nombre:");
			box.setNombre(scan.nextLine());
			System.out.println("Ingrese el peso: ");
			//peso=scan.nextDouble();
			box.setPeso(scan.nextDouble());
			//Clasificador.clasificar(box.getPeso(), box);
			Clasificador.clasificar(box.getPeso(), box);
			
			tipoe= Clasificador.buscarentrenador(box.getCat());
			
			aceptado=g.ingresoBoxeador(box,tipoe);
			
			if(aceptado==1)
			{
				i++;
			}
			else
			{
				rechazados[contrecha]=box;
				contrecha++;
			}
			
		}
		mostrarEntrenadores(g.getListaEntrenadores());
		mostrarRechazados(rechazados);
	}
	private static void mostrarEntrenadores(Entrenador[] listaAntrenadores)
	{
		for (Entrenador entrenador : listaAntrenadores) {
			System.out.println("Nombre entrenador:" + entrenador.getNombre());
			Clasificador.mostrarCategoriaEntrenador(entrenador.getNombre());
		
			//darle categorias a cada entrenador
			System.out.println("Boxeadores asignados: ");
			entrenador.mostrarBoxeadores(entrenador.getListaboxeadores());
		}
	}
	private static void mostrarRechazados(Boxeador[] box)
	{
		System.out.println("Boxeadores rechazados: ");
		System.out.println("Nombre              Categoria");
		for (Boxeador boxeador : box) {
			System.out.println(boxeador.getNombre()+"              "+boxeador.getCat());
		}
	}
	


}
