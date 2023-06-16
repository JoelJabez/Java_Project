package Jetbrains.Chuck_Norris_Cipher_Encoder.Package2;

import Jetbrains.Chuck_Norris_Cipher_Encoder.Package1.WaterBottle;

public class User {
	public static void main(String[] args) {
		WaterBottle waterBottle1 = new WaterBottle(2000);
		WaterBottle waterBottle2 = new WaterBottle(3000);

		waterBottle1.fill(500);
		System.out.println("Water bottle 1(volume): " + waterBottle1.getVolume());

//		waterBottle1.fill(1600);
//		System.out.println("Water bottle 1(volume): " + waterBottle1.volume);
//
//		waterBottle1.drink(100);
//
//
//		waterBottle2.fill(3100);
//		System.out.println("Water bottle 2(volume): " + waterBottle2.volume);
	}
}
