package com.ss.android.ugc.aweme.newfollow.vh;

import com.facebook.drawee.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements a.C0260a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57765a;

    /* renamed from: b  reason: collision with root package name */
    private final MomentFollowFeedViewHolder f57766b;

    z(MomentFollowFeedViewHolder momentFollowFeedViewHolder) {
        this.f57766b = momentFollowFeedViewHolder;
    }

    public final boolean onClick() {
        if (!PatchProxy.isSupport(new Object[0], this, f57765a, false, 62612, new Class[0], Boolean.TYPE)) {
            return this.f57766b.c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57765a, false, 62612, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
