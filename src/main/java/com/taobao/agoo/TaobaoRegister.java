package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.client.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.a.b;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.NotifManager;

public final class TaobaoRegister {
    public static b mRequestListener;

    @Deprecated
    public static void setBuilderSound(Context context, String str) {
    }

    @Deprecated
    public static void setNotificationIcon(Context context, int i) {
    }

    @Deprecated
    public static void setNotificationSound(Context context, boolean z) {
    }

    @Deprecated
    public static void setNotificationVibrate(Context context, boolean z) {
    }

    private TaobaoRegister() {
        throw new UnsupportedOperationException();
    }

    public static void setAgooMsgReceiveService(String str) {
        a.f78910b = str;
    }

    public static void setEnv(Context context, @AccsClientConfig.ENV int i) {
        ACCSClient.setEnvironment(context, i);
    }

    @Deprecated
    public static void unregister(Context context, CallBack callBack) {
        unbindAgoo(context, null);
    }

    public static void bindAgoo(Context context, ICallback iCallback) {
        sendSwitch(context, iCallback, true);
        UTMini.getInstance().commitEvent(66001, "bindAgoo", UtilityImpl.l(context));
    }

    public static void unbindAgoo(Context context, ICallback iCallback) {
        sendSwitch(context, iCallback, false);
        UTMini.getInstance().commitEvent(66001, "unregister", UtilityImpl.l(context));
    }

