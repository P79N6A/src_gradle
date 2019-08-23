package com.ss.android.ugc.aweme.following.ui.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingSearchAdapter;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

public final /* synthetic */ class i implements a.C0572a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48150a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowingSearchAdapter.ViewHolder f48151b;

    /* renamed from: c  reason: collision with root package name */
    private final IMUser f48152c;

    i(FollowingSearchAdapter.ViewHolder viewHolder, IMUser iMUser) {
        this.f48151b = viewHolder;
        this.f48152c = iMUser;
    }

    public final void a(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f48150a, false, 45135, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f48150a, false, 45135, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        FollowingSearchAdapter.ViewHolder viewHolder = this.f48151b;
        IMUser iMUser = this.f48152c;
        if (followStatus != null) {
            FollowingSearchAdapter.this.a(viewHolder.txtUserName, iMUser, FollowingSearchAdapter.this.f48112c);
            FollowingSearchAdapter.this.b(viewHolder.txtDesc, iMUser, FollowingSearchAdapter.this.f48112c);
        }
    }
}
