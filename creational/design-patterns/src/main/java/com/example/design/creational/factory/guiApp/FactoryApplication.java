package com.example.design.creational.factory.guiApp;

import com.example.design.creational.factory.guiApp.factory.Dialog;
import com.example.design.creational.factory.guiApp.factory.HtmlDialog;
import com.example.design.creational.factory.guiApp.factory.WindowsDialog;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	private static Dialog dialog;

	public static void main(String[] args) {
		configure("windows");
		runBusinessLogic();
	}

	/**
	 * The concrete factory is usually chosen depending on configuration or
	 * environment options.
	 */
	static void configure(String os) {
		switch (os) {
			case "windows":
				dialog = new WindowsDialog();
				break;
			case "html":
				dialog = new HtmlDialog();
				break;
			default:
				break;
		}
	}

	/**
	 * All of the client code should work with factories and products through
	 * abstract interfaces. This way it does not care which factory it works
	 * with and what kind of product it returns.
	 */
	static void runBusinessLogic() {
		dialog.renderWindow();
	}
}
