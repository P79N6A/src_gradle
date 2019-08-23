package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.dispatch.a;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import java.util.concurrent.CopyOnWriteArrayList;

public class GlobalAppRuntimeInfo {

    /* renamed from: a  reason: collision with root package name */
    private static Context f1118a;

    /* renamed from: b  reason: collision with root package name */
    private static ENV f1119b = ENV.ONLINE;

    /* renamed from: c  reason: collision with root package name */
    private static String f1120c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f1121d = "";

    /* renamed from: e  reason: collision with root package name */
    private static String f1122e;

    /* renamed from: f  reason: collision with root package name */
    private static String f1123f;
    private static String g;
    private static volatile boolean h = true;
    private static SharedPreferences i;
    private static volatile CopyOnWriteArrayList<String> j;

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        return j;
    }

    public static Context getContext() {
        return f1118a;
    }

    public static String getCurrentProcess() {
        return f1121d;
    }

    public static ENV getEnv() {
        return f1119b;
    }

    public static String getTtid() {
        return f1122e;
    }

    public static String getUserId() {
        return f1123f;
    }

    public static boolean isAppBackground() {
        if (f1118a == null) {
            return true;
        }
        return h;
    }

    public static String getUtdid() {
        if (g == null && f1118a != null) {
            g = Utils.getDeviceId(f1118a);
        }
        return g;
    }

    public static boolean isTargetProcess() {
        if (TextUtils.isEmpty(f1120c) || TextUtils.isEmpty(f1121d)) {
            return true;
        }
        return f1120c.equalsIgnoreCase(f1121d);
    }

    public static void setBackground(boolean z) {
        h = z;
    }

    public static void setCurrentProcess(String str) {
        f1121d = str;
    }

    public static void setEnv(ENV env) {
        f1119b = env;
    }

    public static void setTargetProcess(String str) {
        f1120c = str;
    }

    public static void setUtdid(String str) {
        if (g == null || !g.equals(str)) {
            g = str;
        }
    }

    public static void setTtid(String str) {
        String str2;
        f1122e = str;
        try {
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf("@");
                String str3 = null;
                if (indexOf != -1) {
                    str2 = str.substring(0, indexOf);
                } else {
                    str2 = null;
                }
                String substring = str.substring(indexOf + 1);
                int lastIndexOf = substring.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    String substring2 = substring.substring(0, lastIndexOf);
                    str3 = substring.substring(lastIndexOf + 1);
                    substring = substring2;
                }
                a.a(substring, str3, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void setUserId(String str) {
        if (f1123f == null || !f1123f.equals(str)) {
            f1123f = str;
            StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
            if (i != null) {
                i.edit().putString("UserId", str).apply();
            }
        }
    }

    public static void setContext(Context context) {
        f1118a = context;
        if (context != null) {
            if (TextUtils.isEmpty(f1121d)) {
                f1121d = Utils.getProcessName(context, Process.myPid());
            }
            if (TextUtils.isEmpty(f1120c)) {
                f1120c = Utils.getMainProcessName(context);
            }
            if (i == null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                i = defaultSharedPreferences;
                f1123f = defaultSharedPreferences.getString("UserId", null);
            }
            ALog.e("awcn.GlobalAppRuntimeInfo", "", null, "CurrentProcess", f1121d, "TargetProcess", f1120c);
        }
    }

    public static void addBucketInfo(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.length() <= 32 && str2.length() <= 32) {
            synchronized (GlobalAppRuntimeInfo.class) {
                if (j == null) {
                    j = new CopyOnWriteArrayList<>();
                }
                j.add(str);
                j.add(str2);
            }
        }
    }
}
