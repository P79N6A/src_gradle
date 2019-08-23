package com.bytedance.common.wschannel.channel.impl.ok.policy;

public class AndroidHeartBeatPolicy extends DefaultHeartBeatPolicy {
    private boolean mAppActive;
    private long mBackgroundHeartBeatInterval;

    public void onReceivePong() {
        super.onReceivePong();
    }

    public long getInterval() {
        return super.getInterval();
    }

    private long getBackgroundInterval() {
        this.mBackgroundHeartBeatInterval += 60000;
        return this.mBackgroundHeartBeatInterval;
    }

    public void onAppStateChanged(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.mAppActive = z;
    }
}
