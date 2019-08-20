package classescompostas;

public class PlacaMae {
	private String bios;
	private String nomePlaca;
	
	public PlacaMae()
	{
		this.bios = "SM BIOS v2.7";
		this.nomePlaca = "M5A78L-M LX3";
	}
	
	public PlacaMae(String bios_, String nome_)
	{
		this.bios = bios_;
		this.nomePlaca = nome_;
	}
	public String getBios()
	{
		return this.bios;
	}
	
	public String getNomePlaca()
	{
		return this.nomePlaca;
	}
}
