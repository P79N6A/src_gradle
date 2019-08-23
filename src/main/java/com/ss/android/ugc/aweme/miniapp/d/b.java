package com.ss.android.ugc.aweme.miniapp.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.f;
import com.tt.option.ext.AbstractHostOptionApiDepend;
import com.tt.option.ext.HostOptionApiDepend;

public final class b extends AbstractHostOptionApiDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55671a;

    public final HostOptionApiDepend.ExtApiHandlerCreator createExtHandler() {
        if (!PatchProxy.isSupport(new Object[0], this, f55671a, false, 59378, new Class[0], HostOptionApiDepend.ExtApiHandlerCreator.class)) {
            return new f();
        }
        return (HostOptionApiDepend.ExtApiHandlerCreator) PatchProxy.accessDispatch(new Object[0], this, f55671a, false, 59378, new Class[0], HostOptionApiDepend.ExtApiHandlerCreator.class);
    }
}
