package com.bytedance.android.livesdk.bgbroadcast;

import com.bytedance.android.livesdkapi.depend.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9183a;

    /* renamed from: b  reason: collision with root package name */
    static final a f9184b = new e();

    private e() {
    }

    public final boolean i_() {
        if (!PatchProxy.isSupport(new Object[0], this, f9183a, false, 3254, new Class[0], Boolean.TYPE)) {
            return true;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9183a, false, 3254, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
