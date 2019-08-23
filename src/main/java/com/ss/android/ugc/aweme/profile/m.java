package com.ss.android.ugc.aweme.profile;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.activity.e;

public final /* synthetic */ class m implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61555a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfilePageFragment f61556b;

    m(ProfilePageFragment profilePageFragment) {
        this.f61556b = profilePageFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61555a, false, 67268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61555a, false, 67268, new Class[0], Void.TYPE);
            return;
        }
        this.f61556b.a();
    }
}
