package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67236a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerEditView.b f67237b;

    e(InfoStickerEditView.b bVar) {
        this.f67237b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67236a, false, 76789, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67236a, false, 76789, new Class[0], Void.TYPE);
            return;
        }
        InfoStickerEditView.b bVar = this.f67237b;
        if (InfoStickerEditView.this.l != null) {
            InfoStickerEditView.this.l.a();
        }
    }
}
