package com.ss.android.ugc.aweme.following.ui.adapter;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import java.util.Map;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48138a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowingAdapter.ViewHolder f48139b;

    /* renamed from: c  reason: collision with root package name */
    private final User f48140c;

    e(FollowingAdapter.ViewHolder viewHolder, User user) {
        this.f48139b = viewHolder;
        this.f48140c = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FollowViewModel followViewModel;
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48138a, false, 45119, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48138a, false, 45119, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        FollowingAdapter.ViewHolder viewHolder = this.f48139b;
        User user = this.f48140c;
        r.a("remove_fans", (Map) d.a().a("enter_from", "fans").f34114b);
        if (PatchProxy.isSupport(new Object[0], viewHolder, FollowingAdapter.ViewHolder.f48098a, false, 45113, new Class[0], FollowViewModel.class)) {
            followViewModel = (FollowViewModel) PatchProxy.accessDispatch(new Object[0], viewHolder, FollowingAdapter.ViewHolder.f48098a, false, 45113, new Class[0], FollowViewModel.class);
        } else {
            if (viewHolder.f48100c == null) {
                viewHolder.f48100c = new FollowViewModel(FollowingAdapter.this.n);
            }
            followViewModel = viewHolder.f48100c;
        }
        followViewModel.a(user.getUid(), new f(viewHolder, user), new g(viewHolder));
    }
}
