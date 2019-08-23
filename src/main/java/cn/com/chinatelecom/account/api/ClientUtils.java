package cn.com.chinatelecom.account.api;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import cn.com.chinatelecom.account.api.a.b;
import cn.com.chinatelecom.account.api.c.d;
import cn.com.chinatelecom.account.api.c.g;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.interfaces.RSAPublicKey;

public final class ClientUtils {
    private static final String TAG = "ClientUtils";

    public static String enrdata(String str, String str2) {
        try {
            return b.a(str, (RSAPublicKey) b.a(str2));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getApiVersion() {
        return "v1.46";
    }

    public static String getCurrentNetworkType(Context context) {
        return g.g(context);
    }

    public static String getMobileBrand() {
        return Build.BRAND;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getOnlineType(Context context) {
        return g.f(context);
    }

    public static String getOperatorType(Context context) {
        return d.d(context);
    }

    public static String getOs() {
        return getMobileBrand() + "-" + getModel() + "-A:" + Build.VERSION.RELEASE;
    }

    public static String getPID() {
        try {
            String str = Thread.currentThread().getId() + Process.myPid();
            try {
                return str.length() > 6 ? str.substring(0, 6) : "ctacco";
            } catch (Exception unused) {
                return str;
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String getSdkVersion() {
        return "SDK-API-v1.5.2";
    }

    public static String getTopActivity(Context context) {
        try {
            return ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningTasks(1).get(0).topActivity.getClassName();
        } catch (Throwable unused) {
            return "error";
        }
    }

    public static long getTp() {
        return System.currentTimeMillis();
    }

    public static boolean isAT(Context context, String str) {
        try {
            return ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningTasks(1).get(0).topActivity.getClassName().equals(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
