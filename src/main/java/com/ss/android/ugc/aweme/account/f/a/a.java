package com.ss.android.ugc.aweme.account.f.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f.b;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31846a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f31847b;

    /* renamed from: c  reason: collision with root package name */
    protected b.a f31848c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.account.shortvideo.a.a f31849d;

    /* renamed from: com.ss.android.ugc.aweme.account.f.a.a$a  reason: collision with other inner class name */
    class C0403a implements b.a {
        public final void a() {
        }

        public final void a(String str) {
        }

        C0403a() {
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f31846a, false, 19978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31846a, false, 19978, new Class[0], Void.TYPE);
            return;
        }
        this.f31849d = com.ss.android.ugc.aweme.account.shortvideo.a.a.a(this.f31847b, this.f31847b.getString(C0906R.string.brl));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f31846a, false, 19979, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31846a, false, 19979, new Class[0], Void.TYPE);
            return;
        }
        if (this.f31849d != null) {
            this.f31849d.dismiss();
        }
    }

    public a(Context context) {
        this.f31847b = context;
    }

    public void a(b.a aVar) {
        b.a aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f31846a, false, 19976, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f31846a, false, 19976, new Class[]{b.a.class}, Void.TYPE);
        } else if (this.f31847b != null) {
            if (aVar == null) {
                aVar2 = new C0403a();
            } else {
                aVar2 = aVar;
            }
            this.f31848c = aVar2;
        }
    }

    public void b(b.a aVar) {
        b.a aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f31846a, false, 19977, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f31846a, false, 19977, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        if (aVar == null) {
            aVar2 = new C0403a();
        } else {
            aVar2 = aVar;
        }
        this.f31848c = aVar2;
    }
}
