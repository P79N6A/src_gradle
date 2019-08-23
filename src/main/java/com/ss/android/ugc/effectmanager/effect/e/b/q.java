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

public final class q extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77468e;

    /* renamed from: f  reason: collision with root package name */
    private g f77469f = this.f77468e.f77204a;
    private int g = this.f77469f.s;
    private com.ss.android.ugc.effectmanager.common.d.a h = this.f77469f.r;
    private c i = this.f77469f.v;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private int o;
    private int p;

    public final void a() {
        com.ss.android.ugc.effectmanager.common.a b2 = b();
        while (true) {
            int i2 = this.g;
            this.g = i2 - 1;
            if (i2 != 0) {
                try {
                    if (this.f77323c) {
                        com.ss.android.ugc.effectmanager.common.e.c cVar = new com.ss.android.ugc.effectmanager.common.e.c(10001);
                        cVar.a(this.l, this.m, this.n);
                        a(18, new j(new ProviderEffectModel(), cVar));
                        return;
                    }
                    ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) this.f77469f.w.a(b2, this.i, ProviderEffectListResponse.class);
                    if (providerEffectListResponse.checkValue()) {
                        ProviderEffectModel providerEffectModel = providerEffectListResponse.data;
                        if (providerEffectModel != null) {
                            if (providerEffectModel.sticker_list != null) {
                                for (ProviderEffect next : providerEffectModel.sticker_list) {
                                    next.path = this.f77469f.i + File.separator + next.id + ".gif";
                                }
                            }
                        }
                        a(18, new j(providerEffectModel, null));
                        return;
                    } else if (this.g == 0) {
                        com.ss.android.ugc.effectmanager.common.e.c cVar2 = new com.ss.android.ugc.effectmanager.common.e.c(10002);
                        cVar2.a(this.l, this.m, this.n);
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
        if (!TextUtils.isEmpty(this.f77469f.f77476b)) {
            hashMap.put("access_key", this.f77469f.f77476b);
        }
        if (!TextUtils.isEmpty(this.f77469f.f77478d)) {
            hashMap.put("app_version", this.f77469f.f77478d);
        }
        if (!TextUtils.isEmpty(this.f77469f.f77477c)) {
            hashMap.put("sdk_version", this.f77469f.f77477c);
        }
        if (!TextUtils.isEmpty(this.f77469f.f77480f)) {
            hashMap.put("channel", this.f77469f.f77480f);
        }
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("library", this.j);
        }
        if (!TextUtils.isEmpty(this.f77469f.g)) {
            hashMap.put("device_platform", this.f77469f.g);
        }
        if (!TextUtils.isEmpty(this.f77469f.f77479e)) {
            hashMap.put("device_id", this.f77469f.f77479e);
        }
        if (!TextUtils.isEmpty(this.f77469f.j)) {
            hashMap.put("region", this.f77469f.j);
        }
        if (!TextUtils.isEmpty(this.f77469f.h)) {
            hashMap.put("device_type", this.f77469f.h);
        }
        if (!TextUtils.isEmpty(this.f77469f.k)) {
            hashMap.put("aid", this.f77469f.k);
        }
        if (!TextUtils.isEmpty(this.f77469f.l)) {
            hashMap.put("app_language", this.f77469f.l);
        }
        if (!TextUtils.isEmpty(this.f77469f.m)) {
            hashMap.put("language", this.f77469f.m);
        }
        if (!TextUtils.isEmpty(this.k)) {
            hashMap.put("word", this.k);
        }
        hashMap.put("cursor", String.valueOf(this.o));
        hashMap.put("count", String.valueOf(this.p));
        this.m = this.f77468e.f77205b.i;
        String a2 = f.a(hashMap, this.m + this.f77469f.f77475a + "/stickers/search");
        this.l = a2;
        try {
            this.n = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new com.ss.android.ugc.effectmanager.common.a("GET", a2);
    }

    public q(a aVar, String str, String str2, String str3, int i2, int i3, Handler handler) {
        super(handler, str, "NETWORK");
        this.j = str3;
        this.o = i2;
        this.p = i3;
        this.k = str2;
        this.f77468e = aVar;
    }
}
