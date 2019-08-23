package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c;

public final /* synthetic */ class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67412a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67413b;

    q(InfoStickerHelper infoStickerHelper) {
        this.f67413b = infoStickerHelper;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67412a, false, 76844, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67412a, false, 76844, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67413b;
        y yVar = (y) obj;
        if (infoStickerHelper.a()) {
            infoStickerHelper.a((c) yVar);
        }
    }
}
