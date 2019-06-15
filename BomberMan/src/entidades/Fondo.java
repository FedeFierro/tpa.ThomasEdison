package entidades;


public class Fondo extends Elemento {

	public Fondo(Coordenada pos, Tablero tablero) {
		super(pos, tablero);
		setImageName(1);
	}
	public Fondo(int x,int y, Tablero tablero) {
		super(x, y, tablero);
	}
	
	@Override
	public void explotar() {
		return;
		
	}
	@Override
	public boolean esTransitable() {
		return true;
	}
	
	@Override
	protected void setImageName(Integer numero) {
		imgFinal= "fondo_0"+numero;	
	}

	
	

}
