package oving1;

import javax.swing.*;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonsNText extends JPanel{
	
	private JPanel panel;
	
	public JToggleButton upperCaseButton;
	public JToggleButton lowerCaseButton;
	public JCheckBox continuousButton;
	public JTextField textLine;

	private ButtonGroup buttonGroup;
	
	public ButtonsNText () {
		panel = new JPanel ();
		panel.add(panel);
		
		buttonGroup = new ButtonGroup();
		
		textLine = new JTextField();
		textLine.setColumns(20);
		textLine.setFont(new Font( "Comic Sans MS", Font.PLAIN, 15 ) );
		
		upperCaseButton = new JToggleButton("Upper Case");
		upperCaseButton.addActionListener(new MyButtonAction());
		buttonGroup.add(upperCaseButton);
		
		lowerCaseButton = new JToggleButton("Lower Case");
		lowerCaseButton.addActionListener(new MyButtonAction());
		buttonGroup.add(lowerCaseButton);
		
		panel.add(upperCaseButton);
		panel.add(lowerCaseButton);
		
		continuousButton = new JCheckBox("Continuous");
		
		panel.add(continuousButton);
	}
	
	
	class MyButtonAction implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(upperCaseButton.isSelected()){
				String text = textLine.getText();
				textLine.setText(text.toUpperCase());
			}
			else if(lowerCaseButton.isSelected()){
				String text = textLine.getText();
				textLine.setText(text.toLowerCase());				
			}	
		}
	}
	
	class MyMouseEvent implements MouseListener{
		public void mousePressed (MouseEvent e){
			
		}
		public void mouseReleased(MouseEvent e){
			
		}
	}
	
	public static void Main (String[] args){
		JFrame frame = new JFrame("Oving 1 frame");
		// JPanel panel = new JPanel();
	}
}
