package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.effect.e.a.b;
import com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.io.InputStream;

public final class j extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77454e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.effectmanager.common.d.a f77455f;
    private c g;
    private String h;
    private boolean i = false;

    public final void a() {
        InputStream b2 = this.f77455f.b(com.ss.android.ugc.effectmanager.common.f.a.a(this.f77454e.f77204a.f77480f, this.h));
        if (b2 == null) {
            a(14, new b(new EffectChannelResponse(this.h), new com.ss.android.ugc.effectmanager.common.e.c(10004)));
            return;
        }
        EffectChannelModel effectChannelModel = (EffectChannelModel) this.g.a(b2, EffectChannelModel.class);
        if (effectChannelModel == null) {
            a(14, new b(new EffectChannelResponse(this.h), new com.ss.android.ugc.effectmanager.common.e.c(10004)));
        } else if (!effectChannelModel.checkValued()) {
            a(14, new b(new EffectChannelResponse(this.h), new com.ss.android.ugc.effectmanager.common.e.c(10004)));
        } else {
            a(14, new b(new BuildEffectChannelResponse(this.h, this.f77454e.f77204a.i.getAbsolutePath(), true).buildChannelResponse(effectChannelModel), null));
        }
    }

    public j(a aVar, String str, String str2, Handler handler, boolean z) {
        super(handler, str2, "NETWORK");
        this.h = str;
        this.f77454e = aVar;
        this.f77455f = this.f77454e.f77204a.r;
        this.g = this.f77454e.f77204a.v;
    }
}
