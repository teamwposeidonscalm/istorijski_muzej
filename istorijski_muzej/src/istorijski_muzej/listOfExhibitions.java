package istorijski_muzej;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class listOfExhibitions extends JPanel{
JLabel title;
	public listOfExhibitions()
	  {                     
		setBackground(Color.yellow);  
		setBounds(300,300,500,300);                        
	   
		title= new JLabel("List of Exhibitions");
		add(title);
	  }
}
