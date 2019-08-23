package com.ss.android.ugc.aweme.newfollow.vh;

import com.facebook.drawee.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class t implements a.C0260a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57757a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowVideoViewHolder f57758b;

    t(FollowVideoViewHolder followVideoViewHolder) {
        this.f57758b = followVideoViewHolder;
    }

    public final boolean onClick() {
        if (!PatchProxy.isSupport(new Object[0], this, f57757a, false, 62383, new Class[0], Boolean.TYPE)) {
            return this.f57758b.af();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57757a, false, 62383, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
