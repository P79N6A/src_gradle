package com.ss.android.ad.smartphone;

import android.content.Context;
import android.support.annotation.StringRes;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.smartphone.a.b;
import com.ss.android.ad.smartphone.a.e;
import com.ss.android.ad.smartphone.a.f;
import com.ss.android.ad.smartphone.a.g;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static f f22734a;

    /* renamed from: b  reason: collision with root package name */
    public static com.ss.android.ad.smartphone.a.c f22735b;

    /* renamed from: c  reason: collision with root package name */
    public static b f22736c;

    /* renamed from: d  reason: collision with root package name */
    public static String f22737d;

    /* renamed from: e  reason: collision with root package name */
    public static g f22738e;

    /* renamed from: f  reason: collision with root package name */
    public static Context f22739f;
    public static int g;
    private static e h;
    @StringRes
    private static int i;
    @StringRes
    private static int j;

    public static String a() {
        return f22737d;
    }

    public static e b() {
        return h;
    }

    public static g c() {
        return f22738e;
    }

    public static int d() {
        return g;
    }

    public static int e() {
        return i;
    }

    public static int f() {
        return j;
    }

    public static Context g() {
        return f22739f;
    }

    public static void a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", "smartphone");
            jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            jSONObject.put("category", "umeng");
            f22735b.a(str, str2, str3, str4, jSONObject);
        } catch (Exception unused) {
        }
    }
}
