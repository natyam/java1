package edu.utn.modelo;

//import com.sun.java.util.jar.pack.Instruction.Switch;

public enum TipoEntrenador {
	AAA(1),
	BBB(2),
	CCC(3),
	DDD(4),
	EEE(5);
	
	private int num;
	private TipoEntrenador(int num)
	{
		this.num=num;
	}
	public int num()
	{
		return num;
		}
	

	
	
		
	/*public static TipoEntrenador buscarentrenador(Boxeador b)
	{
		switch (b.getCat()) {
		case MOSCA:
			return AAA;
			break;
		case GALLO:
					return AAA;
					break;
		case PLUMA:
			return BBB;
			break;
		case LIGERO:
			return BBB;
			break;
		case WELTER:
			return CCC;
			break;
		case MEDIANO:
			return CCC;
			break;
		case MEDIOPESADO:
			return DDD;
			break;
		case PESADO:
			return DDD;
			break;
		
		default:
			System.out.println("Categoria no reconocida");
			break;
		}
	} */

}
