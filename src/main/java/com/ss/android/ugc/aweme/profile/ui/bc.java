package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class bc implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62508a;

    /* renamed from: b  reason: collision with root package name */
    private final MusUserProfileFragment f62509b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62510c;

    /* renamed from: d  reason: collision with root package name */
    private final int f62511d;

    bc(MusUserProfileFragment musUserProfileFragment, int i, int i2) {
        this.f62509b = musUserProfileFragment;
        this.f62510c = i;
        this.f62511d = i2;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62508a, false, 68446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62508a, false, 68446, new Class[0], Void.TYPE);
            return;
        }
        this.f62509b.c(this.f62510c, this.f62511d);
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f62508a, false, 68447, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f62508a, false, 68447, new Class[]{Bundle.class}, Void.TYPE);
        }
    }
}
