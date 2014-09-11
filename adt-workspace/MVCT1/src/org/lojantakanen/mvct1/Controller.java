package org.lojantakanen.mvct1;


public class Controller implements Runnable {

	private Model mModel;
	private View mView;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Controller c  = new Controller();
		Thread t = new Thread(c); 
		t.start();

	}

	@Override
	public void run() {
		int count = 0; int maxCount = 5;
		int sleepTime = (int)(Math.random()  *5);
		mView = new View(); 
		mModel = new Model();
		mModel.addObserver(mView);
		// TODO Auto-generated method stub
		while (count < maxCount) {
			System.out.println("sleep for "+ sleepTime + " seconds");
			try {
				Thread.sleep(sleepTime*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sleepTime = (int)(Math.random()  *10);
			mModel.setmValue(sleepTime);
			count++;
		}
	}

}
