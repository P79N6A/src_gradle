package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.LifeCycleMonitor;
import com.bytedance.common.wschannel.app.OnMessageReceiveListener;
import com.bytedance.common.wschannel.client.WsChannelClientSdk;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelReceiver;
import com.bytedance.common.wschannel.utils.Utils;
import com.ss.android.message.a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsChannelSdk {
    private static AppStateListener mAppStateChangedListener = new AppStateListener();
    private static Map<Integer, ChannelInfo> mRegisterMap = new ConcurrentHashMap();
    public static Application sApplication;
    private static boolean sCalculateAppState;
    public static DelayParam sDelayParams;
    private static volatile boolean sInit;
    private static final Object sLock = new Object();
    private static String sProcessName;

    static class AppStateListener implements LifeCycleMonitor.AppStateListener {
        private AppStateListener() {
        }

        public void onEnterToBackground() {
            if (WsChannelSdk.sDelayParams == null || WsChannelSdk.sDelayParams.finishDelay) {
                WsChannelClientSdk.onEnterToBackground(WsChannelSdk.sApplication);
            }
        }

        public void onEnterToForeground() {
            if (WsChannelSdk.sDelayParams == null || WsChannelSdk.sDelayParams.finishDelay) {
                WsChannelClientSdk.onEnterToForeground(WsChannelSdk.sApplication);
            }
        }
    }

    static class DelayParam {
        public boolean finishDelay;
        public Map<Integer, ChannelInfo> mDelayMap;

        private DelayParam() {
            this.mDelayMap = new ConcurrentHashMap();
        }
    }

    private WsChannelSdk() {
    }

    public static Context getContext() {
        return sApplication;
    }

    private static void checkInit() {
        if (!sInit) {
            throw new IllegalStateException("please init first");
        }
    }

    public static void enterToBackground() {
        if (sInit && !sCalculateAppState) {
            mAppStateChangedListener.onEnterToBackground();
        }
    }

    public static void enterToForeground() {
        if (sInit && !sCalculateAppState) {
            mAppStateChangedListener.onEnterToForeground();
        }
    }

    private static void registerNetChangeReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        sApplication.registerReceiver(new WsChannelReceiver(), intentFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void finishDelay() {
        /*
            checkInit()
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            com.bytedance.common.wschannel.WsChannelSdk$DelayParam r1 = sDelayParams     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x004b
            com.bytedance.common.wschannel.WsChannelSdk$DelayParam r1 = sDelayParams     // Catch:{ all -> 0x004d }
            boolean r1 = r1.finishDelay     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0011
            goto L_0x004b
        L_0x0011:
            com.bytedance.common.wschannel.WsChannelSdk$DelayParam r1 = sDelayParams     // Catch:{ all -> 0x004d }
            r2 = 1
            r1.finishDelay = r2     // Catch:{ all -> 0x004d }
            com.bytedance.common.wschannel.WsChannelSdk$DelayParam r1 = sDelayParams     // Catch:{ all -> 0x004d }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.ChannelInfo> r1 = r1.mDelayMap     // Catch:{ all -> 0x004d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0044
            com.bytedance.common.wschannel.WsChannelSdk$DelayParam r1 = sDelayParams     // Catch:{ all -> 0x004d }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.ChannelInfo> r1 = r1.mDelayMap     // Catch:{ all -> 0x004d }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x004d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004d }
        L_0x002c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x004d }
            com.bytedance.common.wschannel.ChannelInfo r2 = (com.bytedance.common.wschannel.ChannelInfo) r2     // Catch:{ all -> 0x004d }
            registerChannel(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002c
        L_0x003c:
            com.bytedance.common.wschannel.WsChannelSdk$DelayParam r1 = sDelayParams     // Catch:{ all -> 0x004d }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.ChannelInfo> r1 = r1.mDelayMap     // Catch:{ all -> 0x004d }
            r1.clear()     // Catch:{ all -> 0x004d }
            goto L_0x0049
        L_0x0044:
            android.app.Application r1 = sApplication     // Catch:{ all -> 0x004d }
            com.bytedance.common.wschannel.client.WsChannelClientSdk.tryStartPushProcess(r1, r2, r2)     // Catch:{ all -> 0x004d }
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelSdk.finishDelay():void");
    }

    public static boolean isEnable(Context context) {
        return WsChannelSettings.inst(context).isEnable();
    }

    public static boolean isOkChannelEnable(Context context) {
        return WsChannelSettings.inst(context).isOkChannelEnable();
    }

    private static void doRealRegisterOrParametersChangedMethod(ChannelInfo channelInfo) {
        mRegisterMap.put(Integer.valueOf(channelInfo.channelId), channelInfo);
        WsChannelClientSdk.registerApp(sApplication, createParameterMap(channelInfo));
    }

    public static boolean isWsConnected(int i) {
        if (sDelayParams == null || sDelayParams.finishDelay) {
            Application application = sApplication;
            WsChannelClientSdk.tryStartPushProcess(application, Utils.isMainProcess(application, sProcessName));
        }
        return WsConstants.isWsChannelConnected(i);
    }

    public static void onParametersChanged(ChannelInfo channelInfo) {
        checkInit();
        synchronized (sLock) {
            if (sDelayParams != null) {
                if (!sDelayParams.finishDelay) {
                    sDelayParams.mDelayMap.put(Integer.valueOf(channelInfo.channelId), channelInfo);
                }
            }
            SsWsApp createParameterMap = createParameterMap(channelInfo);
            mRegisterMap.put(Integer.valueOf(channelInfo.channelId), channelInfo);
            WsChannelClientSdk.onParameterChange(sApplication, createParameterMap);
        }
    }

    public static void registerChannel(ChannelInfo channelInfo) {
        checkInit();
        synchronized (sLock) {
            if (sDelayParams != null) {
                if (!sDelayParams.finishDelay) {
                    sDelayParams.mDelayMap.put(Integer.valueOf(channelInfo.channelId), channelInfo);
                }
            }
            doRealRegisterOrParametersChangedMethod(channelInfo);
        }
    }

    public static void unregisterChannel(int i) {
        checkInit();
        WsConstants.remove(i);
        mRegisterMap.remove(Integer.valueOf(i));
        synchronized (sLock) {
            if (sDelayParams != null && !sDelayParams.finishDelay) {
                sDelayParams.mDelayMap.remove(Integer.valueOf(i));
            }
        }
        finishDelay();
        WsChannelClientSdk.unRegisterApp(sApplication, i);
    }

    public static void sendPayload(WsChannelMsg wsChannelMsg) {
        checkInit();
        if (wsChannelMsg == null) {
            throw new IllegalArgumentException("WsChannelMsg can't be null");
        } else if (wsChannelMsg.getChannelId() <= 0) {
            throw new IllegalArgumentException("illegal channelId");
        } else if (wsChannelMsg.getService() <= 0) {
            throw new IllegalArgumentException("illegal service");
        } else if (wsChannelMsg.getMethod() <= 0) {
            throw new IllegalArgumentException("illegal method");
        } else if (wsChannelMsg.getPayload() != null) {
            if (sDelayParams != null && !sDelayParams.finishDelay) {
                finishDelay();
            }
            WsChannelClientSdk.inst().sendPayload(sApplication, wsChannelMsg);
        } else {
            throw new IllegalArgumentException("illegal payload");
        }
    }

    @NonNull
    private static SsWsApp createParameterMap(ChannelInfo channelInfo) {
        Map<String, String> map = channelInfo.extra;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            if (next != null) {
                arrayList.add(((String) next.getKey()) + "=" + ((String) next.getValue()));
            }
        }
        int i = channelInfo.aid;
        if (i > 0) {
            String str = channelInfo.deviceId;
            if (!StringUtils.isEmpty(str)) {
                String str2 = channelInfo.installId;
                if (!StringUtils.isEmpty(str2)) {
                    int i2 = channelInfo.fpid;
                    if (i2 > 0) {
                        String str3 = channelInfo.appKey;
                        if (!StringUtils.isEmpty(str3)) {
                            int i3 = channelInfo.updateVersionCode;
                            if (i3 > 0) {
                                int i4 = channelInfo.channelId;
                                if (i4 > 0) {
                                    return new SsWsApp.SsWsAppBuilder().setAppId(i).setDeviceId(str).setInstallId(str2).setFPID(i2).setAppKey(str3).setConnectUrls(channelInfo.urls).setAppVersion(i3).setPlatform(0).setChannelId(i4).setExtra(TextUtils.join("&", arrayList.toArray())).build();
                                }
                                throw new IllegalArgumentException("channelId <= 0 ,please set channelId first");
                            }
                            throw new IllegalArgumentException("appVersion <= 0 ,please set appVersion first");
                        }
                        throw new IllegalArgumentException("appKey is empty,please set appKey first");
                    }
                    throw new IllegalArgumentException("fpid <= 0 ,please set fpid first");
                }
                throw new IllegalArgumentException("installId is empty ,please set installId first");
            }
            throw new IllegalArgumentException("deviceId is empty ,please set deviceId first");
        }
        throw new IllegalArgumentException("aid == 0 ,please set aid first");
    }

    public static void init(Application application, @Nullable OnMessageReceiveListener onMessageReceiveListener) {
        doInit(application, onMessageReceiveListener, false, true);
    }

    public static void initWithoutLifeCycle(Application application, @Nullable OnMessageReceiveListener onMessageReceiveListener) {
        doInit(application, onMessageReceiveListener, false, false);
    }

    public static void setOkChannelEnable(Context context, boolean z) {
        WsChannelSettings.inst(context).setOKChannelEnable(z);
    }

    public static void setRetrySendMsgDelayTimeMillis(Context context, long j) {
        WsChannelSettings.inst(context).setRetrySendMsgDelay(j);
    }

    public static void setSocketLimit(Context context, long j) {
        WsChannelSettings.inst(context).setSocketReadLimitSize(j);
    }

    public static void onToutiaoWsChannelParametersChanged(ChannelInfo channelInfo, String str) {
        channelInfo.extra.put("sid", str);
        onParametersChanged(channelInfo);
    }

    public static void registerToutianChannel(ChannelInfo channelInfo, String str) {
        channelInfo.extra.put("sid", str);
        registerChannel(channelInfo);
    }

    public static void setEnable(Context context, boolean z) {
        boolean isEnable = WsChannelSettings.inst(context).isEnable();
        WsChannelSettings.inst(context).setEnable(z);
        if (!isEnable && z) {
            for (ChannelInfo registerChannel : mRegisterMap.values()) {
                registerChannel(registerChannel);
            }
        }
    }

    public static void init(Application application, @Nullable OnMessageReceiveListener onMessageReceiveListener, boolean z) {
        doInit(application, onMessageReceiveListener, z, true);
    }

    private static void doInit(Application application, @Nullable OnMessageReceiveListener onMessageReceiveListener, boolean z, boolean z2) {
        if (!sInit) {
            sInit = true;
            sApplication = application;
            sCalculateAppState = z2;
            sProcessName = Utils.getCurProcessName(application);
            try {
                a.a(application);
            } catch (Throwable unused) {
            }
            boolean isMainProcess = Utils.isMainProcess(application, sProcessName);
            if (z && isMainProcess) {
                DelayParam delayParam = new DelayParam();
                sDelayParams = delayParam;
                delayParam.finishDelay = false;
            }
            if (isMainProcess) {
                if (z2) {
                    LifeCycleMonitor lifeCycleMonitor = new LifeCycleMonitor();
                    lifeCycleMonitor.setAppStateChangedListener(mAppStateChangedListener);
                    application.registerActivityLifecycleCallbacks(lifeCycleMonitor);
                }
                WsConstants.setOnMessageReceiveListener(onMessageReceiveListener);
            } else if (Utils.isMessageProcess(sProcessName)) {
                registerNetChangeReceiver();
            }
            if (sDelayParams == null) {
                WsChannelClientSdk.tryStartPushProcess(sApplication, isMainProcess, true);
            }
        }
    }
}
