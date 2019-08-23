package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.effect.e.a.i;
import com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse;
import com.ss.android.ugc.effectmanager.g;
import java.io.InputStream;

public final class m extends d {

    /* renamed from: e  reason: collision with root package name */
    private a f77460e;

    /* renamed from: f  reason: collision with root package name */
    private g f77461f = this.f77460e.f77204a;
    private com.ss.android.ugc.effectmanager.common.d.a g = this.f77461f.r;
    private c h = this.f77461f.v;
    private String i;

    public final void a() {
        InputStream b2 = this.g.b(com.ss.android.ugc.effectmanager.common.f.a.b(this.f77461f.f77480f, this.i));
        if (b2 == null) {
            a(22, new i(null, new com.ss.android.ugc.effectmanager.common.e.c(10004)));
            return;
        }
        PanelInfoResponse panelInfoResponse = (PanelInfoResponse) this.h.a(b2, PanelInfoResponse.class);
        if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
            a(22, new i(null, new com.ss.android.ugc.effectmanager.common.e.c(10004)));
        } else {
            a(22, new i(panelInfoResponse.data, null));
        }
    }

    public m(a aVar, String str, String str2, Handler handler) {
        super(handler, str2, "NETWORK");
        this.i = str;
        this.f77460e = aVar;
    }
}
