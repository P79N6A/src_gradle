package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import java.util.Map;

public final /* synthetic */ class dc implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62627a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileMoreFragment f62628b;

    dc(ProfileMoreFragment profileMoreFragment) {
        this.f62628b = profileMoreFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FollowViewModel followViewModel;
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62627a, false, 68870, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62627a, false, 68870, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ProfileMoreFragment profileMoreFragment = this.f62628b;
        r.a("remove_fans", (Map) d.a().a("enter_from", "others_homepage").f34114b);
        if (PatchProxy.isSupport(new Object[0], profileMoreFragment, ProfileMoreFragment.f3803a, false, 68868, new Class[0], FollowViewModel.class)) {
            followViewModel = (FollowViewModel) PatchProxy.accessDispatch(new Object[0], profileMoreFragment, ProfileMoreFragment.f3803a, false, 68868, new Class[0], FollowViewModel.class);
        } else {
            if (profileMoreFragment.f3806d == null) {
                profileMoreFragment.f3806d = new FollowViewModel(profileMoreFragment);
            }
            followViewModel = profileMoreFragment.f3806d;
        }
        followViewModel.a(profileMoreFragment.f3804b.getUid(), new de(profileMoreFragment), new df(profileMoreFragment));
    }
}
