package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.push.PushDependManager;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.aj;
import com.xiaomi.push.az;
import com.xiaomi.push.ek;
import com.xiaomi.push.fw;
import com.xiaomi.push.fx;
import com.xiaomi.push.fy;
import com.xiaomi.push.g;
import com.xiaomi.push.ge;
import com.xiaomi.push.ik;
import com.xiaomi.push.ip;
import com.xiaomi.push.iu;
import com.xiaomi.push.ix;
import com.xiaomi.push.iy;
import com.xiaomi.push.j;
import com.xiaomi.push.je;
import com.xiaomi.push.jj;
import com.xiaomi.push.jk;
import com.xiaomi.push.jo;
import com.xiaomi.push.jq;
import com.xiaomi.push.js;
import com.xiaomi.push.m;
import com.xiaomi.push.o;
import com.xiaomi.push.s;
import com.xiaomi.push.service.ag;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import com.xiaomi.push.u;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

public abstract class MiPushClient {
    private static boolean isCrashHandlerSuggested;
    public static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();

    @Deprecated
    public static abstract class MiPushClientCallback {
        private String category;

        /* access modifiers changed from: protected */
        public String getCategory() {
            return this.category;
        }

        public void onCommandResult(String str, long j, String str2, List<String> list) {
        }

        public void onInitializeResult(long j, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onSubscribeResult(long j, String str, String str2) {
        }

        public void onUnsubscribeResult(long j, String str, String str2) {
        }

        /* access modifiers changed from: protected */
        public void setCategory(String str) {
            this.category = str;
        }
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        String acceptTime = getAcceptTime(context);
        return TextUtils.equals(acceptTime, str + "," + str2);
    }

    public static long accountSetTime(Context context, String str) {
        SharedPreferences a2 = c.a(context, "mipush_extra", 0);
        return a2.getLong("account_" + str, -1);
    }

