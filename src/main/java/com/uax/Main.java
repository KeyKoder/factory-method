package com.uax;

import com.uax.dialogs.Dialog;
import com.uax.dialogs.HTMLDialog;
import com.uax.dialogs.WindowsDialog;

public class Main {
	private static Dialog dialog;
	public static void main(String[] args) {
		configure();
		runLogic();
	}

	/**
	 * The concrete factory is usually chosen depending on configuration or
	 * environment options.
	 */
	static void configure() {
		if (System.getProperty("os.name").equals("Windows 10")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HTMLDialog();
		}
	}

	/**
	 * All of the client code should work with factories and products through
	 * abstract interfaces. This way it does not care which factory it works
	 * with and what kind of product it returns.
	 */
	static void runLogic() {
		dialog.renderWindow();
	}
}
