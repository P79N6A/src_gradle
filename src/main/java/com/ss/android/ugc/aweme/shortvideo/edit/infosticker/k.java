package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67393a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67394b;

    k(InfoStickerHelper infoStickerHelper) {
        this.f67394b = infoStickerHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67393a, false, 76838, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67393a, false, 76838, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f67394b.c();
    }
}
