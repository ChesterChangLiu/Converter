package main;

import java.awt.EventQueue;

import view.ConverterJframe;

public class ConverterMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterJframe jframe = new ConverterJframe();
					jframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}

}
