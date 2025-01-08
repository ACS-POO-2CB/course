package patterns.behavioral.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPlay {
	public static void main(String[] args) {
		// Creating the frame
		JFrame frame = new JFrame("Swing Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		// Creating the button
		JButton button = new JButton("Click me");

		// First action: Print a message to the console
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button was clicked!");
			}
		});

		// Second action: Change the text of the button
		button.addActionListener(new ActionListener() {
			int clickCount = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				clickCount++;
				if (clickCount == 1) {
					button.setText("Clicked 1 time!");
					return;
				}
				if (clickCount == 10) {
					System.err.println("I cannot take it any more!");
					System.exit(0);
				}
				button.setText("Clicked " + clickCount +" times!");
			}
		});

		// Adding button to the frame
		frame.getContentPane().add(button);

		// Display the frame
		frame.setVisible(true);
	}
}

