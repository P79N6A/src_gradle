package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class u extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32098a;

    /* renamed from: d  reason: collision with root package name */
    private k f32099d;

    /* renamed from: e  reason: collision with root package name */
    private d f32100e = com.bytedance.sdk.account.d.d.a(w.b());

    /* renamed from: f  reason: collision with root package name */
    private v f32101f;

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32098a, false, 20257, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32098a, false, 20257, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32100e.b(this.f32099d.f22389a, str, this.f32099d.l, this.f32101f);
    }

    public u(@NonNull k kVar, @NonNull v vVar, @NonNull k kVar2) {
        super(kVar);
        this.f32099d = kVar2;
        this.f32101f = vVar;
    }
}
