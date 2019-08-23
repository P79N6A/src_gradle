package com.ss.android.ugc.aweme.newfollow.vh;

import com.facebook.drawee.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements a.C0260a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57755a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowImageViewHolder f57756b;

    s(FollowImageViewHolder followImageViewHolder) {
        this.f57756b = followImageViewHolder;
    }

    public final boolean onClick() {
        if (!PatchProxy.isSupport(new Object[0], this, f57755a, false, 62319, new Class[0], Boolean.TYPE)) {
            return this.f57756b.ad();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57755a, false, 62319, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
