package com.ss.android.ugc.aweme.forward.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48285a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f48286b;

    h(Object[] objArr) {
        this.f48286b = objArr;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f48285a, false, 45436, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f48285a, false, 45436, new Class[]{i.class}, Object.class);
        }
        Object[] objArr = this.f48286b;
        if (iVar.f() != null) {
            return iVar.f();
        }
        ForwardDetail forwardDetail = (ForwardDetail) iVar.e();
        forwardDetail.getComment().setFakeId((String) objArr[7]);
        return forwardDetail;
    }
}
