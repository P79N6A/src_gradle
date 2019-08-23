package com.taobao.accs.init;

import android.content.Context;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Launcher_InitAccs implements Serializable {
    public static final Map<String, String> SERVICES;
    public static String defaultAppkey = "21646297";
    public static IAppReceiver mAppReceiver = new d();
    public static String mAppkey;
    public static Context mContext;
    public static boolean mForceBindUser;
    public static boolean mIsInited;
    public static String mSid;
    public static String mTtid;
    public static String mUserId;

    static class a implements ILoginInfo {
        public boolean getCommentUsed() {
            return false;
        }

        public String getEcode() {
            return null;
        }

        public String getHeadPicLink() {
            return null;
        }

        public String getNick() {
            return null;
        }

        public String getSsoToken() {
            return null;
        }

        a() {
        }

        public String getSid() {
            return Launcher_InitAccs.mSid;
        }

        public String getUserId() {
            return Launcher_InitAccs.mUserId;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        SERVICES = hashMap;
        hashMap.put("im", "com.taobao.tao.amp.remote.AccsReceiverCallback");
        SERVICES.put("powermsg", "com.taobao.appfrmbundle.mkt.AccsReceiverService");
        SERVICES.put("pmmonitor", "com.taobao.appfrmbundle.mkt.AccsReceiverService");
        SERVICES.put("cloudsync", "com.taobao.datasync.network.accs.AccsCloudSyncService");
        SERVICES.put("acds", "com.taobao.acds.compact.AccsACDSService");
        SERVICES.put("agooSend", "org.android.agoo.accs.AgooService");
        SERVICES.put("agooAck", "org.android.agoo.accs.AgooService");
        SERVICES.put("agooTokenReport", "org.android.agoo.accs.AgooService");
        SERVICES.put("AliLive", "com.taobao.playbudyy.gameplugin.danmu.DanmuCallbackService");
        SERVICES.put("orange", "com.taobao.orange.accssupport.OrangeAccsService");
        SERVICES.put("tsla", "com.taobao.android.festival.accs.HomepageAccsMassService");
        SERVICES.put("taobaoWaimaiAccsService", "com.taobao.takeout.order.detail.service.TakeoutOrderDetailACCSService");
        SERVICES.put("login", "com.taobao.android.sso.v2.service.LoginAccsService");
        SERVICES.put("ranger_abtest", "com.taobao.ranger3.RangerACCSService");
        SERVICES.put("accs_poplayer", "com.taobao.tbpoplayer.AccsPopLayerService");
        SERVICES.put("dm_abtest", "com.tmall.wireless.ant.accs.AntAccsService");
        SERVICES.put("family", "com.taobao.family.FamilyAccsService");
        SERVICES.put("taobao-dingtalk", "com.laiwang.protocol.android.LwpAccsService");
        SERVICES.put("amp-sync", "com.taobao.message.init.accs.AccsReceiverCallback");
        SERVICES.put("friend_invite_msg", "com.taobao.message.init.accs.TaoFriendAccsReceiverCallback");
        SERVICES.put("slider", "com.taobao.slide.accs.SlideAccsService");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8 A[Catch:{ Throwable -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb A[Catch:{ Throwable -> 0x0132 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(android.app.Application r9, java.util.HashMap<java.lang.String, java.lang.Object> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Launcher_InitAccs"
            java.lang.String r1 = "init"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.taobao.accs.utl.ALog.i(r0, r1, r3)
            r0 = 1
            anet.channel.AwcnConfig.setAccsSessionCreateForbiddenInBg(r0)     // Catch:{ Throwable -> 0x0132 }
            android.content.Context r9 = r9.getApplicationContext()     // Catch:{ Throwable -> 0x0132 }
            mContext = r9     // Catch:{ Throwable -> 0x0132 }
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()     // Catch:{ Throwable -> 0x0132 }
            int r9 = r9.flags     // Catch:{ Throwable -> 0x0132 }
            r1 = 2
            r9 = r9 & r1
            if (r9 == 0) goto L_0x0020
            r9 = 1
            goto L_0x0021
        L_0x0020:
            r9 = 0
        L_0x0021:
            if (r9 == 0) goto L_0x0028
            com.taobao.accs.utl.ALog.isUseTlog = r2     // Catch:{ Throwable -> 0x0132 }
            anet.channel.util.ALog.setUseTlog(r2)     // Catch:{ Throwable -> 0x0132 }
        L_0x0028:
            r9 = 0
            r3 = 3
            java.lang.String r4 = "envIndex"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Throwable -> 0x0094 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Throwable -> 0x0094 }
            int r4 = r4.intValue()     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r5 = "onlineAppKey"
            java.lang.Object r5 = r10.get(r5)     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0094 }
            mAppkey = r5     // Catch:{ Throwable -> 0x0094 }
            if (r4 != r0) goto L_0x004e
            java.lang.String r4 = "preAppKey"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0094 }
            mAppkey = r4     // Catch:{ Throwable -> 0x0094 }
            r4 = 1
            goto L_0x0068
        L_0x004e:
            if (r4 != r1) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            if (r4 != r3) goto L_0x0057
            r4 = 1
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            r4 = r4 | r5
            if (r4 == 0) goto L_0x0067
            java.lang.String r4 = "dailyAppkey"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0094 }
            mAppkey = r4     // Catch:{ Throwable -> 0x0094 }
            r4 = 2
            goto L_0x0068
        L_0x0067:
            r4 = 0
        L_0x0068:
            java.lang.String r5 = "process"
            java.lang.Object r5 = r10.get(r5)     // Catch:{ Throwable -> 0x0091 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0091 }
            java.lang.String r9 = "ttid"
            java.lang.Object r9 = r10.get(r9)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x008f }
            mTtid = r9     // Catch:{ Throwable -> 0x008f }
            java.lang.String r9 = "userId"
            java.lang.Object r9 = r10.get(r9)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x008f }
            mUserId = r9     // Catch:{ Throwable -> 0x008f }
            java.lang.String r9 = "sid"
            java.lang.Object r9 = r10.get(r9)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x008f }
            mSid = r9     // Catch:{ Throwable -> 0x008f }
            goto L_0x00a0
        L_0x008f:
            r10 = move-exception
            goto L_0x0097
        L_0x0091:
            r10 = move-exception
            r5 = r9
            goto L_0x0097
        L_0x0094:
            r10 = move-exception
            r5 = r9
            r4 = 0
        L_0x0097:
            java.lang.String r9 = "Launcher_InitAccs"
            java.lang.String r6 = "init get param error"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.utl.ALog.e(r9, r6, r10, r7)     // Catch:{ Throwable -> 0x0132 }
        L_0x00a0:
            java.lang.String r9 = mAppkey     // Catch:{ Throwable -> 0x0132 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0132 }
            if (r9 == 0) goto L_0x00b5
            java.lang.String r9 = "Launcher_InitAccs"
            java.lang.String r10 = "init get appkey null！！"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.utl.ALog.e(r9, r10, r6)     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r9 = defaultAppkey     // Catch:{ Throwable -> 0x0132 }
            mAppkey = r9     // Catch:{ Throwable -> 0x0132 }
        L_0x00b5:
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0132 }
            if (r9 == 0) goto L_0x00ce
            java.lang.String r9 = "Launcher_InitAccs"
            java.lang.String r10 = "init get process null！！"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.utl.ALog.e(r9, r10, r5)     // Catch:{ Throwable -> 0x0132 }
            android.content.Context r9 = mContext     // Catch:{ Throwable -> 0x0132 }
            int r10 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r5 = com.taobao.accs.utl.a.a((android.content.Context) r9, (int) r10)     // Catch:{ Throwable -> 0x0132 }
        L_0x00ce:
            java.lang.String r9 = "Launcher_InitAccs"
            java.lang.String r10 = "init"
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r7 = "appkey"
            r6[r2] = r7     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r7 = mAppkey     // Catch:{ Throwable -> 0x0132 }
            r6[r0] = r7     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r0 = "mode"
            r6[r1] = r0     // Catch:{ Throwable -> 0x0132 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0132 }
            r6[r3] = r0     // Catch:{ Throwable -> 0x0132 }
            r0 = 4
            java.lang.String r1 = "process"
            r6[r0] = r1     // Catch:{ Throwable -> 0x0132 }
            r0 = 5
            r6[r0] = r5     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.utl.ALog.i(r9, r10, r6)     // Catch:{ Throwable -> 0x0132 }
            android.content.Context r9 = mContext     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r10 = mAppkey     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.ACCSManager.setAppkey(r9, r10, r4)     // Catch:{ Throwable -> 0x0132 }
            android.content.Context r9 = mContext     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.ACCSManager.setMode(r9, r4)     // Catch:{ Throwable -> 0x0132 }
            android.content.Context r9 = mContext     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.init.Launcher_InitAccs$a r10 = new com.taobao.accs.init.Launcher_InitAccs$a     // Catch:{ Throwable -> 0x0132 }
            r10.<init>()     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.ACCSManager.setLoginInfoImpl(r9, r10)     // Catch:{ Throwable -> 0x0132 }
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0132 }
            if (r9 != 0) goto L_0x0125
            android.content.Context r9 = mContext     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r9 = r9.getPackageName()     // Catch:{ Throwable -> 0x0132 }
            boolean r9 = r5.equals(r9)     // Catch:{ Throwable -> 0x0132 }
            if (r9 == 0) goto L_0x0125
            android.content.Context r9 = mContext     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r10 = mAppkey     // Catch:{ Throwable -> 0x0132 }
            java.lang.String r0 = mTtid     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.IAppReceiver r1 = mAppReceiver     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.ACCSManager.startInAppConnection(r9, r10, r0, r1)     // Catch:{ Throwable -> 0x0132 }
        L_0x0125:
            com.taobao.accs.init.c r9 = new com.taobao.accs.init.c     // Catch:{ Throwable -> 0x0132 }
            r9.<init>(r8)     // Catch:{ Throwable -> 0x0132 }
            r0 = 10
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Throwable -> 0x0132 }
            com.taobao.accs.common.ThreadPoolExecutorFactory.schedule(r9, r0, r10)     // Catch:{ Throwable -> 0x0132 }
            return
        L_0x0132:
            r9 = move-exception
            java.lang.String r10 = "Launcher_InitAccs"
            java.lang.String r0 = "init"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.taobao.accs.utl.ALog.e(r10, r0, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.init.Launcher_InitAccs.init(android.app.Application, java.util.HashMap):void");
    }
}
