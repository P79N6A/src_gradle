package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.c.b;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.common.f.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c extends d {

    /* renamed from: e  reason: collision with root package name */
    private g f77434e;

    /* renamed from: f  reason: collision with root package name */
    private a f77435f;
    private int g;
    private List<String> h;
    private Map<String, String> i;

    public final void a() {
        while (true) {
            int i2 = this.g;
            this.g = i2 - 1;
            if (i2 != 0) {
                try {
                    List<String> list = this.h;
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(this.f77434e.f77476b)) {
                        hashMap.put("access_key", this.f77434e.f77476b);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.f77479e)) {
                        hashMap.put("device_id", this.f77434e.f77479e);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.h)) {
                        hashMap.put("device_type", this.f77434e.h);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.g)) {
                        hashMap.put("device_platform", this.f77434e.g);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.j)) {
                        hashMap.put("region", this.f77434e.j);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.f77477c)) {
                        hashMap.put("sdk_version", this.f77434e.f77477c);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.f77478d)) {
                        hashMap.put("app_version", this.f77434e.f77478d);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.f77480f)) {
                        hashMap.put("channel", this.f77434e.f77480f);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.k)) {
                        hashMap.put("aid", this.f77434e.k);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.l)) {
                        hashMap.put("app_language", this.f77434e.l);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.m)) {
                        hashMap.put("language", this.f77434e.m);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.n)) {
                        hashMap.put("longitude", this.f77434e.n);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.o)) {
                        hashMap.put("latitude", this.f77434e.o);
                    }
                    if (!TextUtils.isEmpty(this.f77434e.p)) {
                        hashMap.put("city_code", this.f77434e.p);
                    }
                    if (this.i != null) {
                        hashMap.putAll(this.i);
                    }
                    hashMap.put("effect_ids", f.a(list));
                    EffectListResponse effectListResponse = (EffectListResponse) this.f77434e.w.a(new com.ss.android.ugc.effectmanager.common.a("GET", f.a(hashMap, this.f77435f.f77205b.i + this.f77434e.f77475a + "/v3/effect/list")), this.f77434e.v, EffectListResponse.class);
                    if (!(effectListResponse == null || effectListResponse.data == null)) {
                        if (effectListResponse.data.size() > 0) {
                            a(effectListResponse.data);
                            a(17, new com.ss.android.ugc.effectmanager.effect.e.a.d(effectListResponse.data, null));
                            return;
                        } else if (this.g == 0) {
                            a(17, new com.ss.android.ugc.effectmanager.effect.e.a.d(new ArrayList(), new com.ss.android.ugc.effectmanager.common.e.c(10014)));
                        }
                    }
                } catch (Exception e2) {
                    if (this.g == 0 || (e2 instanceof b)) {
                        a(17, new com.ss.android.ugc.effectmanager.effect.e.a.d(new ArrayList(), new com.ss.android.ugc.effectmanager.common.e.c(e2)));
                    }
                }
            } else {
                return;
            }
        }
        a(17, new com.ss.android.ugc.effectmanager.effect.e.a.d(new ArrayList(), new com.ss.android.ugc.effectmanager.common.e.c(e2)));
    }

    private void a(List<Effect> list) {
        if (list != null && !list.isEmpty()) {
            for (Effect next : list) {
                next.zipPath = this.f77434e.i.getAbsolutePath() + File.separator + next.id + ".zip";
                StringBuilder sb = new StringBuilder();
                sb.append(this.f77434e.i.getAbsolutePath());
                sb.append(File.separator);
                sb.append(next.id);
                next.unzipPath = sb.toString();
            }
        }
    }

    public c(a aVar, List<String> list, Handler handler, String str, Map<String, String> map) {
        super(handler, str, "NETWORK");
        this.i = map;
        this.f77434e = aVar.f77204a;
        this.f77435f = aVar;
        this.h = list;
        this.g = aVar.f77204a.s;
    }
}
