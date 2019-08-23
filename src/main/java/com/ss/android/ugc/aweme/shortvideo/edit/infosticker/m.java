package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.s;

public final /* synthetic */ class m implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67397a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerHelper f67398b;

    m(InfoStickerHelper infoStickerHelper) {
        this.f67398b = infoStickerHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67397a, false, 76840, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67397a, false, 76840, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67398b;
        Long l = (Long) obj;
        if (infoStickerHelper.z) {
            infoStickerHelper.i.a().setValue(s.a(l.longValue()));
        }
    }
}
