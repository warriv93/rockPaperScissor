package p3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

//fönstret för knapparna

public class SSPUserInput extends JPanel implements ActionListener
{
	private Start start;
	//lägger till en instansvariabel controller med värdet null
	private SSPController controller;
	
	private Font font = new Font("SansSerif", Font.PLAIN, 22);
	

	private JButton rock = new JButton("Rock"), scissors = new JButton(
			"Scissors"), paper = new JButton("Paper"), newGame = new JButton(
			"New game"), quit = new JButton("Quit");

	//konstruktor som vill ah en controller i sig
	public SSPUserInput(SSPController controller)
	{
		this.controller = controller;
		this.controller.setUserInput(this);
		
		//fönstrets storlek
		//en panel för hela fönstret
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(600, 400));
		
		//en panel för norra delen av fönstret
		JPanel north = new JPanel(new GridLayout(1,3));
		north.setBorder(BorderFactory.createTitledBorder( "Choose wisely" ));
		north.add(rock);
		north.add(paper);
		north.add(scissors);
		panel.add(north, BorderLayout.NORTH);
		
		//en panel för södra delen av fönstret
		JPanel south = new JPanel(new GridLayout (2,1));
		south.add(newGame);
		south.add(quit);
		panel.add(south, BorderLayout.SOUTH);
		add(panel);
		
		//placerar ut knapparna
		rock.setPreferredSize(new Dimension(180, 100));
		rock.setFont(font);
		north.add(rock);

		paper.setPreferredSize(new Dimension(180, 100));
		paper.setFont(font);
		north.add(paper);

		scissors.setPreferredSize(new Dimension(180, 100));
		scissors.setFont(font);
		north.add(scissors);

		// FIXA MELLANRUM

		newGame.setPreferredSize(new Dimension(560, 100));
		newGame.setFont(font);
		south.add(newGame);

		quit.setPreferredSize(new Dimension(560, 100));
		quit.setFont(font);
		south.add(quit);

		//lägger till knapparna till att göra en action
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissors.addActionListener(this);
		newGame.addActionListener(this);
		quit.addActionListener(this);
		
		//ta instansvariabelns controller o tilldela det nya värdet från konstruktorn SSPUserInput till controller
		

	}
	
	// vad händer om du klickat på knapparna 
	public void actionPerformed(ActionEvent ae)
	{
		//om du klickar på rock så kommer choice bli 1 osv.
		if (ae.getSource() == rock)
		{
		
			int choice = 1;
			controller.game(choice);
			
			
		} else if (ae.getSource() == paper)
		{
			
			int choice = 2;
			controller.game(choice);
		} else if (ae.getSource() == scissors)
		{
			int choice = 3 ;
			controller.game(choice);
		} 
	
		//om du klickar new game ska alla värdena i SSPViewer resetas
			else if (ae.getSource() == newGame)
		{	
			dimmeroff();
			controller.resetstats();
			
			  
		} 
		  //quit knappen stänger fönstret
		  else if (ae.getSource() == quit)
		{
			System.exit(0);
		}
		
	}

	public void dimmeron()
	{
		rock.setEnabled( false );
		paper.setEnabled(false);
		scissors.setEnabled(false);
		
		
		
		
	}
	public void dimmeroff(){
		rock.setEnabled( true );
		paper.setEnabled(true);
		scissors.setEnabled(true);
	}
	
}
