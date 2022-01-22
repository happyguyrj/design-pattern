package com.example.bridge.remotes;

import com.example.bridge.devices.Device;

public class AdvanceRemote extends BasicRemote {

    public AdvanceRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}