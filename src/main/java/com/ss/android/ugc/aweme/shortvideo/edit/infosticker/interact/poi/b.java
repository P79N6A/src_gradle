package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67284a;

    /* renamed from: b  reason: collision with root package name */
    private final a f67285b;

    /* renamed from: c  reason: collision with root package name */
    private final InteractStickerStruct f67286c;

    b(a aVar, InteractStickerStruct interactStickerStruct) {
        this.f67285b = aVar;
        this.f67286c = interactStickerStruct;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67284a, false, 76995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67284a, false, 76995, new Class[0], Void.TYPE);
            return;
        }
        this.f67285b.b(this.f67286c);
    }
}
