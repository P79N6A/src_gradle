package com.ss.android.ugc.effectmanager.effect.e.a;

import com.ss.android.ugc.effectmanager.common.e.b;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

public final class h extends b {

    /* renamed from: b  reason: collision with root package name */
    public List<Effect> f77407b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public String f77408c;

    /* renamed from: d  reason: collision with root package name */
    public c f77409d;

    public h(c cVar) {
        this.f77409d = cVar;
    }

    public h(List<Effect> list, String str) {
        this.f77407b.clear();
        this.f77407b.addAll(list);
        this.f77408c = str;
    }
}
