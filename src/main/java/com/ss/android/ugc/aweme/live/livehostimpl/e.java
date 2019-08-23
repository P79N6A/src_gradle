package com.ss.android.ugc.aweme.live.livehostimpl;

import android.view.View;
import com.bytedance.android.livesdkapi.g.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.a;

public final class e extends a implements c {
    public static ChangeQuickRedirect j;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 55748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 55748, new Class[0], Void.TYPE);
            return;
        }
        super.e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 55749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 55749, new Class[0], Void.TYPE);
            return;
        }
        super.f();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{0}, this, j, false, 55750, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, j, false, 55750, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(0);
    }

    public final void a(View view, View view2, boolean z) {
        View view3 = view;
        View view4 = view2;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{view3, view4, (byte) 1}, this, j, false, 55747, new Class[]{View.class, View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, (byte) 1}, this, j, false, 55747, new Class[]{View.class, View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view3, view4, (byte) 1}, this, a.f46369a, false, 42398, new Class[]{View.class, View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, (byte) 1}, this, a.f46369a, false, 42398, new Class[]{View.class, View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f46372d = true;
        this.f46373e = view3;
        view.removeOnAttachStateChangeListener(this.i);
        view.addOnAttachStateChangeListener(this.i);
        if (view4 instanceof LiveCircleView) {
            this.f46374f = (LiveCircleView) view4;
        }
        if (!this.f46372d) {
            i = 8;
        }
        view4.setVisibility(i);
    }
}
