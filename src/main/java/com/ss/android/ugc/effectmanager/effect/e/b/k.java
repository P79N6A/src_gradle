package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.common.f.f;
import com.ss.android.ugc.effectmanager.effect.e.a.b;
import com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class k extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77456e;

    /* renamed from: f  reason: collision with root package name */
    private g f77457f = this.f77456e.f77204a;
    private int g = this.f77457f.s;
    private com.ss.android.ugc.effectmanager.common.d.a h = this.f77457f.r;
    private c i = this.f77457f.v;
    @Nullable
    private com.ss.android.ugc.effectmanager.common.d.d j = this.f77457f.x;
    private String k;
    private String l;
    private String m;
    private String n;
    private long o;

    private com.ss.android.ugc.effectmanager.common.a b() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f77457f.f77476b)) {
            hashMap.put("access_key", this.f77457f.f77476b);
        }
        if (!TextUtils.isEmpty(this.f77457f.f77478d)) {
            hashMap.put("app_version", this.f77457f.f77478d);
        }
        if (!TextUtils.isEmpty(this.f77457f.f77477c)) {
            hashMap.put("sdk_version", this.f77457f.f77477c);
        }
        if (!TextUtils.isEmpty(this.f77457f.f77480f)) {
            hashMap.put("channel", this.f77457f.f77480f);
        }
        if (!TextUtils.isEmpty(this.k)) {
            hashMap.put("panel", this.k);
        }
        if (!TextUtils.isEmpty(this.f77457f.g)) {
            hashMap.put("device_platform", this.f77457f.g);
        }
        if (!TextUtils.isEmpty(this.f77457f.f77479e)) {
            hashMap.put("device_id", this.f77457f.f77479e);
        }
        if (!TextUtils.isEmpty(this.f77457f.j)) {
            hashMap.put("region", this.f77457f.j);
        }
        if (!TextUtils.isEmpty(this.f77457f.h)) {
            hashMap.put("device_type", this.f77457f.h);
        }
        if (!TextUtils.isEmpty(this.f77457f.k)) {
            hashMap.put("aid", this.f77457f.k);
        }
        if (!TextUtils.isEmpty(this.f77457f.l)) {
            hashMap.put("app_language", this.f77457f.l);
        }
        if (!TextUtils.isEmpty(this.f77457f.m)) {
            hashMap.put("language", this.f77457f.m);
        }
        if (!TextUtils.isEmpty(this.f77457f.n)) {
            hashMap.put("longitude", this.f77457f.n);
        }
        if (!TextUtils.isEmpty(this.f77457f.o)) {
            hashMap.put("latitude", this.f77457f.o);
        }
        if (!TextUtils.isEmpty(this.f77457f.p)) {
            hashMap.put("city_code", this.f77457f.p);
        }
        this.m = this.f77456e.f77205b.i;
        String a2 = f.a(hashMap, this.m + this.f77457f.f77475a + "/v3/effects");
        this.l = a2;
        try {
            this.n = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new com.ss.android.ugc.effectmanager.common.a("GET", a2);
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.ugc.effectmanager.common.a b2 = b();
        while (true) {
            int i2 = this.g;
            this.g = i2 - 1;
            if (i2 != 0) {
                try {
                    if (this.f77323c) {
                        a(new com.ss.android.ugc.effectmanager.common.e.c(10001));
                        return;
                    }
                    InputStream a2 = this.f77457f.w.a(b2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    EffectNetListResponse effectNetListResponse = (EffectNetListResponse) this.f77457f.w.a(b2, a2, this.i, EffectNetListResponse.class);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (effectNetListResponse.checkValued()) {
                        EffectChannelModel effectChannelModel = effectNetListResponse.data;
                        EffectChannelResponse buildChannelResponse = new BuildEffectChannelResponse(this.k, this.f77456e.f77204a.i.getAbsolutePath(), false).buildChannelResponse(effectChannelModel);
                        String a3 = com.ss.android.ugc.effectmanager.common.f.a.a(this.f77457f.f77480f, this.k);
                        this.h.a(a3, this.i.a(effectChannelModel));
                        this.o = new File(this.f77457f.i + File.separator + a3).length() / ((long) EffectConstants.f77264a);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("version", effectChannelModel.version);
                            com.ss.android.ugc.effectmanager.common.d.a aVar = this.h;
                            aVar.a("effect_version" + this.k, jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                        a(14, new b(buildChannelResponse, null));
                        long currentTimeMillis4 = System.currentTimeMillis();
                        if (this.j != null) {
                            this.j.a("effect_list_success_rate", 0, com.ss.android.ugc.effectmanager.common.f.c.a().a("app_id", this.f77457f.k).a("access_key", this.f77457f.f77476b).a("panel", this.k).a("duration", Long.valueOf(currentTimeMillis4 - currentTimeMillis)).a("network_time", Long.valueOf(currentTimeMillis2 - currentTimeMillis)).a("json_time", Long.valueOf(currentTimeMillis3 - currentTimeMillis2)).a("io_time", Long.valueOf(currentTimeMillis4 - currentTimeMillis3)).a("size", Long.valueOf(this.o)).b());
                        }
                        return;
                    } else if (this.g == 0) {
                        a(new com.ss.android.ugc.effectmanager.common.e.c(10002));
                        return;
                    }
                } catch (Exception e2) {
                    if (this.g == 0 || (e2 instanceof com.ss.android.ugc.effectmanager.common.c.b)) {
                        a(new com.ss.android.ugc.effectmanager.common.e.c(e2));
                    }
                }
            } else {
                return;
            }
        }
        a(new com.ss.android.ugc.effectmanager.common.e.c(e2));
    }

    private void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
        cVar.a(this.l, this.m, this.n);
        a(14, new b(null, cVar));
        if (this.j != null) {
            this.j.a("effect_list_success_rate", 1, com.ss.android.ugc.effectmanager.common.f.c.a().a("app_id", this.f77457f.k).a("access_key", this.f77457f.f77476b).a("panel", this.k).a("error_code", Integer.valueOf(cVar.f77315a)).a("error_msg", cVar.f77316b).b());
        }
    }

    public k(a aVar, String str, String str2, Handler handler) {
        super(handler, str2, "NETWORK");
        this.k = str;
        this.f77456e = aVar;
    }
}
