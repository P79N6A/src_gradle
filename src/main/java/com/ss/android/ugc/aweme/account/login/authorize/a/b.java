package com.ss.android.ugc.aweme.account.login.authorize.a;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.d;
import java.lang.ref.WeakReference;

public final class b extends d {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32122c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<a> f32123d;

    public b(@NonNull a aVar) {
        this.f32123d = new WeakReference<>(aVar);
    }

    public final void a(com.bytedance.sdk.account.api.call.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f32122c, false, 20203, new Class[]{com.bytedance.sdk.account.api.call.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f32122c, false, 20203, new Class[]{com.bytedance.sdk.account.api.call.d.class}, Void.TYPE);
            return;
        }
        if (this.f32123d.get() != null) {
            ((a) this.f32123d.get()).a(dVar.error, dVar.errorMsg, dVar.f22254c, dVar.f22257f, dVar);
        }
    }

    public final void b(com.bytedance.sdk.account.api.call.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f32122c, false, 20204, new Class[]{com.bytedance.sdk.account.api.call.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f32122c, false, 20204, new Class[]{com.bytedance.sdk.account.api.call.d.class}, Void.TYPE);
            return;
        }
        if (this.f32123d.get() != null) {
            ((a) this.f32123d.get()).a(dVar.f22252a, dVar.f22252a.f22520e);
        }
    }

    public final void a(com.bytedance.sdk.account.api.call.d dVar, String str, String str2, String str3) {
        com.bytedance.sdk.account.api.call.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, str, str2, str3}, this, f32122c, false, 20202, new Class[]{com.bytedance.sdk.account.api.call.d.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, str, str2, str3}, this, f32122c, false, 20202, new Class[]{com.bytedance.sdk.account.api.call.d.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.f32123d.get() != null) {
            ((a) this.f32123d.get()).a(dVar2.error, dVar2.errorMsg, str2, dVar2.f22257f, dVar);
        }
    }
}
