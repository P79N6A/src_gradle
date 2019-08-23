package com.bytedance.common.wschannel.channel.impl.ok;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.impl.ok.WsOkClient;
import com.bytedance.common.wschannel.log.WsChannelLog;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.UnsupportedEncodingException;
import okhttp3.Response;
import okio.ByteString;
import org.json.JSONObject;

public class WsStatusChangedListener implements WsOkClient.WsStatusListener {
    private final Context mContext;
    private final IWsChannelClient mWsChannelClient;
    private final WsOkClient mWsClient;

    public void onMessage(ByteString byteString) {
        if (this.mWsChannelClient != null) {
            this.mWsChannelClient.onMessage(byteString.toByteArray());
        }
    }

    public void onMessage(String str) {
        if (this.mWsChannelClient != null) {
            try {
                this.mWsChannelClient.onMessage(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    public void onConnecting(String str) {
        if (this.mWsChannelClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put("state", 1);
                jSONObject.put(PushConstants.WEB_URL, str);
                jSONObject.put("channel_type", 2);
                this.mWsChannelClient.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public void onOpen(Response response) {
        Bundle bundle = new Bundle();
        bundle.putString("response", response.toString());
        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onOpen");
        WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
        if (this.mWsChannelClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put("state", 4);
                jSONObject.put(PushConstants.WEB_URL, response.request().url().toString());
                jSONObject.put("channel_type", 2);
                this.mWsChannelClient.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    WsStatusChangedListener(Context context, WsOkClient wsOkClient, IWsChannelClient iWsChannelClient) {
        this.mWsClient = wsOkClient;
        this.mWsChannelClient = iWsChannelClient;
        this.mContext = context;
    }

    public void onClosed(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(PushConstants.WEB_URL, str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onClosed");
        WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
        if (this.mWsChannelClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put("state", 3);
                jSONObject.put(PushConstants.WEB_URL, str);
                jSONObject.put("channel_type", 2);
                this.mWsChannelClient.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public void onFailure(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(PushConstants.WEB_URL, str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "onFailure");
        WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
        if (this.mWsChannelClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put("state", 2);
                jSONObject.put(PushConstants.WEB_URL, str);
                jSONObject.put("channel_type", 2);
                jSONObject.put("error", str2);
                jSONObject.put("error_code", i);
                this.mWsChannelClient.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
