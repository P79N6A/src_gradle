package com.ss.android.ugc.aweme.base.fragment;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.bogut.library.a.a;
import com.ss.android.ugc.bogut.library.b.b;

public abstract class AmePresenterFragment<P extends a> extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2748a;

    /* renamed from: b  reason: collision with root package name */
    private b<P> f2749b = new b<>(com.ss.android.ugc.bogut.library.factory.a.a(getClass()));

    public final P a() {
        if (!PatchProxy.isSupport(new Object[0], this, f2748a, false, 24614, new Class[0], a.class)) {
            return this.f2749b.a();
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f2748a, false, 24614, new Class[0], a.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2748a, false, 24619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2748a, false, 24619, new Class[0], Void.TYPE);
            return;
        }
        this.f2749b.c();
        super.onDestroy();
        this.f2749b.a(!getActivity().isChangingConfigurations());
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2748a, false, 24618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2748a, false, 24618, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2748a, false, 24617, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2748a, false, 24617, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f2749b.a((Object) this);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f2748a, false, 24615, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f2748a, false, 24615, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (bundle2 != null) {
            this.f2749b.a(bundle2.getBundle("presenter_state"));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f2748a, false, 24616, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f2748a, false, 24616, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putBundle("presenter_state", this.f2749b.b());
    }
}
