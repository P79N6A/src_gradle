package com.bytedance.android.livesdk.live;

import com.bytedance.android.livesdkapi.g.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15801a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveDetailPagerAdapter f15802b;

    c(LiveDetailPagerAdapter liveDetailPagerAdapter) {
        this.f15802b = liveDetailPagerAdapter;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15801a, false, 10255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15801a, false, 10255, new Class[0], Void.TYPE);
            return;
        }
        this.f15802b.notifyDataSetChanged();
    }
}
