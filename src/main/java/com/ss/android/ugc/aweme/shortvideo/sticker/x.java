package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70426a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule f70427b;

    /* renamed from: c  reason: collision with root package name */
    private final FaceStickerBean f70428c;

    x(StickerModule stickerModule, FaceStickerBean faceStickerBean) {
        this.f70427b = stickerModule;
        this.f70428c = faceStickerBean;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70426a, false, 78749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70426a, false, 78749, new Class[0], Void.TYPE);
            return;
        }
        this.f70427b.b(this.f70428c);
    }
}
