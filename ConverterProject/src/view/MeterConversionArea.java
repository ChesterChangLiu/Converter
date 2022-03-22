package view;

import java.awt.Color;

import model.Command;
import model.ConversionArea;
import model.ValueToConvert;

// TODO: Auto-generated Javadoc
/**
 * The Class MeterConversionArea.
 */
public class MeterConversionArea extends ConversionArea  implements Command  {

	/**
	 * Instantiates a new meter conversion area.
	 *
	 * @param valueToConvert the value to convert
	 */
	public MeterConversionArea(ValueToConvert valueToConvert) {
		super();
		super.valueToConvert = valueToConvert;
		super.setBackground(Color.ORANGE);
		super.setText("0 m");
		super.setEditable(false);
		super.valueToConvert.addObserver(this);
	}


	/**
	 * Update.
	 */
	@Override
	public void update() {
		double val = super.valueToConvert.getState()*0.01;
		System.out.println("MeterConversionArea update");
		this.setText(val+" m");
	}


	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		System.out.println("MeterConversionArea");
	}

}
