package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.common.d.a;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.effect.e.a.k;
import java.io.InputStream;
import java.util.HashMap;

public final class p extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77466e;

    /* renamed from: f  reason: collision with root package name */
    private c f77467f;
    private String g;
    private String h;

    public final void a() {
        InputStream b2 = this.f77466e.b("updatetime");
        if (b2 == null) {
            a(52, new k(this.g, this.h, null, new com.ss.android.ugc.effectmanager.common.e.c(10009)));
            return;
        }
        try {
            HashMap hashMap = (HashMap) this.f77467f.a(b2, HashMap.class);
            if (hashMap != null) {
                a(52, new k(this.g, this.h, hashMap, null));
            } else {
                a(52, new k(this.g, this.h, null, new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("local file destroy"))));
            }
        } catch (Exception e2) {
            a(52, new k(this.g, this.h, null, new com.ss.android.ugc.effectmanager.common.e.c(e2)));
        }
    }

    public p(Handler handler, com.ss.android.ugc.effectmanager.a.a aVar, String str, String str2, String str3) {
        super(handler, str);
        this.f77466e = aVar.f77204a.r;
        this.f77467f = aVar.f77204a.v;
        this.g = str2;
        this.h = str3;
    }
}
