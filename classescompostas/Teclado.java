package classescompostas;

public class Teclado {
	private String tipoTeclado;
	private String nomeTeclado;
	
	public Teclado()
	{
		this.nomeTeclado = "Teclado XYZ Logitech";
		this.tipoTeclado = "ABNT";
	}
	
	public Teclado(String nome_, String tipo_)
	{
		this.nomeTeclado = nome_;
		this.tipoTeclado = tipo_;
	}
	
	public String getTipoTeclado()
	{
		return this.tipoTeclado;
	}
	
	public String getNomeTeclado()
	{
		return this.nomeTeclado;
	}
}
