package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.depend.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15721a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f15722b;

    k(LiveBroadcastFragment liveBroadcastFragment) {
        this.f15722b = liveBroadcastFragment;
    }

    public final boolean i_() {
        if (PatchProxy.isSupport(new Object[0], this, f15721a, false, 2597, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15721a, false, 2597, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.f15722b.getActivity().finish();
        return true;
    }
}