    public static void isEnableDaemonServer(Context context, boolean z) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("TaobaoRegister", "isEnableDaemonServer begin,enable=" + z, new Object[0]);
        }
        Config.a(context, z);
    }

    public static synchronized void setAccsConfigTag(Context context, String str) {
        synchronized (TaobaoRegister.class) {
            Config.f83987a = str;
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag != null) {
                ALog.i("TaobaoRegister", "setAccsConfigTag", "config", configByTag.toString());
                a.f78911c = configByTag.getAuthCode();
                Config.setAgooAppKey(context, configByTag.getAppKey());
                String appSecret = configByTag.getAppSecret();
                com.taobao.accs.utl.a.f79096b = appSecret;
                if (!TextUtils.isEmpty(appSecret)) {
                    a.f78909a = 2;
                }
            } else {
                throw new RuntimeException("accs config not exist!! please set accs config first!!");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void removeAlias(android.content.Context r8, com.taobao.agoo.ICallback r9) {
        /*
            java.lang.Class<com.taobao.agoo.TaobaoRegister> r0 = com.taobao.agoo.TaobaoRegister.class
            monitor-enter(r0)
            java.lang.String r1 = "TaobaoRegister"
            java.lang.String r2 = "removeAlias"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b8 }
            com.taobao.accs.utl.ALog.i(r1, r2, r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = org.android.agoo.common.Config.g(r8)     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r2 = org.android.agoo.common.Config.h(r8)     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r4 = org.android.agoo.common.Config.a(r8)     // Catch:{ Throwable -> 0x00ac }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00ac }
            if (r5 != 0) goto L_0x0077
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00ac }
            if (r5 != 0) goto L_0x0077
            if (r8 == 0) goto L_0x0077
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x00ac }
            if (r5 == 0) goto L_0x002e
            goto L_0x0077
        L_0x002e:
            java.lang.String r5 = org.android.agoo.common.Config.b(r8)     // Catch:{ Throwable -> 0x00ac }
            com.taobao.accs.b r5 = com.taobao.accs.ACCSManager.getAccsInstance(r8, r4, r5)     // Catch:{ Throwable -> 0x00ac }
            com.taobao.agoo.a.b r6 = mRequestListener     // Catch:{ Throwable -> 0x00ac }
            if (r6 != 0) goto L_0x0045
            com.taobao.agoo.a.b r6 = new com.taobao.agoo.a.b     // Catch:{ Throwable -> 0x00ac }
            android.content.Context r7 = r8.getApplicationContext()     // Catch:{ Throwable -> 0x00ac }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00ac }
            mRequestListener = r6     // Catch:{ Throwable -> 0x00ac }
        L_0x0045:
            java.lang.String r6 = "AgooDeviceCmd"
            com.taobao.agoo.a.b r7 = mRequestListener     // Catch:{ Throwable -> 0x00ac }
            r5.a((android.content.Context) r8, (java.lang.String) r6, (com.taobao.accs.base.AccsAbstractDataListener) r7)     // Catch:{ Throwable -> 0x00ac }
            byte[] r1 = com.taobao.agoo.a.a.a.b(r4, r1, r2)     // Catch:{ Throwable -> 0x00ac }
            com.taobao.accs.ACCSManager$AccsRequest r2 = new com.taobao.accs.ACCSManager$AccsRequest     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r4 = "AgooDeviceCmd"
            r6 = 0
            r2.<init>(r6, r4, r1, r6)     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r8 = r5.b((android.content.Context) r8, (com.taobao.accs.ACCSManager.AccsRequest) r2)     // Catch:{ Throwable -> 0x00ac }
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x00ac }
            if (r1 == 0) goto L_0x006c
            if (r9 == 0) goto L_0x0075
            java.lang.String r8 = "504.1"
            java.lang.String r1 = "accs channel disabled!"
            r9.onFailure(r8, r1)     // Catch:{ Throwable -> 0x00ac }
            goto L_0x00b6
        L_0x006c:
            if (r9 == 0) goto L_0x0075
            com.taobao.agoo.a.b r1 = mRequestListener     // Catch:{ Throwable -> 0x00ac }
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r1 = r1.f79131a     // Catch:{ Throwable -> 0x00ac }
            r1.put(r8, r9)     // Catch:{ Throwable -> 0x00ac }
        L_0x0075:
            monitor-exit(r0)
            return
        L_0x0077:
            if (r9 == 0) goto L_0x0080
            java.lang.String r5 = "504.1"
            java.lang.String r6 = "input params null!!"
            r9.onFailure(r5, r6)     // Catch:{ Throwable -> 0x00ac }
        L_0x0080:
            java.lang.String r9 = "TaobaoRegister"
            java.lang.String r5 = "setAlias param null"
            r6 = 8
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r7 = "appkey"
            r6[r3] = r7     // Catch:{ Throwable -> 0x00ac }
            r7 = 1
            r6[r7] = r4     // Catch:{ Throwable -> 0x00ac }
            r4 = 2
            java.lang.String r7 = "deviceId"
            r6[r4] = r7     // Catch:{ Throwable -> 0x00ac }
            r4 = 3
            r6[r4] = r1     // Catch:{ Throwable -> 0x00ac }
            r1 = 4
            java.lang.String r4 = "pushAliasToken"
            r6[r1] = r4     // Catch:{ Throwable -> 0x00ac }
            r1 = 5
            r6[r1] = r2     // Catch:{ Throwable -> 0x00ac }
            r1 = 6
            java.lang.String r2 = "context"
            r6[r1] = r2     // Catch:{ Throwable -> 0x00ac }
            r1 = 7
            r6[r1] = r8     // Catch:{ Throwable -> 0x00ac }
            com.taobao.accs.utl.ALog.e(r9, r5, r6)     // Catch:{ Throwable -> 0x00ac }
            monitor-exit(r0)
            return
        L_0x00ac:
            r8 = move-exception
            java.lang.String r9 = "TaobaoRegister"
            java.lang.String r1 = "removeAlias"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b8 }
            com.taobao.accs.utl.ALog.e(r9, r1, r8, r2)     // Catch:{ all -> 0x00b8 }
        L_0x00b6:
            monitor-exit(r0)
            return
        L_0x00b8:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.removeAlias(android.content.Context, com.taobao.agoo.ICallback):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clickMessage(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            org.android.agoo.control.NotifManager r0 = new org.android.agoo.control.NotifManager
            r0.<init>()
            r1 = 0
            r2 = 0
            com.taobao.accs.utl.ALog$Level r3 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Throwable -> 0x0065 }
            boolean r3 = com.taobao.accs.utl.ALog.isPrintLog(r3)     // Catch:{ Throwable -> 0x0065 }
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = "TaobaoRegister"
            java.lang.String r4 = "clickMessage"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r6 = "msgid"
            r5[r2] = r6     // Catch:{ Throwable -> 0x0065 }
            r6 = 1
            r5[r6] = r9     // Catch:{ Throwable -> 0x0065 }
            r6 = 2
            java.lang.String r7 = "extData"
            r5[r6] = r7     // Catch:{ Throwable -> 0x0065 }
            r6 = 3
            r5[r6] = r10     // Catch:{ Throwable -> 0x0065 }
            com.taobao.accs.utl.ALog.i(r3, r4, r5)     // Catch:{ Throwable -> 0x0065 }
        L_0x0028:
            java.lang.String r3 = "accs"
            java.lang.String r4 = "8"
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0065 }
            if (r5 == 0) goto L_0x003c
            java.lang.String r8 = "TaobaoRegister"
            java.lang.String r9 = "messageId == null"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0065 }
            com.taobao.accs.utl.ALog.d(r8, r9, r10)     // Catch:{ Throwable -> 0x0065 }
            return
        L_0x003c:
            r0.init(r8)     // Catch:{ Throwable -> 0x0065 }
            org.android.agoo.common.MsgDO r5 = new org.android.agoo.common.MsgDO     // Catch:{ Throwable -> 0x0065 }
            r5.<init>()     // Catch:{ Throwable -> 0x0065 }
            r5.msgIds = r9     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r5.extData = r10     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r5.messageSource = r3     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r5.msgStatus = r4     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            org.android.agoo.control.AgooFactory r10 = new org.android.agoo.control.AgooFactory     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r10.<init>()     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r10.init(r8, r0, r1)     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            java.lang.String r8 = "8"
            r10.updateMsgStatus(r9, r8)     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r0.reportNotifyMessage(r5)
            return
        L_0x005d:
            r8 = move-exception
            r1 = r5
            goto L_0x0082
        L_0x0060:
            r8 = move-exception
            r1 = r5
            goto L_0x0066
        L_0x0063:
            r8 = move-exception
            goto L_0x0082
        L_0x0065:
            r8 = move-exception
        L_0x0066:
            java.lang.String r9 = "TaobaoRegister"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "clickMessage,error="
            r10.<init>(r3)     // Catch:{ all -> 0x0063 }
            r10.append(r8)     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0063 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x0063 }
            com.taobao.accs.utl.ALog.e(r9, r8, r10)     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0081
            r0.reportNotifyMessage(r1)
            return
        L_0x0081:
            return
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            r0.reportNotifyMessage(r1)
        L_0x0087:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.clickMessage(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void dismissMessage(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            org.android.agoo.control.NotifManager r0 = new org.android.agoo.control.NotifManager
            r0.<init>()
            r1 = 0
            r2 = 0
            com.taobao.accs.utl.ALog$Level r3 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Throwable -> 0x0065 }
            boolean r3 = com.taobao.accs.utl.ALog.isPrintLog(r3)     // Catch:{ Throwable -> 0x0065 }
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = "TaobaoRegister"
            java.lang.String r4 = "dismissMessage"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r6 = "msgid"
            r5[r2] = r6     // Catch:{ Throwable -> 0x0065 }
            r6 = 1
            r5[r6] = r9     // Catch:{ Throwable -> 0x0065 }
            r6 = 2
            java.lang.String r7 = "extData"
            r5[r6] = r7     // Catch:{ Throwable -> 0x0065 }
            r6 = 3
            r5[r6] = r10     // Catch:{ Throwable -> 0x0065 }
            com.taobao.accs.utl.ALog.i(r3, r4, r5)     // Catch:{ Throwable -> 0x0065 }
        L_0x0028:
            java.lang.String r3 = "accs"
            java.lang.String r4 = "9"
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0065 }
            if (r5 == 0) goto L_0x003c
            java.lang.String r8 = "TaobaoRegister"
            java.lang.String r9 = "messageId == null"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0065 }
            com.taobao.accs.utl.ALog.d(r8, r9, r10)     // Catch:{ Throwable -> 0x0065 }
            return
        L_0x003c:
            r0.init(r8)     // Catch:{ Throwable -> 0x0065 }
            org.android.agoo.common.MsgDO r5 = new org.android.agoo.common.MsgDO     // Catch:{ Throwable -> 0x0065 }
            r5.<init>()     // Catch:{ Throwable -> 0x0065 }
            r5.msgIds = r9     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r5.extData = r10     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r5.messageSource = r3     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r5.msgStatus = r4     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            org.android.agoo.control.AgooFactory r10 = new org.android.agoo.control.AgooFactory     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r10.<init>()     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r10.init(r8, r0, r1)     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            java.lang.String r8 = "9"
            r10.updateMsgStatus(r9, r8)     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r0.reportNotifyMessage(r5)
            return
        L_0x005d:
            r8 = move-exception
            r1 = r5
            goto L_0x0082
        L_0x0060:
            r8 = move-exception
            r1 = r5
            goto L_0x0066
        L_0x0063:
            r8 = move-exception
            goto L_0x0082
        L_0x0065:
            r8 = move-exception
        L_0x0066:
            java.lang.String r9 = "TaobaoRegister"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "clickMessage,error="
            r10.<init>(r3)     // Catch:{ all -> 0x0063 }
            r10.append(r8)     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0063 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x0063 }
            com.taobao.accs.utl.ALog.e(r9, r8, r10)     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0081
            r0.reportNotifyMessage(r1)
            return
        L_0x0081:
            return
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            r0.reportNotifyMessage(r1)
        L_0x0087:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.dismissMessage(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void sendSwitch(android.content.Context r8, com.taobao.agoo.ICallback r9, boolean r10) {
        /*
            java.lang.Class<com.taobao.agoo.TaobaoRegister> r0 = com.taobao.agoo.TaobaoRegister.class
            monitor-enter(r0)
            r1 = 0
            java.lang.String r2 = org.android.agoo.common.Config.g(r8)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r3 = org.android.agoo.common.Config.a(r8)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r4 = com.taobao.accs.utl.UtilityImpl.l(r8)     // Catch:{ Throwable -> 0x00a9 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x00a9 }
            if (r5 != 0) goto L_0x006e
            if (r8 == 0) goto L_0x006e
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x00a9 }
            if (r5 == 0) goto L_0x0025
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00a9 }
            if (r5 == 0) goto L_0x0025
            goto L_0x006e
        L_0x0025:
            java.lang.String r5 = org.android.agoo.common.Config.b(r8)     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.accs.b r5 = com.taobao.accs.ACCSManager.getAccsInstance(r8, r3, r5)     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.agoo.a.b r6 = mRequestListener     // Catch:{ Throwable -> 0x00a9 }
            if (r6 != 0) goto L_0x003c
            com.taobao.agoo.a.b r6 = new com.taobao.agoo.a.b     // Catch:{ Throwable -> 0x00a9 }
            android.content.Context r7 = r8.getApplicationContext()     // Catch:{ Throwable -> 0x00a9 }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00a9 }
            mRequestListener = r6     // Catch:{ Throwable -> 0x00a9 }
        L_0x003c:
            java.lang.String r6 = "AgooDeviceCmd"
            com.taobao.agoo.a.b r7 = mRequestListener     // Catch:{ Throwable -> 0x00a9 }
            r5.a((android.content.Context) r8, (java.lang.String) r6, (com.taobao.accs.base.AccsAbstractDataListener) r7)     // Catch:{ Throwable -> 0x00a9 }
            byte[] r10 = com.taobao.agoo.a.a.d.a(r3, r2, r4, r10)     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.accs.ACCSManager$AccsRequest r2 = new com.taobao.accs.ACCSManager$AccsRequest     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r3 = "AgooDeviceCmd"
            r4 = 0
            r2.<init>(r4, r3, r10, r4)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r8 = r5.b((android.content.Context) r8, (com.taobao.accs.ACCSManager.AccsRequest) r2)     // Catch:{ Throwable -> 0x00a9 }
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x00a9 }
            if (r10 == 0) goto L_0x0063
            if (r9 == 0) goto L_0x006c
            java.lang.String r8 = "503.2"
            java.lang.String r10 = "accs channel disabled!"
            r9.onFailure(r8, r10)     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x00b3
        L_0x0063:
            if (r9 == 0) goto L_0x006c
            com.taobao.agoo.a.b r10 = mRequestListener     // Catch:{ Throwable -> 0x00a9 }
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r10 = r10.f79131a     // Catch:{ Throwable -> 0x00a9 }
            r10.put(r8, r9)     // Catch:{ Throwable -> 0x00a9 }
        L_0x006c:
            monitor-exit(r0)
            return
        L_0x006e:
            if (r9 == 0) goto L_0x0077
            java.lang.String r4 = "503.3"
            java.lang.String r5 = "input params null!!"
            r9.onFailure(r4, r5)     // Catch:{ Throwable -> 0x00a9 }
        L_0x0077:
            java.lang.String r9 = "TaobaoRegister"
            java.lang.String r4 = "sendSwitch param null"
            r5 = 8
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r6 = "appkey"
            r5[r1] = r6     // Catch:{ Throwable -> 0x00a9 }
            r6 = 1
            r5[r6] = r3     // Catch:{ Throwable -> 0x00a9 }
            r3 = 2
            java.lang.String r6 = "deviceId"
            r5[r3] = r6     // Catch:{ Throwable -> 0x00a9 }
            r3 = 3
            r5[r3] = r2     // Catch:{ Throwable -> 0x00a9 }
            r2 = 4
            java.lang.String r3 = "context"
            r5[r2] = r3     // Catch:{ Throwable -> 0x00a9 }
            r2 = 5
            r5[r2] = r8     // Catch:{ Throwable -> 0x00a9 }
            r8 = 6
            java.lang.String r2 = "enablePush"
            r5[r8] = r2     // Catch:{ Throwable -> 0x00a9 }
            r8 = 7
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ Throwable -> 0x00a9 }
            r5[r8] = r10     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.accs.utl.ALog.e(r9, r4, r5)     // Catch:{ Throwable -> 0x00a9 }
            monitor-exit(r0)
            return
        L_0x00a7:
            r8 = move-exception
            goto L_0x00b5
        L_0x00a9:
            r8 = move-exception
            java.lang.String r9 = "TaobaoRegister"
            java.lang.String r10 = "sendSwitch"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a7 }
            com.taobao.accs.utl.ALog.e(r9, r10, r8, r1)     // Catch:{ all -> 0x00a7 }
        L_0x00b3:
            monitor-exit(r0)
            return
        L_0x00b5:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.sendSwitch(android.content.Context, com.taobao.agoo.ICallback, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void setAlias(android.content.Context r9, java.lang.String r10, com.taobao.agoo.ICallback r11) {
        /*
            java.lang.Class<com.taobao.agoo.TaobaoRegister> r0 = com.taobao.agoo.TaobaoRegister.class
            monitor-enter(r0)
            java.lang.String r1 = "TaobaoRegister"
            java.lang.String r2 = "setAlias"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f1 }
            java.lang.String r5 = "alias"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x00f1 }
            r5 = 1
            r4[r5] = r10     // Catch:{ all -> 0x00f1 }
            com.taobao.accs.utl.ALog.i(r1, r2, r4)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = org.android.agoo.common.Config.g(r9)     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = org.android.agoo.common.Config.a(r9)     // Catch:{ all -> 0x00f1 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00f1 }
            if (r4 != 0) goto L_0x00be
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00f1 }
            if (r4 != 0) goto L_0x00be
            if (r9 == 0) goto L_0x00be
            boolean r4 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x00f1 }
            if (r4 == 0) goto L_0x0033
            goto L_0x00be
        L_0x0033:
            com.taobao.agoo.a.b r4 = mRequestListener     // Catch:{ Throwable -> 0x00b2 }
            if (r4 != 0) goto L_0x0042
            com.taobao.agoo.a.b r4 = new com.taobao.agoo.a.b     // Catch:{ Throwable -> 0x00b2 }
            android.content.Context r7 = r9.getApplicationContext()     // Catch:{ Throwable -> 0x00b2 }
            r4.<init>(r7)     // Catch:{ Throwable -> 0x00b2 }
            mRequestListener = r4     // Catch:{ Throwable -> 0x00b2 }
        L_0x0042:
            com.taobao.agoo.a.a r4 = com.taobao.agoo.a.b.f79130b     // Catch:{ Throwable -> 0x00b2 }
            boolean r4 = r4.d(r10)     // Catch:{ Throwable -> 0x00b2 }
            if (r4 == 0) goto L_0x0060
            java.lang.String r9 = "TaobaoRegister"
            java.lang.String r1 = "setAlias already set"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r3 = "alias"
            r2[r6] = r3     // Catch:{ Throwable -> 0x00b2 }
            r2[r5] = r10     // Catch:{ Throwable -> 0x00b2 }
            com.taobao.accs.utl.ALog.i(r9, r1, r2)     // Catch:{ Throwable -> 0x00b2 }
            if (r11 == 0) goto L_0x005e
            r11.onSuccess()     // Catch:{ Throwable -> 0x00b2 }
        L_0x005e:
            monitor-exit(r0)
            return
        L_0x0060:
            java.lang.String r3 = org.android.agoo.common.Config.b(r9)     // Catch:{ Throwable -> 0x00b2 }
            com.taobao.accs.b r3 = com.taobao.accs.ACCSManager.getAccsInstance(r9, r2, r3)     // Catch:{ Throwable -> 0x00b2 }
            com.taobao.agoo.a.a r4 = com.taobao.agoo.a.b.f79130b     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r5 = r9.getPackageName()     // Catch:{ Throwable -> 0x00b2 }
            boolean r4 = r4.b(r5)     // Catch:{ Throwable -> 0x00b2 }
            if (r4 == 0) goto L_0x00a7
            java.lang.String r4 = "AgooDeviceCmd"
            com.taobao.agoo.a.b r5 = mRequestListener     // Catch:{ Throwable -> 0x00b2 }
            r3.a((android.content.Context) r9, (java.lang.String) r4, (com.taobao.accs.base.AccsAbstractDataListener) r5)     // Catch:{ Throwable -> 0x00b2 }
            byte[] r1 = com.taobao.agoo.a.a.a.a(r2, r1, r10)     // Catch:{ Throwable -> 0x00b2 }
            com.taobao.accs.ACCSManager$AccsRequest r2 = new com.taobao.accs.ACCSManager$AccsRequest     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r4 = "AgooDeviceCmd"
            r5 = 0
            r2.<init>(r5, r4, r1, r5)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r9 = r3.b((android.content.Context) r9, (com.taobao.accs.ACCSManager.AccsRequest) r2)     // Catch:{ Throwable -> 0x00b2 }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x009b
            if (r11 == 0) goto L_0x00bc
            java.lang.String r9 = "504.1"
            java.lang.String r10 = "accs channel disabled!"
            r11.onFailure(r9, r10)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x00b0
        L_0x009b:
            if (r11 == 0) goto L_0x00bc
            r11.extra = r10     // Catch:{ Throwable -> 0x00b2 }
            com.taobao.agoo.a.b r10 = mRequestListener     // Catch:{ Throwable -> 0x00b2 }
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r10 = r10.f79131a     // Catch:{ Throwable -> 0x00b2 }
            r10.put(r9, r11)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x00bc
        L_0x00a7:
            if (r11 == 0) goto L_0x00b0
            java.lang.String r9 = "504.1"
            java.lang.String r10 = "bindApp first!!"
            r11.onFailure(r9, r10)     // Catch:{ Throwable -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r0)
            return
        L_0x00b2:
            r9 = move-exception
            java.lang.String r10 = "TaobaoRegister"
            java.lang.String r11 = "setAlias"
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x00f1 }
            com.taobao.accs.utl.ALog.e(r10, r11, r9, r1)     // Catch:{ all -> 0x00f1 }
        L_0x00bc:
            monitor-exit(r0)
            return
        L_0x00be:
            if (r11 == 0) goto L_0x00c7
            java.lang.String r4 = "504.1"
            java.lang.String r7 = "input params null!!"
            r11.onFailure(r4, r7)     // Catch:{ all -> 0x00f1 }
        L_0x00c7:
            java.lang.String r11 = "TaobaoRegister"
            java.lang.String r4 = "setAlias param null"
            r7 = 8
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = "appkey"
            r7[r6] = r8     // Catch:{ all -> 0x00f1 }
            r7[r5] = r2     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "deviceId"
            r7[r3] = r2     // Catch:{ all -> 0x00f1 }
            r2 = 3
            r7[r2] = r1     // Catch:{ all -> 0x00f1 }
            r1 = 4
            java.lang.String r2 = "alias"
            r7[r1] = r2     // Catch:{ all -> 0x00f1 }
            r1 = 5
            r7[r1] = r10     // Catch:{ all -> 0x00f1 }
            r10 = 6
            java.lang.String r1 = "context"
            r7[r10] = r1     // Catch:{ all -> 0x00f1 }
            r10 = 7
            r7[r10] = r9     // Catch:{ all -> 0x00f1 }
            com.taobao.accs.utl.ALog.e(r11, r4, r7)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r0)
            return
        L_0x00f1:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.setAlias(android.content.Context, java.lang.String, com.taobao.agoo.ICallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void removeAlias(android.content.Context r7, java.lang.String r8, com.taobao.agoo.ICallback r9) {
        /*
            java.lang.Class<com.taobao.agoo.TaobaoRegister> r0 = com.taobao.agoo.TaobaoRegister.class
            monitor-enter(r0)
            java.lang.String r1 = "TaobaoRegister"
            java.lang.String r2 = "removeAlias"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b4 }
            com.taobao.accs.utl.ALog.i(r1, r2, r4)     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = org.android.agoo.common.Config.g(r7)     // Catch:{ Throwable -> 0x00a8 }
            java.lang.String r2 = org.android.agoo.common.Config.a(r7)     // Catch:{ Throwable -> 0x00a8 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x00a8 }
            if (r4 != 0) goto L_0x0073
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00a8 }
            if (r4 != 0) goto L_0x0073
            if (r7 == 0) goto L_0x0073
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x00a8 }
            if (r4 == 0) goto L_0x002a
            goto L_0x0073
        L_0x002a:
            java.lang.String r4 = org.android.agoo.common.Config.b(r7)     // Catch:{ Throwable -> 0x00a8 }
            com.taobao.accs.b r4 = com.taobao.accs.ACCSManager.getAccsInstance(r7, r2, r4)     // Catch:{ Throwable -> 0x00a8 }
            com.taobao.agoo.a.b r5 = mRequestListener     // Catch:{ Throwable -> 0x00a8 }
            if (r5 != 0) goto L_0x0041
            com.taobao.agoo.a.b r5 = new com.taobao.agoo.a.b     // Catch:{ Throwable -> 0x00a8 }
            android.content.Context r6 = r7.getApplicationContext()     // Catch:{ Throwable -> 0x00a8 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x00a8 }
            mRequestListener = r5     // Catch:{ Throwable -> 0x00a8 }
        L_0x0041:
            java.lang.String r5 = "AgooDeviceCmd"
            com.taobao.agoo.a.b r6 = mRequestListener     // Catch:{ Throwable -> 0x00a8 }
            r4.a((android.content.Context) r7, (java.lang.String) r5, (com.taobao.accs.base.AccsAbstractDataListener) r6)     // Catch:{ Throwable -> 0x00a8 }
            byte[] r8 = com.taobao.agoo.a.a.a.c(r2, r1, r8)     // Catch:{ Throwable -> 0x00a8 }
            com.taobao.accs.ACCSManager$AccsRequest r1 = new com.taobao.accs.ACCSManager$AccsRequest     // Catch:{ Throwable -> 0x00a8 }
            java.lang.String r2 = "AgooDeviceCmd"
            r5 = 0
            r1.<init>(r5, r2, r8, r5)     // Catch:{ Throwable -> 0x00a8 }
            java.lang.String r7 = r4.b((android.content.Context) r7, (com.taobao.accs.ACCSManager.AccsRequest) r1)     // Catch:{ Throwable -> 0x00a8 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x00a8 }
            if (r8 == 0) goto L_0x0068
            if (r9 == 0) goto L_0x0071
            java.lang.String r7 = "504.1"
            java.lang.String r8 = "accs channel disabled!"
            r9.onFailure(r7, r8)     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00b2
        L_0x0068:
            if (r9 == 0) goto L_0x0071
            com.taobao.agoo.a.b r8 = mRequestListener     // Catch:{ Throwable -> 0x00a8 }
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r8 = r8.f79131a     // Catch:{ Throwable -> 0x00a8 }
            r8.put(r7, r9)     // Catch:{ Throwable -> 0x00a8 }
        L_0x0071:
            monitor-exit(r0)
            return
        L_0x0073:
            if (r9 == 0) goto L_0x007c
            java.lang.String r4 = "504.1"
            java.lang.String r5 = "input params null!!"
            r9.onFailure(r4, r5)     // Catch:{ Throwable -> 0x00a8 }
        L_0x007c:
            java.lang.String r9 = "TaobaoRegister"
            java.lang.String r4 = "setAlias param null"
            r5 = 8
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00a8 }
            java.lang.String r6 = "appkey"
            r5[r3] = r6     // Catch:{ Throwable -> 0x00a8 }
            r6 = 1
            r5[r6] = r2     // Catch:{ Throwable -> 0x00a8 }
            r2 = 2
            java.lang.String r6 = "deviceId"
            r5[r2] = r6     // Catch:{ Throwable -> 0x00a8 }
            r2 = 3
            r5[r2] = r1     // Catch:{ Throwable -> 0x00a8 }
            r1 = 4
            java.lang.String r2 = "alias"
            r5[r1] = r2     // Catch:{ Throwable -> 0x00a8 }
            r1 = 5
            r5[r1] = r8     // Catch:{ Throwable -> 0x00a8 }
            r8 = 6
            java.lang.String r1 = "context"
            r5[r8] = r1     // Catch:{ Throwable -> 0x00a8 }
            r8 = 7
            r5[r8] = r7     // Catch:{ Throwable -> 0x00a8 }
            com.taobao.accs.utl.ALog.e(r9, r4, r5)     // Catch:{ Throwable -> 0x00a8 }
            monitor-exit(r0)
            return
        L_0x00a8:
            r7 = move-exception
            java.lang.String r8 = "TaobaoRegister"
            java.lang.String r9 = "removeAlias"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b4 }
            com.taobao.accs.utl.ALog.e(r8, r9, r7, r1)     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r0)
            return
        L_0x00b4:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.removeAlias(android.content.Context, java.lang.String, com.taobao.agoo.ICallback):void");
    }

    @Deprecated
    public static void bindAgoo(Context context, String str, String str2, CallBack callBack) {
        bindAgoo(context, null);
    }

    @Deprecated
    public static void unBindAgoo(Context context, String str, String str2, CallBack callBack) {
        unbindAgoo(context, null);
    }

    public static void pingApp(Context context, String str, String str2, String str3, int i) {
        NotifManager notifManager = new NotifManager();
        notifManager.init(context);
        notifManager.pingApp(str, str2, str3, i);
    }

    @Deprecated
    public static synchronized void register(Context context, String str, String str2, String str3, IRegister iRegister) throws AccsException {
        synchronized (TaobaoRegister.class) {
            register(context, str, str, str2, str3, iRegister);
        }
    }

    public static synchronized void register(Context context, String str, String str2, String str3, String str4, IRegister iRegister) throws AccsException {
        boolean z;
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        synchronized (TaobaoRegister.class) {
            if (context2 != null) {
                if (!TextUtils.isEmpty(str2)) {
                    if (!TextUtils.isEmpty(str)) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            ALog.isUseTlog = false;
                            anet.channel.util.ALog.setUseTlog(false);
                        }
                        ALog.i("TaobaoRegister", "register", "appKey", str6, "configTag", str5);
                        Context applicationContext = context.getApplicationContext();
                        Config.f83987a = str5;
                        Config.setAgooAppKey(context, str2);
                        com.taobao.accs.utl.a.f79096b = str7;
                        if (!TextUtils.isEmpty(str3)) {
                            a.f78909a = 2;
                        }
                        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                        if (configByTag == null) {
                            new AccsClientConfig.Builder().setAppKey(str2).setAppSecret(str7).setTag(str).build();
                        } else {
                            a.f78911c = configByTag.getAuthCode();
                        }
                        com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, str2, str);
                        i iVar = new i(applicationContext, accsInstance, iRegister, str2, str4);
                        accsInstance.a(applicationContext, str2, str4, (IAppReceiver) iVar);
                        return;
                    }
                }
            }
            ALog.e("TaobaoRegister", "register params null", "appkey", str6, "configTag", str5);
        }
    }
}
