package model;

import java.util.ArrayList;
import java.util.List;

public class ValueToConvert {

	private List<ConversionArea> observers = new ArrayList();
	private double state;
	
	public double getState() {
		return state;
	}

	public void setState(String state) {
		if(state != null && state.trim().length()>0) {
			try {
				double tmp = Double.parseDouble(state);
				this.state = tmp;
				this.notifyAllObservers();
			}catch(Exception ex) {
				
			}
		}
		
	}

	public void addObserver(ConversionArea area) {
		observers.add(area);
	}
	
	public void notifyAllObservers(){
		for (ConversionArea observer : observers) {
	         observer.update();
	    }
	}  
	
}
