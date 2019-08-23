package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67424a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67425b;

    v(InfoStickerHelper infoStickerHelper) {
        this.f67425b = infoStickerHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67424a, false, 76849, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67424a, false, 76849, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67425b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            infoStickerHelper.e();
        }
    }
}
