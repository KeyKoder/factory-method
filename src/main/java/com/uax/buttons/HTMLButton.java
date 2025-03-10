package com.uax.buttons;

import com.uax.dialogs.Dialog;

public class HTMLButton implements Button {
	@Override
	public void render(Dialog dialog) {
		System.out.println("<button>Test Button</button>");
		onClick();
	}

	@Override
	public void onClick() {
		System.out.println("Click! Button says - 'Hello World!'");
	}
}
