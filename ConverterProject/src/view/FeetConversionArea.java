package view;

import java.awt.Color;

import model.Command;
import model.ConversionArea;
import model.ValueToConvert;

// TODO: Auto-generated Javadoc
/**
 * The Class FeetConversionArea.
 */
public class FeetConversionArea extends ConversionArea implements Command {

	/**
	 * Instantiates a new feet conversion area.
	 *
	 * @param valueToConvert the value to convert
	 */
	public FeetConversionArea(ValueToConvert valueToConvert){
		super();
		super.valueToConvert = valueToConvert;
		super.setBackground(Color.GREEN);
		super.setEditable(false);
		super.setText("0 ft");
		super.valueToConvert.addObserver(this);
	}
	
	/**
	 * Update.
	 */
	@Override
	public void update() {
		double val = super.valueToConvert.getState()*0.032808399;
		System.out.println("FeetConversionArea update");
		this.setText(val+" ft");
	}
	
	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		System.out.println("FeetConversionArea");
	}
	
	

}
