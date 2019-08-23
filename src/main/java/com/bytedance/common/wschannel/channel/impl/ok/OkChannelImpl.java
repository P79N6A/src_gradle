package com.bytedance.common.wschannel.channel.impl.ok;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.impl.ok.WsOkClient;
import com.bytedance.common.wschannel.channel.impl.ok.policy.AndroidHeartBeatPolicy;
import com.bytedance.common.wschannel.channel.impl.ok.policy.RetryTimesPolicy;
import com.bytedance.common.wschannel.log.WsChannelLog;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class OkChannelImpl implements WeakHandler.IHandler, IWsChannelClient {
    private final int mChannelId;
    public Map<String, Object> mConfigMap = new HashMap();
    public Context mContext;
    private Handler mHandler;
    private boolean mHasInit;
    private AndroidHeartBeatPolicy mHeartBeatPolicy = new AndroidHeartBeatPolicy();
    private ContentObserver mOkChannelEnableObserver = new ContentObserver(this.mHandler) {
        public void onChange(boolean z) {
            super.onChange(z);
            if (OkChannelImpl.this.okChannelEnable(OkChannelImpl.this.mContext)) {
                OkChannelImpl.this.openConnection(OkChannelImpl.this.mConfigMap, OkChannelImpl.this.mUrls);
            } else {
                OkChannelImpl.this.stopConnection();
            }
        }
    };
    public List<String> mUrls;
    private WsOkClient mWsClient;

    public void handleMsg(Message message) {
    }

    public void onConnection(JSONObject jSONObject) {
    }

    public void onMessage(byte[] bArr) {
    }

    public boolean isConnected() {
        return this.mWsClient.isConnected();
    }

    private void unregisterObserver() {
        try {
            if (this.mContext != null) {
                this.mContext.getContentResolver().unregisterContentObserver(this.mOkChannelEnableObserver);
            }
        } catch (Throwable unused) {
        }
    }

    public void stopConnection() {
        Bundle bundle = new Bundle();
        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "stopConnection");
        WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
        this.mWsClient.stopConnect();
    }

    public void destroy() {
        Bundle bundle = new Bundle();
        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "destroy, channelId = " + this.mChannelId);
        WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
        this.mWsClient.destroy();
        unregisterObserver();
    }

    public boolean okChannelEnable(Context context) {
        return WsChannelSettings.inst(context).isOkChannelEnable();
    }

    private void observerSpChanged(Context context) {
        try {
            context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.getContentUri(context, "key_ok_impl_enable", "boolean"), true, this.mOkChannelEnableObserver);
        } catch (Throwable unused) {
        }
    }

    public boolean sendMessage(byte[] bArr) {
        if (!okChannelEnable(this.mContext)) {
            return false;
        }
        return this.mWsClient.sendMessage(bArr);
    }

    public void onAppStateChanged(int i) {
        if (okChannelEnable(this.mContext)) {
            Bundle bundle = new Bundle();
            bundle.putInt("appState", i);
            bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onAppStateChanged");
            WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
            WsOkClient wsOkClient = this.mWsClient;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            wsOkClient.onAppStateChanged(z);
            this.mHeartBeatPolicy.onAppStateChanged(i);
        }
    }

    public void onNetworkStateChanged(int i) {
        if (okChannelEnable(this.mContext)) {
            Bundle bundle = new Bundle();
            bundle.putInt("networkState", i);
            bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onNetworkStateChanged");
            WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
            this.mWsClient.onNetworkStateChanged(i);
        }
    }

    public OkChannelImpl(int i, Handler handler) {
        this.mChannelId = i;
        this.mHandler = handler;
    }

    public void openConnection(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.mConfigMap.putAll(map);
        }
        this.mUrls = list;
        if (okChannelEnable(this.mContext)) {
            this.mWsClient.connect(map, list);
        }
    }

    public void init(Context context, IWsChannelClient iWsChannelClient) {
        if (!this.mHasInit) {
            this.mHasInit = true;
            this.mContext = context.getApplicationContext();
            this.mWsClient = new WsOkClient.Builder(context).retryPolicy(new RetryTimesPolicy(context)).heartBeatPolicy(this.mHeartBeatPolicy).build();
            this.mWsClient.setWsStatusListener(new WsStatusChangedListener(this.mContext, this.mWsClient, iWsChannelClient));
            observerSpChanged(context);
        }
    }

    public void onParameterChange(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.mConfigMap.putAll(map);
        }
        this.mUrls = list;
        if (okChannelEnable(this.mContext)) {
            Bundle bundle = new Bundle();
            bundle.putString("urls", list.toString());
            bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onParameterChange");
            WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
            this.mWsClient.onParameterChange(map, list);
        }
    }
}
