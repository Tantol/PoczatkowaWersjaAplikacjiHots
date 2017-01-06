import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MapMenu extends Frame{
private JButton map;
String[] names = {"Haunted Mines","Towers of Doom","Infernal Shrines","Battlefield of Eternity","Tomb of The Spider Quoeen","Sky Temple","Garden of Terror","Blackheart's Bay","Dragon Shire","Cursed Hollow","Braxis Holdout","Warhead Junction"};
	
	public MapMenu(){
		for(String name: names){
		map = new JButton(name);
		add(map);
		map.addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent event){
		String label = event.getActionCommand();
		for(String name: names){
			if(label.equals(name)){
				System.out.println(name);
			}		
		
		}
		
		}
}