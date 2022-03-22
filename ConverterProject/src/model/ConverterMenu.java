package model;

import javax.swing.JMenu;

// TODO: Auto-generated Javadoc
/**
 * The Class ConverterMenu.
 */
public class ConverterMenu extends JMenu implements Command {

	/**
	 * Instantiates a new converter menu.
	 *
	 * @param name the name
	 */
	public ConverterMenu(String name) {
		super(name);
	}
	
	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		System.out.println("ConverterMenuItem");
	}

}
