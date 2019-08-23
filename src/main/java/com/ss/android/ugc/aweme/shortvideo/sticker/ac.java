package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69285a;

    public static void a(Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f69285a, true, 78767, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, null, f69285a, true, 78767, new Class[]{Effect.class}, Void.TYPE);
        } else if (effect2 != null && effect2.effect_type == 2) {
            h.a().a(effect2.schema);
        }
    }
}
