package com.kleberaluizio.calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorScreen {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Time-consuming multiplication");

		JTextField first = new JTextField(10);
		JTextField second = new JTextField(10);
		JButton button = new JButton(" = ");
		JLabel result = new JLabel("           ?          ");
		
		// When click, it executes multiplication method
		button.addActionListener(new ButtonAction(first, second, result));
		
		JPanel screen = new JPanel();
		screen.add(first);
		screen.add(new JLabel("x"));
		screen.add(second);
		screen.add(button);
		screen.add(result);
		
		window.add(screen);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}
}


