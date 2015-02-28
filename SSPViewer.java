package p3;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SSPViewer extends JPanel {
	private JLabel wonText = new JLabel("First to 3 wins!"),//whoWon
			HumanText = new JLabel("Human"),
			ComputerText = new JLabel("Computer"),
			//ange värdena nedan
			HumanNbr = new JLabel(),//score for human
			ComputerNbr = new JLabel(),//score for bot
			Choice = new JLabel(),//ChoiceHuman
			Choice2 = new JLabel();//ChoiceComputer
	Font font = new Font("SansSerif", Font.PLAIN, 22);
	private SSPPlayer bot;
	private SSPPlayer user;
	
	public SSPViewer(){
		setPreferredSize(new Dimension (400,300));
		
		//texten sätts ut 
		
		wonText.setPreferredSize(new Dimension(300,70));
		wonText.setFont(font);
		add(wonText);
		
		HumanText.setPreferredSize(new Dimension(150,50));
		HumanText.setFont(font);
		add(HumanText);
		
		ComputerText.setPreferredSize(new Dimension(150,50));
		ComputerText.setFont(font);
		add(ComputerText);
		
		HumanNbr.setPreferredSize(new Dimension (150,50));
		HumanNbr.setFont(font);
		add(HumanNbr);
		
		ComputerNbr.setPreferredSize(new Dimension(150,50));
		ComputerNbr.setFont(font);
		add(ComputerNbr);
		
		Choice.setPreferredSize(new Dimension(150,50));
		Choice.setFont(font);
		add(Choice);
		
		Choice2.setPreferredSize(new Dimension(150,50));
		Choice2.setFont(font);
		add(Choice2);
		
		
	
		
		
	}
	
	//värdet i score från controller sätts in som text i viewern
	public void setScore(String userscore, String botscore)
	{
		HumanNbr.setText(userscore);
		ComputerNbr.setText(botscore);
		

	}
	//värdet i choice från controller sätts in som text i viewern
	public void setChoice(String userchoice, String botchoice)
	{
		Choice.setText(userchoice);
		Choice2.setText(botchoice);
	}

	public void sethumanwinner()
	{
		wonText.setText("Human is the winner!");
		
	}

	public void setbotwinner()
	{
		wonText.setText("Computer is the winner!");
		
	}

	public void resettitle()
	{
		wonText.setText("First to 3 wins!");
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
