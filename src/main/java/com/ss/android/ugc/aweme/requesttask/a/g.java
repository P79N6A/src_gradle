package com.ss.android.ugc.aweme.requesttask.a;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63608a;

    /* renamed from: b  reason: collision with root package name */
    static final a.g f63609b = new g();

    private g() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f63608a, false, 70838, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f63608a, false, 70838, new Class[]{i.class}, Object.class);
        }
        FeedImpressionReporter.a("feed").d();
        return null;
    }
}
