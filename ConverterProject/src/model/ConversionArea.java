package model;

import javax.swing.JTextArea;

// TODO: Auto-generated Javadoc
/**
 * Observer Pattern.
 *
 * @author 
 */
public abstract class ConversionArea extends JTextArea {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The value to convert. */
	protected ValueToConvert valueToConvert;
	
	/**
	 * Instantiates a new conversion area.
	 */
	public ConversionArea() {
		super(10,20);
	}
	
	/**
	 * the core function.
	 */
	public abstract void update();
}
