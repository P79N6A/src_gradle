package com.ss.android.ugc.aweme.photo.setfilter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58782a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectPhotoSetFilterActivity f58783b;

    a(EffectPhotoSetFilterActivity effectPhotoSetFilterActivity) {
        this.f58783b = effectPhotoSetFilterActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f58782a, false, 63814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58782a, false, 63814, new Class[0], Void.TYPE);
            return;
        }
        EffectPhotoSetFilterActivity effectPhotoSetFilterActivity = this.f58783b;
        effectPhotoSetFilterActivity.f58731b.setFilterIndex(effectPhotoSetFilterActivity.f58732c);
    }
}
