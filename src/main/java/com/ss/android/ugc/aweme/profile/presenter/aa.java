package com.ss.android.ugc.aweme.profile.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.profile.model.SelelctCityModel;

public final class aa extends b<SelelctCityModel, p> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61566a;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61566a, false, 67622, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61566a, false, 67622, new Class[]{Exception.class}, Void.TYPE);
        }
    }

    public aa() {
        a(new SelelctCityModel());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61566a, false, 67623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61566a, false, 67623, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((p) this.f2979f).a(((SelelctCityModel) this.f2978e).getCityIndexData(), ((SelelctCityModel) this.f2978e).getCityData(0));
        }
    }
}
