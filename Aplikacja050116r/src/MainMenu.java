	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.FlowLayout;

	public class MainMenu extends Frame{
		private JButton option;
		String[] names = { "Map", "Champion" };
		
		public MainMenu(){
			for(String name : names){
				option = new JButton(name);
				add(option);
				option.addActionListener(this);
			}	
		}
		
		public void actionPerformed(ActionEvent e){
			String label = e.getActionCommand();
			
			if(label.equals("Map")){
				EventQueue.invokeLater(new Runnable() {
					 public void run() {
						 new MapMenu();
						 }
					 });
				}
			else if(label.equals("Champion")){
				EventQueue.invokeLater(new Runnable() {
					 public void run() {
						 new CharacterMenu();
						 }
					 });
				}

			
		}

		
	}
	
	
	
	
	
	
	
	/*
	
*/
	 
	