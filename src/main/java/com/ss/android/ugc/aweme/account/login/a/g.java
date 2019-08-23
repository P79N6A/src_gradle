package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32063a;

    /* renamed from: d  reason: collision with root package name */
    private k f32064d;

    /* renamed from: e  reason: collision with root package name */
    private f f32065e;

    /* renamed from: f  reason: collision with root package name */
    private d f32066f = com.bytedance.sdk.account.d.d.a(w.b());
    private b g;

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32063a, false, 20223, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32063a, false, 20223, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32064d.i();
        this.f32066f.a(this.g.f22360a, this.g.f22361b, this.g.f22363d, str, (com.bytedance.sdk.account.f.b.a.b) this.f32065e);
    }

    public g(@NonNull k kVar, @NonNull f fVar, @NonNull b bVar) {
        super(kVar);
        this.f32064d = kVar;
        this.f32065e = fVar;
        this.g = bVar;
    }
}
