package com.meizu.cloud.pushsdk.c.f;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27191a = "e";

    public static long a(String str) {
        long j;
        long j2 = 0;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                j = 1;
            } else if (charAt <= 2047) {
                j = 2;
            } else if (charAt >= 55296 && charAt <= 57343) {
                j2 += 4;
                i++;
                i++;
            } else if (charAt < 65535) {
                j = 3;
            } else {
                j2 += 4;
                i++;
            }
            j2 += j;
            i++;
        }
        return j2;
    }

    private static Object a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            return obj;
        }
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object a2 : (Collection) obj) {
                    jSONArray.put(a(a2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(a(Array.get(obj, i)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                return a((Map) obj);
            } else {
                if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                    if (obj.getClass().getPackage().getName().startsWith("java.")) {
                        return obj.toString();
                    }
                    obj = null;
                }
            }
        }
        return obj;
    }

    public static String a() {
        return Long.toString(System.currentTimeMillis());
    }

    public static JSONObject a(Map map) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new JSONObject(map);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object a2 = a(entry.getValue());
            try {
                jSONObject.put(str, a2);
            } catch (JSONException e2) {
                c.a(f27191a, "Could not put key '%s' and value '%s' into new JSONObject: %s", str, a2, e2);
            }
        }
        return jSONObject;
    }

    public static boolean a(long j, long j2, long j3) {
        return j > j2 - j3;
    }

    public static boolean a(Context context) {
        try {
            c.c(f27191a, "Checking tracker internet connectivity.", new Object[0]);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            c.b(f27191a, "Tracker connection online: %s", Boolean.valueOf(z));
            return z;
        } catch (Exception e2) {
            c.a(f27191a, "Security exception checking connection: %s", e2.toString());
            return true;
        }
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String b(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Exception e2) {
            c.a(f27191a, "getCarrier: %s", e2.toString());
        }
        return null;
    }

    public static Location c(Context context) {
        String str;
        String str2;
        Object[] objArr;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                Criteria criteria = new Criteria();
                criteria.setPowerRequirement(1);
                criteria.setAccuracy(2);
                String bestProvider = locationManager.getBestProvider(criteria, true);
                if (bestProvider != null) {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
                    c.b(f27191a, "Location found: %s", lastKnownLocation);
                    return lastKnownLocation;
                }
                str = f27191a;
                str2 = "Location Manager provider is null.";
                objArr = new Object[0];
            } else {
                str = f27191a;
                str2 = "Location Manager is null.";
                objArr = new Object[0];
            }
            c.a(str, str2, objArr);
        } catch (Exception e2) {
            c.a(f27191a, "Failed to retrieve location: %s", e2.toString());
        }
        return null;
    }
}
