package controller;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import model.ConversionArea;
import model.ValueToConvert;

public class ConverterController implements DocumentListener{

	ConversionArea area;
	ValueToConvert convert;
	public ConverterController(ConversionArea area,ValueToConvert convert){
		this.area = area;
		this.convert = convert;
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		String txt = area.getText();
		convert.setState(txt);
		System.out.println("insertUpdate:"+txt);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		String txt = area.getText();
		convert.setState(txt);
		System.out.println("removeUpdate:"+txt);
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		String txt = area.getText();
		convert.setState(txt);
		System.out.println("changedUpdate:"+txt);
	}

}
