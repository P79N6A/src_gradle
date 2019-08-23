package com.ss.android.ugc.aweme.newfollow.vh;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;

public final /* synthetic */ class g implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57716a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFollowViewHolder f57717b;

    g(BaseFollowViewHolder baseFollowViewHolder) {
        this.f57717b = baseFollowViewHolder;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57716a, false, 62071, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57716a, false, 62071, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f57717b.d(z);
    }
}
