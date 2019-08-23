package com.bytedance.common.wschannel.server;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcelable;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.WsChannelClient;
import com.bytedance.common.wschannel.converter.MsgConverterFactory;
import com.bytedance.common.wschannel.log.WsChannelLog;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelEnableObserver;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ChannelManager implements WeakHandler.IHandler, WsChannelEnableObserver.OnWsChannelEnableChangedObserver {
    @SuppressLint({"StaticFieldLeak"})
    private static ChannelManager sInstance;
    public final WsChannelSaver mChannelSaver;
    private Map<Integer, SocketState> mChannelState = new ConcurrentHashMap();
    public final Context mContext;
    private AtomicLong mCounter = new AtomicLong(0);
    public final HandlerThread mHandlerThread = new HandlerThread("wschannel");
    private final Object mLock = new Object();
    private final WsChannelMsgHandler mMessageHandler;
    public final WeakHandler mThreadHandler;
    private Map<Integer, IWsApp> mWsAppMap = new ConcurrentHashMap();
    private Map<Integer, IWsChannelClient> mWsChannelClientMap = new ConcurrentHashMap();
    public WsChannelEnableObserver mWsChannelEnableObserver;

    private boolean isEnable() {
        return this.mWsChannelEnableObserver.isEnable();
    }

    public void onDestroy() {
        runOnHandlerThread(new Runnable() {
            public void run() {
                ChannelManager.this.stopAllSocket();
                try {
                    if (Build.VERSION.SDK_INT >= 18) {
                        ChannelManager.this.mHandlerThread.quitSafely();
                    } else {
                        ChannelManager.this.mHandlerThread.quit();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void stopAllSocket() {
        try {
            synchronized (this.mLock) {
                for (Map.Entry<Integer, IWsChannelClient> value : this.mWsChannelClientMap.entrySet()) {
                    IWsChannelClient iWsChannelClient = (IWsChannelClient) value.getValue();
                    if (iWsChannelClient != null) {
                        iWsChannelClient.destroy();
                    }
                }
                this.mWsChannelClientMap.clear();
            }
            this.mWsAppMap.clear();
        } catch (Throwable unused) {
        }
    }

    private void runOnHandlerThread(Runnable runnable) {
        this.mThreadHandler.post(runnable);
    }

    public void handleMsg(Message message) {
        final Message obtain = Message.obtain(message);
        runOnHandlerThread(new Runnable() {
            public void run() {
                ChannelManager.this.doHandleMsg(obtain);
            }
        });
    }

    public void onWsChannelEnableChange(boolean z) {
        if (z) {
            tryConnectIfEnable(this.mChannelSaver.loadWsChannels());
        } else {
            stopAllSocket();
        }
    }

    public static ChannelManager inst(Context context) {
        if (sInstance == null) {
            synchronized (ChannelManager.class) {
                if (sInstance == null) {
                    sInstance = new ChannelManager(context);
                }
            }
        }
        return sInstance;
    }

    private void onNullParamLog(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("param_name", str);
        WsChannelLog.onEventV3Bundle(this.mContext, "wschannel_param_null", bundle);
    }

    public void tryConnectIfEnable(Map<Integer, IWsApp> map) {
        if (this.mWsChannelEnableObserver.isEnable() && map != null) {
            for (IWsApp next : map.values()) {
                if (next != null) {
                    doRegisterChannel(next);
                }
            }
        }
    }

    private ChannelManager(Context context) {
        this.mContext = context.getApplicationContext();
        this.mHandlerThread.start();
        this.mThreadHandler = new WeakHandler(this.mHandlerThread.getLooper(), this);
        this.mChannelSaver = new WsChannelSaver(this.mContext);
        this.mMessageHandler = new WsChannelMsgHandler(this.mContext, this.mChannelState, this.mWsAppMap);
        runOnHandlerThread(new Runnable() {
            public void run() {
                ChannelManager.this.mWsChannelEnableObserver = new WsChannelEnableObserver(ChannelManager.this.mContext, ChannelManager.this.mThreadHandler, ChannelManager.this);
                ChannelManager.this.tryConnectIfEnable(ChannelManager.this.mChannelSaver.loadWsChannels());
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = getConfigMap(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        r1.onParameterChange(r0, r6.getConnectUrls());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        throw new java.lang.IllegalArgumentException("configMap is empty !!!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doOnParamChange(@android.support.annotation.NonNull com.bytedance.common.wschannel.app.IWsApp r6) {
        /*
            r5 = this;
            int r0 = com.bytedance.common.wschannel.server.WsChannelService.getClientKey(r6)
            boolean r1 = r5.isEnable()
            if (r1 == 0) goto L_0x0064
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.channel.IWsChannelClient> r1 = r5.mWsChannelClientMap     // Catch:{ Throwable -> 0x0064 }
            int r2 = r6.getChannelId()     // Catch:{ Throwable -> 0x0064 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x0064 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Throwable -> 0x0064 }
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = (com.bytedance.common.wschannel.channel.IWsChannelClient) r1     // Catch:{ Throwable -> 0x0064 }
            java.lang.Class<com.bytedance.common.wschannel.server.WsChannelService> r2 = com.bytedance.common.wschannel.server.WsChannelService.class
            monitor-enter(r2)     // Catch:{ Throwable -> 0x0064 }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r3 = r5.mWsAppMap     // Catch:{ all -> 0x0061 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0061 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0061 }
            com.bytedance.common.wschannel.app.IWsApp r3 = (com.bytedance.common.wschannel.app.IWsApp) r3     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x005f
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0038
            boolean r3 = r1.isConnected()     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0038
            goto L_0x005f
        L_0x0038:
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r3 = r5.mWsAppMap     // Catch:{ all -> 0x0061 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0061 }
            r3.put(r0, r6)     // Catch:{ all -> 0x0061 }
            com.bytedance.common.wschannel.server.WsChannelSaver r0 = r5.mChannelSaver     // Catch:{ all -> 0x0061 }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r3 = r5.mWsAppMap     // Catch:{ all -> 0x0061 }
            r0.saveWsChannels(r3)     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            java.util.Map r0 = r5.getConfigMap(r6)     // Catch:{ Throwable -> 0x0064 }
            if (r0 == 0) goto L_0x0057
            java.util.List r6 = r6.getConnectUrls()     // Catch:{ Throwable -> 0x0064 }
            r1.onParameterChange(r0, r6)     // Catch:{ Throwable -> 0x0064 }
            goto L_0x0064
        L_0x0057:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0064 }
            java.lang.String r0 = "configMap is empty !!!"
            r6.<init>(r0)     // Catch:{ Throwable -> 0x0064 }
            throw r6     // Catch:{ Throwable -> 0x0064 }
        L_0x005f:
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            throw r6     // Catch:{ Throwable -> 0x0064 }
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ChannelManager.doOnParamChange(com.bytedance.common.wschannel.app.IWsApp):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doRegisterChannel(@android.support.annotation.NonNull com.bytedance.common.wschannel.app.IWsApp r8) {
        /*
            r7 = this;
            int r0 = com.bytedance.common.wschannel.server.WsChannelService.getClientKey(r8)
            boolean r1 = r7.isEnable()
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Class<com.bytedance.common.wschannel.server.WsChannelService> r1 = com.bytedance.common.wschannel.server.WsChannelService.class
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.mWsAppMap     // Catch:{ all -> 0x0055 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.app.IWsApp r2 = (com.bytedance.common.wschannel.app.IWsApp) r2     // Catch:{ all -> 0x0055 }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.channel.IWsChannelClient> r3 = r7.mWsChannelClientMap     // Catch:{ all -> 0x0055 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.channel.IWsChannelClient r3 = (com.bytedance.common.wschannel.channel.IWsChannelClient) r3     // Catch:{ all -> 0x0055 }
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0035
            boolean r6 = r8.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x0035
            if (r3 != 0) goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            r5 = 0
            goto L_0x0048
        L_0x0035:
            if (r2 != 0) goto L_0x0048
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.mWsAppMap     // Catch:{ all -> 0x0055 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r2.put(r0, r8)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.server.WsChannelSaver r0 = r7.mChannelSaver     // Catch:{ all -> 0x0055 }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.mWsAppMap     // Catch:{ all -> 0x0055 }
            r0.saveWsChannels(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0032
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            if (r4 == 0) goto L_0x004f
            r7.tryOpenConnection(r8)
            return
        L_0x004f:
            if (r5 == 0) goto L_0x0054
            r7.doOnParamChange(r8)
        L_0x0054:
            return
        L_0x0055:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ChannelManager.doRegisterChannel(com.bytedance.common.wschannel.app.IWsApp):void");
    }

    private void tryOpenConnection(IWsApp iWsApp) {
        IWsChannelClient iWsChannelClient;
        Logger.debug();
        synchronized (this.mLock) {
            iWsChannelClient = this.mWsChannelClientMap.get(Integer.valueOf(iWsApp.getChannelId()));
            if (iWsChannelClient == null) {
                iWsChannelClient = WsChannelClient.newInstance(iWsApp.getChannelId(), this.mMessageHandler, this.mThreadHandler);
                iWsChannelClient.init(this.mContext, iWsChannelClient);
                this.mWsChannelClientMap.put(Integer.valueOf(iWsApp.getChannelId()), iWsChannelClient);
            }
        }
        if (iWsChannelClient.isConnected()) {
            SocketState socketState = this.mChannelState.get(Integer.valueOf(iWsApp.getChannelId()));
            if (socketState != null) {
                try {
                    this.mMessageHandler.onConnection(socketState);
                } catch (Throwable unused) {
                }
            }
        } else {
            try {
                Logger.debug();
                Map<String, Object> configMap = getConfigMap(iWsApp);
                if (configMap != null) {
                    iWsChannelClient.openConnection(configMap, iWsApp.getConnectUrls());
                } else {
                    throw new IllegalArgumentException("configMap is empty !!!");
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private Map<String, Object> getConfigMap(IWsApp iWsApp) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_key", iWsApp.getAppKey());
        hashMap.put("fpid", Integer.valueOf(iWsApp.getFPID()));
        hashMap.put("sdk_version", 2);
        hashMap.put("platform", 0);
        hashMap.put("app_version", Integer.valueOf(iWsApp.getAppVersion()));
        hashMap.put("aid", Integer.valueOf(iWsApp.getAppId()));
        hashMap.put("device_id", iWsApp.getDeviceId());
        hashMap.put("iid", iWsApp.getInstallId());
        String extra = iWsApp.getExtra();
        if (extra == null) {
            onNullParamLog(PushConstants.EXTRA);
            extra = "";
        }
        hashMap.put(PushConstants.EXTRA, extra);
        if (iWsApp.getDeviceId() == null) {
            onNullParamLog("device_id");
        }
        if (iWsApp.getInstallId() == null) {
            onNullParamLog("install_id");
        }
        if (StringUtils.isEmpty(iWsApp.getAppKey())) {
            onNullParamLog("app_key");
        }
        return hashMap;
    }

    public void doHandleMsg(Message message) {
        boolean z;
        IWsChannelClient remove;
        try {
            int i = message.what;
            if (i == 0) {
                message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                Parcelable parcelable = message.getData().getParcelable("ws_app");
                if (parcelable instanceof IWsApp) {
                    doRegisterChannel((IWsApp) parcelable);
                }
            } else if (i == 1) {
                message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                Parcelable parcelable2 = message.getData().getParcelable("ws_app");
                if (parcelable2 instanceof IntegerParcelable) {
                    int data = ((IntegerParcelable) parcelable2).getData();
                    synchronized (WsChannelService.class) {
                        this.mWsAppMap.remove(Integer.valueOf(data));
                        this.mChannelSaver.saveWsChannels(this.mWsAppMap);
                    }
                    synchronized (this.mLock) {
                        remove = this.mWsChannelClientMap.remove(Integer.valueOf(data));
                    }
                    if (remove != null) {
                        Logger.debug();
                        remove.destroy();
                    }
                    this.mChannelState.remove(Integer.valueOf(data));
                    this.mThreadHandler.sendMessageDelayed(this.mThreadHandler.obtainMessage(8, remove), 1000);
                }
            } else if (i == 2) {
                int i2 = message.arg1;
                Logger.debug();
                if (isEnable()) {
                    for (IWsChannelClient next : this.mWsChannelClientMap.values()) {
                        if (next != null) {
                            next.onAppStateChanged(i2);
                        }
                    }
                }
            } else if (i == 3) {
                int i3 = message.arg1;
                Logger.debug();
                if (isEnable()) {
                    for (IWsChannelClient next2 : this.mWsChannelClientMap.values()) {
                        if (next2 != null) {
                            next2.onNetworkStateChanged(i3);
                        }
                    }
                }
            } else if (i == 4) {
                message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                Parcelable parcelable3 = message.getData().getParcelable("ws_app");
                if (parcelable3 instanceof IWsApp) {
                    doOnParamChange((IWsApp) parcelable3);
                }
            } else {
                if (i != 5) {
                    if (i != 10) {
                        if (i == 9) {
                            this.mMessageHandler.syncSocketState();
                        }
                    }
                }
                boolean z2 = false;
                if (i == 10) {
                    z = true;
                } else {
                    z = false;
                }
                message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
                Parcelable parcelable4 = message.getData().getParcelable("payload");
                if (parcelable4 instanceof WsChannelMsg) {
                    WsChannelMsg wsChannelMsg = (WsChannelMsg) parcelable4;
                    if (wsChannelMsg.getSeqId() <= 0) {
                        wsChannelMsg.setSeqId(this.mCounter.incrementAndGet());
                    }
                    IWsChannelClient iWsChannelClient = this.mWsChannelClientMap.get(Integer.valueOf(wsChannelMsg.getChannelId()));
                    if (iWsChannelClient != null) {
                        z2 = iWsChannelClient.sendMessage(MsgConverterFactory.getConverter().encode(wsChannelMsg));
                        if (!z2 && !z) {
                            long retryDelay = WsChannelSettings.inst(this.mContext).getRetryDelay();
                            if (retryDelay > 0) {
                                Message obtain = Message.obtain(message);
                                obtain.what = 10;
                                this.mThreadHandler.sendMessageDelayed(obtain, retryDelay);
                            }
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "sendPayload");
                        bundle.putInt("success", 0);
                        bundle.putString("reason", "client is null");
                        WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk", bundle);
                    }
                    Logger.debug();
                    ComponentName replayToComponentName = wsChannelMsg.getReplayToComponentName();
                    if (replayToComponentName != null) {
                        byte[] payload = wsChannelMsg.getPayload();
                        if (payload == null) {
                            payload = new byte[1];
                        }
                        Intent intent = new Intent();
                        intent.setAction("com.bytedance.article.wschannel.send.payload");
                        intent.setComponent(replayToComponentName);
                        intent.putExtra("send_result", z2);
                        intent.putExtra("payload_md5", DigestUtils.md5Hex(payload));
                        Logger.debug();
                        this.mContext.startService(intent);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
