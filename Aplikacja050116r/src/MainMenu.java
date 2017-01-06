	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.FlowLayout;

	public class MainMenu extends JFrame implements ActionListener{
		//private JLabel informationAboutChampion;
		private JButton option;
		String[] names = { "Map", "Champion" };
		
		public MainMenu(){
			super("Choose your option");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(800,400);
			setLocationRelativeTo(null);
			setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
			
			for(String name : names){
				option = new JButton(name);
				add(option);
				option.addActionListener(this);
			}
			
			
 //
					new  MenuBarAtTop();

			
			setVisible(true);
			
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
	 String label = e.getActionCommand();
 if(label.equals("Otworz plik"))

	Object zrodlo = e.getSource();
 if(zrodlo == oblicz)
 {
 try {
 double a = Double.parseDouble(element1.getText());
 double b = Double.parseDouble(element2.getText());

 wynik.setText(a*b+"");
 }
 catch (NumberFormatException ev) {
 JOptionPane.showMessageDialog(null, "Wpisz poprawne
 wartosci!", "Blad argumentow!?",
JOptionPane.ERROR_MESSAGE);
 }
 }
*/
	 
	