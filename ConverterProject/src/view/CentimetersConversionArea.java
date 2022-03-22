package view;

import java.awt.Color;

import model.Command;
import model.ConversionArea;

// TODO: Auto-generated Javadoc
/**
 * The Class CentimetersConversionArea.
 */
public class CentimetersConversionArea extends ConversionArea  implements Command {

	/**
	 * Instantiates a new centimeters conversion area.
	 */
	public CentimetersConversionArea() {
		super();
		super.setBackground(Color.YELLOW);
		super.setText("0");
	}


	/**
	 * Update.
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}


	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		System.out.println("CentimetersConversionArea");
	}

}
