import javax.swing.*;
import java.awt.FlowLayout;

public class CharacterMenu extends JFrame {
	//private JLabel informationAboutChampion;
	private JButton characterName;
	String[] names = { "Abathur","Alarak" ,"Anub'arak" ,"Artanis" ,"Arthas" ,"Auriel" ,"Azmodan" ,"Brightwing","Chen","Chromie","Dehaka","Diablo","E.T.C.","Falstad","Gazlowe","Greymane","Gul'dan","Illidan","Jaina","Johanna","Kael'thas","Kerrigan","Kharazim","Leoric","Li Li","Li-Ming","Lt.Morales","Lunara","Malfurion","Medivh","Muradin","Murky","Nazeebo","Nova","Ragnaros","Raynor","Rehgar","Rexxar","Samuro","Sgt.Hammer","Sonya","Stitches","Sylvanas","Tassadar","The Butcher","The Lost Vikings","Thrall","Tracer","Tychus","Tyrael","Tyrande","Uther","Valla","Varian","Xul","Zagara","Zarya","Zeratul","Zul'jin"};
	
	public CharacterMenu(){
		super("Choose your champion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
		for(String name : names){
			characterName = new JButton(name);
			add(characterName);
		}
		setVisible(true);
		
	}

}
