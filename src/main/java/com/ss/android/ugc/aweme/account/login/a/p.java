package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.h;
import com.bytedance.sdk.account.f.b.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class p extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32082a;

    /* renamed from: d  reason: collision with root package name */
    private o f32083d;

    /* renamed from: e  reason: collision with root package name */
    private h f32084e;

    /* renamed from: f  reason: collision with root package name */
    private d f32085f = com.bytedance.sdk.account.d.d.a(w.b());

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32082a, false, 20240, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32082a, false, 20240, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32085f.a(this.f32084e.f22379a, this.f32084e.f22380b, str, (f) this.f32083d);
    }

    public p(@NonNull k kVar, @NonNull o oVar, @NonNull h hVar) {
        super(kVar);
        this.f32083d = oVar;
        this.f32084e = hVar;
    }
}
