package edu.utn.modelo;

public class Entrenador {
	
	private Boxeador[] listaboxeadores;
	private int cont=0;
	private TipoEntrenador nombre;
	
	public Entrenador()
	{
		this.listaboxeadores= new Boxeador[5];
		//this.cont=0;
	}

	public Boxeador[] getListaboxeadores() {
		return listaboxeadores;
	}

	

	public int getCont() {
		return cont;
	}

	public TipoEntrenador getNombre() {
		return nombre;
	}

	public void setNombre(TipoEntrenador nombre) {
		this.nombre = nombre;
	}
	
	public void llenarListaboxeadores(Boxeador listaboxeadores) {
		if(cont<5)
		{ 
			
			this.listaboxeadores[cont] = listaboxeadores;
			cont++;
			
		}
		
	}

	/*@Override
	public String toString() {
		for (int i=0; i< this.getCont(); i++) {
			
			System.out.println(this.listaboxeadores[i].getNombre());
			
		}
		return super.toString();
	} */
	
	

}
