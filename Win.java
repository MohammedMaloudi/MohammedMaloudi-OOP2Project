import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Win extends JFrame{

	private JLabel Label1;
	private JLabel Label2;
	private JLabel Labelx;		
	private JButton ButtonE;    

 public Win(int reroll , int attempt) {
        setTitle ("Winner!");
        setSize (650,550);
        setLocation(300,100);
        setResizable (false);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
        Label1 = new JLabel("Number of Rerolls: " + reroll);
        Label2 = new JLabel("Number of Attempts: " + attempt);
        Labelx = new JLabel(new ImageIcon("winner.jpg"));
        ButtonE = new JButton("Exit");
       
        
        Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
        cPane.setBackground (Color.black);
        
	    cPane.add(Label1);
	    Label1.setForeground(Color.white);
	    
	    
	    
	    cPane.add(Label2);
	     Label2.setForeground(Color.white);
	    
	    cPane.add(Labelx);
	    
	    cPane.add(ButtonE);
	    ButtonE.addActionListener(new ButtonListenerE());
	    
	    
	    
}
private class ButtonListenerE implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{ 
	        
		   	System.exit(0);
		}//closing event
	}//closing action
		
}
	
    
   