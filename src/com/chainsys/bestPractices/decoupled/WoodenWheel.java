package com.chainsys.bestPractices.decoupled;

public class WoodenWheel  implements Iwheel {
	public static String location;
	public void rotate() {
		System.out.println("WoodenWheel is rotating");
	}
	public void stopRotation() {
		System.out.println("WoodenWheel is stopped");
	}

}
