package p3;

import java.util.Random;

import javax.swing.JFrame;

public class SSPController
{
	//h�mtar info fr�n de andra klasserna
	private SSPUserInput sspUserInput;
	
	private SSPViewer viewer;
	private SSPPlayer bot;
	private SSPPlayer user;
	private Random rand = new Random();

	public SSPController(SSPPlayer inbot, SSPPlayer inuser, SSPViewer inviewer)
	{
		this.bot = inbot;
		this.user = inuser;
		this.viewer = inviewer;
	}
	public void setUserInput(SSPUserInput sspUserInput)
	{
		this.sspUserInput = sspUserInput;
	}
//REGELBOKEN
	
	public void game(int choice)
	
	{
		if(user.getScore()<3&&bot.getScore()<3){
			
		//ger v�rdet choice fr�n userinput till playerklassen
		user.setChoice(choice);
		//skapar ett random v�rde
		int botchoice = rand.nextInt(3) + 1;
//		l�gger in det randomv�rdet i bots playerklass
		bot.setChoice(botchoice);

		int human = user.getChoice();
		int computer = bot.getChoice();
		
		
		int givescore = 1;
		
		// rock = 1, paper = 2, scissor = 3;

		//reglerna - po�ng utdelning
		if (human == 1 && computer == 3)
		{
			givescore = 1;
			user.addScore(givescore);
		}
		if (human == 2 && computer == 3)
		{
			givescore = 1;
			bot.addScore(givescore);
		}
		if (human == 1 && computer == 2){
			givescore = 1;
			bot.addScore(givescore);
		}
		if (human == 3 && computer == 2){
			givescore = 1;
			user.addScore(givescore);
		}
		if (human == 2 && computer == 1){
			givescore = 1;
			user.addScore(givescore);
		}
		if (human == 3 && computer == 1){
			givescore = 1;
			bot.addScore(givescore);
		}
		// Draw
		
		
		
		
		//k�r viewerupdater
		viewerupdater();
		}
		
		//vem som vinner
		if ( user.getScore()==3){
			viewer.sethumanwinner();

			
			sspUserInput.dimmeron();
			
		}
		if(bot.getScore()==3){
			viewer.setbotwinner();

			sspUserInput.dimmeron();
		}
	}
	
	//ger v�rdena i player score o choice till viewer klassen.
		public void viewerupdater(){
			
			String userscore = Integer.toString(user.getScore());
			String botscore = Integer.toString(bot.getScore());
			viewer.setScore(userscore,botscore);
			
			
			
			
			int userchoiceint = user.getChoice();
			int botchoiceint = bot.getChoice();
			
		String userchoice = null;
		String botchoice = null;
		
		//visar vilket verktyg du valde att anv�nda
		if (userchoiceint == 1)
		{

			userchoice = "Rock";
		}
		else if (userchoiceint == 2)
		{

			userchoice = "Paper";
		}
		else if (userchoiceint == 3)
		{

			userchoice = "Scissor";
		}
		if(botchoiceint == 1) {
			
			botchoice = "Rock";
		}
		else if (botchoiceint == 2)
		{

			botchoice = "Paper";
		}

		else if (botchoiceint == 3)
		{

			botchoice = "Scissor";
		}
	
			
//			userchoice = Integer.toString(userchoiceint);
//			botchoice = Integer.toString(botchoiceint);
			
			viewer.setChoice(userchoice,botchoice);
			
		}
			
			
			//resets stats in viewer f�nstret
		public void resetstats(){
			//s�tter v�rdenna i score i player klassen player f�r b�de user o bot till 0
			user.setScore(0);
			bot.setScore(0);
			//s�tter v�rdena i choice till 0 i klassen player f�r b�de user o bot.
			user.setChoice(0);
			bot.setChoice(0);
			viewer.resettitle();
			
//			viewer.setChoice("", "");
			viewerupdater();
			sspUserInput.dimmeroff();
			
			
		}
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

	


