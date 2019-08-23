package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.k.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class i extends FeedImageViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44948a;
    private final k m = new k(this.j, this.tagLayout);
    private Aweme n;

    public final Aweme B() {
        return this.n;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f44948a, false, 40538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44948a, false, 40538, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        this.m.a();
    }

    public final Aweme d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44948a, false, 40539, new Class[]{Integer.TYPE}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44948a, false, 40539, new Class[]{Integer.TYPE}, Aweme.class);
        } else if (k.a(i)) {
            return B();
        } else {
            return super.d(i);
        }
    }

    public final void a(Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, f44948a, false, 40537, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, this, f44948a, false, 40537, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.n = aweme;
        this.m.f44952c = this.n;
        super.a(b.d(this.n), z);
    }

    i(int i, View view, aa<ar> aaVar, String str, View.OnTouchListener onTouchListener, Fragment fragment, int i2) {
        super(i, view, aaVar, str, onTouchListener, fragment, i2);
    }
}
