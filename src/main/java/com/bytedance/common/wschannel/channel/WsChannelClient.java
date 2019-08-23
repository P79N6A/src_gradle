package com.bytedance.common.wschannel.channel;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.channel.impl.ok.OkChannelImpl;
import com.bytedance.common.wschannel.log.WsChannelLog;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class WsChannelClient implements IWsChannelClient {
    private static String sMyselfChannelImplClass = "";
    private static boolean useMySelfChannel = true;
    private final int mChannelId;
    private boolean mDestroy;
    private final Handler mHandler;
    private IMessageHandler mMessageHandler;
    private List<String> mUrls;
    private boolean mUseCronetPlugin = true;
    private IWsChannelClient mWsChannelImpl;

    private boolean useMySelfChannel() {
        return useMySelfChannel;
    }

    public boolean isConnected() {
        if (this.mWsChannelImpl != null) {
            return this.mWsChannelImpl.isConnected();
        }
        return false;
    }

    public void stopConnection() {
        if (this.mWsChannelImpl != null) {
            this.mWsChannelImpl.stopConnection();
        }
    }

    private void tryResolveMySelfChannelImpl() throws Exception {
        if (this.mWsChannelImpl == null) {
            Class<?> cls = null;
            if (!StringUtils.isEmpty(sMyselfChannelImplClass)) {
                cls = checkClass(sMyselfChannelImplClass);
            }
            if (cls == null) {
                cls = checkClass("org.chromium.wschannel.MySelfChannelImpl");
                this.mUseCronetPlugin = true;
            }
            if (cls == null) {
                cls = checkClass("com.b.c.ws.MySelfChannelImpl");
                this.mUseCronetPlugin = false;
            }
            if (cls != null) {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof IWsChannelClient) {
                    this.mWsChannelImpl = (IWsChannelClient) newInstance;
                    return;
                }
                return;
            }
            throw new ClassNotFoundException("plugin class not found");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|3|(2:5|(5:7|(1:12)(1:11)|13|14|15))|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void destroy() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            r5.mDestroy = r0     // Catch:{ all -> 0x004a }
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.mWsChannelImpl     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.mWsChannelImpl     // Catch:{ all -> 0x004a }
            r1.destroy()     // Catch:{ all -> 0x004a }
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.mWsChannelImpl     // Catch:{ all -> 0x004a }
            boolean r1 = r1 instanceof com.bytedance.common.wschannel.channel.impl.ok.OkChannelImpl     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0048
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x004a }
            r1.<init>()     // Catch:{ all -> 0x004a }
            java.util.List<java.lang.String> r2 = r5.mUrls     // Catch:{ all -> 0x004a }
            r3 = 0
            if (r2 == 0) goto L_0x002e
            java.util.List<java.lang.String> r2 = r5.mUrls     // Catch:{ all -> 0x004a }
            int r2 = r2.size()     // Catch:{ all -> 0x004a }
            if (r2 <= 0) goto L_0x002e
            java.util.List<java.lang.String> r2 = r5.mUrls     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x004a }
            goto L_0x0030
        L_0x002e:
            java.lang.String r2 = ""
        L_0x0030:
            java.lang.String r4 = "type"
            r1.put(r4, r3)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "state"
            r4 = 3
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "url"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = "channel_type"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0048 }
            r5.onConnectionInternal(r1)     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.WsChannelClient.destroy():void");
    }

    public static void setMyselfChannelImplClass(String str) {
        sMyselfChannelImplClass = str;
    }

    private Class<?> checkClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void onConnectionInternal(JSONObject jSONObject) {
        if (this.mMessageHandler != null) {
            this.mMessageHandler.onConnection(this.mChannelId, jSONObject);
        }
    }

    public void onAppStateChanged(int i) {
        if (this.mWsChannelImpl != null) {
            this.mWsChannelImpl.onAppStateChanged(i);
        }
    }

    public void onConnection(JSONObject jSONObject) {
        synchronized (this) {
            if (!this.mDestroy) {
                onConnectionInternal(jSONObject);
            }
        }
    }

    public void onMessage(byte[] bArr) {
        if (this.mMessageHandler != null) {
            this.mMessageHandler.onMessage(this.mChannelId, bArr);
        }
    }

    public void onNetworkStateChanged(int i) {
        if (this.mWsChannelImpl != null) {
            this.mWsChannelImpl.onNetworkStateChanged(i);
        }
    }

    public boolean sendMessage(byte[] bArr) {
        if (this.mWsChannelImpl != null) {
            return this.mWsChannelImpl.sendMessage(bArr);
        }
        return false;
    }

    public void onParameterChange(Map<String, Object> map, List<String> list) {
        if (this.mWsChannelImpl != null) {
            this.mWsChannelImpl.onParameterChange(map, list);
        }
        this.mUrls = list;
    }

    public void openConnection(Map<String, Object> map, List<String> list) {
        if (this.mWsChannelImpl != null) {
            this.mWsChannelImpl.openConnection(map, list);
        }
        this.mUrls = list;
    }

    public void init(Context context, IWsChannelClient iWsChannelClient) {
        if (this.mWsChannelImpl != null) {
            try {
                this.mWsChannelImpl.init(context, iWsChannelClient);
            } catch (Throwable th) {
                if (!(this.mWsChannelImpl instanceof OkChannelImpl)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("stackTrace", Log.getStackTraceString(th));
                    WsChannelLog.onEventV3Bundle(context, "cronet_ws_error", bundle);
                    this.mWsChannelImpl = new OkChannelImpl(this.mChannelId, this.mHandler);
                    this.mWsChannelImpl.init(context, iWsChannelClient);
                    return;
                }
                throw th;
            }
        }
    }

    public static WsChannelClient newInstance(int i, IMessageHandler iMessageHandler, Handler handler) {
        return new WsChannelClient(i, iMessageHandler, handler);
    }

    private WsChannelClient(int i, IMessageHandler iMessageHandler, Handler handler) {
        this.mChannelId = i;
        this.mMessageHandler = iMessageHandler;
        this.mHandler = handler;
        if (useMySelfChannel()) {
            try {
                tryResolveMySelfChannelImpl();
                if (!this.mUseCronetPlugin) {
                    useMySelfChannel = false;
                }
            } catch (Throwable unused) {
            }
        }
        if (this.mWsChannelImpl == null) {
            this.mWsChannelImpl = new OkChannelImpl(i, handler);
        }
    }
}
