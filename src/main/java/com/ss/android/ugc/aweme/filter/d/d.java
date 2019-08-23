package com.ss.android.ugc.aweme.filter.d;

import a.g;
import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.c.a;
import com.ss.android.ugc.aweme.filter.aa;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47582a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.effectmanager.effect.b.g f47583b;

    /* renamed from: c  reason: collision with root package name */
    private final EffectChannelResponse f47584c;

    d(com.ss.android.ugc.effectmanager.effect.b.g gVar, EffectChannelResponse effectChannelResponse) {
        this.f47583b = gVar;
        this.f47584c = effectChannelResponse;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f47582a, false, 44467, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f47582a, false, 44467, new Class[]{i.class}, Object.class);
        }
        com.ss.android.ugc.effectmanager.effect.b.g gVar = this.f47583b;
        EffectChannelResponse effectChannelResponse = this.f47584c;
        if (iVar.b()) {
            aa a2 = aa.a();
            List list = (List) iVar.e();
            if (PatchProxy.isSupport(new Object[]{list}, a2, aa.f47466a, false, 44295, new Class[]{List.class}, Void.TYPE)) {
                aa aaVar = a2;
                PatchProxy.accessDispatch(new Object[]{list}, aaVar, aa.f47466a, false, 44295, new Class[]{List.class}, Void.TYPE);
            } else if (!CollectionUtils.isEmpty(list)) {
                a<h, Void> c2 = a2.c();
                if (PatchProxy.isSupport(new Object[]{list}, c2, a.f43716a, false, 38857, new Class[]{List.class}, Void.TYPE)) {
                    a<h, Void> aVar = c2;
                    PatchProxy.accessDispatch(new Object[]{list}, aVar, a.f43716a, false, 38857, new Class[]{List.class}, Void.TYPE);
                } else if (list != null) {
                    for (Object next : list) {
                        if (next != null) {
                            c2.i.add(next);
                        }
                    }
                }
            }
            aa.a().b();
            if (gVar != null) {
                gVar.a(effectChannelResponse);
            }
        }
        return null;
    }
}
