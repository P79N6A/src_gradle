package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;
import dmt.av.video.s;

public final /* synthetic */ class n implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67399a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67400b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f67401c;

    n(InfoStickerHelper infoStickerHelper, boolean z) {
        this.f67400b = infoStickerHelper;
        this.f67401c = z;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67399a, false, 76841, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67399a, false, 76841, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67400b;
        boolean z = this.f67401c;
        boolean z2 = !z;
        infoStickerHelper.mInfoStickerEditView.setVisibility(z2 ? 0 : 4);
        if (z2) {
            InfoStickerEditView infoStickerEditView = infoStickerHelper.mInfoStickerEditView;
            if (PatchProxy.isSupport(new Object[0], infoStickerEditView, InfoStickerEditView.f67184a, false, 76763, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], infoStickerEditView, InfoStickerEditView.f67184a, false, 76763, new Class[0], Void.TYPE);
            } else {
                infoStickerEditView.y = false;
                for (y yVar : infoStickerEditView.h.f67227b) {
                    yVar.f67433d = false;
                }
                infoStickerEditView.invalidate();
            }
        }
        if (z) {
            infoStickerHelper.g.a(true);
            return;
        }
        infoStickerHelper.i.a().setValue(s.b(0));
        infoStickerHelper.g.a(true);
        infoStickerHelper.i.a().setValue(s.a());
    }
}
