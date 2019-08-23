package com.ss.android.ugc.aweme.music.ui;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56707a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicDetailFragment f56708b;

    i(MusicDetailFragment musicDetailFragment) {
        this.f56708b = musicDetailFragment;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f56707a, false, 60247, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f56707a, false, 60247, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56707a, false, 60246, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56707a, false, 60246, new Class[0], Void.TYPE);
            return;
        }
        this.f56708b.b();
    }
}
