package com.ss.android.ugc.aweme.common.d;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40201a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f40202b;

    /* renamed from: c  reason: collision with root package name */
    public OnAnimatedScrollListener f40203c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40201a, false, 33450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40201a, false, 33450, new Class[0], Void.TYPE);
        } else if (this.f40202b != null) {
            int childCount = this.f40202b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder childViewHolder = this.f40202b.getChildViewHolder(this.f40202b.getChildAt(i));
                if (childViewHolder.getItemViewType() == 0) {
                    AnimatedViewHolder animatedViewHolder = (AnimatedViewHolder) childViewHolder;
                    animatedViewHolder.b(false);
                    animatedViewHolder.g();
                }
            }
        }
    }

    public a(RecyclerView recyclerView, OnAnimatedScrollListener onAnimatedScrollListener) {
        this.f40203c = onAnimatedScrollListener;
        this.f40202b = recyclerView;
    }

    public final void a(boolean z, boolean z2) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40201a, false, 33451, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f40201a, false, 33451, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        final boolean z3 = z;
        AnonymousClass1 r0 = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40204a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f40204a, false, 33452, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40204a, false, 33452, new Class[0], Void.TYPE);
                } else if (a.this.f40203c != null && a.this.f40202b != null && (!z3 || NetworkUtils.isNetworkAvailable(k.a()))) {
                    a.this.f40203c.a(a.this.f40202b, z3);
                }
            }
        };
        if (z2) {
            i = 100;
        }
        com.ss.android.b.a.a.a.a(r0, i);
    }
}
