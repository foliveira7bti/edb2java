package classescompostas;

public class Monitor {
	private int taxaDeAtualizacao;
	
	public Monitor()
	{
		this.taxaDeAtualizacao = 60;
	}
	
	public Monitor(int taxa)
	{
		this.taxaDeAtualizacao = taxa;
	}	
	
	public int getTaxaDeAtualizacao()
	{
		return this.taxaDeAtualizacao;
	}
	
	public void setTaxaDeAtualizacao(int taxaDeAtualizacao_)
	{
		this.taxaDeAtualizacao = taxaDeAtualizacao_;
	}
}
