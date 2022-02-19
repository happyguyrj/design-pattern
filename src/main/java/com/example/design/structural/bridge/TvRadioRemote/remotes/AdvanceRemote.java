package com.example.design.structural.bridge.TvRadioRemote.remotes;

import com.example.design.structural.bridge.TvRadioRemote.devices.Device;

public class AdvanceRemote extends BasicRemote {

    public AdvanceRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}