package com.huawei.android.pushselfshow.richpush.html.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.a.h;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.f;
import com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue;
import com.huawei.android.pushselfshow.richpush.html.api.d;
import com.huawei.android.pushselfshow.utils.a;
import org.json.JSONObject;

public class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private Activity f25301a;

    /* renamed from: b  reason: collision with root package name */
    private NativeToJsMessageQueue f25302b;

    /* renamed from: c  reason: collision with root package name */
    private String f25303c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f25304d;

    public i(Activity activity, boolean z) {
        e.e("PushSelfShowLog", "init App");
        this.f25301a = activity;
        this.f25304d = z;
    }

    private String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("version", Build.DISPLAY);
            jSONObject.put("os", "Android");
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("uuid", a());
            jSONObject.put("sdkVersion", "2815");
            if (this.f25304d) {
                jSONObject.put("imei", a.a(a.b((Context) this.f25301a)));
            }
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "onError error", e2);
        }
        return jSONObject.toString();
    }

    public String a() {
        try {
            String a2 = f.a(this.f25301a, "push_client_self_info", "token_info");
            if (TextUtils.isEmpty(a2)) {
                a2 = a.b((Context) this.f25301a);
            }
            return h.a(a2);
        } catch (Exception unused) {
            return "";
        }
    }

    public String a(String str, JSONObject jSONObject) {
        return "getDeviceInfo".equals(str) ? e() : d.a(d.a.ERROR).toString();
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(NativeToJsMessageQueue nativeToJsMessageQueue, String str, String str2, JSONObject jSONObject) {
        if (nativeToJsMessageQueue == null) {
            e.a("PushSelfShowLog", "jsMessageQueue is null while run into App exec");
            return;
        }
        this.f25302b = nativeToJsMessageQueue;
        if (str2 != null) {
            this.f25303c = str2;
        } else {
            e.a("PushSelfShowLog", "get DeviceInfo exec callback is null ");
        }
        this.f25302b.a(this.f25303c, d.a.METHOD_NOT_FOUND_EXCEPTION, "error", null);
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }
}
