package Jetbrains.Chuck_Norris_Cipher_Encoder.Package1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaterBottle {
	int capacityInML;
	private int volume;

	public WaterBottle(int capacityInML) {
		this.capacityInML = capacityInML;
	}

	public void drink(int volume) {
		this.volume -= volume;
	}

	public void fill(int volume) {
		if (capacityInML >= this.volume) {
			this.volume += volume;
		}
	}
}
