public class Principal {
	public static void main(String[] args) {
		Lampada minhaLampada = new Lampada(20);
		Lampada outraLampada = new Lampada(40);
		minhaLampada.ligar();
		outraLampada.desligar();
		System.out.println("Minha lâmpada de " + minhaLampada.getPotencia() + " de potência está ligada? " + minhaLampada.isLigado() + "\n"
				+ "Minha outra lâmpada de " + outraLampada.getPotencia() + " de potência está ligada? " + outraLampada.isLigado());
	}
}
