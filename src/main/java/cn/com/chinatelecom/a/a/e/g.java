package cn.com.chinatelecom.a.a.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class g {
    public static NetworkInfo a(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static boolean b(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 == null || a2.getType() != 0) {
            return false;
        }
        return true;
    }

    private static boolean e(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 == null || a2.getType() != 1) {
            return false;
        }
        return true;
    }

    public static String c(Context context) {
        boolean e2 = e(context);
        boolean f2 = f(context);
        if (e2 && !f2) {
            return PushConstants.PUSH_TYPE_UPLOAD_LOG;
        }
        if (f2 && !e2) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (e2 && f2) {
            return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        if (e2 || f2 || !b(context)) {
            return "";
        }
        return PushConstants.PUSH_TYPE_NOTIFY;
    }

    public static String d(Context context) {
        int h = h(context);
        if (h == -101) {
            return "wifi";
        }
        switch (h) {
            case -1:
                return "unnet";
            case 0:
                return "-1";
            case 1:
                return "2g";
            case 2:
                return "3g";
            case 3:
                return "4g";
            default:
                return Integer.toString(h);
        }
    }

    private static boolean f(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Object g = g(context);
                Method declaredMethod = Class.forName(g.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(g, new Object[0])).booleanValue();
            } catch (Error | Exception unused) {
                return false;
            }
        } else if (Settings.Global.getInt(context.getContentResolver(), "mobile_data", 0) == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static Object g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            Field declaredField = Class.forName(connectivityManager.getClass().getName()).getDeclaredField("mService");
            declaredField.setAccessible(true);
            return declaredField.get(connectivityManager);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int h(android.content.Context r6) {
        /*
            r0 = 1
            r1 = -101(0xffffffffffffff9b, float:NaN)
            r2 = -1
            r3 = 0
            android.net.NetworkInfo r4 = a(r6)     // Catch:{ Exception | NullPointerException -> 0x0038 }
            if (r4 == 0) goto L_0x0037
            boolean r5 = r4.isAvailable()     // Catch:{ Exception | NullPointerException -> 0x0038 }
            if (r5 == 0) goto L_0x0037
            boolean r5 = r4.isConnected()     // Catch:{ Exception | NullPointerException -> 0x0038 }
            if (r5 == 0) goto L_0x0037
            int r5 = r4.getType()     // Catch:{ Exception | NullPointerException -> 0x0038 }
            if (r5 != r0) goto L_0x0020
            r3 = -101(0xffffffffffffff9b, float:NaN)
            goto L_0x0038
        L_0x0020:
            if (r5 != 0) goto L_0x0038
            java.lang.String r5 = "phone"
            java.lang.Object r6 = r6.getSystemService(r5)     // Catch:{ Exception -> 0x002f }
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ Exception -> 0x002f }
            int r6 = r6.getNetworkType()     // Catch:{ Exception -> 0x002f }
            r3 = r6
        L_0x002f:
            if (r3 != 0) goto L_0x0038
            int r6 = r4.getSubtype()     // Catch:{ Exception | NullPointerException -> 0x0038 }
            r3 = r6
            goto L_0x0038
        L_0x0037:
            r3 = -1
        L_0x0038:
            if (r3 == r1) goto L_0x0046
            if (r3 == r2) goto L_0x0045
            switch(r3) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0044;
                case 3: goto L_0x0042;
                case 4: goto L_0x0044;
                case 5: goto L_0x0042;
                case 6: goto L_0x0042;
                case 7: goto L_0x0044;
                case 8: goto L_0x0042;
                case 9: goto L_0x0042;
                case 10: goto L_0x0042;
                case 11: goto L_0x0044;
                case 12: goto L_0x0042;
                case 13: goto L_0x0040;
                case 14: goto L_0x0042;
                case 15: goto L_0x0042;
                case 16: goto L_0x0044;
                case 17: goto L_0x0042;
                case 18: goto L_0x0040;
                case 19: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            return r3
        L_0x0040:
            r6 = 3
            return r6
        L_0x0042:
            r6 = 2
            return r6
        L_0x0044:
            return r0
        L_0x0045:
            return r2
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.e.g.h(android.content.Context):int");
    }
}
