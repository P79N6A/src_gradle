package com.tencent.connect.common;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.tencent.connect.b.d;
import com.tencent.connect.b.h;
import com.tencent.open.d.f;

public abstract class a {

    /* renamed from: f  reason: collision with root package name */
    public static String f79630f;
    public static String g;
    public static String h;
    public static boolean i;

    /* renamed from: d  reason: collision with root package name */
    protected h f79631d;

    /* renamed from: e  reason: collision with root package name */
    public d f79632e;

    /* access modifiers changed from: protected */
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("format", "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", Build.MODEL);
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", "3.3.0.lite");
        bundle.putString("sdkp", "a");
        if (this.f79632e != null && this.f79632e.a()) {
            bundle.putString("access_token", this.f79632e.f79591b);
            bundle.putString("oauth_consumer_key", this.f79632e.f79590a);
            bundle.putString("openid", this.f79632e.f79592c);
            bundle.putString("appid_for_getting_config", this.f79632e.f79590a);
        }
        SharedPreferences a2 = c.a(com.tencent.open.d.c.a(), "pfStore", 0);
        if (i) {
            bundle.putString("pf", "desktop_m_qq-" + g + "-android" + "-" + f79630f + "-" + h);
        } else {
            bundle.putString("pf", a2.getString("pf", "openmobile_android"));
        }
        return bundle;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("appid", this.f79632e.f79590a);
        if (this.f79632e.a()) {
            bundle.putString("keystr", this.f79632e.f79591b);
            bundle.putString("keytype", "0x80");
        }
        String str = this.f79632e.f79592c;
        if (str != null) {
            bundle.putString("hopenid", str);
        }
        bundle.putString("platform", "androidqz");
        SharedPreferences a2 = c.a(com.tencent.open.d.c.a(), "pfStore", 0);
        if (i) {
            bundle.putString("pf", "desktop_m_qq-" + g + "-android" + "-" + f79630f + "-" + h);
        } else {
            bundle.putString("pf", a2.getString("pf", "openmobile_android"));
            bundle.putString("pf", "openmobile_android");
        }
        bundle.putString("sdkv", "3.3.0.lite");
        bundle.putString("sdkp", "a");
        return bundle;
    }

    public a(d dVar) {
        this(null, dVar);
    }

    protected static boolean a(Intent intent) {
        if (intent != null) {
            return f.a(com.tencent.open.d.c.a(), intent);
        }
        return false;
    }

    public final String a(String str) {
        Bundle a2 = a();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            a2.putString("need_version", str);
        }
        sb.append("http://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        sb.append(com.tencent.open.d.a.a(a2));
        return sb.toString();
    }

    protected static Intent b(String str) {
        Intent intent = new Intent();
        if (com.tencent.open.d.h.c(com.tencent.open.d.c.a())) {
            intent.setClassName("com.tencent.minihd.qq", str);
            if (f.a(com.tencent.open.d.c.a(), intent)) {
                return intent;
            }
        }
        intent.setClassName("com.tencent.mobileqq", str);
        if (f.a(com.tencent.open.d.c.a(), intent)) {
            return intent;
        }
        intent.setClassName("com.tencent.tim", str);
        if (f.a(com.tencent.open.d.c.a(), intent)) {
            return intent;
        }
        intent.setClassName("com.tencent.qim", str);
        if (f.a(com.tencent.open.d.c.a(), intent)) {
            return intent;
        }
        return null;
    }

    private a(h hVar, d dVar) {
        this.f79631d = null;
        this.f79632e = dVar;
    }

    private static Intent a(Activity activity, Intent intent) {
        Intent intent2 = new Intent(activity.getApplicationContext(), AssistActivity.class);
        intent2.putExtra("is_login", true);
        intent2.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", intent);
        return intent2;
    }

    /* access modifiers changed from: protected */
    public final void a(Activity activity, Intent intent, int i2) {
        intent.putExtra("key_request_code", 11101);
        activity.startActivityForResult(a(activity, intent), 11101);
    }

    /* access modifiers changed from: protected */
    public final void a(Fragment fragment, Intent intent, int i2) {
        intent.putExtra("key_request_code", 11101);
        fragment.startActivityForResult(a(fragment.getActivity(), intent), 11101);
    }
}
