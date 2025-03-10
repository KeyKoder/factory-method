package com.uax.buttons;

import com.uax.dialogs.Dialog;
import com.uax.dialogs.WindowsDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button {
	JButton button;

	public void render(Dialog dialog) {
		if(dialog instanceof WindowsDialog winDiag) {
			button = new JButton("Exit");
			winDiag.getDialog().add(button);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					winDiag.getDialog().setVisible(false);
					System.exit(0);
				}
			});
		}
	}

	public void onClick() {

	}
}
