import java.awt.FlowLayout;
import javax.swing.*;

public class Frame extends JFrame{
	public Frame(){ 
	super ("Test");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(800,400);
	setLocationRelativeTo(null);
	setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
	}
}
