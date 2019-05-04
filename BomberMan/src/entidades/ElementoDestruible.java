package entidades;

public abstract class ElementoDestruible extends Elemento{
   protected boolean vivo;
	
   
 
   public ElementoDestruible(int x, int y, Tablero tablero){
	   super(x,y, tablero);
	   vivo=true;
   }
   public void destruirse() {
	   vivo=false;
	   tablero.eliminarElemento(this);
   }
   
   public boolean estaVivo() {
	   return vivo;
   }
}
