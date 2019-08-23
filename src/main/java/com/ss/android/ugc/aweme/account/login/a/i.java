package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class i extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32069a;

    /* renamed from: d  reason: collision with root package name */
    private k f32070d;

    /* renamed from: e  reason: collision with root package name */
    private d f32071e = com.bytedance.sdk.account.d.d.a(w.b());

    /* renamed from: f  reason: collision with root package name */
    private h f32072f;
    private c g;

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32069a, false, 20229, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32069a, false, 20229, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32071e.a(this.g.f22366a, this.g.f22367b, str, (com.bytedance.sdk.account.f.b.a.c) this.f32072f);
    }

    public i(@NonNull k kVar, @NonNull h hVar, @NonNull c cVar) {
        super(kVar);
        this.f32070d = kVar;
        this.f32072f = hVar;
        this.g = cVar;
    }
}
