package p3;

public class SSPPlayer
{
	private String name;
	private int score;

	private int choice;
	final int rock = 1, paper = 2, scissor = 3;

	public SSPPlayer(int choice, int score ,String name){
		this.score = score;
		this.name = name;
		this.choice = choice;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getScore()
	{
		return this.score;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	public void addScore(int score)
	{
		this.score += score;
	}
	public void setChoice(int choice){
		this.choice = choice;
		
	}
	public int getChoice(){
		//bot or users choice
		return this.choice;
	}
	
	
	
	
	
	
	
	}
