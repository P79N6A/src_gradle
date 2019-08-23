package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67240a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67241b;

    g(InfoStickerHelper infoStickerHelper) {
        this.f67241b = infoStickerHelper;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67240a, false, 76834, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67240a, false, 76834, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67241b;
        infoStickerHelper.i.f67219d.setValue(Boolean.TRUE);
        infoStickerHelper.b((c) (y) obj);
    }
}
