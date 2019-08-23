package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32057a;

    /* renamed from: d  reason: collision with root package name */
    private a f32058d;

    /* renamed from: e  reason: collision with root package name */
    private d f32059e;

    /* renamed from: f  reason: collision with root package name */
    private d f32060f = com.bytedance.sdk.account.d.d.a(w.b());

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32057a, false, 20220, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32057a, false, 20220, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32060f.a(this.f32058d.f22355a, this.f32058d.f22356b, this.f32058d.f22358d, str, (com.bytedance.sdk.account.f.b.a.a) this.f32059e);
    }

    public e(@NonNull k kVar, @NonNull d dVar, @NonNull a aVar) {
        super(kVar);
        this.f32058d = aVar;
        this.f32059e = dVar;
    }
}
