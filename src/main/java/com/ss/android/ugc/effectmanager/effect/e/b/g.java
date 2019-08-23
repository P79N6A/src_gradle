package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.c.b;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.e.a.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class g extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77448e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.effectmanager.g f77449f;
    private c g;
    private List<String> h = new ArrayList();
    private String i;
    private boolean j;
    private int k;

    public final void a() {
        int i2 = 0;
        while (i2 < this.k) {
            List<String> list = this.h;
            boolean z = this.j;
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.f77449f.f77476b)) {
                hashMap.put("access_key", this.f77449f.f77476b);
            }
            if (!TextUtils.isEmpty(this.f77449f.f77479e)) {
                hashMap.put("device_id", this.f77449f.f77479e);
            }
            if (!TextUtils.isEmpty(this.f77449f.h)) {
                hashMap.put("device_type", this.f77449f.h);
            }
            if (!TextUtils.isEmpty(this.f77449f.g)) {
                hashMap.put("device_platform", this.f77449f.g);
            }
            if (!TextUtils.isEmpty(this.f77449f.j)) {
                hashMap.put("region", this.f77449f.j);
            }
            if (!TextUtils.isEmpty(this.f77449f.f77477c)) {
                hashMap.put("sdk_version", this.f77449f.f77477c);
            }
            if (!TextUtils.isEmpty(this.f77449f.f77478d)) {
                hashMap.put("app_version", this.f77449f.f77478d);
            }
            if (!TextUtils.isEmpty(this.f77449f.f77480f)) {
                hashMap.put("channel", this.f77449f.f77480f);
            }
            if (!TextUtils.isEmpty(this.f77449f.k)) {
                hashMap.put("aid", this.f77449f.k);
            }
            if (!TextUtils.isEmpty(this.f77449f.l)) {
                hashMap.put("app_language", this.f77449f.l);
            }
            if (!TextUtils.isEmpty(this.f77449f.m)) {
                hashMap.put("language", this.f77449f.m);
            }
            if (!TextUtils.isEmpty(this.f77449f.n)) {
                hashMap.put("longitude", this.f77449f.n);
            }
            if (!TextUtils.isEmpty(this.f77449f.o)) {
                hashMap.put("latitude", this.f77449f.o);
            }
            if (!TextUtils.isEmpty(this.f77449f.p)) {
                hashMap.put("city_code", this.f77449f.p);
            }
            if (!TextUtils.isEmpty(this.i)) {
                hashMap.put("panel", this.i);
            }
            hashMap.put("effect_ids", list);
            hashMap.put("type", Integer.valueOf(z ? 1 : 0));
            com.ss.android.ugc.effectmanager.common.a aVar = new com.ss.android.ugc.effectmanager.common.a("POST", this.f77448e.f77205b.i + this.f77449f.f77475a + "/v3/effect/favorite");
            aVar.f77269e = hashMap;
            aVar.f77270f = "application/json";
            try {
                this.f77449f.w.a(aVar, this.g, BaseNetResponse.class);
                a(40, new f(true, this.h, null));
                return;
            } catch (Exception e2) {
                if (i2 == this.k - 1 || (e2 instanceof b)) {
                    a(40, new f(false, this.h, new com.ss.android.ugc.effectmanager.common.e.c(e2)));
                    return;
                }
                i2++;
            }
        }
    }

    public g(a aVar, String str, String str2, Handler handler, List<String> list, boolean z) {
        super(handler, str2, "NETWORK");
        this.f77448e = aVar;
        this.f77449f = this.f77448e.f77204a;
        this.g = this.f77448e.f77204a.v;
        this.h.clear();
        this.h.addAll(list);
        this.j = z;
        this.i = str;
        this.k = this.f77449f.s;
    }
}
