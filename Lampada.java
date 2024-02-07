public class Lampada {
	private int potencia;
	private boolean ligado;
	public Lampada(int potencia) {
		this.potencia = potencia;
		this.ligar();
	}
	public void ligar() {
		ligado = true;
	}
	public void desligar() {
		ligado = false;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
