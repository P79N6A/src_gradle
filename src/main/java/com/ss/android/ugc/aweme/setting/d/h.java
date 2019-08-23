package com.ss.android.ugc.aweme.setting.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.aweme.setting.model.RestrictUserModel;
import com.ss.android.ugc.aweme.w.a.b;

public final class h extends b<RestrictUserModel, e> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63945a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63945a, false, 72277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63945a, false, 72277, new Class[0], Void.TYPE);
            return;
        }
        if (((CommonResponse) ((RestrictUserModel) this.f76546d).mData).statusCode != 0 || !((CommonResponse) ((RestrictUserModel) this.f76546d).mData).result) {
            if (this.f76547e != null) {
                a aVar = new a(((CommonResponse) ((RestrictUserModel) this.f76546d).mData).statusCode);
                aVar.setErrorMsg(((CommonResponse) ((RestrictUserModel) this.f76546d).mData).statusMsg);
                ((e) this.f76547e).b(aVar);
            }
        } else if (this.f76547e != null) {
            ((e) this.f76547e).h();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f63945a, false, 72276, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f63945a, false, 72276, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            ((e) this.f76547e).b(exc);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63945a, false, 72275, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63945a, false, 72275, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((RestrictUserModel) this.f76546d).restricUser(str2);
    }

    public h(RestrictUserModel restrictUserModel, e eVar) {
        super(restrictUserModel, eVar);
        ((RestrictUserModel) this.f76546d).addNotifyListener(this);
    }
}
