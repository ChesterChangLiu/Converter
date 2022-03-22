package model;

import javax.swing.JMenuItem;

import view.CentimetersConversionArea;

// TODO: Auto-generated Javadoc
/**
 * The Class ConverterMenuItem.
 */
public class ConverterMenuItem extends JMenuItem implements Command {

	/** The cmeter. */
	CentimetersConversionArea cmeter;
	
	/** The convert. */
	ValueToConvert convert;
	
	/**
	 * Instantiates a new converter menu item.
	 *
	 * @param name the name
	 * @param cmeter the cmeter
	 * @param convert the convert
	 */
	public ConverterMenuItem(String name,CentimetersConversionArea cmeter,ValueToConvert convert) {
		super(name);
		this.cmeter = cmeter;
		this.convert = convert;
	}
	
	/**
	 * Execute.
	 */
	@Override
	public void execute() {
//		System.out.println("ConverterMenuItem");
		String txt = cmeter.getText();
		convert.setState(txt);
	}

}
