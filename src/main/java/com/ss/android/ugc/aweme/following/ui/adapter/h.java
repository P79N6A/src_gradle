package com.ss.android.ugc.aweme.following.ui.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;

public final /* synthetic */ class h implements RemarkEditDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48146a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowingAdapter.ViewHolder f48147b;

    /* renamed from: c  reason: collision with root package name */
    private final User f48148c;

    /* renamed from: d  reason: collision with root package name */
    private final FollowStatus f48149d;

    h(FollowingAdapter.ViewHolder viewHolder, User user, FollowStatus followStatus) {
        this.f48147b = viewHolder;
        this.f48148c = user;
        this.f48149d = followStatus;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48146a, false, 45122, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48146a, false, 45122, new Class[0], Void.TYPE);
            return;
        }
        this.f48147b.a(this.f48148c, this.f48149d.followStatus);
    }
}
