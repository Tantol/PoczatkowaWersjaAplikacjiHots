import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class MenuBarAtTop extends JFrame implements ActionListener{
	
	public MenuBarAtTop(){
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
		}
	
	public void actionPerformed(ActionEvent e){
		String label = e.getActionCommand();
		
		if(label.equals("Close")){
			System.exit(0);
		}
		else if(label.equals("About the program")){
			JOptionPane.showMessageDialog(null,"@Tantol \n @DoneQ \n @marohcab \n");
		}
		}
	}
