package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.mediachoose.a.d;

public final /* synthetic */ class e implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68595a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChooseAlbumFragment f68596b;

    e(MvChooseAlbumFragment mvChooseAlbumFragment) {
        this.f68596b = mvChooseAlbumFragment;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68595a, false, 77942, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68595a, false, 77942, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f68596b.a(i);
    }
}
