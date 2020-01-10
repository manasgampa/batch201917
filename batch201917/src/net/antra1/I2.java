package net.antra1;

public interface I2 {
	
	public void m1();
	public default void m3() {
		System.out.println("in m3 default of I2");
	}

}
