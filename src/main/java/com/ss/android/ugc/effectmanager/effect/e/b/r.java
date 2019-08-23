package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.common.d.a;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.effect.e.a.l;
import java.util.HashMap;

public final class r extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77470e;

    /* renamed from: f  reason: collision with root package name */
    private c f77471f;
    private HashMap<String, String> g = new HashMap<>();
    private String h;

    public final void a() {
        this.f77470e.a("updatetime", this.f77471f.a(this.g));
        a(51, new l(this.h, null));
    }

    public r(Handler handler, com.ss.android.ugc.effectmanager.a.a aVar, String str, HashMap<String, String> hashMap) {
        super(handler, str);
        this.f77470e = aVar.f77204a.r;
        this.f77471f = aVar.f77204a.v;
        this.g.putAll(hashMap);
        this.h = str;
    }
}
