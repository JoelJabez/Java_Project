package Training;

import java.util.HashMap;

public class ComputerMonitor {
	private HashMap<String, Integer> ports = new HashMap<>();

	public String getMaxRefreshRate() {
		return maxRefreshRate;
	}

	public void setMaxRefreshRate(String maxRefreshRate) {
		this.maxRefreshRate = maxRefreshRate;
	}

	private String maxRefreshRate;

	public ComputerMonitor() {
		ports.put("HDMI", 0);
		ports.put("Display Port", 0);
		ports.put("VGA", 0);
		ports.put("Lighting", 0);
	}

	public HashMap<String, Integer> getPorts() {
		return ports;
	}

	public void setPorts(String portName, Integer number) {
		ports.replace(portName, number);
	}

}
