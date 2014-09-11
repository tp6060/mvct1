package org.lojantakanen.mvct1;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Value now " + ((Model)arg).getmValue());
		
	}


}
