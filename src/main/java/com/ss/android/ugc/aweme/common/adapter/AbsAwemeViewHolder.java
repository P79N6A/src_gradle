package com.ss.android.ugc.aweme.common.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public abstract class AbsAwemeViewHolder extends AnimatedViewHolder<Aweme> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f40162d;

    /* renamed from: e  reason: collision with root package name */
    public a f40163e = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40164a;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f40164a, false, 33330, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40164a, false, 33330, new Class[0], Void.TYPE);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f40164a, false, 33329, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40164a, false, 33329, new Class[0], Void.TYPE);
                return;
            }
            AbsAwemeViewHolder absAwemeViewHolder = AbsAwemeViewHolder.this;
            if (PatchProxy.isSupport(new Object[0], absAwemeViewHolder, AbsAwemeViewHolder.f40162d, false, 33328, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], absAwemeViewHolder, AbsAwemeViewHolder.f40162d, false, 33328, new Class[0], Void.TYPE);
                return;
            }
            if (!absAwemeViewHolder.j && AbTestManager.a().an()) {
                absAwemeViewHolder.h.c();
            }
        }
    };

    public final Aweme c() {
        return (Aweme) this.g;
    }

    public AbsAwemeViewHolder(View view) {
        super(view);
    }
}
