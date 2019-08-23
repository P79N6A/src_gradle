package com.bytedance.bdlocation.client;

import com.bytedance.bdlocation.client.BDLocationClient;

public class LocationRequest {
    private final BDLocationClient.Callback callback;
    private final LocationOption option;

    public BDLocationClient.Callback getCallback() {
        return this.callback;
    }

    public LocationOption getOption() {
        return this.option;
    }

    public LocationRequest(LocationOption locationOption, BDLocationClient.Callback callback2) {
        this.option = locationOption;
        this.callback = callback2;
    }
}
