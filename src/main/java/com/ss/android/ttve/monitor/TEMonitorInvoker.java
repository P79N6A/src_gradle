package com.ss.android.ttve.monitor;

import android.support.annotation.Keep;
import com.ss.android.ttve.nativePort.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class TEMonitorInvoker {
    public static native Map<String, String> nativeGetMap();

    public static native Map<String, String> nativeGetMap(int i);

    public static native void nativeInit();

    public static native void nativeMonitorPerf(int i);

    public static native void nativeMonitorPerfWithType(int i);

    public static native void nativePerfDouble(int i, String str, double d2);

    public static native void nativePerfDouble(String str, double d2);

    public static native void nativePerfLong(int i, String str, long j);

    public static native void nativePerfLong(String str, long j);

    public static native void nativePerfRational(String str, float f2, float f3);

    public static native void nativePerfString(int i, String str, String str2);

    public static native void nativePerfString(String str, String str2);

    public static native void nativeReset();

    public static native void nativeReset(int i);

    static {
        b.a();
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f2) {
        e.a(str, str2, f2);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, long j) {
        e.a(str, str2, j);
    }

    public static void onNativeCallback_onMonitorLogMap(String str, String str2, HashMap hashMap) {
        e.a(str, str2, (Map) hashMap);
    }

    public static void onNativeCallback_onMonitorLogJson(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str3);
            try {
                jSONObject.put("service", str2);
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        e.a(e.f31256c, str, jSONObject);
    }
}
