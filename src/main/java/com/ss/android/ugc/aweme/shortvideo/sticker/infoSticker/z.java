package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70127a;

    /* renamed from: b  reason: collision with root package name */
    private final w f70128b;

    z(w wVar) {
        this.f70128b = wVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70127a, false, 79472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70127a, false, 79472, new Class[0], Void.TYPE);
            return;
        }
        w wVar = this.f70128b;
        if (wVar.f70118d != null) {
            wVar.f70118d.requestFocus();
            KeyboardUtils.b(wVar.f70118d);
        }
    }
}
