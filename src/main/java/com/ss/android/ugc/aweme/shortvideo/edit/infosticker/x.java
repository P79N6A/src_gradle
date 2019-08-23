package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.s;

public final /* synthetic */ class x implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67428a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67429b;

    x(InfoStickerHelper infoStickerHelper) {
        this.f67429b = infoStickerHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67428a, false, 76851, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67428a, false, 76851, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67429b;
        if (PatchProxy.isSupport(new Object[0], infoStickerHelper, InfoStickerHelper.f67201a, false, 76807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], infoStickerHelper, InfoStickerHelper.f67201a, false, 76807, new Class[0], Void.TYPE);
            return;
        }
        if (infoStickerHelper.z) {
            Pair<Long, Long> playBoundary = infoStickerHelper.mVideoEditView.getPlayBoundary();
            infoStickerHelper.i.a().setValue(s.a((long) ((Long) playBoundary.second).intValue()));
            infoStickerHelper.a(((Long) playBoundary.first).intValue(), Math.min(((Long) playBoundary.second).intValue() + 30, infoStickerHelper.g.t()));
        }
    }
}
