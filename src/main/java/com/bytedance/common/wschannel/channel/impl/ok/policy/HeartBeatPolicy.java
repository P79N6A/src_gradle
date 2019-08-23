package com.bytedance.common.wschannel.channel.impl.ok.policy;

import okhttp3.Response;

public interface HeartBeatPolicy {
    long getInterval();

    long getSuccessHeatBeatInterval();

    void onReceivePong();

    void updatePingInterval(Response response);
}