    static void addAcceptTime(Context context, String str, String str2) {
        synchronized (MiPushClient.class) {
            try {
                SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
                edit.putString("accept_time", str + "," + str2);
                s.a(edit);
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    static void addAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            try {
                SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
                edit.putLong("account_" + str, System.currentTimeMillis()).commit();
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    static void addAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            try {
                SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
                edit.putLong("alias_" + str, System.currentTimeMillis()).commit();
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
        edit.putLong("last_pull_notification", System.currentTimeMillis());
        s.a(edit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
        edit.putLong("last_reg_request", System.currentTimeMillis());
        s.a(edit);
    }

    static void addTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            try {
                SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
                edit.putLong("topic_" + str, System.currentTimeMillis()).commit();
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    public static long aliasSetTime(Context context, String str) {
        SharedPreferences a2 = c.a(context, "mipush_extra", 0);
        return a2.getLong("alias_" + str, -1);
    }

    public static void awakeApps(Context context, String[] strArr) {
        aj.a(context).a((Runnable) new ah(strArr, context));
    }

    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        int i = 0;
        if (packageInfo == null || !PushDependManager.inst().getWakeupBlacklistPkg(context).contains(packageInfo.packageName)) {
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                int length = serviceInfoArr.length;
                while (i < length) {
                    ServiceInfo serviceInfo = serviceInfoArr[i];
                    if (!serviceInfo.exported || !serviceInfo.enabled || !"com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) || context.getPackageName().equals(serviceInfo.packageName)) {
                        i++;
                    } else {
                        try {
                            Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                            Intent intent = new Intent();
                            intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                            intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                            intent.putExtra("waker_pkgname", context.getPackageName());
                            PushMessageHandler.a(context, intent);
                        } catch (Throwable unused) {
                        }
                        return;
                    }
                }
            }
        } else {
            PushDependManager inst = PushDependManager.inst();
            inst.loggerD("MiPush", "prevent start " + packageInfo.packageName);
            com.ss.android.push.c.a(context, packageInfo.packageName, "xiaomi", new JSONObject[0]);
        }
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException("param " + str + " is not nullable");
        }
    }

    protected static void clearExtras(Context context) {
        SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        ay.a(context).e();
    }

    public static void clearNotification(Context context) {
        ay.a(context).a(-1);
    }

    public static void clearNotification(Context context, int i) {
        ay.a(context).a(i);
    }

    public static void clearNotification(Context context, String str, String str2) {
        ay.a(context).a(str, str2);
    }

    public static void disablePush(Context context) {
        ay.a(context).a(true);
    }

    public static void enablePush(Context context) {
        ay.a(context).a(false);
    }

    private static void forceHandleCrash() {
        boolean a2 = ag.a(sContext).a(ip.ForceHandleCrashSwitch.a(), false);
        if (!isCrashHandlerSuggested && a2) {
            Thread.setDefaultUncaughtExceptionHandler(new x(sContext));
        }
    }

    protected static String getAcceptTime(Context context) {
        return c.a(context, "mipush_extra", 0).getString("accept_time", "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String next : c.a(context, "mipush_extra", 0).getAll().keySet()) {
            if (next.startsWith("alias_")) {
                arrayList.add(next.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String next : c.a(context, "mipush_extra", 0).getAll().keySet()) {
            if (next.startsWith("topic_") && !next.contains("**ALL**")) {
                arrayList.add(next.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String next : c.a(context, "mipush_extra", 0).getAll().keySet()) {
            if (next.startsWith("account_")) {
                arrayList.add(next.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (d.a(context).c()) {
            return d.a(context).f();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return m.b();
    }

    protected static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, "context");
        return g.a(context).b(f.ASSEMBLE_PUSH_FCM);
    }

    protected static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, "context");
        return g.a(context).b(f.ASSEMBLE_PUSH_HUAWEI);
    }

    protected static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, "context");
        return g.a(context).b(f.ASSEMBLE_PUSH_COS);
    }

    protected static boolean getOpenVIVOPush(Context context) {
        return g.a(context).b(f.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (d.a(context).c()) {
            return d.a(context).c();
        }
        return null;
    }

    private static void initEventPerfLogic(Context context) {
        fy.a((fy.a) new ai());
        Config a2 = fy.a(context);
        ClientReportClient.init(context, a2, new fw(context), new fx(context));
        a.a(context);
        t.a(context, a2);
        ag.a(context).a((ag.a) new aj(100, "perf event job update", context));
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        if (miPushClientCallback != null) {
            PushMessageHandler.a(miPushClientCallback);
        }
        if (u.a(sContext)) {
            z.a(sContext);
        }
        boolean z = d.a(sContext).a() != Constants.a();
        if (z || shouldSendRegRequest(sContext)) {
            if (z || !d.a(sContext).a(str, str2) || d.a(sContext).e()) {
                String a2 = az.a(6);
                d.a(sContext).a();
                d.a(sContext).a(Constants.a());
                d.a(sContext).a(str, str2, a2);
                MiTinyDataClient.a.a().b("com.xiaomi.xmpushsdk.tinydataPending.appId");
                clearExtras(sContext);
                jk jkVar = new jk();
                jkVar.a(com.xiaomi.push.service.aj.a());
                jkVar.b(str);
                jkVar.e(str2);
                jkVar.d(sContext.getPackageName());
                jkVar.f(a2);
                Context context2 = sContext;
                jkVar.c(g.a(context2, context2.getPackageName()));
                Context context3 = sContext;
                jkVar.b(g.a(context3, context3.getPackageName()));
                jkVar.g("3_6_16");
                jkVar.a(30616);
                jkVar.h(j.e(sContext));
                jkVar.a(iy.Init);
                if (!m.d()) {
                    String g = j.g(sContext);
                    String i = j.i(sContext);
                    if (!TextUtils.isEmpty(g)) {
                        if (m.b()) {
                            if (!TextUtils.isEmpty(i)) {
                                g = g + "," + i;
                            }
                            jkVar.i(g);
                        }
                        jkVar.k(az.a(g) + "," + j.j(sContext));
                    }
                }
                jkVar.j(j.a());
                int a3 = j.a();
                if (a3 >= 0) {
                    jkVar.c(a3);
                }
                ay.a(sContext).a(jkVar, z);
                b.a(sContext);
                c.a(sContext, "mipush_extra", 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == PushMessageHelper.getPushMode(sContext)) {
                    checkNotNull(miPushClientCallback, "callback");
                    miPushClientCallback.onInitializeResult(0, null, d.a(sContext).c());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(d.a(sContext).c());
                    PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(ge.COMMAND_REGISTER.f413a, arrayList, 0, null, null));
                }
                ay.a(sContext).a();
                if (d.a(sContext).a()) {
                    jj jjVar = new jj();
                    jjVar.b(d.a(sContext).a());
                    jjVar.c("client_info_update");
                    jjVar.a(com.xiaomi.push.service.aj.a());
                    jjVar.f710a = new HashMap();
                    Map<String, String> map = jjVar.f710a;
                    Context context4 = sContext;
                    map.put("app_version", g.a(context4, context4.getPackageName()));
                    Map<String, String> map2 = jjVar.f710a;
                    Context context5 = sContext;
                    map2.put("app_version_code", Integer.toString(g.a(context5, context5.getPackageName())));
                    jjVar.f710a.put("push_sdk_vn", "3_6_16");
                    jjVar.f710a.put("push_sdk_vc", Integer.toString(30616));
                    String e2 = d.a(sContext).e();
                    if (!TextUtils.isEmpty(e2)) {
                        jjVar.f710a.put("deviceid", e2);
                    }
                    ay.a(sContext).a(jjVar, ik.Notification, false, (ix) null);
                    b.a(sContext);
                }
                if (!o.a(sContext, "update_devId", false)) {
                    updateIMEI();
                    o.a(sContext, "update_devId", true);
                }
                String d2 = j.d(sContext);
                if (!TextUtils.isEmpty(d2)) {
                    je jeVar = new je();
                    jeVar.a(com.xiaomi.push.service.aj.a());
                    jeVar.b(str);
                    jeVar.c(ge.COMMAND_CHK_VDEVID.f413a);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(j.c(sContext));
                    arrayList2.add(d2);
                    try {
                        arrayList2.add(Build.MODEL != null ? Build.MODEL : "");
                        arrayList2.add(Build.BOARD != null ? Build.BOARD : "");
                        jeVar.a((List<String>) arrayList2);
                        ay.a(sContext).a(jeVar, ik.Command, false, (ix) null);
                    } catch (Throwable th) {
                        b.a(th);
                        return;
                    }
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    jj jjVar2 = new jj();
                    jjVar2.b(d.a(sContext).a());
                    jjVar2.c(iu.PullOfflineMessage.f570a);
                    jjVar2.a(com.xiaomi.push.service.aj.a());
                    jjVar2.a(false);
                    ay.a(sContext).a(jjVar2, ik.Notification, false, (ix) null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            scheduleDataCollectionJobs(sContext);
            initEventPerfLogic(sContext);
            be.a(sContext);
            forceHandleCrash();
            if (!sContext.getPackageName().equals("com.xiaomi.xmsf")) {
                Logger.setLogger(sContext, Logger.getUserLogger());
                b.a(2);
            }
            operateSyncAction(context);
            return;
        }
        ay.a(sContext).a();
        b.a("Could not send  register message within 5s repeatly .");
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(ao.a(sContext).a(bd.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(ao.a(sContext).a(bd.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        if ("syncing".equals(ao.a(sContext).a(bd.UPLOAD_HUAWEI_TOKEN))) {
            syncAssemblePushToken(sContext);
        }
        if ("syncing".equals(ao.a(sContext).a(bd.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        if ("syncing".equals(ao.a(sContext).a(bd.UPLOAD_COS_TOKEN))) {
            syncAssembleCOSPushToken(context);
        }
        if ("syncing".equals(ao.a(sContext).a(bd.UPLOAD_FTOS_TOKEN))) {
            syncAssembleFTOSPushToken(context);
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    static void reInitialize(Context context, iy iyVar) {
        if (d.a(context).c()) {
            String a2 = az.a(6);
            String a3 = d.a(context).a();
            String b2 = d.a(context).b();
            d.a(context).a();
            d.a(context).a(Constants.a());
            d.a(context).a(a3, b2, a2);
            jk jkVar = new jk();
            jkVar.a(com.xiaomi.push.service.aj.a());
            jkVar.b(a3);
            jkVar.e(b2);
            jkVar.f(a2);
            jkVar.d(context.getPackageName());
            jkVar.c(g.a(context, context.getPackageName()));
            jkVar.a(iyVar);
            ay.a(context).a(jkVar, false);
        }
    }

    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(new x(sContext, uncaughtExceptionHandler));
        isCrashHandlerSuggested = true;
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            context.getApplicationContext().registerReceiver(new NetworkStatusReceiver(null), intentFilter);
        } catch (Throwable th) {
            b.a(th);
        }
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        checkNotNull(context, "context");
        checkNotNull(str, "appID");
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        u.a(context2);
        if (!NetworkStatusReceiver.a()) {
            registerNetworkReceiver(sContext);
        }
        g.a(sContext).a(pushConfiguration);
        b.a();
        aj.a(context2).a((Runnable) new ae(str, str2));
    }

    static void removeAcceptTime(Context context) {
        synchronized (MiPushClient.class) {
            try {
                SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
                edit.remove("accept_time");
                s.a(edit);
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    static void removeAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            try {
                SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
                edit.remove("account_" + str).commit();
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    static void removeAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            try {
                SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
                edit.remove("alias_" + str).commit();
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    static void removeAllAccounts(Context context) {
        synchronized (MiPushClient.class) {
            try {
                for (String removeAccount : getAllUserAccount(context)) {
                    removeAccount(context, removeAccount);
                }
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    static void removeAllAliases(Context context) {
        synchronized (MiPushClient.class) {
            try {
                for (String removeAlias : getAllAlias(context)) {
                    removeAlias(context, removeAlias);
                }
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    static void removeAllTopics(Context context) {
        synchronized (MiPushClient.class) {
            try {
                for (String removeTopic : getAllTopic(context)) {
                    removeTopic(context, removeTopic);
                }
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    static void removeTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            try {
                SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
                edit.remove("topic_" + str).commit();
            } catch (Throwable th) {
                Class<MiPushClient> cls = MiPushClient.class;
                throw th;
            }
        }
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (d.a(context).b()) {
            iu iuVar = z ? iu.APP_SLEEP : iu.APP_WAKEUP;
            jj jjVar = new jj();
            jjVar.b(d.a(context).a());
            jjVar.c(iuVar.f570a);
            jjVar.d(context.getPackageName());
            jjVar.a(com.xiaomi.push.service.aj.a());
            jjVar.a(false);
            ay.a(context).a(jjVar, ik.Notification, false, (ix) null, false);
        }
    }

    static void reportIgnoreRegMessageClicked(Context context, String str, ix ixVar, String str2, String str3) {
        jj jjVar = new jj();
        if (TextUtils.isEmpty(str3)) {
            b.d("do not report clicked message");
            return;
        }
        jjVar.b(str3);
        jjVar.c("bar:click");
        jjVar.a(str);
        jjVar.a(false);
        ay.a(context).a(jjVar, ik.Notification, false, true, ixVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        ix ixVar = new ix();
        ixVar.a(miPushMessage.getMessageId());
        ixVar.b(miPushMessage.getTopic());
        ixVar.d(miPushMessage.getDescription());
        ixVar.c(miPushMessage.getTitle());
        ixVar.c(miPushMessage.getNotifyId());
        ixVar.a(miPushMessage.getNotifyType());
        ixVar.b(miPushMessage.getPassThrough());
        ixVar.a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), ixVar, null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    static void reportMessageClicked(Context context, String str, ix ixVar, String str2) {
        jj jjVar = new jj();
        if (TextUtils.isEmpty(str2)) {
            if (d.a(context).b()) {
                str2 = d.a(context).a();
            } else {
                b.d("do not report clicked message");
                return;
            }
        }
        jjVar.b(str2);
        jjVar.c("bar:click");
        jjVar.a(str);
        jjVar.a(false);
        ay.a(context).a(jjVar, ik.Notification, false, ixVar);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (ag.a(sContext).a(ip.DataCollectionSwitch.a(), getDefaultSwitch())) {
            ek.a().a(new s(context));
            aj.a(sContext).a((Runnable) new af(), 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        aj.a(sContext).a(new an(sContext), ag.a(sContext).a(ip.OcVersionCheckFrequency.a(), 86400), 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        Context context2 = context;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (i5 < 0 || i5 >= 24 || i7 < 0 || i7 >= 24 || i6 < 0 || i6 >= 60 || i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = (long) (((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) / 60);
        long j = ((((long) ((i5 * 60) + i6)) + rawOffset) + 1440) % 1440;
        long j2 = ((rawOffset + ((long) ((i7 * 60) + i8))) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}));
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        arrayList2.add(String.format("%1$02d:%2$02d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}));
        if (!acceptTimeSet(context2, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context2, ge.COMMAND_SET_ACCEPT_TIME.f413a, arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.a(context, str, ge.COMMAND_SET_ACCEPT_TIME.f413a, 0, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context2, PushMessageHelper.generateCommandMessage(ge.COMMAND_SET_ACCEPT_TIME.f413a, arrayList2, 0, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, ge.COMMAND_SET_ALIAS.f413a, str, str2);
        }
    }

    protected static void setCommand(Context context, String str, String str2, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str5);
        }
        if (!ge.COMMAND_SET_ALIAS.f413a.equalsIgnoreCase(str4) || Math.abs(System.currentTimeMillis() - aliasSetTime(context, str5)) >= 3600000) {
            if (ge.COMMAND_UNSET_ALIAS.f413a.equalsIgnoreCase(str4) && aliasSetTime(context, str5) < 0) {
                b.a("Don't cancel alias for " + az.a(arrayList.toString(), 3) + " is unseted");
            } else if (!ge.COMMAND_SET_ACCOUNT.f413a.equalsIgnoreCase(str4) || Math.abs(System.currentTimeMillis() - accountSetTime(context, str5)) >= 3600000) {
                if (!ge.COMMAND_UNSET_ACCOUNT.f413a.equalsIgnoreCase(str4) || accountSetTime(context, str5) >= 0) {
                    setCommand(context, str4, arrayList, str3);
                    return;
                }
                b.a("Don't cancel account for " + az.a(arrayList.toString(), 3) + " is unseted");
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0, null, arrayList);
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(ge.COMMAND_SET_ACCOUNT.f413a, arrayList, 0, null, str3));
            }
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.a(context, str3, str, 0, null, arrayList);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(ge.COMMAND_SET_ALIAS.f413a, arrayList, 0, null, str3));
        }
    }

    protected static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (!TextUtils.isEmpty(d.a(context).a())) {
            je jeVar = new je();
            jeVar.a(com.xiaomi.push.service.aj.a());
            jeVar.b(d.a(context).a());
            jeVar.c(str);
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jeVar.a(it2.next());
            }
            jeVar.e(str2);
            jeVar.d(context.getPackageName());
            ay.a(context).a(jeVar, ik.Command, (ix) null);
        }
    }

    public static void setLocalNotificationType(Context context, int i) {
        ay.a(context).b(i & -1);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, ge.COMMAND_SET_ACCOUNT.f413a, str, str2);
        }
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - c.a(context, "mipush_extra", 0).getLong("last_pull_notification", -1)) > 300000;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - c.a(context, "mipush_extra", 0).getLong("last_reg_request", -1)) > 5000;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return ay.a(context).a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(d.a(context).a()) && !TextUtils.isEmpty(str)) {
            if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) > 86400000) {
                jo joVar = new jo();
                joVar.a(com.xiaomi.push.service.aj.a());
                joVar.b(d.a(context).a());
                joVar.c(str);
                joVar.d(context.getPackageName());
                joVar.e(str2);
                ay.a(context).a(joVar, ik.Subscription, (ix) null);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str2, 0, null, str);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(ge.COMMAND_SUBSCRIBE_TOPIC.f413a, arrayList, 0, null, null));
            }
        }
    }

    public static void syncAssembleCOSPushToken(Context context) {
        ay.a(context).a((String) null, bd.UPLOAD_COS_TOKEN, f.ASSEMBLE_PUSH_COS);
    }

    public static void syncAssembleFCMPushToken(Context context) {
        ay.a(context).a((String) null, bd.UPLOAD_FCM_TOKEN, f.ASSEMBLE_PUSH_FCM);
    }

    public static void syncAssembleFTOSPushToken(Context context) {
        ay.a(context).a((String) null, bd.UPLOAD_FTOS_TOKEN, f.ASSEMBLE_PUSH_FTOS);
    }

    public static void syncAssemblePushToken(Context context) {
        ay.a(context).a((String) null, bd.UPLOAD_HUAWEI_TOKEN, f.ASSEMBLE_PUSH_HUAWEI);
    }

    public static long topicSubscribedTime(Context context, String str) {
        SharedPreferences a2 = c.a(context, "mipush_extra", 0);
        return a2.getLong("topic_" + str, -1);
    }

    public static void unregisterPush(Context context) {
        j.c(context);
        ag.a(context).a();
        if (d.a(context).b()) {
            jq jqVar = new jq();
            jqVar.a(com.xiaomi.push.service.aj.a());
            jqVar.b(d.a(context).a());
            jqVar.c(d.a(context).c());
            jqVar.e(d.a(context).b());
            jqVar.d(context.getPackageName());
            ay.a(context).a(jqVar);
            PushMessageHandler.a();
            d.a(context).b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, ge.COMMAND_UNSET_ALIAS.f413a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, ge.COMMAND_UNSET_ACCOUNT.f413a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (d.a(context).b()) {
            if (topicSubscribedTime(context, str) < 0) {
                b.a("Don't cancel subscribe for " + str + " is unsubscribed");
                return;
            }
            js jsVar = new js();
            jsVar.a(com.xiaomi.push.service.aj.a());
            jsVar.b(d.a(context).a());
            jsVar.c(str);
            jsVar.d(context.getPackageName());
            jsVar.e(str2);
            ay.a(context).a(jsVar, ik.UnSubscription, (ix) null);
        }
    }

    private static void updateIMEI() {
        new Thread(new ag()).start();
    }
}
