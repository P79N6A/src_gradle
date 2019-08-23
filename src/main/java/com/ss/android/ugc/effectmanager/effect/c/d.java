package com.ss.android.ugc.effectmanager.effect.c;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.i;
import com.ss.android.ugc.effectmanager.effect.b.n;
import com.ss.android.ugc.effectmanager.effect.e.a.f;
import com.ss.android.ugc.effectmanager.effect.e.a.h;
import com.ss.android.ugc.effectmanager.g;
import com.ss.android.ugc.effectmanager.j;
import java.util.HashMap;

public final class d implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public g f77367a;

    /* renamed from: b  reason: collision with root package name */
    public a f77368b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f77369c;

    /* renamed from: d  reason: collision with root package name */
    private String f77370d = "FavoriteRepository";

    public d(a aVar) {
        this.f77368b = aVar;
        this.f77367a = this.f77368b.f77204a;
        this.f77369c = new i(this);
    }

    public final void a(Message message) {
        switch (message.what) {
            case 40:
                if (message.obj instanceof f) {
                    f fVar = (f) message.obj;
                    j jVar = this.f77367a.z;
                    String str = fVar.f77314a;
                    if (jVar.f77509c == null) {
                        jVar.f77509c = new HashMap();
                    }
                    n nVar = jVar.f77509c.get(str);
                    if (nVar != null) {
                        if (!fVar.f77402b) {
                            nVar.a(fVar.f77404d);
                            break;
                        } else {
                            nVar.a(fVar.f77403c);
                            return;
                        }
                    }
                }
                break;
            case 41:
                if (message.obj instanceof h) {
                    h hVar = (h) message.obj;
                    j jVar2 = this.f77367a.z;
                    String str2 = hVar.f77314a;
                    if (jVar2.f77510d == null) {
                        jVar2.f77510d = new HashMap();
                    }
                    com.ss.android.ugc.effectmanager.effect.b.j jVar3 = jVar2.f77510d.get(str2);
                    if (jVar3 != null) {
                        if (hVar.f77409d == null) {
                            jVar3.a(hVar.f77407b, hVar.f77408c);
                            break;
                        } else {
                            jVar3.a(hVar.f77409d);
                        }
                    }
                    return;
                }
                break;
        }
    }
}
