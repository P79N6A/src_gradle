package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67391a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67392b;

    j(InfoStickerHelper infoStickerHelper) {
        this.f67392b = infoStickerHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67391a, false, 76837, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67391a, false, 76837, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f67392b.b();
    }
}
