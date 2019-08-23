package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.j;
import com.bytedance.sdk.account.f.b.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class r extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32088a;

    /* renamed from: d  reason: collision with root package name */
    private q f32089d;

    /* renamed from: e  reason: collision with root package name */
    private j f32090e;

    /* renamed from: f  reason: collision with root package name */
    private d f32091f = com.bytedance.sdk.account.d.d.a(w.b());

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32088a, false, 20249, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32088a, false, 20249, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32091f.a(this.f32090e.f22384a, this.f32090e.f22385b, this.f32090e.f22386c, str, (h) this.f32089d);
    }

    public r(@NonNull k kVar, @NonNull q qVar, @NonNull j jVar) {
        super(kVar);
        this.f32089d = qVar;
        this.f32090e = jVar;
    }
}
