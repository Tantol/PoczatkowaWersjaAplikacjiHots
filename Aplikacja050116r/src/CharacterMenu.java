import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class CharacterMenu extends Frame {
	private JButton characterName;
	String[] names = { "Abathur","Alarak" ,"Anub'arak" ,"Artanis" ,"Arthas" ,"Auriel" ,"Azmodan" ,"Brightwing","Chen","Chromie","Dehaka","Diablo","E.T.C.","Falstad","Gazlowe","Greymane","Gul'dan","Illidan","Jaina","Johanna","Kael'thas","Kerrigan","Kharazim","Leoric","Li Li","Li-Ming","Lt.Morales","Lunara","Malfurion","Medivh","Muradin","Murky","Nazeebo","Nova","Ragnaros","Raynor","Rehgar","Rexxar","Samuro","Sgt.Hammer","Sonya","Stitches","Sylvanas","Tassadar","The Butcher","The Lost Vikings","Thrall","Tracer","Tychus","Tyrael","Tyrande","Uther","Valla","Varian","Xul","Zagara","Zarya","Zeratul","Zul'jin"};
	
	public CharacterMenu(){
		for(String name : names){
			characterName = new JButton(name);
			add(characterName);
		}	
	}
	public void taskOther(ActionEvent event){}
	
}
