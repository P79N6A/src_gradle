package com.ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.CallAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lancet.e;
import java.util.List;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33865a;

    @Insert
    @TargetClass
    static List a() {
        if (PatchProxy.isSupport(new Object[0], null, f33865a, true, 23126, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f33865a, true, 23126, new Class[0], List.class);
        }
        List<CallAdapter.Factory> b2 = m.b();
        b2.add(0, e.b());
        return b2;
    }
}
