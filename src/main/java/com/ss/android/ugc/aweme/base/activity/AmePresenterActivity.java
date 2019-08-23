package com.ss.android.ugc.aweme.base.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.bogut.library.a.a;
import com.ss.android.ugc.bogut.library.b.b;

public abstract class AmePresenterActivity<P extends a> extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34489a;

    /* renamed from: b  reason: collision with root package name */
    public b<P> f34490b = new b<>(com.ss.android.ugc.bogut.library.factory.a.a(getClass()));

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f34489a, false, 24082, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34489a, false, 24082, new Class[0], Void.TYPE);
            return;
        }
        this.f34490b.c();
        super.onDestroy();
        this.f34490b.a(!isChangingConfigurations());
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f34489a, false, 24081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34489a, false, 24081, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f34489a, false, 24080, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34489a, false, 24080, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f34490b.a((Object) this);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f34489a, false, 24078, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f34489a, false, 24078, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (bundle2 != null) {
            this.f34490b.a(bundle2.getBundle("presenter_state"));
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f34489a, false, 24079, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f34489a, false, 24079, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putBundle("presenter_state", this.f34490b.b());
    }
}
