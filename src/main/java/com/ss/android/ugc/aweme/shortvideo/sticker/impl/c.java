package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.a;

public final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69654a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectStickerViewImpl f69655b;

    c(EffectStickerViewImpl effectStickerViewImpl) {
        this.f69655b = effectStickerViewImpl;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69654a, false, 79133, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f69654a, false, 79133, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f69655b.a();
    }
}
