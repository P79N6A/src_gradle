package com.ss.android.common.lib;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.aa;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLogNewUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static JSONObject copyJson(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15802, new Class[]{JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 15802, new Class[]{JSONObject.class}, JSONObject.class);
        } else if (jSONObject2 == null) {
            return null;
        } else {
            LinkedList linkedList = new LinkedList();
            Iterator<String> keys = jSONObject.keys();
            if (keys == null) {
                return null;
            }
            while (keys.hasNext()) {
                linkedList.add(keys.next());
            }
            try {
                return new JSONObject(jSONObject2, (String[]) linkedList.toArray(new String[0]));
            } catch (Exception unused) {
                return jSONObject2;
            }
        }
    }

    public static void onEventV3(String str, JSONObject jSONObject) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject}, null, changeQuickRedirect, true, 15801, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject}, null, changeQuickRedirect, true, 15801, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        final JSONObject copyJson = copyJson(jSONObject);
        final long currentTimeMillis = System.currentTimeMillis();
        aa.a().a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28306a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f28306a, false, 15804, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28306a, false, 15804, new Class[0], Void.TYPE);
                } else if (!StringUtils.isEmpty(str2)) {
                    JSONObject jSONObject = copyJson;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    JSONObject jSONObject2 = jSONObject;
                    try {
                        jSONObject2.put("_event_v3", 1);
                        jSONObject2.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject2.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (JSONException unused) {
                    }
                    AppLog.onEvent((Context) null, "event_v3", str2, (String) null, 0, 0, jSONObject2);
                }
            }
        });
    }

    public static void onEventV3Bundle(String str, Bundle bundle) {
        final String str2 = str;
        final Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{str2, bundle2}, null, changeQuickRedirect, true, 15803, new Class[]{String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bundle2}, null, changeQuickRedirect, true, 15803, new Class[]{String.class, Bundle.class}, Void.TYPE);
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        aa.a().a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28310a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f28310a, false, 15805, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28310a, false, 15805, new Class[0], Void.TYPE);
                } else if (!StringUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("_event_v3", 1);
                        jSONObject.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        if (bundle2 != null) {
                            for (String str : bundle2.keySet()) {
                                jSONObject.put(str, bundle2.get(str));
                            }
                        }
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (Throwable unused) {
                    }
                    AppLog.onEvent((Context) null, "event_v3", str2, (String) null, 0, 0, jSONObject);
                }
            }
        });
    }
}
