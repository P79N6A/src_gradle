package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.e.a;
import com.bytedance.android.livesdk.feed.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FragmentFeedViewModel extends BaseFeedDataViewModel {
    public static ChangeQuickRedirect A;
    public boolean B;
    private boolean C;

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 9027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 9027, new Class[0], Void.TYPE);
        } else if (this.B && this.l != null) {
            this.l.d();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 9024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 9024, new Class[0], Void.TYPE);
        } else if (this.C) {
            if (PatchProxy.isSupport(new Object[0], this, A, false, 9025, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, A, false, 9025, new Class[0], Void.TYPE);
                return;
            }
            if (!this.B) {
                super.b();
                this.B = true;
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, A, false, 9026, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, A, false, 9026, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.C = z;
        if (!this.C) {
            g();
        }
        b();
    }

    public FragmentFeedViewModel(IFeedRepository iFeedRepository, h hVar, a aVar) {
        super(iFeedRepository, hVar, aVar);
    }
}
