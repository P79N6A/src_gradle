package com.bytedance.common.wschannel.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelSdk;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.server.NetworkUtils;

public class WsChannelReceiver extends BroadcastReceiver {
    private static boolean sFrontierEnabled;
    private boolean mIsFirstTimeReceiveNetChangedAction = true;
    private NetworkUtils.NetworkType mOnCreateNetworkType = NetworkUtils.getNetworkType(WsChannelSdk.getContext());

    private void loadFrontierEnabled(Context context) {
        try {
            boolean isEnable = WsChannelSettings.inst(context).isEnable();
            if (isEnable != sFrontierEnabled) {
                sFrontierEnabled = isEnable;
            }
        } catch (Throwable unused) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && !TextUtils.isEmpty(intent.getAction()) && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (this.mIsFirstTimeReceiveNetChangedAction) {
                this.mIsFirstTimeReceiveNetChangedAction = false;
                if (NetworkUtils.getNetworkType(WsChannelSdk.getContext()) == this.mOnCreateNetworkType) {
                    return;
                }
            }
            loadFrontierEnabled(context);
            if (sFrontierEnabled) {
                try {
                    Logger.debug();
                    int networkState = NetworkUtils.getNetworkState(context);
                    Intent intent2 = new Intent(context, WsChannelService.class);
                    intent2.setAction("com.bytedance.article.wschannel.networkstate");
                    intent2.putExtra("network_state", networkState);
                    context.startService(intent2);
                } catch (Exception unused) {
                }
            }
        }
    }
}
