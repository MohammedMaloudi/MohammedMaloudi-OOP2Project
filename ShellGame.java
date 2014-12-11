//ShellGame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShellGame extends JFrame {
	private JButton Button1; 
	private JButton Button2;//creatng buttons for the "cups"
	private JButton Button3;
	
	private JButton Buttonx;//creating button for the reroll 
	private JMenuBar menuBar;
	
	public int reroll = 0;//reroll counter
	public int attempt= 1;//attempt counter

	
	
	 public static void main (String args []) {
		ShellGame f1= new ShellGame();// creating the frame for ShellGame.java
        f1.setVisible(true);
        
        
    }
    
    public ShellGame () {
        setTitle ("ShellGame");
        setSize (650,550);
        setLocation(300,100);//Properties for the JFrame
        setResizable (false);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
	        
	 Button1 = new JButton(new ImageIcon("blue-cup-th.png"));
	 Button2 = new JButton(new ImageIcon("blue-cup-th.png"));// creating JButtons
     Button3 = new JButton(new ImageIcon("blue-cup-th.png"));
     Buttonx = new JButton(new ImageIcon("Dice.png"));
     
     menuBar = new JMenuBar();
	 setJMenuBar(menuBar);
	 BuildMenu();
     
 
	Container cPane = getContentPane();//setting the Container 
		cPane.setLayout(null); 
        cPane.setBackground (Color.black);
        
        
         
        cPane.add(Button1);
        Button1.setSize(80,110);
        Button1.setLocation(100,150);
        
	    cPane.add(Button2);
	    Button2.setSize(80,110);
	    Button2.setLocation(280,150);// JButton and other properties 
	    
	    cPane.add(Button3);
	    Button3.setSize(80,110);
	    Button3.setLocation(460,150);
	    
	    cPane.add(Buttonx);
	    Buttonx.setSize(70,70);
	    Buttonx.setLocation(285,380);
	    	
	    
	   
     
 
     
     //creating and adding an action listener to the buttons 
     	Button1.addActionListener(new ButtonListener1());
     	Button2.addActionListener(new ButtonListener2());
     	Button3.addActionListener(new ButtonListener1());
     	Buttonx.addActionListener(new ButtonListenerx());
     	
     	
}
	private class ButtonListener1 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{ 
	        attempt++;
		   	JOptionPane.showMessageDialog(null,"Aww... too bad try again?");
		}//closing event
	}//closing action
	
	private class ButtonListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Win w1=new Win(reroll , attempt);//sets vairable reroll at Win class
			w1.setVisible(true);
		   	JOptionPane.showMessageDialog(null,"you win congrats!");
		}//closing event
	}//closing action
	
	private class ButtonListenerx implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			reroll++;//add reroll
		   	Button1.setLocation((int)(Math.random()*550),(int)(150));
		   	Button2.setLocation((int)(Math.random()*550),(int)(150));//randomizes Xlocation 
		   	Button3.setLocation((int)(Math.random()*550),(int)(150));
		   	
		   
		   	
		   	
		}//closing event
	}//closing action
	
		public void  BuildMenu(){
	JMenu game = new JMenu("Game");
	menuBar.add(game);
	JMenuItem re = new JMenuItem("Reroll");
	JMenuItem close = new JMenuItem("Close");
	JMenuItem ch = new JMenuItem("Cheat");
	game.add(re);
	game.add(close);
	game.add(ch);
	ButtonListenerx roll = new ButtonListenerx();
	re.addActionListener(roll);
	
    ButtonListenery exit = new ButtonListenery();
    close.addActionListener(exit);
    
    ButtonListener2 cheat = new ButtonListener2();
    ch.addActionListener(cheat);
    
    

		}
		
		private class ButtonListenery implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{ 
	        
		   	System.exit(0);
		}//closing event
	}//closing action
		



}//closing frame

	