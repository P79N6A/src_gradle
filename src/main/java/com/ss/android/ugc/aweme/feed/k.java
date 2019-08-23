package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class k implements aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45561a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45562b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45563c;

    k(d dVar, Aweme aweme) {
        this.f45562b = dVar;
        this.f45563c = aweme;
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f45561a, false, 40027, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f45561a, false, 40027, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f45562b.a(this.f45563c, (ar) obj);
    }
}
