package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67402a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67403b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67404c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67405d;

    /* renamed from: e  reason: collision with root package name */
    private final c f67406e;

    o(InfoStickerHelper infoStickerHelper, int i, int i2, c cVar) {
        this.f67403b = infoStickerHelper;
        this.f67404c = i;
        this.f67405d = i2;
        this.f67406e = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67402a, false, 76842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67402a, false, 76842, new Class[0], Void.TYPE);
            return;
        }
        this.f67403b.a(this.f67404c, this.f67405d, 0, this.f67406e);
    }
}
