package entidades;

import helper.Helper;

public class Muro extends Elemento{
	
	
	public Muro (int x, int y, Tablero tablero) {
		super(x,y,tablero);
	}
	public Muro (Coordenada pos, Tablero tablero) {
		super(pos,tablero);
		setImageName(1);
	}
	

	@Override
	public void explotar() {
		return;
		
	}
	@Override
	public boolean puedeSeguirExplotando() {
		return false;
	}
	@Override
	protected void setImageName(Integer numero) {
		imgFinal= String.format(Helper.METHOD_MURO, numero);	
	}
	
}
