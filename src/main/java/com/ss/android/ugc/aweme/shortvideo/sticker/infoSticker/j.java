package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.b.a;

public final /* synthetic */ class j implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70082a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerFragment f70083b;

    j(InfoStickerFragment infoStickerFragment) {
        this.f70083b = infoStickerFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70082a, false, 79287, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70082a, false, 79287, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f70083b.c((a) obj);
    }
}
