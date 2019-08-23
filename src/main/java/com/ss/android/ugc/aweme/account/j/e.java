package com.ss.android.ugc.aweme.account.j;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.j.a;
import com.ss.android.ugc.aweme.w;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32017a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass2 f32018b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f32019c;

    e(a.AnonymousClass2 r1, Bundle bundle) {
        this.f32018b = r1;
        this.f32019c = bundle;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f32017a, false, 20890, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32017a, false, 20890, new Class[]{i.class}, Object.class);
        }
        a.AnonymousClass2 r0 = this.f32018b;
        Bundle bundle = this.f32019c;
        w.a(true, a.this.f31996b.getCurUser());
        return w.f().b(bundle);
    }
}
