package p3;

import java.util.Random;

import javax.swing.JFrame;

public class SSPController
{
	//hämtar info från de andra klasserna
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
			
		//ger värdet choice från userinput till playerklassen
		user.setChoice(choice);
		//skapar ett random värde
		int botchoice = rand.nextInt(3) + 1;
//		lägger in det randomvärdet i bots playerklass
		bot.setChoice(botchoice);

		int human = user.getChoice();
		int computer = bot.getChoice();
		
		
		int givescore = 1;
		
		// rock = 1, paper = 2, scissor = 3;

		//reglerna - poäng utdelning
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
		
		
		
		
		//kör viewerupdater
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
	
	//ger värdena i player score o choice till viewer klassen.
		public void viewerupdater(){
			
			String userscore = Integer.toString(user.getScore());
			String botscore = Integer.toString(bot.getScore());
			viewer.setScore(userscore,botscore);
			
			
			
			
			int userchoiceint = user.getChoice();
			int botchoiceint = bot.getChoice();
			
		String userchoice = null;
		String botchoice = null;
		
		//visar vilket verktyg du valde att använda
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
			
			
			//resets stats in viewer fönstret
		public void resetstats(){
			//sätter värdenna i score i player klassen player för både user o bot till 0
			user.setScore(0);
			bot.setScore(0);
			//sätter värdena i choice till 0 i klassen player för både user o bot.
			user.setChoice(0);
			bot.setChoice(0);
			viewer.resettitle();
			
//			viewer.setChoice("", "");
			viewerupdater();
			sspUserInput.dimmeroff();
			
			
		}
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

	


