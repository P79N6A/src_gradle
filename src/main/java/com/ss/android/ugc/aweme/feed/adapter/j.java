package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.c.m;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.k.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

public final class j extends VideoViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44949a;
    private final k w = new k(this.j, this.tagLayout);
    private Aweme x;

    public final Aweme B() {
        return this.x;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f44949a, false, 40549, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44949a, false, 40549, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.w.a();
    }

    public final Aweme f(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44949a, false, 40550, new Class[]{Integer.TYPE}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44949a, false, 40550, new Class[]{Integer.TYPE}, Aweme.class);
        } else if (k.a(i)) {
            return B();
        } else {
            return super.f(i);
        }
    }

    public final void a(Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, f44949a, false, 40548, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, this, f44949a, false, 40548, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.x = aweme;
        this.w.f44952c = this.x;
        super.a(b.d(this.x), z);
    }

    j(View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, @NonNull BaseFeedPageParams baseFeedPageParams, m mVar) {
        super(view, aaVar, onTouchListener, fragment, baseFeedPageParams, mVar);
    }
}
