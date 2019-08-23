package com.ss.android.ugc.aweme.feed.guide.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.main.bm;

public interface b {
    public static final b i = new b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45378a;

        /* renamed from: b  reason: collision with root package name */
        private bm f45379b;

        public final void G() {
        }

        public final void H() {
        }

        public final void I() {
        }

        public final void h(boolean z) {
        }

        public final void M() {
            if (PatchProxy.isSupport(new Object[0], this, f45378a, false, 41283, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45378a, false, 41283, new Class[0], Void.TYPE);
                return;
            }
            if (this.f45379b == null) {
                this.f45379b = (bm) c.a(k.a(), bm.class);
            }
            this.f45379b.u(false);
        }
    };

    void G();

    void H();

    void I();

    void M();

    void h(boolean z);
}
