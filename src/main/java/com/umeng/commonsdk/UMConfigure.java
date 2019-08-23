package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.a;
import com.umeng.commonsdk.statistics.b;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.PushAgent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UMConfigure {
    private static boolean debugLog;
    private static boolean isFinish = false;
    private static Object lockObject = new Object();
    public static UMLog umDebugLog = new UMLog();

    public static boolean isDebugLog() {
        return debugLog;
    }

    public static boolean getInitStatus() {
        boolean z;
        synchronized (lockObject) {
            z = isFinish;
        }
        return z;
    }

    private static void saveSDKComponent() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getClass("com.umeng.analytics.vismode.V") != null) {
            stringBuffer.append(NotifyType.VIBRATE);
        } else if (getClass("com.umeng.analytics.MobclickAgent") != null) {
            stringBuffer.append("a");
        }
        if (getClass("com.umeng.visual.UMVisualAgent") != null) {
            stringBuffer.append("x");
        }
        if (getClass(PushAgent.TAG) != null) {
            stringBuffer.append("p");
        }
        if (getClass("com.umeng.socialize.UMShareAPI") != null) {
            stringBuffer.append(NotifyType.SOUND);
        }
        if (getClass("com.umeng.error.UMError") != null) {
            stringBuffer.append("e");
        }
        stringBuffer.append("i");
        if (!(SdkVersion.SDK_TYPE == 1 || getClass("com.umeng.commonsdk.internal.UMOplus") == null)) {
            stringBuffer.append("o");
        }
        if (!TextUtils.isEmpty(stringBuffer)) {
            b.f80920a = stringBuffer.toString();
            UMSLEnvelopeBuild.module = stringBuffer.toString();
        }
    }

    private static void setCheckDevice(boolean z) {
        AnalyticsConstants.CHECK_DEVICE = z;
    }

    public static void setProcessEvent(boolean z) {
        AnalyticsConstants.SUB_PROCESS_EVENT = z;
    }

    private static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void setEncryptEnabled(boolean z) {
        b.a(z);
        UMSLEnvelopeBuild.setEncryptEnabled(z);
    }

    private static void setLatencyWindow(long j) {
        a.f80918c = ((int) j) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    }

    private Object getInstanceObject(Class<?> cls) {
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return null;
    }

    public static String getUMIDString(Context context) {
        if (context != null) {
            return UMUtils.getUMId(context.getApplicationContext());
        }
        return null;
    }

    private static Object getDecInstanceObject(Class<?> cls) {
        Constructor<?> constructor;
        if (cls != null) {
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            if (constructor != null) {
                constructor.setAccessible(true);
                try {
                    return constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused2) {
                }
            }
        }
        return null;
    }

    public static String[] getTestDeviceInfo(Context context) {
        String[] strArr = new String[2];
        if (context != null) {
            try {
                strArr[0] = DeviceConfig.getDeviceIdForGeneral(context);
                strArr[1] = DeviceConfig.getMac(context);
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static void setLogEnabled(boolean z) {
        try {
            debugLog = z;
            MLog.DEBUG = z;
            Class<?> cls = getClass(PushAgent.TAG);
            Object decInstanceObject = getDecInstanceObject(cls);
            invoke(getDecMethod(cls, "setDebugMode", new Class[]{Boolean.TYPE}), decInstanceObject, new Object[]{Boolean.valueOf(z)});
            setFile(getClass("com.umeng.socialize.Config"), "DEBUG", z);
        } catch (Exception unused) {
        } catch (Throwable unused2) {
        }
    }

    private static void invoke(Method method, Object[] objArr) {
        if (method != null) {
            try {
                method.invoke(null, objArr);
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            } catch (InvocationTargetException unused2) {
            }
        }
    }

    private static void setWraperType(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("native")) {
                com.umeng.commonsdk.stateless.a.f80882a = "native";
                a.f80916a = "native";
            } else if (str.equals("Cocos2d-x")) {
                com.umeng.commonsdk.stateless.a.f80882a = "Cocos2d-x";
                a.f80916a = "Cocos2d-x";
            } else if (str.equals("Cocos2d-x_lua")) {
                com.umeng.commonsdk.stateless.a.f80882a = "Cocos2d-x_lua";
                a.f80916a = "Cocos2d-x_lua";
            } else if (str.equals("Unity")) {
                com.umeng.commonsdk.stateless.a.f80882a = "Unity";
                a.f80916a = "Unity";
            } else if (str.equals("react-native")) {
                com.umeng.commonsdk.stateless.a.f80882a = "react-native";
                a.f80916a = "react-native";
            } else if (str.equals("phonegap")) {
                com.umeng.commonsdk.stateless.a.f80882a = "phonegap";
                a.f80916a = "phonegap";
            } else if (str.equals("weex")) {
                com.umeng.commonsdk.stateless.a.f80882a = "weex";
                a.f80916a = "weex";
            } else if (str.equals("hybrid")) {
                com.umeng.commonsdk.stateless.a.f80882a = "hybrid";
                a.f80916a = "hybrid";
            } else if (str.equals("flutter")) {
                com.umeng.commonsdk.stateless.a.f80882a = "flutter";
                a.f80916a = "flutter";
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            com.umeng.commonsdk.stateless.a.f80883b = str2;
            a.f80917b = str2;
        }
    }

    public static void init(Context context, int i, String str) {
        init(context, null, null, i, str);
    }

    private static Method getDecMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        Method method = null;
        if (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method != null) {
                method.setAccessible(true);
            }
        }
        return method;
    }

    private static void invoke(Method method, Object obj, Object[] objArr) {
        if (!(method == null || obj == null)) {
            try {
                method.invoke(obj, objArr);
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            } catch (InvocationTargetException unused2) {
            }
        }
    }

    private static void setFile(Class<?> cls, String str, String str2) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    private static void setFile(Class<?> cls, String str, boolean z) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02af, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0202 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x027a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x019b */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0208 A[Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x024d A[Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0257 A[Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:82:0x019b] */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:2:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a1 A[Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ad A[Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(android.content.Context r9, java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13) {
        /*
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r9.getApplicationContext()     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            boolean r1 = debugLog     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003c
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getAppkeyByXML(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            boolean r5 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r5 != 0) goto L_0x003c
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r5 != 0) goto L_0x003c
            boolean r5 = r10.equals(r1)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r5 != 0) goto L_0x003c
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r6 = "@"
            r5[r3] = r6     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r6 = "#"
            r5[r4] = r6     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r6[r3] = r10     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r6[r4] = r1     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r1 = "请注意：您init接口中设置的AppKey是@，manifest中设置的AppKey是#，init接口设置的AppKey会覆盖manifest中设置的AppKey"
            r7 = 3
            java.lang.String r8 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r1, r7, r8, r5, r6)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x003c:
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x0046
            java.lang.String r10 = com.umeng.commonsdk.utils.UMUtils.getAppkeyByXML(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x0046:
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x0050
            java.lang.String r11 = com.umeng.commonsdk.utils.UMUtils.getChannelByXML(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x0050:
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x0058
            java.lang.String r11 = "Unknown"
        L_0x0058:
            com.umeng.commonsdk.utils.UMUtils.setChannel(r0, r11)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x0064
            saveSDKComponent()     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x0064:
            java.lang.String r1 = "com.umeng.analytics.MobclickAgent"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            if (r1 == 0) goto L_0x00af
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            if (r5 == 0) goto L_0x008f
            r5.setAccessible(r4)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            r6[r3] = r0     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            r5.invoke(r1, r6)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            boolean r5 = debugLog     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            if (r5 == 0) goto L_0x008f
            java.lang.String r5 = "统计SDK初始化成功"
            java.lang.String r6 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r5, (int) r2, (java.lang.String) r6)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
        L_0x008f:
            java.lang.String r5 = "com.umeng.analytics.game.UMGameAgent"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            if (r5 == 0) goto L_0x00af
            java.lang.String r5 = "setGameScenarioType"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            if (r5 == 0) goto L_0x00af
            r5.setAccessible(r4)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            r6[r3] = r0     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            r5.invoke(r1, r6)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
        L_0x00af:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.f80920a     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.String r5 = "e"
            int r1 = r1.indexOf(r5)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            if (r1 < 0) goto L_0x00d3
            java.lang.String r1 = "com.umeng.analytics.MobclickAgent"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            if (r1 == 0) goto L_0x00d3
            java.lang.String r5 = "disableExceptionCatch"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            if (r5 == 0) goto L_0x00d3
            r5.setAccessible(r4)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
            r5.invoke(r1, r6)     // Catch:{ Throwable -> 0x00d3, Exception -> 0x02af }
        L_0x00d3:
            java.lang.String r1 = "com.umeng.message.MessageSharedPrefs"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x0165
            java.lang.String r5 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r5 == 0) goto L_0x0165
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            r6[r3] = r0     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.Object r5 = r5.invoke(r1, r6)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r5 == 0) goto L_0x0165
            java.lang.String r6 = "setMessageAppKey"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r3] = r8     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.reflect.Method r6 = r1.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r6 == 0) goto L_0x0116
            r6.setAccessible(r4)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            r7[r3] = r10     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            r6.invoke(r5, r7)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            boolean r6 = debugLog     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r6 == 0) goto L_0x0116
            java.lang.String r6 = "PUSH AppKey设置成功"
            java.lang.String r7 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r6, (int) r2, (java.lang.String) r7)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
        L_0x0116:
            java.lang.String r6 = "setMessageChannel"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r3] = r8     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.reflect.Method r6 = r1.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r6 == 0) goto L_0x0139
            r6.setAccessible(r4)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            r7[r3] = r11     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            r6.invoke(r5, r7)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            boolean r6 = debugLog     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r6 == 0) goto L_0x0139
            java.lang.String r6 = "PUSH Channel设置成功"
            java.lang.String r7 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r6, (int) r2, (java.lang.String) r7)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
        L_0x0139:
            boolean r6 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r6 == 0) goto L_0x0142
            boolean r1 = debugLog     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            goto L_0x0165
        L_0x0142:
            java.lang.String r6 = "setMessageAppSecret"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r3] = r8     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x0165
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            r6[r3] = r13     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            r1.invoke(r5, r6)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            boolean r1 = debugLog     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x0165
            java.lang.String r1 = "PUSH Secret设置成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r1, (int) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x0165, Throwable -> 0x02ae }
        L_0x0165:
            java.lang.String r1 = "com.umeng.socialize.UMShareAPI"
            java.lang.Class r1 = getClass(r1)     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            java.lang.String r5 = "APPKEY"
            setFile((java.lang.Class<?>) r1, (java.lang.String) r5, (java.lang.String) r10)     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            if (r1 == 0) goto L_0x019b
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r4] = r7     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            if (r5 == 0) goto L_0x019b
            r5.setAccessible(r4)     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            r6[r3] = r0     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            r6[r4] = r10     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            r5.invoke(r1, r6)     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            boolean r1 = debugLog     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
            if (r1 == 0) goto L_0x019b
            java.lang.String r1 = "Share AppKey设置成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r1, (int) r2, (java.lang.String) r5)     // Catch:{ Throwable -> 0x019b, Exception -> 0x02af }
        L_0x019b:
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x01ad
            boolean r9 = debugLog     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r9 == 0) goto L_0x01ac
            java.lang.String r9 = com.umeng.commonsdk.debug.UMLogCommon.SC_10007     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r10 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq((java.lang.String) r9, (int) r3, (java.lang.String) r10)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x01ac:
            return
        L_0x01ad:
            com.umeng.commonsdk.utils.UMUtils.setAppkey(r0, r10)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getLastAppkey(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            boolean r5 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r5 != 0) goto L_0x01d4
            boolean r5 = r10.equals(r1)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r5 != 0) goto L_0x01d4
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 != 0) goto L_0x01d1
            boolean r1 = debugLog     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x01d1
            java.lang.String r1 = "AppKey改变!!!"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r1, (int) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x01d1:
            com.umeng.commonsdk.utils.UMUtils.setLastAppkey(r0, r10)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x01d4:
            com.umeng.commonsdk.statistics.AnalyticsConstants.setDeviceType(r12)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r1 = "com.umeng.error.UMError"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            if (r1 == 0) goto L_0x0202
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            if (r5 == 0) goto L_0x0202
            r5.setAccessible(r4)     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            r6[r3] = r0     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            r5.invoke(r1, r6)     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            boolean r1 = debugLog     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
            if (r1 == 0) goto L_0x0202
            java.lang.String r1 = "错误分析SDK初始化成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r1, (int) r2, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0202, Exception -> 0x02af }
        L_0x0202:
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 == 0) goto L_0x0230
            int r1 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            if (r1 == r4) goto L_0x022d
            java.lang.String r1 = "com.umeng.commonsdk.UMConfigureImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x0230, Exception -> 0x02af }
            if (r1 == 0) goto L_0x0230
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0230, Exception -> 0x02af }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ Throwable -> 0x0230, Exception -> 0x02af }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x0230, Exception -> 0x02af }
            if (r5 == 0) goto L_0x0230
            r5.setAccessible(r4)     // Catch:{ Throwable -> 0x0230, Exception -> 0x02af }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0230, Exception -> 0x02af }
            r6[r3] = r0     // Catch:{ Throwable -> 0x0230, Exception -> 0x02af }
            r5.invoke(r1, r6)     // Catch:{ Throwable -> 0x0230, Exception -> 0x02af }
            goto L_0x0230
        L_0x022d:
            com.umeng.commonsdk.a.a(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x0230:
            r1 = 0
            java.lang.String r5 = "com.umeng.visual.UMVisualAgent"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            java.lang.String r6 = "init"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r3] = r8     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r4] = r8     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            boolean r6 = android.text.TextUtils.isEmpty(r10)     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            if (r6 != 0) goto L_0x0257
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            r2[r3] = r9     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            r2[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            r5.invoke(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            goto L_0x027a
        L_0x0257:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            if (r2 == 0) goto L_0x027a
            java.lang.String r2 = "initDebugSDK appkey  is null"
            com.umeng.commonsdk.statistics.common.MLog.e((java.lang.String) r2)     // Catch:{ ClassNotFoundException -> 0x0261, Throwable -> 0x027a, Exception -> 0x02af }
            goto L_0x027a
        L_0x0261:
            java.lang.String r2 = "com.umeng.analytics.vismode.event.VisualHelper"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x027a, Throwable -> 0x02ae }
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x027a, Throwable -> 0x02ae }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ Throwable -> 0x027a, Throwable -> 0x02ae }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ Throwable -> 0x027a, Throwable -> 0x02ae }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x027a, Throwable -> 0x02ae }
            r5[r3] = r9     // Catch:{ Throwable -> 0x027a, Throwable -> 0x02ae }
            r2.invoke(r1, r5)     // Catch:{ Throwable -> 0x027a, Throwable -> 0x02ae }
        L_0x027a:
            com.umeng.commonsdk.service.UMGlobalContext$a r9 = new com.umeng.commonsdk.service.UMGlobalContext$a     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.<init>()     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.f80875a = r0     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.f80876b = r12     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.f80877c = r13     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.f80878d = r10     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.f80879e = r11     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r10 = com.umeng.commonsdk.statistics.b.f80920a     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.f80880f = r10     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.g = r3     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r10 = com.umeng.commonsdk.framework.UMFrUtils.getCurrentProcessName(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.h = r10     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.String r10 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.i = r10     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            boolean r10 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            r9.j = r10     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            com.umeng.commonsdk.service.UMGlobalContext.newUMGlobalContext(r9)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            java.lang.Object r9 = lockObject     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            monitor-enter(r9)     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
            isFinish = r4     // Catch:{ all -> 0x02ab }
            monitor-exit(r9)     // Catch:{ all -> 0x02ab }
            goto L_0x02ae
        L_0x02ab:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x02ab }
            throw r10     // Catch:{ Exception -> 0x02af, Throwable -> 0x02ae }
        L_0x02ae:
            return
        L_0x02af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigure.init(android.content.Context, java.lang.String, java.lang.String, int, java.lang.String):void");
    }
}
