//ShellGame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShellGame extends JFrame {
	private JButton Button1; 
	private JButton Button2;
	private JButton Button3;
	private JButton Buttonx;
	private int reroll;
	 public static void main (String args []) {
		ShellGame f1= new ShellGame();
        f1.setVisible(true);
    }
    
    public ShellGame () {
        setTitle ("ShellGame");
        setSize (650,550);
        setLocation(300,100);
        setResizable (false);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
	        
	 Button1 = new JButton(new ImageIcon("blue-cup-th.png"));
	 Button2 = new JButton(new ImageIcon("blue-cup-th.png"));
     Button3 = new JButton(new ImageIcon("blue-cup-th.png"));
     Buttonx = new JButton(new ImageIcon("Dice.png"));
 
	Container cPane = getContentPane();
		cPane.setLayout(null);
        cPane.setBackground (Color.black);
        
        
         
        cPane.add(Button1);
        Button1.setSize(80,110);
        Button1.setLocation(100,200);
        
	    cPane.add(Button2);
	    Button2.setSize(80,110);
	    Button2.setLocation(280,200);
	    
	    cPane.add(Button3);
	    Button3.setSize(80,110);
	    Button3.setLocation(460,200);
	    
	    cPane.add(Buttonx);
	    Buttonx.setSize(70,70);
	    Buttonx.setLocation(285,380);
	    	
	    
	   
     
 
     
     //creating and adding an action listener to the buttons 
     	Button1.addActionListener(new ButtonListener1());
     	Button2.addActionListener(new ButtonListener2());
     	Button3.addActionListener(new ButtonListener3());
     	Buttonx.addActionListener(new ButtonListenerx());
}
	private class ButtonListener1 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
		   	JOptionPane.showMessageDialog(null,"Aww... too bad try again?");
		}//closing event
	}//closing action
	
	private class ButtonListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
		   	JOptionPane.showMessageDialog(null,"you win congrats!");
		   	JOptionPane.ShowMessageDialog(null,"Number of rolls"+ reroll,JOptionPane.WARNING_MESSAGE);
		}//closing event
	}//closing action
	
	private class ButtonListener3 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
		   	JOptionPane.showMessageDialog(null,"Aww... too bad try again?");
		}//closing event
	}//closing action
	
	
	
	private class ButtonListenerx implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			reroll++;
		   	Button1.setLocation((int)(Math.random()*550),(int)(200));
		   	Button2.setLocation((int)(Math.random()*550),(int)(200));
		   	Button3.setLocation((int)(Math.random()*550),(int)(200));
		   	
		   
		   	/*for(int i=3; i>-1; i--){
		     
		   		
		   	}*/
		   	
		   	
		}//closing event
	}//closing action
	



}//closing frame

	