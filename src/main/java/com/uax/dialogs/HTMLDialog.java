package com.uax.dialogs;

import com.uax.buttons.Button;
import com.uax.buttons.HTMLButton;

public class HTMLDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HTMLButton();
	}
}
