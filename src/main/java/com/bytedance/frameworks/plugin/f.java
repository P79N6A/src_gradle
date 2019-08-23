package com.bytedance.frameworks.plugin;

import android.content.Intent;
import android.os.Bundle;
import java.util.Map;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static a f2251a;

    public interface a {
    }

    public static void a(String str, int i, int i2) {
        a(str, i, i2, null, null);
    }

    public static void a(String str, int i, int i2, Map<String, Long> map) {
        a(str, i, i2, map, null);
    }

    public static void a(String str, int i, int i2, Map<String, Long> map, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.bytedance.frameworks.plugin.ACTION_REPORTER");
        Bundle bundle = new Bundle();
        bundle.putInt("status", i2);
        bundle.putString("packageName", str);
        bundle.putInt("versionCode", i);
        bundle.putString("message", str2);
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String next : map.keySet()) {
                    jSONObject.put(next, map.get(next));
                }
            }
            bundle.putString("duration", jSONObject.toString());
        } catch (Exception unused) {
        }
        intent.putExtras(bundle);
        intent.setPackage(e.a().getPackageName());
        if (f2251a == null) {
            e.a().sendBroadcast(intent);
        }
    }
}
