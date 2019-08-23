package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;

public final class ch implements fj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66010a;

    ch() {
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f66010a, false, 74212, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66010a, false, 74212, new Class[0], Boolean.TYPE)).booleanValue();
        }
        switch (a.L.b(e.a.BeautificationMode)) {
            case 0:
                z = a.M.a(a.C0682a.BeautyModeSwitch);
                break;
            case 1:
                z = true;
                break;
        }
        return z;
    }
}
