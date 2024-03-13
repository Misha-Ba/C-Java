import java.util.HashMap;

import javax.swing.*;
public class Grade_Calc extends GUI{
	public static HashMap<String, Float> converter = new HashMap<>();
	static {
		converter.put("A+", 4.0f);
		converter.put("A", 4.0f);
		converter.put("A-", 3.7f);
		converter.put("B+", 3.3f);
		converter.put("B", 3.0f);
		converter.put("B-", 2.7f);
		converter.put("C+", 2.3f);
		converter.put("C", 2.0f);
		converter.put("C-", 1.7f);
		converter.put("D-", 1.3f);
		converter.put("D", 1.0f);
		converter.put("F", 0.0f);
	}
	public static float sum;
	public static void main(String [] args) {
		GUI displayGUI = new GUI();
		String num_class;
		
		num_class = JOptionPane.showInputDialog("Enter the number of classes ");
		int size = Integer.parseInt(num_class);
		
		String credit = JOptionPane.showInputDialog("Enter the total credits for all the classes: ");
		int total_credit= Integer.parseInt(credit);
		
		//calculates the GPA from the grade
		String arr[] = new String[size];
		for(int i = 0; i < size; i++) {
			arr[i] = JOptionPane.showInputDialog("Enter a letter for class " + (i+1) + ": ");
			if(converter.containsKey(arr[i])) {
				sum+=converter.get(arr[i]);
			}	
		}
		sum = sum/size;
		JOptionPane.showMessageDialog(null, "Your GPA is "+ sum);
		
		
	}
}
