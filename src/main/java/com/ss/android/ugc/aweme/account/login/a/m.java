package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class m extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32074a;

    /* renamed from: d  reason: collision with root package name */
    private e f32075d;

    /* renamed from: e  reason: collision with root package name */
    private n f32076e;

    /* renamed from: f  reason: collision with root package name */
    private d f32077f = com.bytedance.sdk.account.d.d.a(w.b());

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32074a, false, 20232, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32074a, false, 20232, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32077f.a(this.f32075d.f22369a, this.f32075d.f22370b, str, (com.bytedance.sdk.account.f.b.a.d) this.f32076e);
    }

    public m(@NonNull k kVar, @NonNull n nVar, @NonNull e eVar) {
        super(kVar);
        this.f32076e = nVar;
        this.f32075d = eVar;
    }
}
