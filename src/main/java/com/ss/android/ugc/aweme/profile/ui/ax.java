package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class ax implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62493a;

    /* renamed from: b  reason: collision with root package name */
    private final MusUserProfileFragment f62494b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62495c;

    ax(MusUserProfileFragment musUserProfileFragment, View view) {
        this.f62494b = musUserProfileFragment;
        this.f62495c = view;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f62493a, false, 68441, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f62493a, false, 68441, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62493a, false, 68440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62493a, false, 68440, new Class[0], Void.TYPE);
            return;
        }
        this.f62494b.e(this.f62495c);
    }
}
