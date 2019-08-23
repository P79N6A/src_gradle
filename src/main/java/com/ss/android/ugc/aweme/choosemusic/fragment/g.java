package com.ss.android.ugc.aweme.choosemusic.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ac.b;

public final /* synthetic */ class g implements b.C0400b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35976a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalMusicFragment f35977b;

    g(LocalMusicFragment localMusicFragment) {
        this.f35977b = localMusicFragment;
    }

    public final void a(String[] strArr, int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f35976a, false, 26602, new Class[]{String[].class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f35976a, false, 26602, new Class[]{String[].class, int[].class}, Void.TYPE);
            return;
        }
        LocalMusicFragment localMusicFragment = this.f35977b;
        if (iArr[0] == 0) {
            localMusicFragment.f();
        }
    }
}
