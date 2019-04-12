package edu.utn.modelo;

public class Boxeador {
	private String nombre;
	private double peso;
	private Categoria cat;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	
	
	
	//revisar esta
	@Override
	public String toString() {
		
		return nombre;
	}
	
	


			

}
/*public void mostrar(Boxeador[] b) {
		for (Boxeador boxeador : b) {
			System.out.println(boxeador.getNombre());
		}
		
		return;
	} */
	
