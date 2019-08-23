package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69521a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectStickerManager f69522b;

    f(EffectStickerManager effectStickerManager) {
        this.f69522b = effectStickerManager;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f69521a, false, 78612, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f69521a, false, 78612, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        EffectStickerManager effectStickerManager = this.f69522b;
        Pair pair = (Pair) obj;
        if (pair != null) {
            if (pair.second == null) {
                effectStickerManager.c();
                return;
            }
            effectStickerManager.c((Effect) pair.second);
        }
    }
}
