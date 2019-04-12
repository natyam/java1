package edu.utn.controlador;

import edu.utn.modelo.Boxeador;
import edu.utn.modelo.Categoria;
import edu.utn.modelo.TipoEntrenador;



public class Clasificador {
	
		public static void clasificar(double peso, Boxeador b)
	{
			if(peso>=0 && peso <= 52.162)
			{
				b.setCat(Categoria.MOSCA);
			}
			
		
				if(peso>=52.163 && peso <= 55.337)
				{
					b.setCat(Categoria.GALLO);
				}
				if(peso>=55.338 && peso <= 58.966)
				{
					b.setCat(Categoria.PLUMA);
				}
				if(peso>=58.967 && peso <= 63.502)
				{
					b.setCat(Categoria.LIGERO);
				}
				if(peso>=63.503  && peso <= 69.852)
				{
					b.setCat(Categoria.WELTER);
				}
				if(peso>=69.853 && peso <= 76.204)
				{
					b.setCat(Categoria.MEDIANO);
				}
				if(peso>=76.205 && peso < 91)
				{
					b.setCat(Categoria.MEDIOPESADO);
				}
				if(peso>=91)
				{
					b.setCat(Categoria.PESADO);
				}
	}
	
	public static int buscarentrenador(Categoria c)
	{
		int i=Categoria.buscare(c);
		return i;
	}
	public static void mostrarCategoriaEntrenador(TipoEntrenador nombre)
	{
		switch (nombre) {
		case AAA:
			System.out.println("Categorias asignadas: "+Categoria.MOSCA.toString()+", "+Categoria.GALLO.toString());
			//System.out.print(Categoria.MOSCA.toString());
			//System.out.print(Categoria.GALLO.toString());
			
			break;
		case BBB:
			System.out.println("Categorias asignadas: "+Categoria.PLUMA.toString()+", "+Categoria.LIGERO.toString());
			
					break;
		case CCC:
			System.out.println("Categorias asignadas: "+Categoria.WELTER.toString()+", "+Categoria.MEDIANO.toString());
			break;
		case DDD:
			System.out.println("Categorias asignadas: "+Categoria.MEDIOPESADO.toString()+", "+Categoria.PESADO.toString());
			break;

		default:
			System.out.println("Categoria irreconocible");
			break;
		}
	}
	
	

}
