package com.ss.android.ugc.aweme.setting.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.ss.android.ugc.aweme.setting.model.RestrictInfoModel;
import com.ss.android.ugc.aweme.w.a.b;

public final class g extends b<RestrictInfoModel, d> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63944a;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f63944a, false, 72273, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f63944a, false, 72273, new Class[]{Exception.class}, Void.TYPE);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63944a, false, 72274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63944a, false, 72274, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            ((d) this.f76547e).a((RestrictInfo) ((RestrictInfoModel) this.f76546d).mData);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63944a, false, 72272, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63944a, false, 72272, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((RestrictInfoModel) this.f76546d).getRestrictInfo(str2);
    }

    public g(RestrictInfoModel restrictInfoModel, d dVar) {
        super(restrictInfoModel, dVar);
        ((RestrictInfoModel) this.f76546d).addNotifyListener(this);
    }
}
