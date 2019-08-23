package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69666a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectStickerViewImpl f69667b;

    g(EffectStickerViewImpl effectStickerViewImpl) {
        this.f69667b = effectStickerViewImpl;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f69666a, false, 79137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69666a, false, 79137, new Class[0], Void.TYPE);
            return;
        }
        EffectStickerViewImpl effectStickerViewImpl = this.f69667b;
        effectStickerViewImpl.l.setRotation(0.0f);
        effectStickerViewImpl.l.setEnabled(true);
    }
}
