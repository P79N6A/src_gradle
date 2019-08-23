package com.ss.android.ugc.aweme.port.in;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.x;

public final /* synthetic */ class e implements x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61132a;

    /* renamed from: b  reason: collision with root package name */
    static final x f61133b = new e();

    private e() {
    }

    public final void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f61132a, false, 67131, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f61132a, false, 67131, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a.a(i, str);
    }
}
