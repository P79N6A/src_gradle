package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.ss.android.ugc.effectmanager.g;
import java.io.InputStream;

public final class h extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77450e;

    /* renamed from: f  reason: collision with root package name */
    private g f77451f = this.f77450e.f77204a;
    private com.ss.android.ugc.effectmanager.common.d.a g = this.f77451f.r;
    private c h = this.f77451f.v;
    private String i;
    private String j;
    private int k;
    private int l;
    private int m;
    private String n;

    public final void a() {
        InputStream b2 = this.g.b(com.ss.android.ugc.effectmanager.common.f.a.a(this.i, this.j, this.k, this.l, this.m));
        if (b2 == null) {
            a(21, new com.ss.android.ugc.effectmanager.effect.e.a.g(null, new com.ss.android.ugc.effectmanager.common.e.c(10004)));
            return;
        }
        CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) this.h.a(b2, CategoryEffectListResponse.class);
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            a(21, new com.ss.android.ugc.effectmanager.effect.e.a.g(null, new com.ss.android.ugc.effectmanager.common.e.c(10004)));
        } else {
            a(21, new com.ss.android.ugc.effectmanager.effect.e.a.g(categoryEffectListResponse.data, null));
        }
    }

    public h(a aVar, String str, String str2, String str3, int i2, int i3, int i4, String str4, Handler handler) {
        super(handler, str2, "NETWORK");
        this.i = str;
        this.j = str3;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = str4;
        this.f77450e = aVar;
    }
}
