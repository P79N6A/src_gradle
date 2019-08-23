package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.s;

public final /* synthetic */ class w implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67426a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67427b;

    w(InfoStickerHelper infoStickerHelper) {
        this.f67427b = infoStickerHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67426a, false, 76850, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67426a, false, 76850, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67427b;
        if (PatchProxy.isSupport(new Object[0], infoStickerHelper, InfoStickerHelper.f67201a, false, 76806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], infoStickerHelper, InfoStickerHelper.f67201a, false, 76806, new Class[0], Void.TYPE);
            return;
        }
        if (infoStickerHelper.z) {
            infoStickerHelper.e();
            infoStickerHelper.a(0, infoStickerHelper.g.t());
            infoStickerHelper.i.a().setValue(s.a((long) ((Long) infoStickerHelper.mVideoEditView.getPlayBoundary().second).intValue()));
        }
    }
}
