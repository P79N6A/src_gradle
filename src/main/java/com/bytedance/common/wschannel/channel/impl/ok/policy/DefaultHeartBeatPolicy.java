package com.bytedance.common.wschannel.channel.impl.ok.policy;

import android.text.TextUtils;
import okhttp3.Response;

public class DefaultHeartBeatPolicy implements HeartBeatPolicy {
    protected static long DEFAULT_PING_INTERVAL_MIN = 270000;
    protected long mCurrentInterval = DEFAULT_PING_INTERVAL_MIN;

    public void onReceivePong() {
    }

    public long getSuccessHeatBeatInterval() {
        return this.mCurrentInterval;
    }

    public long getInterval() {
        if (this.mCurrentInterval < DEFAULT_PING_INTERVAL_MIN) {
            this.mCurrentInterval = DEFAULT_PING_INTERVAL_MIN;
        }
        return this.mCurrentInterval;
    }

    public void updatePingInterval(long j) {
        if (j > 0) {
            DEFAULT_PING_INTERVAL_MIN = j;
            this.mCurrentInterval = j;
        }
    }

    public void updatePingInterval(Response response) {
        if (response != null) {
            String header = response.header("Handshake-Options");
            if (header != null) {
                for (String str : header.split(";")) {
                    if (!TextUtils.isEmpty(str)) {
                        String[] split = str.split("=");
                        if ("ping-interval".equals(split[0])) {
                            try {
                                updatePingInterval(Long.parseLong(split[1]) * 1000);
                                return;
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}
