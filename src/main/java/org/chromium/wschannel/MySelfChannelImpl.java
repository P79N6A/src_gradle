package org.chromium.wschannel;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.TTWebsocketConnection;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.CronetClient;
import org.json.JSONException;
import org.json.JSONObject;

public class MySelfChannelImpl implements WeakHandler.IHandler, IWsChannelClient {
    private static String WSCHANNEL_ACTION_BACK;
    private static String WSCHANNEL_ACTION_FORE;
    private static volatile int firstConnection;
    private static CronetEngine mCronetEngine;
    private a mCallback = new a();
    private Context mContext;
    private TTWebsocketConnection mWebsocketConnection;
    private IWsChannelClient mWsChannelClient;
    private boolean sharedConnection = true;

    class a extends TTWebsocketConnection.Callback {
        a() {
        }

        public final void onMessageReceived(TTWebsocketConnection tTWebsocketConnection, ByteBuffer byteBuffer) throws Exception {
            byte[] bArr = new byte[byteBuffer.capacity()];
            try {
                byteBuffer.get(bArr);
                MySelfChannelImpl.this.onMessage(bArr);
            } catch (Throwable unused) {
            }
        }

        public final void onConnectionStateChanged(TTWebsocketConnection tTWebsocketConnection, int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i));
                jSONObject.put(PushConstants.WEB_URL, str);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }

        public final void onConnectionError(TTWebsocketConnection tTWebsocketConnection, int i, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 0);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i));
                jSONObject.put(PushConstants.WEB_URL, str);
                jSONObject.put("error", str2);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    public int cronetToWsStateAdapter(int i) {
        switch (i) {
            case -1:
                return 0;
            case 0:
                return 1;
            case 1:
                return 6;
            default:
                return i;
        }
    }

    public void handleMsg(Message message) {
    }

    public void onNetworkStateChanged(int i) {
    }

    public void destroy() {
        if (this.mWebsocketConnection != null) {
            this.mWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
    }

    public boolean isConnected() {
        if (this.mWebsocketConnection == null) {
            return false;
        }
        return this.mWebsocketConnection.isConnected();
    }

    public void stopConnection() {
        if (this.mWebsocketConnection != null) {
            this.mWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
    }

    private static void loadCronetKernel() throws Exception {
        Reflect.on((Object) Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("preInitCronetKernel");
    }

    public void onConnection(JSONObject jSONObject) {
        if (this.mWsChannelClient != null) {
            try {
                jSONObject.put("channel_type", 1);
            } catch (JSONException unused) {
            }
            this.mWsChannelClient.onConnection(jSONObject);
        }
    }

    public void onMessage(byte[] bArr) {
        if (this.mWsChannelClient != null) {
            this.mWsChannelClient.onMessage(bArr);
        }
    }

    public boolean sendMessage(byte[] bArr) {
        if (this.mWebsocketConnection == null) {
            return false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        this.mWebsocketConnection.asyncSendBinary(allocateDirect);
        return true;
    }

    public void onAppStateChanged(int i) {
        Intent intent = new Intent();
        if (i == 1) {
            intent.setAction(WSCHANNEL_ACTION_FORE);
            this.mContext.sendBroadcast(intent);
            return;
        }
        if (i == 2) {
            intent.setAction(WSCHANNEL_ACTION_BACK);
            this.mContext.sendBroadcast(intent);
        }
    }

    public void onParameterChange(Map<String, Object> map, List<String> list) {
        if (this.mWebsocketConnection != null) {
            this.mWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
        openConnection(map, list);
    }

    public void init(Context context, IWsChannelClient iWsChannelClient) {
        int i = firstConnection + 1;
        firstConnection = i;
        if (i > 1) {
            this.sharedConnection = false;
        }
        this.mContext = context;
        this.mWsChannelClient = iWsChannelClient;
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
        }
        mCronetEngine = CronetClient.getCronetEngine();
        WSCHANNEL_ACTION_BACK = this.mContext.getPackageName() + ".wschannel.APP_BACKGROUND";
        WSCHANNEL_ACTION_FORE = this.mContext.getPackageName() + ".wschannel.APP_FOREGROUND";
    }

    public void openConnection(Map<String, Object> map, List<String> list) {
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        } else if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("configMap is empty !!!");
        } else {
            TTWebsocketConnection.Builder newWebsocketConnectionBuilder = mCronetEngine.newWebsocketConnectionBuilder(this.mCallback, h.a(m.a(p.FIXED).a(1).a()));
            try {
                newWebsocketConnectionBuilder.setUrlList(list);
                newWebsocketConnectionBuilder.setAppKey(String.valueOf(map.get("app_key")));
                newWebsocketConnectionBuilder.setFpid(((Integer) map.get("fpid")).intValue());
                newWebsocketConnectionBuilder.setAppVersion(((Integer) map.get("app_version")).intValue());
                newWebsocketConnectionBuilder.setAppId(((Integer) map.get("aid")).intValue());
                newWebsocketConnectionBuilder.setDeviceId(Long.parseLong((String) map.get("device_id")));
                newWebsocketConnectionBuilder.setInstallId(Long.parseLong((String) map.get("iid")));
                newWebsocketConnectionBuilder.setSharedConnection(this.sharedConnection);
                if (map.containsKey("sid")) {
                    newWebsocketConnectionBuilder.setSessionId((String) map.get("sid"));
                }
                String str = (String) map.get(PushConstants.EXTRA);
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(str)) {
                    for (String str2 : str.split("&")) {
                        if (!TextUtils.isEmpty(str2)) {
                            String[] split = str2.split("=");
                            if (split.length == 2) {
                                hashMap.put(split[0], split[1]);
                            }
                        }
                    }
                }
                newWebsocketConnectionBuilder.setCustomizedParams(hashMap);
                this.mWebsocketConnection = newWebsocketConnectionBuilder.build();
                this.mWebsocketConnection.startConnection();
            } catch (Throwable unused) {
                throw new IllegalArgumentException("configMap contain err params !!!");
            }
        }
    }
}
