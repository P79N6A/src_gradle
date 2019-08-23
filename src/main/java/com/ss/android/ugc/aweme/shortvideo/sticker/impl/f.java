package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69664a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectStickerViewImpl f69665b;

    f(EffectStickerViewImpl effectStickerViewImpl) {
        this.f69665b = effectStickerViewImpl;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f69664a, false, 79136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69664a, false, 79136, new Class[0], Void.TYPE);
            return;
        }
        this.f69665b.l.setEnabled(false);
    }
}
