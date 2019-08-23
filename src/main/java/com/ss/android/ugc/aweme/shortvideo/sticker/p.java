package com.ss.android.ugc.aweme.shortvideo.sticker;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.e;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final /* synthetic */ class p implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70179a;

    /* renamed from: b  reason: collision with root package name */
    private final n f70180b;

    /* renamed from: c  reason: collision with root package name */
    private final Effect f70181c;

    /* renamed from: d  reason: collision with root package name */
    private final l f70182d;

    p(n nVar, Effect effect, l lVar) {
        this.f70180b = nVar;
        this.f70181c = effect;
        this.f70182d = lVar;
    }

    public final Object then(i iVar) {
        e eVar;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f70179a, false, 78666, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f70179a, false, 78666, new Class[]{i.class}, Object.class);
        }
        n nVar = this.f70180b;
        Effect effect = this.f70181c;
        l lVar = this.f70182d;
        if (iVar.c() || iVar.d()) {
            eVar = nVar.g.get(effect.designer_id);
        } else {
            eVar = (e) iVar.e();
        }
        if (lVar != null && !lVar.a()) {
            return null;
        }
        if (effect.equals(nVar.h)) {
            if (eVar == null) {
                nVar.f70170b.setVisibility(8);
                return null;
            }
            nVar.f70170b.setVisibility(0);
            c.b(nVar.f70171c, eVar.e());
            nVar.f70172d.setText(eVar.g());
        }
        nVar.g.put(effect.designer_id, eVar);
        return null;
    }
}
