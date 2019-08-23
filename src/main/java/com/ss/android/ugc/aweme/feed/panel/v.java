package com.ss.android.ugc.aweme.feed.panel;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

public final /* synthetic */ class v implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45748a;

    /* renamed from: b  reason: collision with root package name */
    private final u f45749b;

    public v(u uVar) {
        this.f45749b = uVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f45748a, false, 41931, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f45748a, false, 41931, new Class[0], Object.class);
        }
        return (FeedItemList) b.b().a((Context) this.f45749b.ar, "nearby_aweme", FeedItemList.class);
    }
}
