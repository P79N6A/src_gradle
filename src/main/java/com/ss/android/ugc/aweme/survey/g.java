package com.ss.android.ugc.aweme.survey;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.survey.f;
import com.ss.android.ugc.aweme.utils.y;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74512a;

    /* renamed from: b  reason: collision with root package name */
    private final f f74513b;

    g(f fVar) {
        this.f74513b = fVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f74512a, false, 86699, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f74512a, false, 86699, new Class[]{i.class}, Object.class);
        }
        f fVar = this.f74513b;
        if (!y.a(iVar)) {
            if (fVar.f74511c != null) {
                iVar.f();
            }
            return null;
        }
        e eVar = (e) iVar.e();
        if (fVar.f74511c != null) {
            f.a aVar = fVar.f74511c;
            if (eVar == null || eVar.f74503b == 0) {
                eVar = null;
            }
            aVar.a(eVar);
        }
        return null;
    }
}
