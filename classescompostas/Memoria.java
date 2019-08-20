package classescompostas;

public class Memoria {
	private int ramTotal;
	
	public Memoria()
	{
		this.ramTotal = 0;
	}
	
	public Memoria(int ram)
	{
		this.ramTotal = ram;
	}

	
	public int getRamTotal()
	{
		return this.ramTotal;
	}
	
	public void setRamTotal(int ramTotal_)
	{
		this.ramTotal = ramTotal_;
	}
}
