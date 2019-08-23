package com.ss.android.ugc.aweme.requesttask.a;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.utils.permission.d;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63606a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f63607b = new f();

    private f() {
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f63606a, false, 70837, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f63606a, false, 70837, new Class[0], Object.class);
        }
        d.a().report(Integer.valueOf(e.a()), Integer.valueOf(e.b()), 1, FeedImpressionReporter.a("feed").c()).a(g.f63609b, (Executor) i.f1051a);
        return null;
    }
}
