package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.c.b;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.common.f.f;
import com.ss.android.ugc.effectmanager.effect.e.a.j;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

public final class o extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77464e;

    /* renamed from: f  reason: collision with root package name */
    private g f77465f = this.f77464e.f77204a;
    private int g = this.f77465f.s;
    private com.ss.android.ugc.effectmanager.common.d.a h = this.f77465f.r;
    private c i = this.f77465f.v;
    private String j;
    private String k;
    private String l;
    private String m;
    private int n;
    private int o;

    public final void a() {
        com.ss.android.ugc.effectmanager.common.a b2 = b();
        while (true) {
            int i2 = this.g;
            this.g = i2 - 1;
            if (i2 != 0) {
                try {
                    if (this.f77323c) {
                        com.ss.android.ugc.effectmanager.common.e.c cVar = new com.ss.android.ugc.effectmanager.common.e.c(10001);
                        cVar.a(this.k, this.l, this.m);
                        a(18, new j(new ProviderEffectModel(), cVar));
                        return;
                    }
                    ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) this.f77465f.w.a(b2, this.i, ProviderEffectListResponse.class);
                    if (providerEffectListResponse.checkValue()) {
                        ProviderEffectModel providerEffectModel = providerEffectListResponse.data;
                        if (providerEffectModel != null) {
                            if (providerEffectModel.sticker_list != null) {
                                for (ProviderEffect next : providerEffectModel.sticker_list) {
                                    next.path = this.f77465f.i + File.separator + next.id + ".gif";
                                }
                            }
                        }
                        this.h.a(com.ss.android.ugc.effectmanager.common.f.a.a(this.f77465f.f77480f, this.j), this.i.a(providerEffectModel));
                        a(18, new j(providerEffectModel, null));
                        return;
                    } else if (this.g == 0) {
                        com.ss.android.ugc.effectmanager.common.e.c cVar2 = new com.ss.android.ugc.effectmanager.common.e.c(10002);
                        cVar2.a(this.k, this.l, this.m);
                        a(18, new j(new ProviderEffectModel(), cVar2));
                        return;
                    }
                } catch (Exception e2) {
                    if (this.g == 0 || (e2 instanceof b)) {
                        a(18, new j(new ProviderEffectModel(), new com.ss.android.ugc.effectmanager.common.e.c(e2)));
                    }
                }
            } else {
                return;
            }
        }
        a(18, new j(new ProviderEffectModel(), new com.ss.android.ugc.effectmanager.common.e.c(e2)));
    }

    private com.ss.android.ugc.effectmanager.common.a b() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f77465f.f77476b)) {
            hashMap.put("access_key", this.f77465f.f77476b);
        }
        if (!TextUtils.isEmpty(this.f77465f.f77478d)) {
            hashMap.put("app_version", this.f77465f.f77478d);
        }
        if (!TextUtils.isEmpty(this.f77465f.f77477c)) {
            hashMap.put("sdk_version", this.f77465f.f77477c);
        }
        if (!TextUtils.isEmpty(this.f77465f.f77480f)) {
            hashMap.put("channel", this.f77465f.f77480f);
        }
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("library", this.j);
        }
        if (!TextUtils.isEmpty(this.f77465f.g)) {
            hashMap.put("device_platform", this.f77465f.g);
        }
        if (!TextUtils.isEmpty(this.f77465f.f77479e)) {
            hashMap.put("device_id", this.f77465f.f77479e);
        }
        if (!TextUtils.isEmpty(this.f77465f.j)) {
            hashMap.put("region", this.f77465f.j);
        }
        if (!TextUtils.isEmpty(this.f77465f.h)) {
            hashMap.put("device_type", this.f77465f.h);
        }
        if (!TextUtils.isEmpty(this.f77465f.k)) {
            hashMap.put("aid", this.f77465f.k);
        }
        if (!TextUtils.isEmpty(this.f77465f.l)) {
            hashMap.put("app_language", this.f77465f.l);
        }
        if (!TextUtils.isEmpty(this.f77465f.m)) {
            hashMap.put("language", this.f77465f.m);
        }
        hashMap.put("cursor", String.valueOf(this.n));
        hashMap.put("count", String.valueOf(this.o));
        this.l = this.f77464e.f77205b.i;
        String a2 = f.a(hashMap, this.l + this.f77465f.f77475a + "/stickers/recommend");
        this.k = a2;
        try {
            this.m = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new com.ss.android.ugc.effectmanager.common.a("GET", a2);
    }

    public o(a aVar, String str, String str2, int i2, int i3, Handler handler) {
        super(handler, str, "NETWORK");
        this.n = i2;
        this.o = i3;
        this.j = str2;
        this.f77464e = aVar;
    }
}
