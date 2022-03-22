package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import controller.ConverterController;
import model.Command;
import model.ConverterMenu;
import model.ConverterMenuItem;
import model.ValueToConvert;

public class ConverterJframe extends JFrame implements ItemListener, ActionListener{

	JPanel panel;
	
	FeetConversionArea feet;
	MeterConversionArea meter;
	CentimetersConversionArea cmeter;
	
	
	public ConverterJframe() {
		this.initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ValueToConvert convert = new ValueToConvert();
		feet = new FeetConversionArea(convert);
		meter = new MeterConversionArea(convert);
		cmeter = new CentimetersConversionArea();
		
		GridBagLayout gridBag = new GridBagLayout(); 
		GridBagConstraints c = null; 
		panel = new JPanel(gridBag);
		
		Insets leftinsets = new Insets(10, 100, 10, 10);
		Insets rightinsets = new Insets(10, 10, 10, 100);
		Insets bottominsets = new Insets(10, 10, 100, 100);
		c = new GridBagConstraints();
		c.insets = leftinsets;
		gridBag.addLayoutComponent(feet, c);
        
        c = new GridBagConstraints();
        c.insets = rightinsets;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        gridBag.addLayoutComponent(meter, c);
        c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.insets = bottominsets;
        gridBag.addLayoutComponent(cmeter, c);
        
		JMenuBar menuBar = new JMenuBar();
		ConverterMenu mMenu = new ConverterMenu("Update model");
		menuBar.add(mMenu);
		ConverterMenuItem mItem = new ConverterMenuItem("Save input centimeters",cmeter,convert);
		mMenu.add(mItem);
		this.setJMenuBar(menuBar);
		
		mMenu.addActionListener(this);
		mItem.addActionListener(this);
		panel.add(feet);
		panel.add(meter);
		panel.add(cmeter);
		
		
		this.getContentPane().add(panel);
		this.pack();
		
//		cmeter.getDocument().addDocumentListener(new ConverterController(cmeter,convert));
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Command obj = (Command) e.getSource();
		obj.execute();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}

}
