package com.ss.android.ugc.aweme.music.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import java.util.concurrent.Callable;

public final /* synthetic */ class y implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56782a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicTabListFragment f56783b;

    y(MusicTabListFragment musicTabListFragment) {
        this.f56783b = musicTabListFragment;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f56782a, false, 60494, new Class[0], Object.class)) {
            return MusicApi.a(this.f56783b.s.getMid(), 0).music;
        }
        return PatchProxy.accessDispatch(new Object[0], this, f56782a, false, 60494, new Class[0], Object.class);
    }
}
