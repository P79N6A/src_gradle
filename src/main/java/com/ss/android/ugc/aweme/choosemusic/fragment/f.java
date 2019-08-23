package com.ss.android.ugc.aweme.choosemusic.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;

public final /* synthetic */ class f implements PreloadRecyclerViewConverter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35974a;

    /* renamed from: b  reason: collision with root package name */
    private final HotMusicListFragment f35975b;

    f(HotMusicListFragment hotMusicListFragment) {
        this.f35975b = hotMusicListFragment;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35974a, false, 26594, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35974a, false, 26594, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f35975b.loadMore();
    }
}
