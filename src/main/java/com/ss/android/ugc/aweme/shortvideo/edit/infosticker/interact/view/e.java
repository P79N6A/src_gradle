package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;

public final /* synthetic */ class e implements StickerHelpBoxView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67334a;

    /* renamed from: b  reason: collision with root package name */
    private final c f67335b;

    e(c cVar) {
        this.f67335b = cVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67334a, false, 77090, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67334a, false, 77090, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f67335b.a(z);
    }
}
