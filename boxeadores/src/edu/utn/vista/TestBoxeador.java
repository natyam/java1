package edu.utn.vista;

import edu.utn.modelo.Boxeador;

public class TestBoxeador {
	
	public static void main(String[] args) {
		Boxeador[ ] a = new Boxeador[3];
		String n="a";
		String q="aa";
		String s="afd";
		a[0].setNombre(n);
		a[2].setNombre(q);
		a[3].setNombre(s);
		System.out.println(a[2].getNombre());
	}

}
