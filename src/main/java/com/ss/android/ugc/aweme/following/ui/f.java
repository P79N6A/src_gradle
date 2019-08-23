package com.ss.android.ugc.aweme.following.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;

public final /* synthetic */ class f implements RemarkEditDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48157a;

    /* renamed from: b  reason: collision with root package name */
    private final SimpleUserFragment f48158b;

    /* renamed from: c  reason: collision with root package name */
    private final User f48159c;

    /* renamed from: d  reason: collision with root package name */
    private final FollowStatus f48160d;

    f(SimpleUserFragment simpleUserFragment, User user, FollowStatus followStatus) {
        this.f48158b = simpleUserFragment;
        this.f48159c = user;
        this.f48160d = followStatus;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48157a, false, 45057, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48157a, false, 45057, new Class[0], Void.TYPE);
            return;
        }
        this.f48158b.a(this.f48159c, this.f48160d);
    }
}
