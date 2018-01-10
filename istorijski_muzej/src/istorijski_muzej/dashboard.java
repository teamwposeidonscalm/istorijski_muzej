package istorijski_muzej;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class dashboard {

	private JFrame frame;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard window = new dashboard();
				  
			     	
			    	window.frame.setVisible(true); 

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public dashboard() {
		initialize();
		addButtonToMeni();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		Color backgroundColor = Color.decode("#4286f4");
		frame.getContentPane().setBackground(backgroundColor);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Istorijski Muzej");
		
	
		
		
	}
	JButton btn1;
	private void addButtonToMeni() {
		int meniButtonHeight = 40;
		int meniButtonWidth = 200;
		int meniButtonPositionX = 0;
		int meniButtonPositionY = 100;

		btn1 = new JButton("Exhibition");
		btn1.setBounds(meniButtonPositionX, meniButtonPositionY, meniButtonWidth, meniButtonHeight);
		frame.add(btn1);
		
		btn1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  frame.add(new listOfExhibitions()); 
				  
				  } 
				} );
		// frame.setSize(400,400);

		JButton btn2 = new JButton("List of Exhibition");
		btn2.setBounds(meniButtonPositionX, incrementPosition(meniButtonPositionY, 40), meniButtonWidth,
				meniButtonHeight);
		frame.add(btn2);
 
		JButton btn3 = new JButton("Visitors");
		btn3.setBounds(meniButtonPositionX, incrementPosition(meniButtonPositionY, 80), meniButtonWidth,
				meniButtonHeight);
		frame.add(btn3);

		JButton btn4 = new JButton("Rooms");
		btn4.setBounds(meniButtonPositionX, incrementPosition(meniButtonPositionY, 120), meniButtonWidth,
		meniButtonHeight);
		frame.add(btn4);

		JButton btn5 = new JButton("Exhibit");
		btn5.setBounds(meniButtonPositionX, incrementPosition(meniButtonPositionY, 160), meniButtonWidth,
		meniButtonHeight);
		frame.add(btn5);
		
		JButton btn6 = new JButton("List of Exhibit");
		btn6.setBounds(meniButtonPositionX, incrementPosition(meniButtonPositionY, 200), meniButtonWidth,
		meniButtonHeight);
		frame.add(btn6);
		
		JButton btn7 = new JButton("Authors");
		btn7.setBounds(meniButtonPositionX, incrementPosition(meniButtonPositionY, 240), meniButtonWidth,
		meniButtonHeight);
		frame.add(btn7);
		
		JButton btn8 = new JButton("Staffs");
		btn8.setBounds(meniButtonPositionX, incrementPosition(meniButtonPositionY, 280), meniButtonWidth,
		meniButtonHeight);
		frame.add(btn8);
		
		JButton btn9 = new JButton("Lessons");
		btn9.setBounds(meniButtonPositionX, incrementPosition(meniButtonPositionY, 320), meniButtonWidth,
		meniButtonHeight);
		frame.add(btn9);
		
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
	}

	public int incrementPosition(int position, int x) {
		position += x;
		return position;
	}

}
