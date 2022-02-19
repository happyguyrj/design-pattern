package com.example.design.structural.bridge.TvRadioRemote;

import com.example.design.structural.bridge.TvRadioRemote.devices.Device;
import com.example.design.structural.bridge.TvRadioRemote.devices.Radio;
import com.example.design.structural.bridge.TvRadioRemote.devices.Tv;
import com.example.design.structural.bridge.TvRadioRemote.remotes.AdvanceRemote;
import com.example.design.structural.bridge.TvRadioRemote.remotes.BasicRemote;

public class BridgeApplication {

	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvanceRemote advancedRemote = new AdvanceRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}

}
