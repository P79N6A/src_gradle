package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.follow.presenter.e;

public final class k extends a<b, e> implements s.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41236a;

    public final int a(int i) {
        return 1;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41236a, false, 34778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41236a, false, 34778, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        ((e) this.f41201d).f47790b = null;
    }

    public final void a(x xVar) {
        ((e) this.f41201d).h = xVar;
    }

    public final void a(boolean z) {
        ((e) this.f41201d).i = true;
    }

    public k(@Nullable a aVar) {
        b bVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
        } else {
            bVar = new b();
        }
        this.f41200c = bVar;
        this.f41201d = new e();
    }

    public final void a(@NonNull DetailFragmentPanel detailFragmentPanel) {
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel}, this, f41236a, false, 34776, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel}, this, f41236a, false, 34776, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        ((e) this.f41201d).f47790b = detailFragmentPanel;
        ((e) this.f41201d).a((d) detailFragmentPanel);
        ((e) this.f41201d).a(this.f41200c);
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41236a, false, 34777, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41236a, false, 34777, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (i3 == 1) {
            ((e) this.f41201d).a(1, com.ss.android.ugc.aweme.follow.presenter.d.a(1, 0, 0, "-1").a());
        } else if (i3 == 4) {
            ((e) this.f41201d).a(4, com.ss.android.ugc.aweme.follow.presenter.d.a(4, 2, 0, "-1").a("-1").a());
        } else {
            ((e) this.f41201d).a(Integer.valueOf(i), com.ss.android.ugc.aweme.follow.presenter.d.a(i, 2, 0, "-1").a("-1").a());
        }
    }
}
