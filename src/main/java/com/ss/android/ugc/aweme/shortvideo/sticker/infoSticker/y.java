package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerFragment;

public final /* synthetic */ class y implements SearchInfoStickerFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70125a;

    /* renamed from: b  reason: collision with root package name */
    private final w f70126b;

    y(w wVar) {
        this.f70126b = wVar;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70125a, false, 79471, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70125a, false, 79471, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        KeyboardUtils.c(this.f70126b.f70118d);
    }
}
