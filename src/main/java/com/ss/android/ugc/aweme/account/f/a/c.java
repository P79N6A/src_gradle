package com.ss.android.ugc.aweme.account.f.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.f.b;
import com.ss.android.ugc.aweme.account.f.c.a;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f31878d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f31879e = new Handler(Looper.getMainLooper());

    public c(Context context) {
        super(context);
    }

    public final void a(b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f31878d, false, 20006, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f31878d, false, 20006, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        a();
        a(true);
    }

    public final void b(b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f31878d, false, 20007, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f31878d, false, 20007, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        super.b(aVar);
        a();
        a(false);
    }

    private void a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f31878d, false, 20008, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f31878d, false, 20008, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        User k = w.k();
        if (k != null) {
            k.setIsSyncToutiao(z2 ? 1 : 0);
            w.a(k);
        }
        n.a(z ? 1 : 0);
        a.a(z2, new a.C0404a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31880a;

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void d() {
                c.this.f31848c.a();
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void c() {
                c.this.f31848c.a("");
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f31880a, false, 20009, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f31880a, false, 20009, new Class[0], Void.TYPE);
                    return;
                }
                c.this.b();
                c.this.f31879e.post(new d(this));
                w.a().queryUser();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f31880a, false, 20010, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f31880a, false, 20010, new Class[0], Void.TYPE);
                    return;
                }
                c.this.b();
                c.this.f31879e.post(new e(this));
            }
        });
    }
}
