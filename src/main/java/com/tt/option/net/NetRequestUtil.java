package com.tt.option.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.annotation.AnyProcess;
import org.json.JSONObject;

public class NetRequestUtil {
    private static String deviceId = "0";

    @AnyProcess
    public static String getDeviceId() {
        if (isDeviceIdValid(deviceId)) {
            return deviceId;
        }
        if (AppbrandContext.getInst().getInitParams() != null) {
            deviceId = AppbrandContext.getInst().getInitParams().getDeviceId();
        }
        if (isDeviceIdValid(deviceId)) {
            return deviceId;
        }
        JSONObject netCommonParams = HostProcessBridge.getNetCommonParams();
        if (netCommonParams != null) {
            deviceId = netCommonParams.optString("device_id", PushConstants.PUSH_TYPE_NOTIFY);
        }
        return deviceId;
    }

    private static boolean isDeviceIdValid(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null") || TextUtils.equals(str, PushConstants.PUSH_TYPE_NOTIFY)) {
            return false;
        }
        return true;
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo.isAvailable() && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getNetType(android.content.Context r3) {
        /*
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch:{ Exception -> 0x0042 }
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch:{ Exception -> 0x0042 }
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0042 }
            if (r3 == 0) goto L_0x0040
            boolean r1 = r3.isAvailable()     // Catch:{ Exception -> 0x0042 }
            if (r1 == 0) goto L_0x0040
            java.lang.String r1 = r3.getTypeName()     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "MOBILE"
            boolean r2 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0042 }
            if (r2 != 0) goto L_0x0022
            goto L_0x004e
        L_0x0022:
            java.lang.String r3 = r3.getExtraInfo()     // Catch:{ Exception -> 0x0042 }
            if (r3 != 0) goto L_0x003e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003a }
            r0.<init>()     // Catch:{ Exception -> 0x003a }
            r0.append(r1)     // Catch:{ Exception -> 0x003a }
            java.lang.String r1 = "#[]"
            r0.append(r1)     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r0 = move-exception
            r1 = r3
            r3 = r0
            goto L_0x0044
        L_0x003e:
            r1 = r3
            goto L_0x004e
        L_0x0040:
            r1 = r0
            goto L_0x004e
        L_0x0042:
            r3 = move-exception
            r1 = r0
        L_0x0044:
            r0 = 6
            java.lang.String r2 = "NetRequestUtil"
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r0, r2, r3)
        L_0x004e:
            if (r1 != 0) goto L_0x0053
            java.lang.String r3 = ""
            return r3
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.option.net.NetRequestUtil.getNetType(android.content.Context):java.lang.String");
    }
}
