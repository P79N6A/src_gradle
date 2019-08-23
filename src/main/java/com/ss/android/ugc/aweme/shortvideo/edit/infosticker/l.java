package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67395a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67396b;

    l(InfoStickerHelper infoStickerHelper) {
        this.f67396b = infoStickerHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67395a, false, 76839, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67395a, false, 76839, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f67396b.b();
    }
}
