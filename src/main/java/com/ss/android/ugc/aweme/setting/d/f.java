package com.ss.android.ugc.aweme.setting.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.setting.a.c;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.aweme.setting.model.RestrictAwemeModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.w.a.b;

public final class f extends b<RestrictAwemeModel, c> implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63943a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63943a, false, 72271, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63943a, false, 72271, new Class[0], Void.TYPE);
        } else if (((CommonResponse) ((RestrictAwemeModel) this.f76546d).mData).statusCode != 0 || !((CommonResponse) ((RestrictAwemeModel) this.f76546d).mData).result) {
            if (this.f76547e != null) {
                a aVar = new a(((CommonResponse) ((RestrictAwemeModel) this.f76546d).mData).statusCode);
                aVar.setErrorMsg(((CommonResponse) ((RestrictAwemeModel) this.f76546d).mData).statusMsg);
                ((c) this.f76547e).a(aVar);
            }
        } else {
            if (this.f76547e != null) {
                ((c) this.f76547e).g();
            }
            bg.a(new c());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f63943a, false, 72270, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f63943a, false, 72270, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f76547e != null) {
            ((c) this.f76547e).a(exc);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63943a, false, 72269, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63943a, false, 72269, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((RestrictAwemeModel) this.f76546d).restricAweme(str2);
    }

    public f(RestrictAwemeModel restrictAwemeModel, c cVar) {
        super(restrictAwemeModel, cVar);
        ((RestrictAwemeModel) this.f76546d).addNotifyListener(this);
    }
}
