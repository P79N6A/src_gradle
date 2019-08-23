package com.ss.android.ugc.aweme.choosemusic.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;

public final /* synthetic */ class e implements PreloadRecyclerViewConverter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35972a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverMusicFragment f35973b;

    e(DiscoverMusicFragment discoverMusicFragment) {
        this.f35973b = discoverMusicFragment;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35972a, false, 26586, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35972a, false, 26586, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f35973b.loadMore();
    }
}
