package com.ss.android.ugc.aweme.main;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a;
import com.ss.android.ugc.aweme.main.c.g;
import com.ss.android.ugc.aweme.utils.bg;

public final class bk implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54593a;

    /* renamed from: b  reason: collision with root package name */
    private SwipeRefreshLayout f54594b;

    public bk(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.f54594b = swipeRefreshLayout;
    }

    public final void setRefreshing(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54593a, false, 57583, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54593a, false, 57583, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f54594b.setRefreshing(z);
        if (!z) {
            bg.a(new g() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54595a;

                public final /* synthetic */ void accept(Object obj) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj;
                    if (PatchProxy.isSupport(new Object[]{swipeRefreshLayout}, this, f54595a, false, 57584, new Class[]{SwipeRefreshLayout.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{swipeRefreshLayout}, this, f54595a, false, 57584, new Class[]{SwipeRefreshLayout.class}, Void.TYPE);
                        return;
                    }
                    swipeRefreshLayout.setRefreshing(z);
                }
            });
        }
    }
}
