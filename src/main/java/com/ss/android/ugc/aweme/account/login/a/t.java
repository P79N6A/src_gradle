package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.k;
import com.bytedance.sdk.account.f.b.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class t extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32094a;

    /* renamed from: d  reason: collision with root package name */
    private k f32095d;

    /* renamed from: e  reason: collision with root package name */
    private s f32096e;

    /* renamed from: f  reason: collision with root package name */
    private d f32097f = com.bytedance.sdk.account.d.d.a(w.b());

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32094a, false, 20254, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32094a, false, 20254, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32097f.a(this.f32095d.f22389a, str, this.f32095d.l, (i) this.f32096e);
    }

    public t(@NonNull k kVar, @NonNull s sVar, @NonNull k kVar2) {
        super(kVar);
        this.f32096e = sVar;
        this.f32095d = kVar2;
    }
}
