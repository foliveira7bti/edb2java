package classescompostas;

public class Computador {
	private Memoria memoria;
	private Monitor monitor;
	private PlacaMae placamae;
	private Teclado teclado;
	
	public Computador()
	{
		this.memoria = new Memoria();
		this.monitor = new Monitor();
		this.placamae = new PlacaMae();
		this.teclado = new Teclado();
	}
	
	public Computador(int mem, int taxa, String nome, String bios, String formatoTeclado, String nometeclado)
	{
		this.memoria = new Memoria(mem);
		this.monitor = new Monitor(taxa);
		this.placamae = new PlacaMae(bios, nome);
		this.teclado = new Teclado(nometeclado, formatoTeclado);
	}

}
