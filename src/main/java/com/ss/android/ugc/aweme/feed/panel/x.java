package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

public final /* synthetic */ class x implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45752a;

    /* renamed from: b  reason: collision with root package name */
    private final u f45753b;

    /* renamed from: c  reason: collision with root package name */
    private final FeedItemList f45754c;

    x(u uVar, FeedItemList feedItemList) {
        this.f45753b = uVar;
        this.f45754c = feedItemList;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f45752a, false, 41933, new Class[0], Object.class)) {
            return this.f45753b.a(this.f45754c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f45752a, false, 41933, new Class[0], Object.class);
    }
}
