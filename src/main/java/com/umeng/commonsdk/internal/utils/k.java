package com.umeng.commonsdk.internal.utils;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.q.c;
import com.umeng.commonsdk.utils.UMUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class k {
    public static String b(Context context) {
        String str = null;
        if (context != null && UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            str = telephonyManager.getSimSerialNumber();
        }
        return str;
    }

    public static String e(Context context) {
        if (context == null) {
            return null;
        }
        SharedPreferences a2 = c.a(context.getApplicationContext(), "um_pri", 0);
        if (a2 != null) {
            return a2.getString("um_common_strength", null);
        }
        return null;
    }

    public static String f(Context context) {
        if (context == null) {
            return null;
        }
        SharedPreferences a2 = c.a(context.getApplicationContext(), "um_pri", 0);
        if (a2 != null) {
            return a2.getString("um_common_battery", null);
        }
        return null;
    }

    public static String a(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                return Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
            }
            if (UMUtils.checkPermission(context, "android.permission.BLUETOOTH")) {
                return BluetoothAdapter.getDefaultAdapter().getAddress();
            }
        }
        return null;
    }

    public static String c(Context context) {
        String str = null;
        if (context != null && Build.VERSION.SDK_INT >= 23 && UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return null;
                }
                Class<?> cls = telephonyManager.getClass();
                if (((Integer) cls.getMethod("getPhoneCount", new Class[0]).invoke(telephonyManager, new Object[0])).intValue() == 2) {
                    str = (String) cls.getMethod("getDeviceId", new Class[]{Integer.TYPE}).invoke(telephonyManager, new Object[]{2});
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static JSONObject d(Context context) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (context != null && (UMUtils.checkPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || UMUtils.checkPermission(context, "android.permission.ACCESS_FINE_LOCATION"))) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            int phoneType = telephonyManager.getPhoneType();
            if (phoneType == 1 && (cellLocation instanceof GsmCellLocation)) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                int cid = gsmCellLocation.getCid();
                if (cid > 0 && cid != 65535) {
                    int lac = gsmCellLocation.getLac();
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("cid", cid);
                        jSONObject.put("lacid", lac);
                        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                    } catch (Exception unused) {
                    }
                }
            } else if (phoneType == 2 && (cellLocation instanceof CdmaCellLocation)) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                int baseStationId = cdmaCellLocation.getBaseStationId();
                int networkId = cdmaCellLocation.getNetworkId();
                jSONObject = new JSONObject();
                jSONObject.put("cid", baseStationId);
                jSONObject.put("lacid", networkId);
                jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
            }
            jSONObject2 = jSONObject;
        }
        return jSONObject2;
    }

    public static JSONArray g(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return jSONArray;
            }
            for (Sensor next : sensorManager.getSensorList(-1)) {
                if (next != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("a_type", next.getType());
                        jSONObject.put("a_ven", next.getVendor());
                        if (Build.VERSION.SDK_INT >= 24) {
                            jSONObject.put("a_id", next.getId());
                        }
                        jSONObject.put("a_na", next.getName());
                        jSONObject.put("a_ver", next.getVersion());
                        jSONObject.put("a_mar", (double) next.getMaximumRange());
                        jSONObject.put("a_ver", next.getVersion());
                        jSONObject.put("a_res", (double) next.getResolution());
                        jSONObject.put("a_po", (double) next.getPower());
                        if (Build.VERSION.SDK_INT >= 9) {
                            jSONObject.put("a_mid", next.getMinDelay());
                        }
                        if (Build.VERSION.SDK_INT >= 21) {
                            jSONObject.put("a_mad", next.getMaxDelay());
                        }
                        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                    } catch (Exception unused) {
                    }
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    public static void b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a2 = c.a(context.getApplicationContext(), "um_pri", 0);
            if (a2 != null) {
                a2.edit().putString("um_common_battery", str).commit();
            }
        }
    }

    public static void a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            SharedPreferences a2 = c.a(context.getApplicationContext(), "um_pri", 0);
            if (a2 != null) {
                a2.edit().putString("um_common_strength", str).commit();
            }
        }
    }
}
