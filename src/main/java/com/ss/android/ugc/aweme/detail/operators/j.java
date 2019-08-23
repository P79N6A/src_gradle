package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.detail.e.d;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;

public final class j extends a<b, d> implements s.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41235a;

    public final int a(int i) {
        return 1;
    }

    public final void a(x xVar) {
        ((d) this.f41201d).f41186b = xVar;
    }

    public final void a(boolean z) {
        ((d) this.f41201d).g = true;
    }

    public j(@Nullable a aVar) {
        b bVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
        } else {
            bVar = new b();
        }
        this.f41200c = bVar;
        this.f41201d = new d();
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41235a, false, 34775, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41235a, false, 34775, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (i3 == 1) {
            ((d) this.f41201d).a(1, com.ss.android.ugc.aweme.follow.presenter.d.a(1, 0, 0, FeedImpressionReporter.a("feed").c()).a());
        } else if (i3 == 4) {
            ((d) this.f41201d).a(4, com.ss.android.ugc.aweme.follow.presenter.d.a(4, 2, 0, FeedImpressionReporter.a("feed").c()).a(FeedImpressionReporter.a("feed").a()).a());
        } else {
            ((d) this.f41201d).a(Integer.valueOf(i), com.ss.android.ugc.aweme.follow.presenter.d.a(i, 2, 0, FeedImpressionReporter.a("feed").c()).a(FeedImpressionReporter.a("feed").a()).a());
        }
    }
}
