package com.ss.android.ugc.aweme.setting;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.api.b;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public final /* synthetic */ class n implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63990a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f63991b = new n();

    private n() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f63990a, false, 72060, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f63990a, false, 72060, new Class[]{i.class}, Object.class);
        }
        if (!iVar.d()) {
            b bVar = (b) iVar.e();
            if (bVar.f41162b == 0 || bVar.f41161a == 0) {
                a.L.a(e.a.ReactDuetSettingCurrent, l.g);
            } else {
                a.L.a(e.a.ReactDuetSettingCurrent, l.f63987f);
            }
        }
        return null;
    }
}
