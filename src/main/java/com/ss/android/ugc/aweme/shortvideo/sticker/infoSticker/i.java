package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69828a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerFragment f69829b;

    i(InfoStickerFragment infoStickerFragment) {
        this.f69829b = infoStickerFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f69828a, false, 79286, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69828a, false, 79286, new Class[0], Void.TYPE);
            return;
        }
        this.f69829b.g();
    }
}
