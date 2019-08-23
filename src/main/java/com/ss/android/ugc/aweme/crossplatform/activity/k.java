package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.BaseAppData;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40707a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f40708b;

    /* renamed from: c  reason: collision with root package name */
    private f f40709c;

    /* renamed from: d  reason: collision with root package name */
    private int f40710d;

    /* renamed from: e  reason: collision with root package name */
    private int f40711e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40712f;

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40707a, false, 34190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40707a, false, 34190, new Class[0], Void.TYPE);
            return;
        }
        this.f40710d = 0;
        if (!(this.f40710d == 1 || this.f40710d == 2)) {
            this.f40710d = 0;
        }
    }

    k(Activity activity, f fVar) {
        int i;
        BaseAppData a2 = BaseAppData.a();
        if (PatchProxy.isSupport(new Object[0], a2, BaseAppData.f2496a, false, 18346, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, BaseAppData.f2496a, false, 18346, new Class[0], Integer.TYPE)).intValue();
        } else if (a2.n() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        this.f40711e = i;
        this.f40712f = false;
        this.f40708b = activity;
        this.f40709c = fVar;
    }
}
