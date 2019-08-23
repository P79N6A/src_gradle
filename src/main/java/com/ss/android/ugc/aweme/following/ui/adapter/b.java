package com.ss.android.ugc.aweme.following.ui.adapter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter;
import com.ss.android.ugc.aweme.profile.d.i;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;

public final /* synthetic */ class b implements a.C0572a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48125a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowingAdapter.ViewHolder f48126b;

    /* renamed from: c  reason: collision with root package name */
    private final User f48127c;

    b(FollowingAdapter.ViewHolder viewHolder, User user) {
        this.f48126b = viewHolder;
        this.f48127c = user;
    }

    public final void a(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f48125a, false, 45116, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f48125a, false, 45116, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        FollowingAdapter.ViewHolder viewHolder = this.f48126b;
        User user = this.f48127c;
        if (followStatus != null) {
            if (FollowingAdapter.this.m != null) {
                FollowingAdapter.this.m.put(user.getUid(), Boolean.TRUE);
            }
            viewHolder.b(user, followStatus.followStatus);
            viewHolder.a(user, followStatus.followStatus);
            if (viewHolder.itemView != null && i.a(viewHolder.itemView.getContext(), user, followStatus)) {
                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(viewHolder.itemView.getContext());
                remarkEditDialog.g = user;
                remarkEditDialog.h = followStatus.contactName;
                remarkEditDialog.i = 1;
                remarkEditDialog.f63095f = new h(viewHolder, user, followStatus);
                remarkEditDialog.show();
            }
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(user.getRemarkName())) {
                user.setRemarkName("");
                viewHolder.a(user, followStatus.followStatus);
            }
        }
    }
}
