package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.common.f.f;
import com.ss.android.ugc.effectmanager.common.model.NetException;
import com.ss.android.ugc.effectmanager.effect.e.a.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.util.HashMap;
import java.util.List;

public final class l extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77458e;

    /* renamed from: f  reason: collision with root package name */
    private g f77459f = this.f77458e.f77204a;
    private c g = this.f77458e.f77204a.v;
    private String h;
    private int i;

    public final void a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f77459f.f77476b)) {
            hashMap.put("access_key", this.f77459f.f77476b);
        }
        if (!TextUtils.isEmpty(this.f77459f.f77479e)) {
            hashMap.put("device_id", this.f77459f.f77479e);
        }
        if (!TextUtils.isEmpty(this.f77459f.h)) {
            hashMap.put("device_type", this.f77459f.h);
        }
        if (!TextUtils.isEmpty(this.f77459f.g)) {
            hashMap.put("device_platform", this.f77459f.g);
        }
        if (!TextUtils.isEmpty(this.f77459f.j)) {
            hashMap.put("region", this.f77459f.j);
        }
        if (!TextUtils.isEmpty(this.f77459f.f77477c)) {
            hashMap.put("sdk_version", this.f77459f.f77477c);
        }
        if (!TextUtils.isEmpty(this.f77459f.f77478d)) {
            hashMap.put("app_version", this.f77459f.f77478d);
        }
        if (!TextUtils.isEmpty(this.f77459f.f77480f)) {
            hashMap.put("channel", this.f77459f.f77480f);
        }
        if (!TextUtils.isEmpty(this.h)) {
            hashMap.put("panel", this.h);
        }
        if (!TextUtils.isEmpty(this.f77459f.k)) {
            hashMap.put("aid", this.f77459f.k);
        }
        if (!TextUtils.isEmpty(this.f77459f.l)) {
            hashMap.put("app_language", this.f77459f.l);
        }
        if (!TextUtils.isEmpty(this.f77459f.m)) {
            hashMap.put("language", this.f77459f.m);
        }
        com.ss.android.ugc.effectmanager.common.a aVar = new com.ss.android.ugc.effectmanager.common.a("GET", f.a(hashMap, this.f77458e.f77205b.i + this.f77459f.f77475a + "/v3/effect/my"));
        int i2 = 0;
        while (i2 < this.i) {
            try {
                FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) this.f77459f.w.a(aVar, this.g, FetchFavoriteListResponse.class);
                if (fetchFavoriteListResponse == null || !fetchFavoriteListResponse.checkValued()) {
                    throw new NetException(10002, "Download error");
                }
                List<Effect> effects = fetchFavoriteListResponse.getEffects();
                for (Effect effect : effects) {
                    if (TextUtils.isEmpty(effect.zipPath) || TextUtils.isEmpty(effect.unzipPath)) {
                        effect.zipPath = this.f77459f.i + File.separator + effect.id + ".zip";
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f77459f.i);
                        sb.append(File.separator);
                        sb.append(effect.id);
                        effect.unzipPath = sb.toString();
                    }
                }
                a(41, new h(effects, fetchFavoriteListResponse.getType()));
                return;
            } catch (Exception e2) {
                if (i2 == this.i - 1) {
                    a(41, new h(new com.ss.android.ugc.effectmanager.common.e.c(e2)));
                }
                i2++;
            }
        }
    }

    public l(a aVar, String str, String str2, Handler handler) {
        super(handler, str2, "NETWORK");
        this.f77458e = aVar;
        this.h = str;
        this.i = this.f77459f.s;
    }
}
