package com.huawei.android.pushselfshow.richpush.html.api;

import com.huawei.android.pushagent.utils.a.e;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f25327a = {"OK.", "Failed to start compass.", "Can't find method.", "Service not found.", "Class not found.", "Illegal access.", "Instantiation error.", "Malformed url.", "IO error.", "Invalid action.", "Illegal parameter.", "Subject to play the file is not found.", "Supports only HTTP / HTTPS or local file.", "Play abnormal, please try again.", "Application does not exist.", "Application does not exist, thus opening the application market.", "Application market does not exist.", "NetWork provider is not available.", "GPS provider is not available.", "NetWork Provider is out of service.", "GPS Provider is out of service.", "Location API is not available for this device.", "No sensors found to register accelerometer listening to.", "Accelerometer could not be started.", "Not found Sd card.", "Error"};

    /* renamed from: b  reason: collision with root package name */
    private String f25328b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f25329c;

    public enum a {
        OK,
        FAILED_TO_START_COMPASS,
        METHOD_NOT_FOUND_EXCEPTION,
        SERVICE_NOT_FOUND_EXCEPTION,
        CLASS_NOT_FOUND_EXCEPTION,
        ILLEGAL_ACCESS_EXCEPTION,
        INSTANTIATION_EXCEPTION,
        MALFORMED_URL_EXCEPTION,
        IO_EXCEPTION,
        INVALID_ACTION,
        JSON_EXCEPTION,
        AUDIO_SRC_NOT_FOUND,
        AUDIO_ONLY_SUPPORT_HTTP,
        AUDIO_PLAY_ERROR,
        APP_NOT_EXIST,
        APP_OPEN_APPMARKET,
        APP_NOT_APPMARKET,
        POSITION_UNAVAILABLE_NETOWRK,
        POSITION_UNAVAILABLE_GPS,
        POSTION_OUT_OF_SERVICE_NETOWRK,
        POSTION_OUT_OF_SERVICE_GPS,
        POSTION_API_NOT_SUPPORT,
        ACCL_NO_SENSORS,
        ACCL_CAN_NOT_START,
        ACCL_NO_SDCARD,
        ERROR
    }

    public d(String str, a aVar) {
        this.f25328b = str;
        this.f25329c = a(aVar, new JSONObject());
    }

    public d(String str, a aVar, JSONObject jSONObject) {
        this.f25328b = str;
        this.f25329c = a(aVar, jSONObject);
    }

    public static JSONObject a(a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            int ordinal = aVar.ordinal();
            jSONObject.put("result_code", ordinal);
            jSONObject.put("result_info", f25327a[ordinal]);
            return jSONObject;
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "pluginRecsult encodeMsg error ", e2);
            return jSONObject;
        }
    }

    private JSONObject a(a aVar, JSONObject jSONObject) {
        try {
            int ordinal = aVar.ordinal();
            jSONObject.put("result_code", ordinal);
            jSONObject.put("result_info", f25327a[ordinal]);
            return jSONObject;
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "pluginRecsult encodeMsg error ", e2);
            return null;
        }
    }

    public static String[] c() {
        String[] strArr = new String[f25327a.length];
        System.arraycopy(f25327a, 0, strArr, 0, f25327a.length);
        return strArr;
    }

    public String a() {
        return this.f25328b;
    }

    public JSONObject b() {
        return this.f25329c;
    }
}
