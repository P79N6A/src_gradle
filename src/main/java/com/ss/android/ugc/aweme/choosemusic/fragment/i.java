package com.ss.android.ugc.aweme.choosemusic.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;

public final /* synthetic */ class i implements PreloadRecyclerViewConverter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35980a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicClassDetailFragment f35981b;

    i(MusicClassDetailFragment musicClassDetailFragment) {
        this.f35981b = musicClassDetailFragment;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35980a, false, 26613, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35980a, false, 26613, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f35981b.loadMore();
    }
}
