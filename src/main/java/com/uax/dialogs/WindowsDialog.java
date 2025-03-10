package com.uax.dialogs;

import com.uax.buttons.Button;
import com.uax.buttons.HTMLButton;
import com.uax.buttons.WindowsButton;

import javax.swing.*;
import java.awt.*;

public class WindowsDialog extends Dialog {
	private JPanel panel = new JPanel();
	private JFrame frame = new JFrame();
	private JDialog dialog = new JDialog();

	public JDialog getDialog() {
		return dialog;
	}

	@Override
	public void renderWindow() {
		this.dialog = new JDialog();
		this.dialog.setTitle("Windows");
		this.dialog.setModal(true);
		this.dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.dialog.setLayout(new BorderLayout());
		this.dialog.setSize(100, 100);

		Button okButton = createButton();
		okButton.render(this);

		this.dialog.setVisible(true);
	}

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
