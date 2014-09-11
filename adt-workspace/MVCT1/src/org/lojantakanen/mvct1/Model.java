package org.lojantakanen.mvct1;

import java.util.Observable;

public class Model extends Observable {

	int mValue;
	
	public int getmValue() {
		return mValue;
	}

	public void setmValue(int mValue) {
		this.mValue = mValue;
		notifyObservers(this);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
