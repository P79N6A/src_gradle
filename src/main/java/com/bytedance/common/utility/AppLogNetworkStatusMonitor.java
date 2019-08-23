package com.bytedance.common.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.common.utility.NetworkUtils;

public class AppLogNetworkStatusMonitor {
    final Context mContext;
    BroadcastReceiver mNetworkStateReceiver;
    NetworkUtils.NetworkType mNetworkType = NetworkUtils.NetworkType.MOBILE;
    boolean mReceiverOn;

    public NetworkUtils.NetworkType getNetworkType() {
        return this.mNetworkType;
    }

    public void onDestroy() {
        stop();
    }

    public void onPause() {
        stop();
    }

    public void onResume() {
        start();
    }

    public boolean isNetworkOn() {
        if (NetworkUtils.NetworkType.NONE != this.mNetworkType) {
            return true;
        }
        return false;
    }

    public boolean isWifiOn() {
        if (NetworkUtils.NetworkType.WIFI == this.mNetworkType) {
            return true;
        }
        return false;
    }

    private void stop() {
        if (this.mReceiverOn) {
            this.mReceiverOn = false;
            this.mContext.unregisterReceiver(this.mNetworkStateReceiver);
            this.mNetworkStateReceiver = null;
        }
    }

    private void start() {
        if (!this.mReceiverOn) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.mNetworkStateReceiver = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        try {
                            AppLogNetworkStatusMonitor.this.mNetworkType = NetworkUtils.getNetworkType(AppLogNetworkStatusMonitor.this.mContext);
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            this.mReceiverOn = true;
            try {
                this.mContext.registerReceiver(this.mNetworkStateReceiver, intentFilter);
            } catch (Throwable unused) {
            }
        }
        this.mNetworkType = NetworkUtils.getNetworkType(this.mContext);
    }

    public AppLogNetworkStatusMonitor(Context context) {
        this.mContext = context;
        start();
    }
}
