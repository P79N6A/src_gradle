package com.mapbox.android.telemetry;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.q.c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okio.Buffer;

public final class bp {

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f26100a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b  reason: collision with root package name */
    private static final Locale f26101b = Locale.US;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Integer, String> f26102c = new HashMap<Integer, String>() {
        {
            put(7, "1xRTT");
            put(4, "CDMA");
            put(2, "EDGE");
            put(14, "EHRPD");
            put(5, "EVDO_0");
            put(6, "EVDO_A");
            put(12, "EVDO_B");
            put(1, "GPRS");
            put(8, "HSDPA");
            put(10, "HSPA");
            put(15, "HSPAP");
            put(9, "HSUPA");
            put(11, "IDEN");
            put(13, "LTE");
            put(3, "UMTS");
            put(0, "Unknown");
        }
    };

    public static String a() {
        return UUID.randomUUID().toString();
    }

    static String b() {
        return f26100a.format(new Date());
    }

    private static String d() {
        String a2 = a();
        if (MapboxTelemetry.g == null) {
            return a2;
        }
        SharedPreferences.Editor edit = d(MapboxTelemetry.g).edit();
        edit.putString("mapboxVendorId", a2);
        edit.apply();
        return a2;
    }

    public static String c() {
        if (MapboxTelemetry.g == null) {
            return d();
        }
        String string = d(MapboxTelemetry.g).getString("mapboxVendorId", "");
        if (a(string)) {
            string = d();
        }
        return string;
    }

    static SharedPreferences d(Context context) {
        return c.a(context, "MapboxSharedPreferences", 0);
    }

    private static Intent g(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public static int a(Context context) {
        Intent g = g(context);
        if (g == null) {
            return -1;
        }
        return Math.round((((float) g.getIntExtra("level", -1)) / ((float) g.getIntExtra("scale", -1))) * 100.0f);
    }

    public static String c(Context context) {
        return f26102c.get(Integer.valueOf(((TelephonyManager) context.getSystemService("phone")).getNetworkType()));
    }

    static boolean e(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getBoolean("com.mapbox.AdjustWakeUp", false);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static String b(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt <= 31 || codePointAt >= 127) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i2);
                while (i2 < length) {
                    int codePointAt2 = str.codePointAt(i2);
                    if (codePointAt2 <= 31 || codePointAt2 >= 127) {
                        i = 63;
                    } else {
                        i = codePointAt2;
                    }
                    buffer.writeUtf8CodePoint(i);
                    i2 += Character.charCount(codePointAt2);
                }
                return buffer.readUtf8();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static String f(Context context) {
        try {
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            return String.format(f26101b, "%s/%s/%s", new Object[]{packageName, packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean b(Context context) {
        boolean z;
        boolean z2;
        Intent g = g(context);
        if (g == null) {
            return false;
        }
        int intExtra = g.getIntExtra("plugged", -1);
        if (intExtra == 2) {
            z = true;
        } else {
            z = false;
        }
        if (intExtra == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    static String a(String str, Context context) {
        String f2 = f(context);
        String b2 = b(String.format(f26101b, "%s %s", new Object[]{f2, str}));
        if (TextUtils.isEmpty(f2)) {
            return str;
        }
        return b2;
    }

    static boolean a(Class<?> cls, Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
