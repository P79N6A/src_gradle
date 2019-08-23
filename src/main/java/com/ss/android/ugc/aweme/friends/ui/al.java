package com.ss.android.ugc.aweme.friends.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

public final /* synthetic */ class al implements a.C0572a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49425a;

    /* renamed from: b  reason: collision with root package name */
    private final ak f49426b;

    al(ak akVar) {
        this.f49426b = akVar;
    }

    public final void a(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f49425a, false, 47415, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f49425a, false, 47415, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        this.f49426b.a(followStatus2);
    }
}
