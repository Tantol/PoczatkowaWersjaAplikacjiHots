import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class Frame extends JFrame implements ActionListener{
	public Frame(){ 
	super ("Program");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(800,400);
	setLocationRelativeTo(null);
	setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
	JMenuBar menubar = new JMenuBar();
	JMenu menuFile = new JMenu("File");
	JMenuItem menuClose = new JMenuItem("Close");
	menuClose.addActionListener(this); 
	JMenuItem menuAboutTheProgram = new JMenuItem("About the program");
	menuAboutTheProgram.addActionListener(this); 
	menuFile.add(menuAboutTheProgram);
	menuFile.add(new JSeparator());
	menuFile.add(menuClose);
	menubar.add(menuFile);
	setJMenuBar(menubar);
	setVisible(true);
	}
	
	public void taskMenu(ActionEvent e){
		String label = e.getActionCommand();
		if(label.equals("Close")){
			System.exit(0);
		}
		else if(label.equals("About the program")){
			JOptionPane.showMessageDialog(null,"@Tantol \n @DoneQ \n @marohcab \n");
		}
	}
	public abstract void taskOther(ActionEvent event);

public void actionPerformed(ActionEvent e){
	taskMenu(e);
	taskOther(e);
	}
		
	
	
	
	


}
