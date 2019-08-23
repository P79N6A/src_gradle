package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.shortvideo.c;

public final /* synthetic */ class z implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70432a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule f70433b;

    z(StickerModule stickerModule) {
        this.f70433b = stickerModule;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70432a, false, 78751, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70432a, false, 78751, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f70433b.x = (c) obj;
    }
}
