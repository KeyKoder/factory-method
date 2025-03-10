package com.uax.dialogs;

import com.uax.buttons.Button;

public abstract class Dialog {
	public void renderWindow() {
		Button okButton = createButton();
		okButton.render(this);
	}

	/**
	 * Subclasses will override this method in order to create specific button
	 * objects.
	 */
	public abstract Button createButton();
}
