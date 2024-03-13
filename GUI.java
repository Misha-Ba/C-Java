import javax.swing.*;
public class GUI extends JFrame{
	public static void main (String[] args) {
		Grade_Calc.main(args);
		JFrame showGUI = new JFrame();
		showGUI.setSize(900,500);
		showGUI.setLocation(500,500);
		showGUI.setTitle("Term GPA Calculator");
		showGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		showGUI.setVisible(true);
		
		
	}

}
