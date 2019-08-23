package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.a.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.g;
import java.util.ArrayList;
import java.util.List;

public final class e extends d {

    /* renamed from: e  reason: collision with root package name */
    public Effect f77440e;

    /* renamed from: f  reason: collision with root package name */
    private int f77441f;
    private a g;
    private List<String> h;
    private g i;

    public final void a() {
        com.ss.android.ugc.effectmanager.effect.d.a<com.ss.android.ugc.effectmanager.effect.e.a.e> a2 = this.g.f77204a.A.a(new b(this.f77440e, this.h, this.i.i.getPath()));
        final com.ss.android.ugc.effectmanager.effect.e.a.e a3 = new com.ss.android.ugc.effectmanager.effect.e.a.e(this.f77440e, null).a(0).a(0);
        a2.f77386d = new com.ss.android.ugc.effectmanager.effect.d.b<com.ss.android.ugc.effectmanager.effect.e.a.e>() {
            public final void a() {
                e.this.a(42, new com.ss.android.ugc.effectmanager.effect.e.a.e(e.this.f77440e, null));
            }

            public final void a(c cVar) {
                e.this.a(15, new com.ss.android.ugc.effectmanager.effect.e.a.e(e.this.f77440e, cVar));
            }

            public final /* synthetic */ void a(com.ss.android.ugc.effectmanager.effect.d.a aVar, Object obj) {
                e.this.a(15, new com.ss.android.ugc.effectmanager.effect.e.a.e(((com.ss.android.ugc.effectmanager.effect.e.a.e) obj).f77398b, null));
            }

            public final void a(com.ss.android.ugc.effectmanager.effect.d.a<com.ss.android.ugc.effectmanager.effect.e.a.e> aVar, int i, long j) {
                e.this.a(53, a3.a(i).a(j));
            }
        };
        a2.a();
    }

    public e(Effect effect, a aVar, String str, Handler handler) {
        super(handler, str, "NETWORK");
        List<String> list;
        this.f77440e = effect;
        this.g = aVar;
        this.i = aVar.f77204a;
        this.f77441f = aVar.f77204a.s;
        UrlModel urlModel = this.f77440e.file_url;
        if (urlModel == null || com.ss.android.ugc.effectmanager.common.f.b.a(urlModel)) {
            list = new ArrayList<>();
        } else {
            list = urlModel.url_list;
        }
        this.h = list;
    }
}
