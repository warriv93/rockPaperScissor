package p3;

import javax.swing.JFrame;

public class Start
{
		
	public static void main(String[] args)
	{
		String name = "Player";
		int score=0;
		int choice=0;
		
		String name2 = "Bot";
		int score2=0;
		int choice2=0;
		
		
		
		//set/get values user
		SSPPlayer player = new SSPPlayer(choice,score,name);
		//set/get values bot
		SSPPlayer player2 = new SSPPlayer(choice2,score2,name2);
		
		SSPViewer viewer = new SSPViewer();
		//controller hämtar från player o player2 o viewer
		SSPController controller = new SSPController(player, player2, viewer);
		SSPUserInput userInput = new SSPUserInput(controller);

		
		//fönstrena skapas
		JFrame frame1 = new JFrame("SSPViewer");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.add(viewer);
		frame1.pack();
		frame1.setVisible(true);
		frame1.setResizable(false);
		
		JFrame frame2 = new JFrame("SSPUserInput");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.add(userInput);
		frame2.pack();
		frame2.setVisible(true);
		frame2.setLocation(600, 400);
		frame2.setResizable(false);
	}

}
