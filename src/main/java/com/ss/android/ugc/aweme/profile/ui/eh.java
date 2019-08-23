package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.RoomResponse;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class eh implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62734a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileFragment f62735b;

    eh(UserProfileFragment userProfileFragment) {
        this.f62735b = userProfileFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62734a, false, 69249, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62734a, false, 69249, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62735b.a((RoomResponse) obj);
    }
}
