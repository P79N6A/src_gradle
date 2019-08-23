package com.ss.android.ugc.aweme.choosemusic.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment;

public final /* synthetic */ class b implements NewMusicListFragment.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35966a;

    /* renamed from: b  reason: collision with root package name */
    private final ChooseMusicFragment f35967b;

    b(ChooseMusicFragment chooseMusicFragment) {
        this.f35967b = chooseMusicFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35966a, false, 26547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35966a, false, 26547, new Class[0], Void.TYPE);
            return;
        }
        ChooseMusicFragment chooseMusicFragment = this.f35967b;
        chooseMusicFragment.a(chooseMusicFragment.f2834d.c());
    }
}
