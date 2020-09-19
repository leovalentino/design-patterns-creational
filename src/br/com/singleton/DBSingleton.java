package br.com.singleton;

public class DBSingleton {
	
	private static DBSingleton instance = null;
	
	private DBSingleton() {}
	
	public static DBSingleton getInstance() {
		if (instance == null) {
			synchronized (DBSingleton.class) {
				instance = new DBSingleton();				
			}
		}
		return instance;
	}

}
