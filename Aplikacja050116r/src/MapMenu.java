import java.awt.FlowLayout;

import javax.swing.*;
public class MapMenu extends JFrame {
private JButton map;
String[] names = {"Haunted Mines","Towers of Doom","Infernal Shrines","Battlefield of Eternity","Tomb of The Spider Quoeen","Sky Temple","Garden of Terror","Blackheart's Bay","Dragon Shire","Cursed Hollow","Braxis Holdout","Warhead Junction"};
	
	public MapMenu(){
		super ("Maps");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
		
		for(String name: names){
		map = new JButton(name);
		add(map);
		}
		
		
		setVisible(true);
	}

}
