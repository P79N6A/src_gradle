package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final /* synthetic */ class m implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65724a;

    /* renamed from: b  reason: collision with root package name */
    private final l f65725b;

    m(l lVar) {
        this.f65725b = lVar;
    }

    public final void onChanged(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f65724a, false, 75162, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f65724a, false, 75162, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l lVar = this.f65725b;
        q qVar = (q) obj;
        lVar.f65722c = qVar;
        if (qVar != null) {
            if (PatchProxy.isSupport(new Object[]{qVar}, lVar, l.f65720a, false, 75159, new Class[]{q.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{qVar}, lVar, l.f65720a, false, 75159, new Class[]{q.class}, Void.TYPE);
                return;
            }
            r rVar = lVar.f65721b[qVar.f65737c];
            if (qVar.f65735a == 32) {
                if (PatchProxy.isSupport(new Object[0], lVar, l.f65720a, false, 75160, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], lVar, l.f65720a, false, 75160, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    Effect effect = PatchProxy.isSupport(new Object[0], lVar, l.f65720a, false, 75161, new Class[0], Effect.class) ? (Effect) PatchProxy.accessDispatch(new Object[0], lVar, l.f65720a, false, 75161, new Class[0], Effect.class) : (lVar.f65723d == null || lVar.f65723d.getActivity() == null) ? null : (Effect) ((CurUseStickerViewModel) ViewModelProviders.of(lVar.f65723d.getActivity()).get(CurUseStickerViewModel.class)).f70249b.getValue();
                    if (PatchProxy.isSupport(new Object[]{effect}, null, ae.f69286a, true, 78774, new Class[]{Effect.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, ae.f69286a, true, 78774, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
                    } else if (!ae.d(effect) && !ae.e(effect)) {
                        z = false;
                    }
                }
                if (z && rVar != null) {
                    rVar.f65743f = lVar.f65722c;
                    rVar.b(qVar.f65736b, qVar.f65738d);
                    rVar.c();
                    rVar.a(qVar.f65738d, qVar.f65736b);
                }
            } else if (qVar.f65735a == 33) {
                rVar.d();
            }
        }
    }
}
