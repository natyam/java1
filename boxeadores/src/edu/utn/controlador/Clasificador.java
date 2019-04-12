package edu.utn.controlador;

import edu.utn.modelo.Boxeador;
import edu.utn.modelo.Categoria;
//import edu.utn.modelo.TipoEntrenador;



public class Clasificador {
	
		public static void clasificar(double peso, Boxeador b)
	{
		Categoria.clasifica(peso, b);			
	}
	
	public static int buscarentrenador(Categoria c)
	{
		int i=Categoria.buscare(c);
		return i;
	}
	
	

}
