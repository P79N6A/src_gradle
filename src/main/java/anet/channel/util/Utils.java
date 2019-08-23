package anet.channel.util;

import android.content.Context;
import android.content.pm.PackageManager;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.monitor.b;
import anet.channel.status.NetworkStatusHelper;
import com.ta.utdid2.device.UTDevice;
import java.lang.reflect.Method;

public class Utils {
    public static Context context;

    public static float getNetworkTimeFactor() {
        float f2;
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status == NetworkStatusHelper.NetworkStatus.G4 || status == NetworkStatusHelper.NetworkStatus.WIFI) {
            f2 = 0.8f;
        } else {
            f2 = 1.0f;
        }
        if (b.a().b() == NetworkSpeed.Fast.getCode()) {
            return f2 * 0.75f;
        }
        return f2;
    }

    public static Context getAppContext() {
        if (context != null) {
            return context;
        }
        synchronized (Utils.class) {
            if (context != null) {
                Context context2 = context;
                return context2;
            }
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
                context = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e2) {
                ALog.w("awcn.Utils", "getAppContext", null, e2, new Object[0]);
            }
            Context context3 = context;
            return context3;
        }
    }

    public static String getDeviceId(Context context2) {
        return UTDevice.getUtdid(context2);
    }

    public static String getMainProcessName(Context context2) {
        String str;
        if (context2 == null) {
            return "";
        }
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).applicationInfo.processName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        return str;
    }

    public static String getStackMsg(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString() + "\n");
                }
            }
        } catch (Exception e2) {
            ALog.e("awcn.Utils", "getStackMsg", null, e2, new Object[0]);
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.close();
        r5.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9 A[SYNTHETIC, Splitter:B:36:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1 A[Catch:{ IOException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d4 A[SYNTHETIC, Splitter:B:47:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc A[Catch:{ IOException -> 0x00d8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getProcessNameNew(int r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ps  |  grep  "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r4 = "sh"
            java.lang.Process r3 = r3.exec(r4)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f }
            r6.<init>()     // Catch:{ Exception -> 0x009f }
            r6.append(r0)     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = "  &\n"
            r6.append(r0)     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x009f }
            r5.writeBytes(r0)     // Catch:{ Exception -> 0x009f }
            r5.flush()     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = "exit\n"
            r5.writeBytes(r0)     // Catch:{ Exception -> 0x009f }
            r3.waitFor()     // Catch:{ Exception -> 0x009f }
        L_0x0050:
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x009f }
            if (r0 == 0) goto L_0x0098
            java.lang.String r3 = "\\s+"
            java.lang.String r6 = "  "
            java.lang.String r0 = r0.replaceAll(r3, r6)     // Catch:{ Exception -> 0x009f }
            java.lang.String r3 = "  "
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ Exception -> 0x009f }
            int r3 = r0.length     // Catch:{ Exception -> 0x009f }
            r6 = 9
            if (r3 < r6) goto L_0x0050
            r3 = 1
            r6 = r0[r3]     // Catch:{ Exception -> 0x009f }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x009f }
            if (r6 != 0) goto L_0x0050
            r3 = r0[r3]     // Catch:{ Exception -> 0x009f }
            java.lang.String r3 = r3.trim()     // Catch:{ Exception -> 0x009f }
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x009f }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x009f }
            if (r3 == 0) goto L_0x0050
            r7 = 8
            r7 = r0[r7]     // Catch:{ Exception -> 0x009f }
            r4.close()     // Catch:{ IOException -> 0x008d }
            r5.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x0097
        L_0x008d:
            r0 = move-exception
            java.lang.String r3 = "awcn.Utils"
            java.lang.String r4 = "getProcessNameNew "
            java.lang.Object[] r1 = new java.lang.Object[r1]
            anet.channel.util.ALog.e(r3, r4, r2, r0, r1)
        L_0x0097:
            return r7
        L_0x0098:
            r4.close()     // Catch:{ IOException -> 0x00bd }
            r5.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00ce
        L_0x009f:
            r7 = move-exception
            goto L_0x00ae
        L_0x00a1:
            r7 = move-exception
            r5 = r2
            goto L_0x00d2
        L_0x00a4:
            r7 = move-exception
            r5 = r2
            goto L_0x00ae
        L_0x00a7:
            r7 = move-exception
            r4 = r2
            r5 = r4
            goto L_0x00d2
        L_0x00ab:
            r7 = move-exception
            r4 = r2
            r5 = r4
        L_0x00ae:
            java.lang.String r0 = "awcn.Utils"
            java.lang.String r3 = "getProcessNameNew "
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d1 }
            anet.channel.util.ALog.e(r0, r3, r2, r7, r6)     // Catch:{ all -> 0x00d1 }
            if (r4 == 0) goto L_0x00bf
            r4.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00bf
        L_0x00bd:
            r7 = move-exception
            goto L_0x00c5
        L_0x00bf:
            if (r5 == 0) goto L_0x00ce
            r5.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00ce
        L_0x00c5:
            java.lang.String r0 = "awcn.Utils"
            java.lang.String r3 = "getProcessNameNew "
            java.lang.Object[] r1 = new java.lang.Object[r1]
            anet.channel.util.ALog.e(r0, r3, r2, r7, r1)
        L_0x00ce:
            java.lang.String r7 = ""
            return r7
        L_0x00d1:
            r7 = move-exception
        L_0x00d2:
            if (r4 == 0) goto L_0x00da
            r4.close()     // Catch:{ IOException -> 0x00d8 }
            goto L_0x00da
        L_0x00d8:
            r0 = move-exception
            goto L_0x00e0
        L_0x00da:
            if (r5 == 0) goto L_0x00e9
            r5.close()     // Catch:{ IOException -> 0x00d8 }
            goto L_0x00e9
        L_0x00e0:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "awcn.Utils"
            java.lang.String r4 = "getProcessNameNew "
            anet.channel.util.ALog.e(r3, r4, r2, r0, r1)
        L_0x00e9:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.Utils.getProcessNameNew(int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getProcessName(android.content.Context r5, int r6) {
        /*
            java.lang.String r0 = ""
            r1 = -108(0xffffffffffffff94, float:NaN)
            java.lang.String r2 = "activity"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch:{ Exception -> 0x0059 }
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch:{ Exception -> 0x0059 }
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch:{ Exception -> 0x0059 }
            if (r5 == 0) goto L_0x0032
            int r2 = r5.size()     // Catch:{ Exception -> 0x0059 }
            if (r2 <= 0) goto L_0x0032
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0059 }
        L_0x001c:
            boolean r2 = r5.hasNext()     // Catch:{ Exception -> 0x0059 }
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r5.next()     // Catch:{ Exception -> 0x0059 }
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch:{ Exception -> 0x0059 }
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch:{ Exception -> 0x0059 }
            int r3 = r2.pid     // Catch:{ Exception -> 0x0059 }
            if (r3 != r6) goto L_0x001c
            java.lang.String r5 = r2.processName     // Catch:{ Exception -> 0x0059 }
            r0 = r5
            goto L_0x006c
        L_0x0032:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059 }
            java.lang.String r2 = "BuildVersion="
            r5.<init>(r2)     // Catch:{ Exception -> 0x0059 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0059 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0059 }
            r5.append(r2)     // Catch:{ Exception -> 0x0059 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r5 = anet.channel.util.ErrorConstant.formatMsg(r1, r5)     // Catch:{ Exception -> 0x0059 }
            anet.channel.appmonitor.IAppMonitor r2 = anet.channel.appmonitor.AppMonitor.getInstance()     // Catch:{ Exception -> 0x0059 }
            anet.channel.statist.ExceptionStatistic r3 = new anet.channel.statist.ExceptionStatistic     // Catch:{ Exception -> 0x0059 }
            java.lang.String r4 = "rt"
            r3.<init>(r1, r5, r4)     // Catch:{ Exception -> 0x0059 }
            r2.commitStat(r3)     // Catch:{ Exception -> 0x0059 }
            goto L_0x006c
        L_0x0059:
            r5 = move-exception
            anet.channel.appmonitor.IAppMonitor r2 = anet.channel.appmonitor.AppMonitor.getInstance()
            anet.channel.statist.ExceptionStatistic r3 = new anet.channel.statist.ExceptionStatistic
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = "rt"
            r3.<init>(r1, r5, r4)
            r2.commitStat(r3)
        L_0x006c:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x0076
            java.lang.String r0 = getProcessNameNew(r6)
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.Utils.getProcessName(android.content.Context, int):java.lang.String");
    }

    public static Object invokeStaticMethodThrowException(String str, String str2, Class<?>[] clsArr, Object... objArr) throws Exception {
        Method method;
        Object obj = null;
        if (str == null || str2 == null) {
            return null;
        }
        Class<?> cls = Class.forName(str);
        if (clsArr != null) {
            method = cls.getDeclaredMethod(str2, clsArr);
        } else {
            method = cls.getDeclaredMethod(str2, new Class[0]);
        }
        if (method != null) {
            method.setAccessible(true);
            if (objArr != null) {
                obj = method.invoke(cls, objArr);
            } else {
                obj = method.invoke(cls, new Object[0]);
            }
        }
        return obj;
    }
}
