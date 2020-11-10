package threads;

public class Player {
	
	private int ageP;
	private String fName;
	
	public Player(int agePlay)
	{
		
		this.ageP = agePlay;
		this.fName = fName;
		
	}
	public int ageP()
	{
		return this.ageP;
	}
	
	public String fName()
	{
		return this.fName;
	}
	
	public void display()
	{
		System.out.println("Name: " + this.fName + "Age " + this.ageP);
	}
}
