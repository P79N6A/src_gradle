package com.ss.android.ttvecamera.hardware;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import com.b.b.b;
import com.ss.android.ttvecamera.ad;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(21)
public final class e extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, String> f31458d = new HashMap<String, String>() {
        {
            put("com.ss.android.ugc.trill", "VdRQAXll2qGqBr3q0pv9fxjKUNSUZE5Au4tXeYAjvegHPG8+QL6PB65CdoZjef9mmWbVU0avYTAujNyKeSbN696+CZwbhwMnT28B8LU0XECzBxuUCrSUIK2DSy8KOLKDgbcseRuqLdEO91Wo70115XKAUOMkMaZosdSVnqhHYP4=");
            put("com.ss.android.ttve.app", "acJhRrV9SGJSFhTPJu53AJUEzAIie4adIn1J3yC+QG5FXX3h/GX7gaeDXRlRMoUa80Jv43LwjuMR47MPdPzldZp6PCPxXNW81maIAc0oebAMT6NgTHf5O8wgkbAZFNilvD70Cjd8YbYfDvSJ5O63V4+VHcNJ/LV3p1id21Z9FLU=");
            put("com.zhiliaoapp.musically", "I1nLPCzgp4J6fBHsdd82IBOcMK+AY67rPqYPuw4WfLYtvifBG+ABEO+Wh3N0t5siZ6dA6ZTdSIBxEZSVZlHRyD7VRaPajn/oghXkdYuDkyzzEexN6BDEXHd+B7aC2yb080U3MSzCDya2wAg6QG2IRYl1TIMlET7EhR9lmQetYdc=");
            put("com.ss.android.ugc.aweme", "V0smG6erGIWwu3z5JaAn4ibfK6iq5uW3qRb+zT6rqgpy8HHYw5TeFOMt2k0cNWuSWv4Rxn1gW+nK5oGMpBwf8nYKppzfrtXQsYgsumcg8yNRVpKZ0WSntuSCCkAtFKcnNx/DoEAjXZuqs5Vzg9VbcOmKwsgsz58eJdXiEMUqoZw=");
        }
    };

    public static boolean b(Context context, int i) {
        try {
            b a2 = b.a();
            String str = ((CameraManager) context.getSystemService("camera")).getCameraIdList()[i];
            String b2 = a2.b(f31458d.get(context.getPackageName()));
            if (b2 != null && !b2.isEmpty()) {
                String b3 = a2.b();
                if (b3 != null && b3.contains(str)) {
                    String c2 = a2.c(str);
                    if (c2 != null && !c2.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(c2);
                        if (1 == jSONObject.optInt("EIS") || 1 == jSONObject.optInt("OIS-Movie")) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            ad.c("TECameraOppoProxy", "AntiShake verify cause this exception");
        }
        return false;
    }
}
