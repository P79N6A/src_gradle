package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70429a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule f70430b;

    /* renamed from: c  reason: collision with root package name */
    private final FaceStickerBean f70431c;

    y(StickerModule stickerModule, FaceStickerBean faceStickerBean) {
        this.f70430b = stickerModule;
        this.f70431c = faceStickerBean;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70429a, false, 78750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70429a, false, 78750, new Class[0], Void.TYPE);
            return;
        }
        this.f70430b.b(this.f70431c);
    }
}
