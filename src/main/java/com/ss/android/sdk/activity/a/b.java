package com.ss.android.sdk.activity.a;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.ss.android.downloadad.api.a.a;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.downloadad.api.a.c;
import com.ss.android.ugc.aweme.app.c.d.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f30640a;

    /* renamed from: b  reason: collision with root package name */
    public String f30641b;

    /* renamed from: c  reason: collision with root package name */
    public String f30642c;

    /* renamed from: d  reason: collision with root package name */
    public String f30643d;

    /* renamed from: e  reason: collision with root package name */
    public String f30644e;

    /* renamed from: f  reason: collision with root package name */
    public String f30645f;
    public String g;
    public String h;
    public JSONObject i;
    public int j;
    public boolean k;
    public com.ss.android.download.api.c.b l;
    private int m;
    private JSONObject n;
    private String o;
    private int p;

    private int a() {
        if (this.p == 1) {
            return 0;
        }
        return this.p;
    }

    @NonNull
    public static a b(b bVar) {
        return new a.C0339a().a(bVar.j).b(bVar.a()).a(true).c(bVar.k).a();
    }

    @NonNull
    public static com.ss.android.downloadad.api.a.b a(String str) {
        return f.a().a(new b.a().a(str).b(str).h("click_start_detail").i("click_pause_detail").j("click_continue_detail").k("click_install_detail").l("click_open_detail").m("storage_deny_detail").a(1).a(false).b(true).c(false), str);
    }

    @NonNull
    public static c a(@NonNull b bVar) {
        long j2;
        long j3 = 0;
        try {
            j2 = Long.parseLong(bVar.f30640a);
            try {
                j3 = Long.parseLong(bVar.f30641b);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j2 = 0;
        }
        return f.a().a(new c.a().a(j2).b(j3).a(bVar.f30642c).d(bVar.f30645f).b(bVar.f30643d).e(bVar.f30644e).a(bVar.l).a(bVar.i), bVar.o);
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.f30640a = bundle.getString("aweme_creative_id", "");
            this.f30641b = bundle.getString("aweme_group_id", "");
            this.f30642c = bundle.getString("bundle_download_app_log_extra");
            this.f30643d = bundle.getString("aweme_package_name");
            this.f30645f = bundle.getString("bundle_download_url");
            this.f30644e = bundle.getString("bundle_download_app_name");
            this.m = bundle.getInt("bundle_app_ad_from", 0);
            this.h = bundle.getString("bundle_download_app_extra");
            this.p = bundle.getInt("bundle_download_mode");
            this.k = bundle.getBoolean("bundle_support_multiple_download");
            try {
                this.n = new JSONObject(bundle.getString("aweme_json_extra", ""));
            } catch (Exception unused) {
            }
            this.o = bundle.getString("bundle_ad_quick_app_url");
            this.j = bundle.getInt("bundle_link_mode", 0);
            this.l = new com.ss.android.download.api.c.b(bundle.getString("bundle_open_url"), bundle.getString("bundle_web_url"), bundle.getString("bundle_web_title"));
            switch (this.m) {
                case 1:
                    this.g = "feed_download_ad";
                    return;
                case 2:
                    this.g = "detail_download_ad";
                    return;
                case 3:
                    this.g = "comment_download_ad";
                    return;
                case 4:
                    this.g = "wap";
                    return;
                case 5:
                    this.g = "landing_ad";
                    return;
                default:
                    this.g = "draw_ad";
                    return;
            }
        }
    }

    @NonNull
    public static c a(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, String str8) {
        HashMap hashMap;
        long j2;
        if (!TextUtils.isEmpty(str6)) {
            hashMap = new HashMap();
            hashMap.put("User-Agent", str6);
        } else {
            hashMap = null;
        }
        try {
            j2 = Long.parseLong(str);
            try {
                jSONObject.putOpt("ext_value", Long.valueOf(Long.parseLong(str2)));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j2 = 0;
        }
        return f.a().a(new c.a().a(j2).a(str3).d(str5).e(str4).f(str7).a((Map<String, String>) hashMap).a(jSONObject), str8);
    }
}
